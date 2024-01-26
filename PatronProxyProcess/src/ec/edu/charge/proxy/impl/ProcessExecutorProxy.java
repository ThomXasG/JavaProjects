package ec.edu.charge.proxy.impl;

import ec.edu.charge.proxy.service.AuditService;
import ec.edu.charge.proxy.service.SecurityService;

public class ProcessExecutorProxy implements IProcessExecutor{
    @Override
    public void executeProcess(int idProcess, String user, String password) throws Exception {
        SecurityService securityService = new SecurityService();

        if (!securityService.authorization(user, password)) {
            throw new Exception("Usuario " + user + " no tiene permiso para ejecutar el proceso");
        }

        DefaultProcessExecutor defaultProcessExecutor = new DefaultProcessExecutor();
        defaultProcessExecutor.executeProcess(idProcess, user, password);

        AuditService auditService = new AuditService();
        auditService.auditServiceUsed(user, DefaultProcessExecutor.class.getName());
    }
}
