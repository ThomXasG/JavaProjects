
package ec.edu.carlos.builder;

public abstract class VehiculoBuilder {
    protected Vehiculo vehiculo;
    
    public void nuevoVehiculo(){
        this.vehiculo=new Vehiculo();
    }
    
    public Vehiculo getVehiculo(){
        return this.vehiculo;
    }
    
    //region de los metodos abstractos
    
    public abstract void definirVehiculo();
    public abstract void construirRuedas();
    public abstract void construirCarroceria();
    public abstract void construirMotor();
    public abstract void definirExtras();
    
}
