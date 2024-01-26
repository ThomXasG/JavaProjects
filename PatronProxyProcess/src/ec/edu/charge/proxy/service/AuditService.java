/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.proxy.service;

import java.text.SimpleDateFormat;

/**
 *
 * @author joelv
 */
public class AuditService {
    public void auditServiceUsed(String user, String service) {
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(user + " utilizando el servicio > " + service + " a las " + formater.format(System.currentTimeMillis()));
    }
}
