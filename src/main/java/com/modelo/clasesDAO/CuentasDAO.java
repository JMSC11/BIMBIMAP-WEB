/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.modelo.clasesDAO;

import Util.HibernateUtil;
import com.modelo.Cuenta.CuentaCliente;
import com.modelo.Cuenta.CuentaEmpleados;
import com.modelo.Cuenta.CuentaGerente;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author misae
 */
public class CuentasDAO {

    public CuentasDAO() {
        
    }
    public List<CuentaCliente> getListaClientes(){
        List<CuentaCliente> clientes = new ArrayList<CuentaCliente>();
        SessionFactory sessFact = HibernateUtil.getSessionFactory();
        Session session = sessFact.getCurrentSession();
        Transaction tr = null;
        
        try{
            tr = session.beginTransaction();
            clientes = session.createQuery("Select a from CuentaCliente a", CuentaCliente.class).getResultList();
            System.out.println("Descargando cuentas cliente.. \n");
        }catch(Exception ex){
            if(tr != null){
                tr.rollback();
            }
            ex.printStackTrace();
            clientes=null;
            
        }finally{
            session.close();
            sessFact.close();
        }
        return clientes;
    }
        public List<CuentaGerente> getListaGerente(){
        List<CuentaGerente> gerentes = new ArrayList<CuentaGerente>();
        SessionFactory sessFact = HibernateUtil.getSessionFactory();
        Session session = sessFact.getCurrentSession();
        Transaction tr = null;
        
        try{
            tr = session.beginTransaction();
            gerentes = session.createQuery("Select a from CuentaGerente a", CuentaGerente.class).getResultList();
            System.out.println("Descargando cuentas gerente.. \n");
        }catch(Exception ex){
            if(tr != null){
                tr.rollback();
            }
            ex.printStackTrace();
            gerentes=null;
            
        }finally{
            session.close();
            sessFact.close();
        }
        return gerentes;
    }

        public List<CuentaEmpleados> getListaEmpleados(){
        List<CuentaEmpleados> empleados = new ArrayList<CuentaEmpleados>();
        SessionFactory sessFact = HibernateUtil.getSessionFactory();
        Session session = sessFact.getCurrentSession();
        Transaction tr = null;
        
        try{
            tr = session.beginTransaction();
            empleados = session.createQuery("Select a from CuentaEmpleados a", CuentaEmpleados.class).getResultList();
            System.out.println("Descargando cuentas empleados.. \n");
        }catch(Exception ex){
            if(tr != null){
                tr.rollback();
            }
            ex.printStackTrace();
            empleados=null;
            
        }finally{
            session.close();
            sessFact.close();
        }
        return empleados;
    }        
    /*
    Devuelve un cliente por su ID
    */
        public CuentaCliente obtenerCliente(int IDuser){


        CuentaCliente cliente = new CuentaCliente();
        SessionFactory sessFact = HibernateUtil.getSessionFactory();
        Session session = sessFact.getCurrentSession();
        Transaction tr = null;

        try{
            tr = session.beginTransaction();
            cliente = session.get(CuentaCliente.class, IDuser);
           
        }catch(Exception ex){
            if(tr != null){
                tr.rollback();
            }
            ex.printStackTrace();
            cliente = null;
            
        }finally{
            session.close();
            sessFact.close();
        }
        return cliente;
    }
        /*
        Agregar cuenta cliente.
        */
    public boolean addCliente(int ID, String nombre, String apellidop, String apellidom, String usuario, String password, String mail, String telefono){
        SessionFactory sessFact = HibernateUtil.getSessionFactory();
        Session session = sessFact.getCurrentSession();
        Transaction tr = null;
        
        try {
            tr = session.beginTransaction();
            CuentaCliente cliente = new CuentaCliente();
            cliente.setIDCliente(ID);
            cliente.setNombre(nombre);
            cliente.setApellidoP(apellidop);
            cliente.setApellidoM(apellidom);
            cliente.setUserName(usuario);
            cliente.setPassword(password);
            cliente.setCorreo(mail);
            cliente.setTelefono(telefono);
            
            session.save(cliente);
            tr.commit();
            return true;
        }catch(Exception ex){
            if(tr != null){
                tr.rollback();
            }
            ex.printStackTrace();
            return false;
        }finally{
            session.close();
            sessFact.close();
        }        
    }
}
