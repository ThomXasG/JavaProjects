/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.vaca;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
import javax.swing.JOptionPane;

import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

public class Api {

    private List<Estudiante> estudiantes = new ArrayList<>();

    public List<Estudiante> GET() {
        try {
            estudiantes.clear();
            //solicitar una peticion 
            URL url = new URL("http://localhost/QUINTO/api.php");
            //Usamos un objeto de conecccion para brir la conexion 
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            //Luego solicitamos a travez de un metodo la conexion 
            con.setRequestMethod("GET");
            //luego nos conectamos 
            con.connect();

            //Comporbar si a peticion es correcta 
            int response = con.getResponseCode();
            //Si es correcta abrir un scanner que ela el flujo de datos 

            if (response != 200) {
                throw new RuntimeException("Ocurrio un error");//error en tiempo de ejecucion
            } else {
                //abrir un scanner para que lea los datos 
                StringBuilder information = new StringBuilder();
                Scanner sc = new Scanner(con.getInputStream());// aqui va a leer el flujo de dtaos que envie la api
                while (sc.hasNext()) {
                    information.append(sc.nextLine());// aqui vamso agregando la infromacion 
                }
                sc.close();
                //mostrar la infromacion obtenida por consola        
//        System.out.println(information);
                JSONArray jsonArray = new JSONArray(information.toString());
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    String cedula = jsonObject.getString("cedula");
                    String nombre = jsonObject.getString("nombre");
                    String apellido = jsonObject.getString("apellido");
                    String direccion = jsonObject.getString("email");
                    String telefono = jsonObject.getString("telefono");
                    // Crear un objeto Estudiante
                    Estudiante estudiante = new Estudiante(cedula, nombre, apellido, direccion, telefono);

                    // Agregar el objeto Estudiante a la lista
                    estudiantes.add(estudiante);

                }
                con.disconnect();
                return estudiantes;
            }
        } catch (Exception e) {
            System.out.println("Error en el método GET");
            return null;
        }
    }

    public void insertar(String cedula, String nombre, String apellido, String telefono, String direccion) {
        try {
            String url = "http://localhost/QUINTO/api.php";
            HttpClient cliente = HttpClientBuilder.create().build();
            HttpPost post = new HttpPost(url);
            ArrayList<BasicNameValuePair> parametros = new ArrayList<BasicNameValuePair>();
            parametros.add(new BasicNameValuePair("cedula", cedula));
            parametros.add(new BasicNameValuePair("nombre", nombre));
            parametros.add(new BasicNameValuePair("apellido", apellido));
            parametros.add(new BasicNameValuePair("email", direccion));
            parametros.add(new BasicNameValuePair("telefono", telefono));
            post.setEntity(new UrlEncodedFormEntity(parametros));
            cliente.execute(post);
            //   mostrarDatos();
        } catch (Exception e) {
            
            System.out.println("Error  : " + e);
        }

    }

    public void editar(String cedula, String nombre, String apellido, String direccion, String telefono) {
        try {
            String apiUrl = "http://localhost/QUINTO/api.php?";
            String urlParametros = "&cedula=" + cedula + " &nombre=" + nombre + " &apellido=" + apellido + " &email=" + direccion + " &telefono=" + telefono;

            URL url = new URL(apiUrl + urlParametros);
            HttpURLConnection connection
                    = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("PUT");
            int respuesta = connection.getResponseCode();
            
            if (respuesta == 200) {
                JOptionPane.showMessageDialog(null, "ok");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void eliminar(String cedula) {
        try {
            String apiUrl = "http://localhost/QUINTO/api.php";

            URL url = new URL(apiUrl + "?cedula" + cedula);
            HttpURLConnection connection
                    = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("DELETE");
            connection.getResponseCode();

        } catch (Exception e) {

        }
    }
}
