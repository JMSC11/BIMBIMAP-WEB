package com.modelo.Pedidos;

import com.modelo.Cuenta.GestorCuentas;
import java.sql.SQLException;
import java.util.LinkedList;

public class GestorPedidos {
        private static final ProxyPedidos proxy = new ProxyPedidos();

       /* public boolean agregarPedido(int ID_Cliente, String pedido, String Status) {
            return proxy.agregarPedido( ID_Cliente,  pedido, Status);        
        }
        
        public LinkedList<Pedido> getPedidos() throws SQLException, ClassNotFoundException{
            return proxy.getPedidos();
        }
        
        public String getDetalles(String id) throws SQLException, ClassNotFoundException{
            return proxy.getDetalles(id);
        }
        
        public LinkedList<Pedido> getHistorialPedidos() throws SQLException, ClassNotFoundException{
            return proxy.getHistorialPedidos(String.valueOf(new GestorCuentas().getId()));
        }   
*/
}
