<?php

include 'conexion.php';
	
$Query = "select Nombre, Marca, Presentacion, Precio, Cantidad from registro_productos, actualizacion_inventario;";
$Consulta = mysqli_query($conn,$Query);
$arreglo= array();
while($recibido=mysqli_fetch_assoc($Consulta))
{
	array_push($arreglo,$recibido);
}
print json_encode($arreglo, JSON_FORCE_OBJECT);
mysqli_close($conn);

?>