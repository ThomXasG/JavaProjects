<?php
include_once 'conexion.php';
Class CRUDG{
    public static function GuardarEstudiante(){
        $cedula = $_POST['cedula'];
        $nombre = $_POST["nombre"];
        $apellido = $_POST["apellido"];
        $direccion = $_POST["direccion"];
        $telefono = $_POST["telefono"];
        
        $objeto = new Conexion();
        $conectar = $objeto->Conectar();
        
        $insertsql = "INSERT INTO estudiante (cedula, nombre, apellido, direccion, telefono) VALUES ('$cedula', '$nombre', '$apellido', '$direccion', '$telefono')";
        
        $resultado = $conectar->prepare($insertsql);
        $resultado->execute();
        echo json_encode($_POST);
        $conectar->commit();
    }
}

?>
