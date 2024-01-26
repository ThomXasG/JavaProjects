package ec.edu.charge.proxy.impl;

public class DefaultProcessExecutor implements IProcessExecutor {

    @Override
    public void executeProcess(int idProcess, String user, String password) throws Exception {
        System.out.println("Proceso: " + idProcess + " en ejecución...");

        for (int i = 0; i <= 10; i++) {
            Thread.sleep(600);
            System.out.println(i * 10 + "..");
        }

        System.out.println("Proceso: " + idProcess + " finalizado.");
    }
}
