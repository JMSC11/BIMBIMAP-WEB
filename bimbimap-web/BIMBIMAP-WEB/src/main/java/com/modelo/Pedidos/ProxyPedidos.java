/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.modelo.Pedidos;


import com.modelo.Cuenta.GestorCuentas;
import java.sql.SQLException;
import java.util.LinkedList;

public class ProxyPedidos {
    
    LinkedList<Pedido> ListaPedidos = new LinkedList<>();
    Pedido pedido;
    int ID =0;
    
    /*protected void descargaPedidos() throws SQLException, ClassNotFoundException{
        ListaPedidos = new CRUD_pedidos().getLista();
    }
    
    public LinkedList<Pedido> getPedidos() throws SQLException, ClassNotFoundException{
        ListaPedidos = new CRUD_pedidos().getIdPedido(String.valueOf(new GestorCuentas().getId()));
        return ListaPedidos;
    }
    
    public LinkedList<Pedido> getHistorialPedidos(String id) throws SQLException, ClassNotFoundException{
        ListaPedidos = new CRUD_pedidos().getHistorialPedidos(id);
        return ListaPedidos;
    }
    
    public String getDetalles(String id) throws SQLException, ClassNotFoundException{
        return new CRUD_pedidos().getDetallesPedido(id);
    }
    
    boolean agregarPedido( int ID_Cliente, String pedido, String Status) {
        boolean respuesta;
        int i;
        
            try {
            descargaPedidos();
            
            if (ListaPedidos.isEmpty()){
                ID = 1;
            } else if(ListaPedidos.get(0).getIDPedido() > 1){
                ID = 1;
            } else if(ListaPedidos.size() >= 2){
                for (i=1; i<ListaPedidos.size(); i++){
                    int ant = ListaPedidos.get(i-1).getIDPedido();
                    int pos = ListaPedidos.get(i).getIDPedido();
                
                    if((pos - ant) != 1){
                       ID = ant + 1;
                       break;
                    }
                }
                if(i == ListaPedidos.size()){
                    ID = ListaPedidos.size();
                }
            } else{
                ID = 2;
            }
            
            if (ID != -1){
                respuesta = new CRUD_pedidos().agregarPedido(ID, ID_Cliente, pedido, Status);
                       
            } else{
                respuesta = false;
            }
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.toString());
            respuesta = false;
        }
        
        
       
        return respuesta;
    }
*/
    
}
