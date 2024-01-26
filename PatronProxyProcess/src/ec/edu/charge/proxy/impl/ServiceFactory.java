package ec.edu.charge.proxy.impl;

public class ServiceFactory {
    public static IProcessExecutor createProcessExecutor() {
        return new ProcessExecutorProxy();
    }
}
