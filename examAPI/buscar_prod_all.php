<?php

include 'conexion.php';
	
$Query = "select distinct R.Nombre, R.Marca, R.Presentacion, R.Precio, P.Cantidad from registro_productos R, productos_inventario P";
$Consulta = mysqli_query($conn,$Query);
$arreglo= array();
while($recibido=mysqli_fetch_assoc($Consulta))
{
	array_push($arreglo,$recibido);
}
print json_encode($arreglo, JSON_FORCE_OBJECT);
mysqli_close($conn);

?>