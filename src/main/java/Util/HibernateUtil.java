/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author misae
 */
public class HibernateUtil {
    
    public static SessionFactory getSessionFactory(){
        SessionFactory sessionFactory;
        try{
            //Create the session factory from hibernate.cfg.xml
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex){
            //Make Sure you log the exeption as it might be swallowed
            System.err.println("Error al cargar la factoria de sesiones" + ex);
            throw new ExceptionInInitializerError(ex);
        }
        return sessionFactory;
    }
    
}
