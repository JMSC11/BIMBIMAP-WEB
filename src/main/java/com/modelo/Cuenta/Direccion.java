/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.modelo.Cuenta;

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
@Table(name = "Direccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Direccion.findAll", query = "SELECT d FROM Direccion d"),
    @NamedQuery(name = "Direccion.findByIDDireccion", query = "SELECT d FROM Direccion d WHERE d.iDDireccion = :iDDireccion"),
    @NamedQuery(name = "Direccion.findByCalle", query = "SELECT d FROM Direccion d WHERE d.calle = :calle"),
    @NamedQuery(name = "Direccion.findByCodigoPostal", query = "SELECT d FROM Direccion d WHERE d.codigoPostal = :codigoPostal"),
    @NamedQuery(name = "Direccion.findByNumeroExterno", query = "SELECT d FROM Direccion d WHERE d.numeroExterno = :numeroExterno"),
    @NamedQuery(name = "Direccion.findByNumeroInterno", query = "SELECT d FROM Direccion d WHERE d.numeroInterno = :numeroInterno"),
    @NamedQuery(name = "Direccion.findByCalle1", query = "SELECT d FROM Direccion d WHERE d.calle1 = :calle1"),
    @NamedQuery(name = "Direccion.findByCalle2", query = "SELECT d FROM Direccion d WHERE d.calle2 = :calle2"),
    @NamedQuery(name = "Direccion.findByIndicacionesAdicionales", query = "SELECT d FROM Direccion d WHERE d.indicacionesAdicionales = :indicacionesAdicionales")})
public class Direccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Direccion")
    private Integer iDDireccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Calle")
    private String calle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Codigo_Postal")
    private String codigoPostal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Numero_Externo")
    private String numeroExterno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Numero_Interno")
    private String numeroInterno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Calle1")
    private String calle1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Calle2")
    private String calle2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Indicaciones_Adicionales")
    private String indicacionesAdicionales;
    /*@JoinColumn(name = "ID_Cliente", referencedColumnName = "ID_Cliente")
    @ManyToOne(optional = false)
    private CuentaCliente iDCliente;
*/
    public Direccion() {
    }

    public Direccion(Integer iDDireccion) {
        this.iDDireccion = iDDireccion;
    }

    public Direccion(Integer iDDireccion, String calle, String codigoPostal, String numeroExterno, String numeroInterno, String calle1, String calle2, String indicacionesAdicionales) {
        this.iDDireccion = iDDireccion;
        this.calle = calle;
        this.codigoPostal = codigoPostal;
        this.numeroExterno = numeroExterno;
        this.numeroInterno = numeroInterno;
        this.calle1 = calle1;
        this.calle2 = calle2;
        this.indicacionesAdicionales = indicacionesAdicionales;
    }

    public Integer getIDDireccion() {
        return iDDireccion;
    }

    public void setIDDireccion(Integer iDDireccion) {
        this.iDDireccion = iDDireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getNumeroExterno() {
        return numeroExterno;
    }

    public void setNumeroExterno(String numeroExterno) {
        this.numeroExterno = numeroExterno;
    }

    public String getNumeroInterno() {
        return numeroInterno;
    }

    public void setNumeroInterno(String numeroInterno) {
        this.numeroInterno = numeroInterno;
    }

    public String getCalle1() {
        return calle1;
    }

    public void setCalle1(String calle1) {
        this.calle1 = calle1;
    }

    public String getCalle2() {
        return calle2;
    }

    public void setCalle2(String calle2) {
        this.calle2 = calle2;
    }

    public String getIndicacionesAdicionales() {
        return indicacionesAdicionales;
    }

    public void setIndicacionesAdicionales(String indicacionesAdicionales) {
        this.indicacionesAdicionales = indicacionesAdicionales;
    }

   /* public CuentaCliente getIDCliente() {
        return iDCliente;
    }

    public void setIDCliente(CuentaCliente iDCliente) {
        this.iDCliente = iDCliente;
    }
*/
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDDireccion != null ? iDDireccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Direccion)) {
            return false;
        }
        Direccion other = (Direccion) object;
        if ((this.iDDireccion == null && other.iDDireccion != null) || (this.iDDireccion != null && !this.iDDireccion.equals(other.iDDireccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Direccion[ iDDireccion=" + iDDireccion + " ]";
    }
    
}
