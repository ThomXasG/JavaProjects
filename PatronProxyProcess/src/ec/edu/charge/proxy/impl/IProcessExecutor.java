package ec.edu.charge.proxy.impl;

public interface IProcessExecutor {
    public void executeProcess(int idProcess, String user, String password) throws Exception;
}
