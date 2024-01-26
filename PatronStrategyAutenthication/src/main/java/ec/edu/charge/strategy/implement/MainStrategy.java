package ec.edu.charge.strategy.implement;

import ec.edu.charge.strategy.providers.OnMemoryAuthenticationProvider;
import ec.edu.charge.strategy.providers.SQLAuthenticationProvier;
import ec.edu.charge.strategy.providers.XMLAuthenticationProvider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainStrategy {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        AuthenticationContext contexto;
        contexto = new AuthenticationContext();
        char pregunta;
        String usuario, password;

        do {
            System.out.println("Tipo de Auntetificacion a utilizar:" + "\n"
                    + "1. OnMemory Authentication" + "\n"
                    + "2. SQL Authentication" + "\n"
                    + "3. XML Authentication" + "\n");
            System.out.println("Por favor, Seleccione una opción: ");
            String opcion = reader.readLine();
            if (opcion.equals("1")) {
                System.out.println("Authentication OnMemory selecionada =>");
                contexto.setAuthenticationStrategy(new OnMemoryAuthenticationProvider());
            } else if (opcion.equals("2")) {
                System.out.println("Authentication SQL selecionada =>");
                contexto.setAuthenticationStrategy(new SQLAuthenticationProvier());
            } else if (opcion.equals("3")) {
                System.out.println("Authentication XML selecionada =>");
                contexto.setAuthenticationStrategy(new XMLAuthenticationProvider());
            }
            System.out.println("");
            System.out.println("Favor autenticarse:");
            System.out.println("Usuartio: ");
            usuario = reader.readLine();
            System.out.println("Contraseña: ");
            password = reader.readLine();
            Principal p1 = contexto.authenticate(usuario, password);
            if(p1!=null){
                System.out.println("Autentificación Exitosa!.");
                System.out.println(p1.toString());
                pregunta = 'N';
            }else{
                System.out.println("Usuario o Contraseña Invalidos..");
                System.out.println("Desea cambiar el Método de autenticación? (S/N) = ");
                pregunta = reader.readLine().toUpperCase().charAt(0);
            }


        } while (pregunta == 'S');
    }
}
