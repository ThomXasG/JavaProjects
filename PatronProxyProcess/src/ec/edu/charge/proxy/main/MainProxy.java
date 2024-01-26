package ec.edu.charge.proxy.main;

import ec.edu.charge.proxy.impl.IProcessExecutor;
import ec.edu.charge.proxy.impl.ServiceFactory;

import javax.swing.*;

public class MainProxy {
    public static void main(String[] args) {
        String user, password;
        int process = 1;

        user = JOptionPane.showInputDialog(null, "Ingrese su usuario: ",
                "ingreso de datos", JOptionPane.INFORMATION_MESSAGE);
        password = JOptionPane.showInputDialog(null, "Ingrese su contraseña: ",
                "ingreso de datos", JOptionPane.INFORMATION_MESSAGE);

        IProcessExecutor proxy = ServiceFactory.createProcessExecutor();

        try {
            proxy.executeProcess(process, user, password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
