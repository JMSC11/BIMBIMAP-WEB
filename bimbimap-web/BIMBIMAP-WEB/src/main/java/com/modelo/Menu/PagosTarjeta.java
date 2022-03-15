/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.modelo.Menu;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author misae
 */
@Entity
@Table(name = "Pagos_Tarjeta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PagosTarjeta.findAll", query = "SELECT p FROM PagosTarjeta p"),
    @NamedQuery(name = "PagosTarjeta.findByIDPagoTarjeta", query = "SELECT p FROM PagosTarjeta p WHERE p.iDPagoTarjeta = :iDPagoTarjeta"),
    @NamedQuery(name = "PagosTarjeta.findByNombreTitular", query = "SELECT p FROM PagosTarjeta p WHERE p.nombreTitular = :nombreTitular"),
    @NamedQuery(name = "PagosTarjeta.findByNumeroTransaccion", query = "SELECT p FROM PagosTarjeta p WHERE p.numeroTransaccion = :numeroTransaccion"),
    @NamedQuery(name = "PagosTarjeta.findByFechaExpedicionMes", query = "SELECT p FROM PagosTarjeta p WHERE p.fechaExpedicionMes = :fechaExpedicionMes"),
    @NamedQuery(name = "PagosTarjeta.findByFechaExpedicionA\u00f1o", query = "SELECT p FROM PagosTarjeta p WHERE p.fechaExpedicionA\u00f1o = :fechaExpedicionA\u00f1o"),
    @NamedQuery(name = "PagosTarjeta.findByCodigoExpedicion", query = "SELECT p FROM PagosTarjeta p WHERE p.codigoExpedicion = :codigoExpedicion")})
public class PagosTarjeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Pago_Tarjeta")
    private Integer iDPagoTarjeta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Nombre_Titular")
    private String nombreTitular;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Numero_Transaccion")
    private String numeroTransaccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "Fecha_Expedicion_Mes")
    private String fechaExpedicionMes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "Fecha_Expedicion_A\u00f1o")
    private String fechaExpedicionAño;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Codigo_Expedicion")
    private String codigoExpedicion;

    /*@JoinColumn(name = "ID_Pago", referencedColumnName = "ID_Pago")
    @ManyToOne(optional = false)
    private Pago iDPago;
*/
    public PagosTarjeta() {
    }

    public PagosTarjeta(Integer iDPagoTarjeta) {
        this.iDPagoTarjeta = iDPagoTarjeta;
    }

    public PagosTarjeta(Integer iDPagoTarjeta, String nombreTitular, String numeroTransaccion, String fechaExpedicionMes, String fechaExpedicionAño, String codigoExpedicion) {
        this.iDPagoTarjeta = iDPagoTarjeta;
        this.nombreTitular = nombreTitular;
        this.numeroTransaccion = numeroTransaccion;
        this.fechaExpedicionMes = fechaExpedicionMes;
        this.fechaExpedicionAño = fechaExpedicionAño;
        this.codigoExpedicion = codigoExpedicion;
    }

    public Integer getIDPagoTarjeta() {
        return iDPagoTarjeta;
    }

    public void setIDPagoTarjeta(Integer iDPagoTarjeta) {
        this.iDPagoTarjeta = iDPagoTarjeta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getNumeroTransaccion() {
        return numeroTransaccion;
    }

    public void setNumeroTransaccion(String numeroTransaccion) {
        this.numeroTransaccion = numeroTransaccion;
    }

    public String getFechaExpedicionMes() {
        return fechaExpedicionMes;
    }

    public void setFechaExpedicionMes(String fechaExpedicionMes) {
        this.fechaExpedicionMes = fechaExpedicionMes;
    }

    public String getFechaExpedicionAño() {
        return fechaExpedicionAño;
    }

    public void setFechaExpedicionAño(String fechaExpedicionAño) {
        this.fechaExpedicionAño = fechaExpedicionAño;
    }

    public String getCodigoExpedicion() {
        return codigoExpedicion;
    }

    public void setCodigoExpedicion(String codigoExpedicion) {
        this.codigoExpedicion = codigoExpedicion;
    }

  

   /* public Pago getIDPago() {
        return iDPago;
    }

    public void setIDPago(Pago iDPago) {
        this.iDPago = iDPago;
    }
*/
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPagoTarjeta != null ? iDPagoTarjeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PagosTarjeta)) {
            return false;
        }
        PagosTarjeta other = (PagosTarjeta) object;
        if ((this.iDPagoTarjeta == null && other.iDPagoTarjeta != null) || (this.iDPagoTarjeta != null && !this.iDPagoTarjeta.equals(other.iDPagoTarjeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.PagosTarjeta[ iDPagoTarjeta=" + iDPagoTarjeta + " ]";
    }
    
}
