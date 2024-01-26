/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

import javax.swing.JTextField;

/**
 *
 * @author joelv
 */
public class UtcTextoNumeros extends JTextField{

    public UtcTextoNumeros() {
        this.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SoloNumeros(evt);
            }
        });
    }
    
    private void SoloNumeros(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }     
    
    public Integer getTextAsInteger() {
        Integer retorno = 0;
        
        if (this.getText() == null || this.getText().isEmpty()) {
            return retorno;
        } else {
            retorno = Integer.valueOf(this.getText());
        }
        return retorno;
    }
}
