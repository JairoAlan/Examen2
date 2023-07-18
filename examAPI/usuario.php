<?php

// API para registrar un usuario
if (isset($_REQUEST['nombre']) && isset($_REQUEST['clave']) && isset($_REQUEST['usuario']) && isset($_REQUEST['estado']))
{
	include 'conexion.php';
    // Obtiene los datos de la consulta
    
    $Nombre = $_REQUEST['nombre'];
    $Clave = $_REQUEST['clave'];
    $Usuario = $_REQUEST['usuario'];
	$Estado = $_REQUEST['estado'];

    // Inserta el producto en la tabla usuario
    $sql = "INSERT INTO usuario (nombre, clave, usuario, estado) VALUES (?, ?, ?, ?)";
	$stmt = $conn->prepare($sql);
	$stmt->bind_param("ssss", $Nombre, $Clave, $Usuario, $Estado);
	$stmt->execute();
	$stmt->close();
}

// Cerrar la conexión a la base de datos
$conn->close();

?>