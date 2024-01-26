package ec.edu.carlos.adapterFormas;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/**
 *
 * @author g4to1
 */
public class CuadroTextoAdaptador implements IForma {

    JTextPane text;
    JFrame ventana;

    public CuadroTextoAdaptador() {
        ventana = new JFrame("JTextPane");
        text = new JTextPane();
    }

    @Override
    public void dibujar() {
        try {
            SimpleAttributeSet attrs = new SimpleAttributeSet();
            //negrita
            StyleConstants.setBold(attrs, true);
            //curia
            StyleConstants.setItalic(attrs, true);
            StyleConstants.setUnderline(attrs, true);
            StyleConstants.setFontSize(attrs, 20);
            text.getStyledDocument().insertString(text.getStyledDocument().getLength(), "Hola mundo", attrs);
        } catch (BadLocationException e) {
            System.out.println(e);
        }
        ventana.add(text);
        ventana.pack();
        ventana.setVisible(true);

    }

}
