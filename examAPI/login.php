<?php

if(isset($_REQUEST['usuario'])&& isset($_REQUEST['clave']))
{
	include 'conexion.php';
	
	$Usuario=$_REQUEST['usuario'];
	$Clave=$_REQUEST['clave'];
	
	$Query = "SELECT * FROM usuario where usuario = '$Usuario' and clave = '$Clave'";
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