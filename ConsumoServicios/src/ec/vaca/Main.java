/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.vaca;

import java.util.Map;

/**
 *
 * @author joelv
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        api api = new api();
        
        //System.out.println(api.GET().get(0).toString());
        
        Estudiante es = new Estudiante("Raul", "Paredes", "1807", "rp@hotmail.com", "0907");
        
        Map<String, String> form = Map.of(
                "cedula", es.getCedula(),
                "nombre", es.getNombre(),
                "apellido", es.getApellido(),
                "email", es.getDireccion(),
                "telefono", es.getTelefono()
        );
        
        api.POST(form);
    }
    
}
