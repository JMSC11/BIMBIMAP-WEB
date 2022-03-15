/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.modelo.Pagos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author misae
 */
@Entity
@Table(name = "Pago")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pago.findAll", query = "SELECT p FROM Pago p"),
    @NamedQuery(name = "Pago.findByIDPago", query = "SELECT p FROM Pago p WHERE p.iDPago = :iDPago"),
    @NamedQuery(name = "Pago.findByFecha", query = "SELECT p FROM Pago p WHERE p.fecha = :fecha"),
    @NamedQuery(name = "Pago.findByTotalPago", query = "SELECT p FROM Pago p WHERE p.totalPago = :totalPago"),
    @NamedQuery(name = "Pago.findByEfectivo", query = "SELECT p FROM Pago p WHERE p.efectivo = :efectivo"),
    @NamedQuery(name = "Pago.findByCambio", query = "SELECT p FROM Pago p WHERE p.cambio = :cambio"),
    @NamedQuery(name = "Pago.findByDescuento", query = "SELECT p FROM Pago p WHERE p.descuento = :descuento")})
public class Pago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Pago")
    private Integer iDPago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "Total_Pago")
    private BigDecimal totalPago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Efectivo")
    private BigDecimal efectivo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cambio")
    private BigDecimal cambio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Descuento")
    private BigDecimal descuento;
    /*@JoinTable(name = "Pedido_Pago", joinColumns = {
        @JoinColumn(name = "ID_Pago", referencedColumnName = "ID_Pago")}, inverseJoinColumns = {
        @JoinColumn(name = "ID_Pedido", referencedColumnName = "ID_Pedido")})
    @ManyToMany
    private Collection<Pedido> pedidoCollection;
    @JoinColumn(name = "ID_Froma_Pago", referencedColumnName = "ID_Forma_Pago")
    @ManyToOne(optional = false)
    private FormaPago iDFromaPago;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDPago")
    private Collection<PagosTarjeta> pagosTarjetaCollection;
*/
    public Pago() {
    }

    public Pago(Integer iDPago) {
        this.iDPago = iDPago;
    }

    public Pago(Integer iDPago, Date fecha, BigDecimal totalPago, BigDecimal efectivo, BigDecimal cambio, BigDecimal descuento) {
        this.iDPago = iDPago;
        this.fecha = fecha;
        this.totalPago = totalPago;
        this.efectivo = efectivo;
        this.cambio = cambio;
        this.descuento = descuento;
    }

    public Integer getIDPago() {
        return iDPago;
    }

    public void setIDPago(Integer iDPago) {
        this.iDPago = iDPago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(BigDecimal totalPago) {
        this.totalPago = totalPago;
    }

    public BigDecimal getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(BigDecimal efectivo) {
        this.efectivo = efectivo;
    }

    public BigDecimal getCambio() {
        return cambio;
    }

    public void setCambio(BigDecimal cambio) {
        this.cambio = cambio;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    /*@XmlTransient
    public Collection<Pedido> getPedidoCollection() {
        return pedidoCollection;
    }

    public void setPedidoCollection(Collection<Pedido> pedidoCollection) {
        this.pedidoCollection = pedidoCollection;
    }

    public FormaPago getIDFromaPago() {
        return iDFromaPago;
    }

    public void setIDFromaPago(FormaPago iDFromaPago) {
        this.iDFromaPago = iDFromaPago;
    }

    @XmlTransient
    public Collection<PagosTarjeta> getPagosTarjetaCollection() {
        return pagosTarjetaCollection;
    }

    public void setPagosTarjetaCollection(Collection<PagosTarjeta> pagosTarjetaCollection) {
        this.pagosTarjetaCollection = pagosTarjetaCollection;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPago != null ? iDPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pago)) {
            return false;
        }
        Pago other = (Pago) object;
        if ((this.iDPago == null && other.iDPago != null) || (this.iDPago != null && !this.iDPago.equals(other.iDPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Pago[ iDPago=" + iDPago + " ]";
    }
    
}
