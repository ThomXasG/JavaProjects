
package ec.edu.carlos.builder;

public class MotorGasolina implements IMotor{
    int cilindraje=0;
    int potencia=0;

    @Override
    public void setPotencia(int potencia) {
        this.potencia=potencia;
    }

    @Override
    public void setCilindraje(int cilindraje) {
        this.cilindraje=cilindraje;
    }

    @Override
    public String getDefinicionMotor() {
        return "Cilindraje: " + this.cilindraje
                + "---------"+" Potencia: "+this.potencia;
    }

    @Override
    public String inyectarCombustible(int cantidad) {
        return String.format("Motor Gasolina: Inyecta %d ml",cantidad);
    }

    @Override
    public String consumirCombustible() {
        return "Motor Gasolina: Realiza combustion de Gasolina";
    }
    
    
}
