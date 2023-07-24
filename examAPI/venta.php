<?php

include 'conexion.php';
	
// API para realizar la venta de productos
if (isset($_REQUEST['Id_Prod'])&& isset($_REQUEST['Cantidad'])) {
    // Obtener los datos del formulario
    $Id_Prod = $_REQUEST['Id_Prod'];
    $Cantidad = $_REQUEST['Cantidad'];

    // Verificar si el producto existe en el inventario y asi obtener su información
    $sql = "SELECT * FROM productos_inventario INNER JOIN registro_productos ON productos_inventario.Id_Prod = registro_productos.Id_Prod WHERE productos_inventario.Id_Prod = $Id_Prod";
    $result = $conn->query($sql);
    if ($result->num_rows > 0) {
        $row = $result->fetch_assoc();
        $Nombre = $row['Nombre'];
        $Presentacion = $row['Presentacion'];
		$Precio = $row['Precio'];
		/**/
		echo "El nombre del producto es: $Nombre";
		echo "\n";
		echo "La presentacion del producto: $Presentacion";
		echo "\n";
		echo "El precio por unidad del producto es: $Precio";
		echo "\n";
		echo "\n";
		
        // Verificar si hay suficiente cantidad en el inventario
        if ($row['Cantidad'] >= $Cantidad) {
            // Calcular el total de pago
            $total_pago = $Precio * $Cantidad;

            // Actualizar el inventario restando la cantidad vendida
            $sql = "UPDATE productos_inventario SET Cantidad = Cantidad - $Cantidad WHERE Id_Prod = $Id_Prod";
            if ($conn->query($sql) === TRUE) {
				$Id_Venta = $conn->insert_id;
				$sql2 = "INSERT INTO ventas_productos (Id_Venta, Id_Prod, FechaVenta, Cantidad, Precio, Nombre)
				VALUES ($Id_Venta, $Id_Prod, CURDATE(), $Cantidad, $total_pago, '$Nombre')";
                if($conn->query($sql2) === TRUE){
					echo "Inventario ha sido actualizado.";
				}
					echo "Venta realizada. Total que se debe pagar es: $total_pago.";
				
            } else {
                // Error al actualizar el inventario
                echo "Error: " . $sql . "<br>" . $conn->error;
            }
        } else {
            // No hay suficiente cantidad en el inventario
            echo "No hay suficiente items en el inventario. La cantidad disponible: " . $row['Cantidad'];
        }
    } else {
        // El producto no existe en el inventario
        echo "El producto no está en el inventario.";
    }
}

// Cerrar la conexión a la base de datos
$conn->close();

?>