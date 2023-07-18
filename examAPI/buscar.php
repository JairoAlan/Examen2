<?php

if(isset($_REQUEST['Id_Prod']))
{
	include 'conexion.php';
	
	$Id_Prod=$_REQUEST['Id_Prod'];
	
	
	$Query = "select Nombre, Marca, Presentacion, Precio, Cantidad from registro_productos, actualizacion_inventario where registro_productos.Id_Prod = '$Id_Prod'";
	$Consulta = mysqli_query($conn,$Query);
	$arreglo= array();
	while($recibido=mysqli_fetch_assoc($Consulta))
	{
		array_push($arreglo,$recibido);
	}
	print json_encode($arreglo, JSON_FORCE_OBJECT);
	mysqli_close($conn);
}


?>