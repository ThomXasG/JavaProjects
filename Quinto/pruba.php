<?php

//array ascociativo a JSON
//JSON de encode transforma algun tipo de dato de php a texto
$arrayasociativo=array("nombre"=>"Juan","Apellido"=>"Pa" ,"edad"=>20);
$miJSON=json_encode($arrayasociativo);
echo ($miJSON);
print_r($arrayasociativo);

var_dump($miJSON);
var_dump($arrayasociativo);
echo "<br>";
echo($arrayasociativo["nombre"]);


//array normalito a JSON

$sarrayn=array("Lunes","Martes","miercoles");

print_r($sarrayn);
$miJSONn=json_encode($sarrayn) ;

echo $miJSON;

$objeto=new stdClass();
$objeto->nombre="Edison";
$objeto->apellido="Ortiz";
$objeto->edad=21;

$MIJSON=json_encode($objeto);
print_r($MIJSON);



//JSON_DECODE pasa de JSON a PHP

$persona='{
"nombre":"calos",
"apellido":"Ortiz",
"edad":20

}';

$var=json_decode($persona,true );

print_r($var);

$vara1='{"nombre": true}';
$vara2='{"nombre": 2}';

$vara11=json_decode($vara1,true);



?>  
