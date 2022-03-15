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
@Table(name = "Mesa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mesa.findAll", query = "SELECT m FROM Mesa m"),
    @NamedQuery(name = "Mesa.findByIDMesa", query = "SELECT m FROM Mesa m WHERE m.iDMesa = :iDMesa"),
    @NamedQuery(name = "Mesa.findByNumPersonas", query = "SELECT m FROM Mesa m WHERE m.numPersonas = :numPersonas"),
    @NamedQuery(name = "Mesa.findByMaxPersonas", query = "SELECT m FROM Mesa m WHERE m.maxPersonas = :maxPersonas")})
public class Mesa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Mesa")
    private Integer iDMesa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Num_Personas")
    private String numPersonas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Max_Personas")
    private String maxPersonas;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "iDMesa")
    private Collection<CuentaGerente> cuentaGerenteCollection;
    @JoinColumn(name = "ID_Pedido", referencedColumnName = "ID_Pedido")
    @ManyToOne(optional = false)
    private Pedido iDPedido;
    @JoinColumn(name = "ID_Cliente", referencedColumnName = "ID_Cliente")
    @ManyToOne(optional = false)
    private CuentaCliente iDCliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDMesa")
    private Collection<CuentaEmpleados> cuentaEmpleadosCollection;*/

    public Mesa() {
    }

    public Mesa(Integer iDMesa) {
        this.iDMesa = iDMesa;
    }

    public Mesa(Integer iDMesa, String numPersonas, String maxPersonas) {
        this.iDMesa = iDMesa;
        this.numPersonas = numPersonas;
        this.maxPersonas = maxPersonas;
    }

    public Integer getIDMesa() {
        return iDMesa;
    }

    public void setIDMesa(Integer iDMesa) {
        this.iDMesa = iDMesa;
    }

    public String getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(String numPersonas) {
        this.numPersonas = numPersonas;
    }

    public String getMaxPersonas() {
        return maxPersonas;
    }

    public void setMaxPersonas(String maxPersonas) {
        this.maxPersonas = maxPersonas;
    }

   /* @XmlTransient
    public Collection<CuentaGerente> getCuentaGerenteCollection() {
        return cuentaGerenteCollection;
    }

    public void setCuentaGerenteCollection(Collection<CuentaGerente> cuentaGerenteCollection) {
        this.cuentaGerenteCollection = cuentaGerenteCollection;
    }

    public Pedido getIDPedido() {
        return iDPedido;
    }

    public void setIDPedido(Pedido iDPedido) {
        this.iDPedido = iDPedido;
    }

    public CuentaCliente getIDCliente() {
        return iDCliente;
    }

    public void setIDCliente(CuentaCliente iDCliente) {
        this.iDCliente = iDCliente;
    }

    @XmlTransient
    public Collection<CuentaEmpleados> getCuentaEmpleadosCollection() {
        return cuentaEmpleadosCollection;
    }

    public void setCuentaEmpleadosCollection(Collection<CuentaEmpleados> cuentaEmpleadosCollection) {
        this.cuentaEmpleadosCollection = cuentaEmpleadosCollection;
    }
*/
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDMesa != null ? iDMesa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mesa)) {
            return false;
        }
        Mesa other = (Mesa) object;
        if ((this.iDMesa == null && other.iDMesa != null) || (this.iDMesa != null && !this.iDMesa.equals(other.iDMesa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Mesa[ iDMesa=" + iDMesa + " ]";
    }
    
}
