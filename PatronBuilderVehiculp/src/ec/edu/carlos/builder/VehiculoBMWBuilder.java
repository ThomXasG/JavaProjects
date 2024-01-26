package ec.edu.carlos.builder;

/**
 *
 * @author g4to1
 */
public class VehiculoBMWBuilder extends VehiculoBuilder{
    
    @Override
    public void definirVehiculo() {
        this.vehiculo.marca="BMW";
        this.vehiculo.modelo="X6 M";
    }

    @Override
    public void construirRuedas() {
        this.vehiculo.tipoRueda=new Rueda();
        this.vehiculo.tipoRueda.setDiametro(17);
        this.vehiculo.tipoRueda.setLlantas("hierro");
        this.vehiculo.tipoRueda.setNeumaticos("Pirelli");
        
    }

    @Override
    public void construirCarroceria() {
        this.vehiculo.tipoCarroceria=new Carroceria();
        this.vehiculo.tipoCarroceria.setTipoCarroceria("Monovalente");
        this.vehiculo.tipoCarroceria.setHabitaculoReforzado(false);
        this.vehiculo.tipoCarroceria.setMaterial("Acero");
        this.vehiculo.color="Negro";
    }

    @Override
    public void construirMotor() {
        this.vehiculo.tipoMotor=new MotorGasolina();
        this.vehiculo.tipoMotor.setPotencia(560);
        this.vehiculo.tipoMotor.setCilindraje(4300);
    }

    @Override
    public void definirExtras() {
        this.vehiculo.bloqueoCentralizado=true;
        this.vehiculo.direccionAsistida=false;
    }
    
    
}
