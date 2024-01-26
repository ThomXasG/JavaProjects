<?php
 include_once('conexion.php');
class CRUD{
public static function ObtenerEstudiantes(){
   
    $objeto=new Conexion();
    $conectar=$objeto->Conectar();
    $select="SELECT * FROM estudiante";
    $resultado=$conectar->prepare($select);
    $resultado->execute();
    $data=$resultado->fetchAll(PDO::FETCH_ASSOC);
    echo json_encode($data);
}
}

?>