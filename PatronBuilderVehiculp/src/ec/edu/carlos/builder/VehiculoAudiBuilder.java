package ec.edu.carlos.builder;

/**
 *
 * @author g4to1
 */
public class VehiculoAudiBuilder extends VehiculoBuilder{

    @Override
    public void definirVehiculo() {
        this.vehiculo.marca="Audi";
        this.vehiculo.modelo="A3 Sportback";
    }

    @Override
    public void construirRuedas() {
        this.vehiculo.tipoRueda=new Rueda();
        this.vehiculo.tipoRueda.setDiametro(17);
        this.vehiculo.tipoRueda.setLlantas("Aluminio");
        this.vehiculo.tipoRueda.setNeumaticos("Pirelli");
        
    }

    @Override
    public void construirCarroceria() {
        this.vehiculo.tipoCarroceria=new Carroceria();
        this.vehiculo.tipoCarroceria.setTipoCarroceria("Deportivo");
        this.vehiculo.tipoCarroceria.setHabitaculoReforzado(true);
        this.vehiculo.tipoCarroceria.setMaterial("Fibra de carbono");
        this.vehiculo.color="Plata cromado";
    }

    @Override
    public void construirMotor() {
        this.vehiculo.tipoMotor=new MotorDisel();
        this.vehiculo.tipoMotor.setPotencia(300);
        this.vehiculo.tipoMotor.setCilindraje(2600);
    }

    @Override
    public void definirExtras() {
        this.vehiculo.bloqueoCentralizado=true;
        this.vehiculo.direccionAsistida=true;
    }
    
}
