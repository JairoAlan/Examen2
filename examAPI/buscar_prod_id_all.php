<?php

include 'conexion.php';
	
$Query = "SELECT R.Id_Prod, R.Nombre, R.Marca, R.Presentacion, R.Precio, P.Cantidad FROM registro_productos R
          INNER JOIN productos_inventario P ON R.Id_Prod = P.Id_Prod";
$Consulta = mysqli_query($conn,$Query);
$arreglo= array();
while($recibido=mysqli_fetch_assoc($Consulta))
{
	array_push($arreglo,$recibido);
}
print json_encode($arreglo, JSON_FORCE_OBJECT);
mysqli_close($conn);

?>