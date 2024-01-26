/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.adapterFormas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/**
 *
 * @author joelv
 */
public class CuadroTextoAdaptar implements IForma{
    JTextPane text;
    JFrame ventana;

    public CuadroTextoAdaptar() {
        text = new JTextPane();
        ventana = new JFrame("JTextPane");
    }
    
    @Override
    public void dibujar() {
        try {
            SimpleAttributeSet attrs = new SimpleAttributeSet();
            
            // Negrita
            StyleConstants.setBold(attrs, true);
            
            // Cursiva
            StyleConstants.setItalic(attrs, true);
            StyleConstants.setUnderline(attrs, true);
            StyleConstants.setFontSize(attrs, 20);
            text.getStyledDocument().insertString(text.getStyledDocument().getLength(), "Hola Mundo", attrs);
        } catch (BadLocationException ex) {
            Logger.getLogger(CuadroTextoAdaptar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
