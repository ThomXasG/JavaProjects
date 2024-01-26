<?php
//El metodo server me devuelve en donde estoy si post , delete o put 
$opc=$_SERVER["REQUEST_METHOD"];
include_once 'seleccionar.php';
include_once 'guardar.php';
include_once 'delete.php';
include_once 'actualizar.php';
switch($opc){
    case "GET":
    //$resultado="Tu estas en un get";
    CRUD::ObtenerEstudiantes();
    //echo($resultado);
    break;
    case "POST":
        CRUDG::GuardarEstudiante();
        break;
    case "DELETE":  
        $var=$_GET["cedula"];
        CRUDE::EliminarEstudiante($var);
        break;
        case "PUT":
            $cedula=$_GET["cedula"];
            $nombre=$_GET["nombre"]; 
            $apellido=$_GET["apellido"]; 
            $direccion=$_GET["direccion"]; 
            $telefono=$_GET["telefono"];      
    
            CRUDU::ActualizarEstudiante($cedula,$nombre,$apellido,$direccion,$telefono);
            break;
            
        

}
?>