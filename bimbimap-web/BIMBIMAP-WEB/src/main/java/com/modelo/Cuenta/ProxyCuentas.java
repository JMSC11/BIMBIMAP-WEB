package com.modelo.Cuenta;



import com.modelo.clasesDAO.CuentasDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProxyCuentas {
    
    List<CuentaCliente> listaClientes = new ArrayList<CuentaCliente>();
    List<CuentaGerente> listaGerentes = new ArrayList<CuentaGerente>();
    List<CuentaEmpleados> listaEmpleados = new ArrayList<CuentaEmpleados>();
    
 

    CuentaCliente cliente;
    CuentaGerente gerente;
    CuentaEmpleados empleado;

   
    protected void descargaCuentasCliente() throws SQLException, ClassNotFoundException{
       
        listaClientes = new CuentasDAO().getListaClientes();
         System.out.println("Descargando cuentas cliente.. \n");
        
    }
    protected void descargaCuentasGerente() throws SQLException, ClassNotFoundException{
        listaGerentes = new CuentasDAO().getListaGerente();
         System.out.println("Descargando cuentas gerente.. \n");
    }
    protected void descargaCuentasEmpleados() throws SQLException, ClassNotFoundException{
        listaEmpleados = new CuentasDAO().getListaEmpleados();
         System.out.println("Descargando cuentas empleados.. \n");
    }
 
    protected void descargaCuentas() throws SQLException, ClassNotFoundException{
        this.descargaCuentasCliente();
        this.descargaCuentasGerente();
        this.descargaCuentasEmpleados();

    }
    
    
    protected String getConfirmarCredenciales(String usuario, String contra) throws SQLException, ClassNotFoundException {
        String respuesta = "ninguno";    
        this.descargaCuentas();
        System.out.println("buscando en  cuentas cliente.. \n");
        for (CuentaCliente cadaCuenta : listaClientes){
             System.out.println("buscando en for cuentas cliente.. \n");
            if (cadaCuenta.getUserName().equals(usuario) &&
                cadaCuenta.getPassword().equals(contra)){
                System.out.println("credenciales correctas.. \n");
                cliente = cadaCuenta; 
    
                respuesta = cliente.getTipoCuenta();
                System.out.println(respuesta);
          
                break;
            }
        } 
        
    
        if (respuesta.equals("ninguno")){
            for (CuentaEmpleados cadaCuenta : listaEmpleados){
                System.out.println("buscando en for cuentas empleados.. \n");
                if (cadaCuenta.getUserName().equals(usuario) &&
                    cadaCuenta.getPassword().equals(contra)){
                    System.out.println("credenciales correctas.. \n");
                    empleado = cadaCuenta;               
                    respuesta = empleado.getTipoCuenta();
                    break;
                }
            }    
        }

   /*     if (respuesta.equals("ninguno")){
            for (Cuenta_Cocinero cadaCuenta : ListaCuentasCocinero){
                if (cadaCuenta.getCorreo().equals(usuario) &&
                    cadaCuenta.getPassword().equals(contra)){
                
                    Cocinero = cadaCuenta;               
                    respuesta = Cocinero.getTipoCuenta();
                    break;
                }
            }    
        }*/
   
        if (respuesta.equals("ninguno")){
            for (CuentaGerente cadaCuenta : listaGerentes){
                System.out.println("buscando en for cuentas gerente.. \n");
                if (cadaCuenta.getUserName().equals(usuario) &&
                    cadaCuenta.getPassword().equals(contra)){
                    System.out.println("credenciales correctas.. \n");
                    gerente = cadaCuenta;    
                    respuesta = gerente.getTipoCuenta();
                    break;
                }
            }    
        }

       /* if (respuesta.equals("ninguno")){
            for (Cuenta_Repartidor cadaCuenta : ListaCuentasRepartidor){
                if (cadaCuenta.getCorreo().equals(usuario) &&
                    cadaCuenta.getPassword().equals(contra)){
                
                    Repartidor = cadaCuenta;
                    respuesta = Repartidor.getTipoCuenta();
                    break;
                }
            }    
        }*/
        
        return respuesta;
    }

    protected String getNombreCliente() {
        return cliente.getNombre();
    }
    
    protected int getIDCliente(){
        return cliente.getIDCliente();
    }

   /* protected boolean agregarCuentaCliente(String nombre, String apellidop, String apellidom, String usuario, String password, String mail, String telefono) {
        boolean respuesta;
        int ID = -1;
        int i;
                
        try {
            descargaCuentas();
            
            if (listaClientes.isEmpty()){
                ID = 1;
            } else if(listaClientes.get(0).getIDCliente() > 1){
                ID = 1;
            } else if(listaClientes.size() >= 2){
                for (i=1; i<listaClientes.size(); i++){
                    int ant = listaClientes.get(i-1).getIDCliente();
                    int pos = listaClientes.get(i).getIDCliente();
                
                    if((pos - ant) != 1){
                       ID = ant + 1;
                       break;
                    }
                }
                if(i == listaClientes.size()){
                    ID = listaClientes.size();
                }
            } else{
                ID = 2;
            }
            
            if (ID != -1){
                respuesta = new CRUD_cuentas().agregarCuentaCliente(ID, nombre, apellidop, apellidom,
                        usuario, password, mail, telefono);
            } else{
                respuesta = false;
            }
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.toString());
            respuesta = false;
        }
        
        return respuesta;
    }*/
    
    
}
