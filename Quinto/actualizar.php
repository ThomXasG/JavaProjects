<?php
class CRUDU {
    public static function ActualizarEstudiante($cedula,$nombre,$apellido,$direccion,$telefono) {
       include_once("conexion.php");
        $obj=new conexion();
        $conectar=$obj->Conectar();
        $sql="UPDATE estudiante SET nombre='$nombre', apellido='$apellido', direccion='$direccion', telefono='$telefono' WHERE cedula='$cedula'";
        $resultado=$conectar->prepare($sql);
        $resultado->execute();
    
        echo json_encode($resultado);
    
        $conectar->commit();
    }
}
?>
