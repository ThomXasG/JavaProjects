/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author joelv
 */
public class FuncionesVentana {
    public void centrarVentana(JFrame ventana) {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) (pantalla.getWidth() - ventana.getWidth()) / 2; 
        int y = (int) (pantalla.getHeight()- ventana.getHeight()) / 2; 
        
        ventana.setLocation(x, y);
    }
    
    public void abrirVentana(JFrame ventana1, JFrame ventana2) {
        ventana1.dispose();
        ventana2.setVisible(true);
    }
    
    
}
