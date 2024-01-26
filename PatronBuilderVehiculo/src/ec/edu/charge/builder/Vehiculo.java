/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.builder;

/**
 *
 * @author joelv
 */
public class Vehiculo {
    protected String color;
    protected String marca;
    protected String modelo;
    protected IMotor tipoMotor;
    protected Carroceria tipoCarroceria;
    protected Rueda tipoRueda;
    protected boolean bloqueoCentralizado;
    protected boolean direccionAsistida;
    
    public String mostrarVehiculo() {
        StringBuilder sb = new StringBuilder();
        String nl = System.getProperty("line.separator");
        
        sb.append("El presente vehiculo es un ").append(marca)
                .append(" ").append(modelo).append(nl);
        sb.append("Estilo ").append(tipoCarroceria.getTipoCarroceria()).append(nl);
        sb.append("Color ").append(color).append(nl);
        sb.append(this.direccionAsistida ? "Con " : "Sin ")
                .append("Direccion asistida").append(nl);
        sb.append(this.bloqueoCentralizado ? "Con " : "Sin ")
                .append("Bloqueo Centralizado").append(nl);
        sb.append("Carroceria de ").append(this.tipoCarroceria.getMaterial());
        sb.append(this.tipoCarroceria.isHabitaculoReforzado() ? "Con " : "Sin ")
                .append("el habitaculo reforzado").append(nl);
        sb.append("Ruedas con llantas ").append(this.tipoRueda.getLlanta())
                .append(" de ").append(this.tipoRueda.getDiametro()).append(" cm")
                .append(nl);
        sb.append("Neumaticos: ").append(this.tipoRueda.getNeumatico()).append(nl);
        sb.append("Motor: ").append(this.tipoMotor.getDefinicionMotor()).append(nl);
        sb.append("Respuesta de Motor: ").append(this.tipoMotor.inyectarCombustible(100));
        
        return sb.toString();
    }
}
