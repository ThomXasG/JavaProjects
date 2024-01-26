
package ec.edu.carlos.builder;

public class Pizza {
    private String masa;
    private String salsa;
    private String relleno;
    
    public String mostrarPizza(){
        StringBuilder sb=new StringBuilder();
        String nl= System.getProperty("line.separator");
        
        sb.append("Soy una Pizza con masa: ").append(masa).append(", con salsa: ").append(salsa).append(nl).append("Y de relleno: ").append(relleno).append(nl);
        return sb.toString();
    }

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
    
    
}
