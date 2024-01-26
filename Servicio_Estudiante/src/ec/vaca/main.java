/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.vaca;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Map;

public class main {

    public static void main(String[] args) throws IOException {
        Api api = new Api();

        // Conexión GET
        Estudiante es = new Estudiante("325", "Carlas", "cdf", "fc", "0983860422");
// 
//
//      Map<String ,String> formdata=Map.of(
//          "cedula",es.getCedula(), "nombre",es.getNombre(), "apellido",es.getApellido(), "direccion"
//                  ,es.getDirreccion(), "telefono",es.getTelefono()
//        );
//   api.POST(formdata);
//   
//   api.Delete("83425");
//api.actualizar("325",es);
        System.out.println(api.GET());
    }

}
