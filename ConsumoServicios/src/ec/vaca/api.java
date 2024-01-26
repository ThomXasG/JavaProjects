/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.vaca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author joelv
 */
public class api {

    ArrayList<Estudiante> array = new ArrayList<>();

    public ArrayList<Estudiante> GET() {
        try {
            URL url = new URL("http://localhost/quinto/api.php");
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            http.setRequestMethod("GET");
            http.connect();

            int response = http.getResponseCode();
            if (response != 200) {
                System.out.println("Error:" + response);
            } else {
                StringBuilder datos = new StringBuilder();
                Scanner sc = new Scanner(http.getInputStream());
                while (sc.hasNext()) {
                    datos.append(sc.nextLine());
                }
                sc.close();
                JSONArray json = new JSONArray(datos.toString());
                for (int i = 0; i < json.length(); i++) {
                    JSONObject objeto = json.getJSONObject(i);
                    String cedula = objeto.getString("cedula");
                    String nombre = objeto.getString("nombre");
                    String apellido = objeto.getString("apellido");
                    String direccion = objeto.getString("email");
                    String telefono = objeto.getString("telefono");

                    Estudiante es = new Estudiante(nombre, apellido, cedula, direccion, telefono);
                    array.add(es);
                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return array;

    }
    
    public void POST(Map<String, String> fromdata) {
        try {
            URL url = new URL("http://localhost/QUINTO/api.php");
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            http.setRequestMethod("POST");
            http.connect();
            http.setDoOutput(true);
            
            StringBuilder formatDat = new StringBuilder();
            
            for (Map.Entry<String, String> entrada : fromdata.entrySet()) {
                if (formatDat.length() != 0) {
                    formatDat.append('&');
                    formatDat.append(entrada.getKey());
                    formatDat.append('=');
                    formatDat.append(entrada.getValue());
                }
            }
            OutputStream os = http.getOutputStream();
            OutputStreamWriter writer = new OutputStreamWriter(os);
            writer.write(formatDat.toString());
            
            int respuesta = http.getResponseCode();
            BufferedReader lector = new BufferedReader(new InputStreamReader(
                    http.getInputStream()
            ));
            
            StringBuilder response = new StringBuilder();
            String line;
            
            if ((line = lector.readLine()) != null) {
                response.append(line);
            }
            
            String respuestaDelServidor = response.toString();
            
            if (respuesta == 200 && !respuestaDelServidor.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Solicitud Exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "Solicitud Erronea");
            }
            
            http.getDoOutput();
            http.disconnect();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}