<?php

// API para Actualizar el precio de un producto
if (isset($_REQUEST['Id_Prod']) && isset($_REQUEST['Precio'])) {
    include 'conexion.php';
    
    // Obtén los datos de la solicitud
    $Id_Prod = $_REQUEST['Id_Prod'];
    $Precio = $_REQUEST['Precio'];

    // Utiliza una consulta preparada para evitar inyecciones SQL
    $sql = "UPDATE registro_productos SET Precio = ? WHERE Id_Prod = ?";
    
    // Utilizar una sentencia preparada
    $stmt = $conn->prepare($sql);
    
    // Enlazar los parámetros usando bind_param
    // Aquí, 'di' significa que el primer parámetro (Precio) es un double (d) y el segundo parámetro (Id_Prod) es un integer (i).
    $stmt->bind_param("di", $Precio, $Id_Prod);
    
    // Ejecutar la consulta preparada
    if ($stmt->execute()) {
        echo "Precio actualizado correctamente.";
    } else {
        echo "Error al actualizar el precio: " . $stmt->error;
    }
    
    // Cerrar la consulta
    $stmt->close();
}

// Cerrar la conexión a la base de datos
$conn->close();


?>