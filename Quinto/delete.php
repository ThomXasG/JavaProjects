<?php
include_once 'conexion.php';
Class CRUDE{
    public static function EliminarEstudiante($cedula){
        $objeto = new Conexion();
        $conectar = $objeto->Conectar();
      //  $cedula=$_POST["cedula"];
        $delete="DELETE  FROM estudiante WHERE cedula='$cedula'";
        $respuesta=$conectar->prepare($delete);
        $respuesta->execute();
        echo json_encode($respuesta);
        $conectar->commit();
    }
}

?>