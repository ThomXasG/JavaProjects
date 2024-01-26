package ec.edu.carlos.builder;

public class AppVehiculo {

    public static void main(String[] args) {
        VehiculoDirector directorAudi = new VehiculoDirector(new VehiculoAudiBuilder());
        directorAudi.construirVehiculo();
        
        Vehiculo audiA3 = directorAudi.getVehiculo();
        
        System.out.println("Primer Vehiculo");
        System.out.println("================");
        System.out.println(audiA3.mostrarVehiculo());
        
        VehiculoDirector directorBMW = new VehiculoDirector(new VehiculoBMWBuilder());
        directorBMW.construirVehiculo();
        
        Vehiculo bmw = directorBMW.getVehiculo();
        
        System.out.println("Segundo Vehiculo");
        System.out.println("================");
        System.out.println(bmw.mostrarVehiculo());
    }
    
}
