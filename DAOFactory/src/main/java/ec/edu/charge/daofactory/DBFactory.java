/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.daofactory;

import ec.edu.charge.daofactory.impl.IDBAdapter;
import ec.edu.charge.daofactory.impl.MySQLDBAdapter;
import ec.edu.charge.daofactory.impl.PostgreDBAdapter;

/**
 *
 * @author joelv
 */
public class DBFactory {
    private IDBAdapter dbAdapter;
    
    public IDBAdapter getDBAdapter() {
        return this.dbAdapter;
    }
    
    public void createDBAdapter(DBType type) {
        if (type == DBType.MySQL) {
            this.dbAdapter = new MySQLDBAdapter();
        } else if (type == DBType.PostgreSQL) {
            this.dbAdapter = new PostgreDBAdapter();
        } else {
            throw new IllegalArgumentException("No Soportado");
        }
    }
}
