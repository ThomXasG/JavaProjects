package ec.edu.carlos.builder;


import ec.edu.carlos.builder.Carroceria;


public class Vehiculo {
    public String color;
    public String marca;
    public String modelo;
    public IMotor tipoMotor;
    public Carroceria tipoCarroceria;
    public Rueda tipoRueda;
    protected boolean bloqueoCentralizado;
    protected boolean direccionAsistida;
    
    public String mostrarVehiculo(){
        StringBuilder sb=new StringBuilder();
        String nl= System.getProperty("line.separator");
        
        sb.append("El presente vehiculo es un: ").append(marca).
                append(" ").append(modelo);
        sb.append(" estilo ").append(tipoCarroceria.getTipoCarroceria()).append(nl);
        sb.append("Color: ").append(color).append(nl);
        sb.append(this.direccionAsistida ? "Con" : "Sin").append(" direccion asistida").append(nl);
        sb.append(this.bloqueoCentralizado ? "Con" : "Sin").append(" bloqueo centralizado").append(nl);
        sb.append("Carroceria de ").append(this.tipoCarroceria.getMaterial());
        sb.append(this.tipoCarroceria.isHabitaculoReforzado() ? " Con" : " Sin").append(" el habitaculo reforzado").append(nl);
        
        sb.append("Ruedas con llantas ").append(this.tipoRueda.getLlantas()).
                append("de ").append(this.tipoRueda.getDiametro()).append(" cm").append(nl);
        
        sb.append("Neumaticos ").append(this.tipoRueda.getNeumaticos()).append(nl);
        
        sb.append("Motor: ").append(this.tipoMotor.getDefinicionMotor()).append(nl);
        
        sb.append("Respuesta del motor: ").append(this.tipoMotor.inyectarCombustible(100));
        
        return sb.toString();
    }
}
