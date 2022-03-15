package com.modelo.Cuenta;

import java.sql.SQLException;

public class GestorCuentas {
    
    private static final ProxyCuentas proxy = new ProxyCuentas();
    
    public String getNombreCliente() {
        return proxy.getNombreCliente();
    }
    
    public ProxyCuentas getProxy(){
        return proxy;
    }

    /*protected boolean agregarCuentaCliente(String nombre, String apellidop, String apellidom, String usuario, String password, String mail, String telefono) {
        return proxy.agregarCuentaCliente(nombre, apellidop, apellidom, usuario, password, mail, telefono);
    }*/
    
    public int getId(){
        return proxy.getIDCliente();
    }
    
    protected String getConfirmarCredenciales(String usuario, String contra) throws ClassNotFoundException, SQLException {
        System.out.println("llamando a proxy. \n");
        return proxy.getConfirmarCredenciales(usuario, contra);
    }

    protected void descargaCuentas() throws SQLException, ClassNotFoundException {
        proxy.descargaCuentas();
    }
}
