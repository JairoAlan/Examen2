<?php

if (isset($_REQUEST['Id']) && isset($_REQUEST['Nombre']) && isset($_REQUEST['Marca']) && isset($_REQUEST['Presentacion']) && isset($_REQUEST['Precio'])) {
    include 'conexion.php';
    
    $Id = $_REQUEST['Id'];
    $Nombre = $_REQUEST['Nombre'];
    $Marca = $_REQUEST['Marca'];
    $Presentacion = $_REQUEST['Presentacion'];
    $Precio = $_REQUEST['Precio'];
    
    // Preparar la consulta usando sentencia preparada para registrar el producto
    $sql = "INSERT INTO registro_productos (Id_Prod, Nombre, Marca, Presentacion, Precio)
            VALUES (?, ?, ?, ?, ?)";
            
    // Utilizar una sentencia preparada
    $stmt = $conn->prepare($sql);
    
    // Enlazar los parámetros usando bind_param
    $stmt->bind_param("isssd", $Id, $Nombre, $Marca, $Presentacion, $Precio);
    
    // Ejecutar la consulta preparada para registrar el producto
    if ($stmt->execute()) {
        echo "Producto registrado correctamente.";
        
        // Preparar la consulta usando sentencia preparada para insertar en productos_inventario
        $sql = "INSERT INTO productos_inventario (Id_Prod, Cantidad)
                VALUES (?, 0)";
                
        // Utilizar una nueva sentencia preparada para insertar en productos_inventario
        $stmt_inventario = $conn->prepare($sql);
        
        // Enlazar los parámetros usando bind_param
        $stmt_inventario->bind_param("i", $Id);
        
        // Ejecutar la consulta preparada para insertar en productos_inventario
        if ($stmt_inventario->execute()) {
            echo " Inventario actualizado.";
        } else {
            echo " Error al actualizar el inventario: " . $stmt_inventario->error;
        }
        
        // Cerrar la consulta preparada para productos_inventario
        $stmt_inventario->close();
        
    } else {
        echo "Error al registrar el producto: " . $stmt->error;
    }
    
    // Cerrar la consulta preparada para registro_productos
    $stmt->close();
}


/*
	if ($conn->query($sql) === TRUE) {
        $Id_Prod = $conn->insert_id;

        // Inserta el producto en la tabla Productos_inventario con cantidad 0
        $sql = "INSERT INTO productos_inventario (Id_Prod, Cantidad)
                VALUES ($Id_Prod, 0)";
        if ($conn->query($sql) === TRUE) {
            // Si la conn y el query se ejecuta con exito se registra el producto y actualizar el inventario
            echo "Producto registrado y inventario actualizado.";
        } else {
            // Error si no pasa el query y no actualizar el inventario
            echo "Error: " . $sql . "<br>" . $conn->error;
        }
    } else {
        // Error al registrar el producto
        echo "Error: " . $sql . "<br>" . $conn->error;
    }
	*/
/*
// API para actualizar el inventario
if ($_SERVER['REQUEST_METHOD'] === 'PUT') {
    
    $Id_Prod = $_GET['Id_Prod'];
    $Cantidad = $_GET['Cantidad'];

    // Verificar si el producto existe en la tabla Productos_inventario
    $sql = "SELECT * FROM Productos_inventario WHERE Id_Prod = $Id_Prod";
    $result = $conn->query($sql);
    if ($result->num_rows > 0) {
        // Si el producto existe, actualizar el inventario
        $sql = "UPDATE productos_inventario SET Cantidad = Cantidad + $Cantidad WHERE Id_Prod = $Id_Prod";
        if ($conn->query($sql) === TRUE) {
            // Éxito al actualizar el inventario
			$Id_Fact = $conn->insert_id;
				$sql = "INSERT INTO actualizacion_inventario (Id_Fact, Id_Prod, FechaCompra, Cantidad)
				VALUES ($Id_Fact, '$Id_Prod', CURDATE(), '$Cantidad')";
                if($conn->query($sql) === TRUE){
					echo "Inventario actualizado.";
				}
            //echo "Inventario actualizado.";
        } else {
            // Error al actualizar el inventario
            echo "Error: " . $sql . "<br>" . $conn->error;
        }
    } else {
        // El producto no existe en el inventario
        echo "El producto no está registrado en el inventario.";
    }
}
*/

// API para realizar la venta de productos
// if ($_SERVER['REQUEST_METHOD'] === 'GET') {
    // // Obtener los datos del formulario
    // $Id_Prod = $_GET['Id_Prod'];
    // $Cantidad = $_GET['Cantidad'];

    // // Verificar si el producto existe en el inventario y asi obtener su información
    // $sql = "SELECT * FROM productos_inventario INNER JOIN registro_productos ON productos_inventario.Id_Prod = registro_productos.Id_Prod WHERE productos_inventario.Id_Prod = $Id_Prod";
    // $result = $conn->query($sql);
    // if ($result->num_rows > 0) {
        // $row = $result->fetch_assoc();
        // $Nombre = $row['Nombre'];
        // $Presentacion = $row['Presentacion'];
		// $Precio = $row['Precio'];
		// /**/
		// echo "El nombre del producto es: $Nombre";
		// echo "\n";
		// echo "La presentacion del producto: $Presentacion";
		// echo "\n";
		// echo "El precio por unidad del producto es: $Precio";
		// echo "\n";
		// echo "\n";
		
        // // Verificar si hay suficiente cantidad en el inventario
        // if ($row['Cantidad'] >= $Cantidad) {
            // // Calcular el total de pago
            // $total_pago = $Precio * $Cantidad;

            // // Actualizar el inventario restando la cantidad vendida
            // $sql = "UPDATE productos_inventario SET Cantidad = Cantidad - $Cantidad WHERE Id_Prod = $Id_Prod";
            // if ($conn->query($sql) === TRUE) {
				// $Id_Venta = $conn->insert_id;
				// $sql2 = "INSERT INTO ventas_productos (Id_Venta, Id_Prod, FechaVenta, Cantidad, Precio, Nombre)
				// VALUES ($Id_Venta, $Id_Prod, CURDATE(), $Cantidad, $total_pago, '$Nombre')";
                // if($conn->query($sql2) === TRUE){
					// echo "Inventario ha sido actualizado.";
				// }
					// echo "Venta realizada. Total que se debe pagar es: $total_pago.";
				
            // } else {
                // // Error al actualizar el inventario
                // echo "Error: " . $sql . "<br>" . $conn->error;
            // }
        // } else {
            // // No hay suficiente cantidad en el inventario
            // echo "No hay suficiente items en el inventario. La cantidad disponible: " . $row['Cantidad'];
        // }
    // } else {
        // // El producto no existe en el inventario
        // echo "El producto no está en el inventario.";
    // }
// }

// // Cerrar la conexión a la base de datos
// $conn->close();

?>