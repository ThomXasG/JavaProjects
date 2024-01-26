package ec.edu.charge.bridge;

import ec.edu.charge.bridge.abstrac.AdvanceRemote;
import ec.edu.charge.bridge.abstrac.BasicRemote;
import ec.edu.charge.bridge.imp.IDevice;
import ec.edu.charge.bridge.imp.Radio;

/**
 *
 * @author joelv
 */
public class AppBridge {
    public static void main(String[] args) {
        testDevice(new Radio());
    }
    
    public static void testDevice(IDevice device) {
        System.out.println("Prueba con un control remoto basico");
        
        BasicRemote basicRemote = new BasicRemote(device);

        basicRemote.togglePower();
        basicRemote.volumeUp();
        basicRemote.channelUp();
        device.printState();
        
        basicRemote.volumeDown();
        basicRemote.togglePower();
        device.printState();
        
        System.out.println("Prueba con el control remoto avanzado");
        AdvanceRemote advanceRemote = new AdvanceRemote(device);
        
        advanceRemote.togglePower();
        advanceRemote.volumeUp();
        advanceRemote.mute();
        device.printState();
    }
}
