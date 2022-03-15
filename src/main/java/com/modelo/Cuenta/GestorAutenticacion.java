package com.modelo.Cuenta;

import java.sql.SQLException;

public class GestorAutenticacion {

    public GestorAutenticacion(){}
    
    // Para iniciar sesión
    public String VerificarCuenta(){
        return "algo";
    }
    // Para sacar el nombre personalizado en el Menu del Cliente
    public String getNombreCliente(){
        return new GestorCuentas().getNombreCliente();
    }
    
    // Borrar informacion estatica por algun motivo

    public String getConfirmarCredenciales(String usuario, String contra) throws ClassNotFoundException, SQLException {
        System.out.println("llamando a gestor. \n");
        return new GestorCuentas().getConfirmarCredenciales(usuario, contra);
    }
    
    public void descargaCuentas() throws SQLException, ClassNotFoundException{
        new GestorCuentas().descargaCuentas();
    }
/*
    public boolean agregarCuentaCliente(String nombre, String apellidop, String apellidom, String usuario, String password, String mail, String telefono) {
        return new GestorCuentas().agregarCuentaCliente(nombre, apellidop, apellidom, usuario, password, mail, telefono);
    }
    */
    public int getId(){
        return new GestorCuentas().getId();
    }
}
