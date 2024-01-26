
package ec.edu.carlos.builder;

public interface IMotor {
    void setPotencia(int potencia);
    void setCilindraje(int cilindraje);
    String getDefinicionMotor();
    String inyectarCombustible(int cantidad);
    String consumirCombustible();
    
}
