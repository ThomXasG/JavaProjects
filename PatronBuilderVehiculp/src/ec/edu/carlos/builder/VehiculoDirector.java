package ec.edu.carlos.builder;

public class VehiculoDirector {
    private VehiculoBuilder builder;

    public VehiculoDirector(VehiculoBuilder builder) {
        this.builder = builder;
    }
    
    public void construirVehiculo(){
        this.builder.nuevoVehiculo();
        this.builder.definirVehiculo();
        this.builder.construirMotor();
        this.builder.construirCarroceria();
        this.builder.construirRuedas();
        this.builder.definirExtras();
        
    }
    
    public Vehiculo getVehiculo(){
        return builder.getVehiculo();
    }
}
