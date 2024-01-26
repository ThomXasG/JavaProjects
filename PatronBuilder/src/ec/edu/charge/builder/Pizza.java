/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.builder;

/**
 *
 * @author joelv
 */
public class Pizza {
    private String masa;
    private String salsa;
    private String relleno;

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }
    
    public String mostrarPizza() {
        StringBuilder sb = new StringBuilder();
        String nl = System.getProperty("line.separator");
        
        sb.append("Pizza {").append(nl);
        sb.append("\tmasa = ").append(masa).append(",").append(nl);
        sb.append("\tsalsa = ").append(salsa).append(",").append(nl);
        sb.append("\trelleno = ").append(relleno).append(",").append(nl);
        sb.append("}");
        
        return sb.toString();
    }

}
