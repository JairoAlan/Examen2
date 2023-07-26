<?php

if (
    isset($_REQUEST['nombre']) &&
    isset($_REQUEST['marca']) &&
    isset($_REQUEST['precio']) &&
    isset($_REQUEST['cantidad']) &&
    isset($_REQUEST['subtotal']) &&
    isset($_REQUEST['total'])
) {
    include 'conexion.php';

    // Obtener los valores y escaparlos para evitar inyección de SQL
    $nombre = mysqli_real_escape_string($conn, $_REQUEST['nombre']);
    $marca = mysqli_real_escape_string($conn, $_REQUEST['marca']);
    $precio = (float)$_REQUEST['precio'];
    $cantidad = (int)$_REQUEST['cantidad'];
    $subtotal = (float)$_REQUEST['subtotal'];
    $total = (float)$_REQUEST['total'];

    // Sentencia preparada
    $query = "INSERT INTO notas (nombre, marca, precio, cantidad, subtotal, total, fecha)
              VALUES (?, ?, ?, ?, ?, ?, CURDATE())";

    $stmt = mysqli_prepare($conn, $query);
    mysqli_stmt_bind_param($stmt, "ssdiid", $nombre, $marca, $precio, $cantidad, $subtotal, $total);

    if (mysqli_stmt_execute($stmt)) {
        echo "Inserción exitosa";
    } else {
        echo "Error al insertar: " . mysqli_error($conn);
    }

    mysqli_stmt_close($stmt);
    mysqli_close($conn);
}
?>
