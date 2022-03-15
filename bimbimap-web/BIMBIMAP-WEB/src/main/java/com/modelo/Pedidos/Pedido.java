/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.modelo.Pedidos;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author misae
 */
@Entity
@Table(name = "Pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p"),
    @NamedQuery(name = "Pedido.findByIDPedido", query = "SELECT p FROM Pedido p WHERE p.iDPedido = :iDPedido"),
    @NamedQuery(name = "Pedido.findByPedido", query = "SELECT p FROM Pedido p WHERE p.pedido = :pedido"),
    @NamedQuery(name = "Pedido.findByEstatus", query = "SELECT p FROM Pedido p WHERE p.estatus = :estatus")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Pedido")
    private Integer iDPedido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "Pedido")
    private String pedido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Estatus")
    private String estatus;
    /*@ManyToMany(mappedBy = "pedidoCollection")
    private Collection<Pago> pagoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDPedido")
    private Collection<CuentaGerente> cuentaGerenteCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDPedido")
    private Collection<Mesa> mesaCollection;
    @JoinColumn(name = "ID_Cliente", referencedColumnName = "ID_Cliente")
    @ManyToOne(optional = false)
    private CuentaCliente iDCliente;
*/
    public Pedido() {
    }

    public Pedido(Integer iDPedido) {
        this.iDPedido = iDPedido;
    }

    public Pedido(Integer iDPedido, String pedido, String estatus) {
        this.iDPedido = iDPedido;
        this.pedido = pedido;
        this.estatus = estatus;
    }

    public Integer getIDPedido() {
        return iDPedido;
    }

    public void setIDPedido(Integer iDPedido) {
        this.iDPedido = iDPedido;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    /*@XmlTransient
    public Collection<Pago> getPagoCollection() {
        return pagoCollection;
    }

    public void setPagoCollection(Collection<Pago> pagoCollection) {
        this.pagoCollection = pagoCollection;
    }

    @XmlTransient
    public Collection<CuentaGerente> getCuentaGerenteCollection() {
        return cuentaGerenteCollection;
    }

    public void setCuentaGerenteCollection(Collection<CuentaGerente> cuentaGerenteCollection) {
        this.cuentaGerenteCollection = cuentaGerenteCollection;
    }

    @XmlTransient
    public Collection<Mesa> getMesaCollection() {
        return mesaCollection;
    }

    public void setMesaCollection(Collection<Mesa> mesaCollection) {
        this.mesaCollection = mesaCollection;
    }

    public CuentaCliente getIDCliente() {
        return iDCliente;
    }

    public void setIDCliente(CuentaCliente iDCliente) {
        this.iDCliente = iDCliente;
    }
*/
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPedido != null ? iDPedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.iDPedido == null && other.iDPedido != null) || (this.iDPedido != null && !this.iDPedido.equals(other.iDPedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Pedido[ iDPedido=" + iDPedido + " ]";
    }
    
}
