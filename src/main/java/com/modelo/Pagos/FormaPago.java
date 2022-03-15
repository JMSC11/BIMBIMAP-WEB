/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.modelo.Pagos;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "Forma_Pago")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FormaPago.findAll", query = "SELECT f FROM FormaPago f"),
    @NamedQuery(name = "FormaPago.findByIDFormaPago", query = "SELECT f FROM FormaPago f WHERE f.iDFormaPago = :iDFormaPago"),
    @NamedQuery(name = "FormaPago.findByFormaPago", query = "SELECT f FROM FormaPago f WHERE f.formaPago = :formaPago")})
public class FormaPago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Forma_Pago")
    private Integer iDFormaPago;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Forma_Pago")
    private String formaPago;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "iDFromaPago")
    private Collection<Pago> pagoCollection;
*/
    public FormaPago() {
    }

    public FormaPago(Integer iDFormaPago) {
        this.iDFormaPago = iDFormaPago;
    }

    public FormaPago(Integer iDFormaPago, String formaPago) {
        this.iDFormaPago = iDFormaPago;
        this.formaPago = formaPago;
    }

    public Integer getIDFormaPago() {
        return iDFormaPago;
    }

    public void setIDFormaPago(Integer iDFormaPago) {
        this.iDFormaPago = iDFormaPago;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

   /* @XmlTransient
    public Collection<Pago> getPagoCollection() {
        return pagoCollection;
    }

    public void setPagoCollection(Collection<Pago> pagoCollection) {
        this.pagoCollection = pagoCollection;
    }
*/
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDFormaPago != null ? iDFormaPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormaPago)) {
            return false;
        }
        FormaPago other = (FormaPago) object;
        if ((this.iDFormaPago == null && other.iDFormaPago != null) || (this.iDFormaPago != null && !this.iDFormaPago.equals(other.iDFormaPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.FormaPago[ iDFormaPago=" + iDFormaPago + " ]";
    }
    
}
