/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.modelo.Menu;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "Platillo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Platillo.findAll", query = "SELECT p FROM Platillo p"),
    @NamedQuery(name = "Platillo.findByIDPlatillo", query = "SELECT p FROM Platillo p WHERE p.iDPlatillo = :iDPlatillo"),
    @NamedQuery(name = "Platillo.findByNombre", query = "SELECT p FROM Platillo p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Platillo.findByDescripcion", query = "SELECT p FROM Platillo p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Platillo.findByPrecio", query = "SELECT p FROM Platillo p WHERE p.precio = :precio"),
    @NamedQuery(name = "Platillo.findByCategoria", query = "SELECT p FROM Platillo p WHERE p.categoria = :categoria")})
public class Platillo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Platillo")
    private Integer iDPlatillo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "Descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "Precio")
    private BigDecimal precio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Categoria")
    private String categoria;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "Imagen")
    private byte[] imagen;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "iDPlatillo")
    private Collection<CuentaGerente> cuentaGerenteCollection;
*/
    public Platillo() {
    }

    public Platillo(Integer iDPlatillo) {
        this.iDPlatillo = iDPlatillo;
    }

    public Platillo(Integer iDPlatillo, String nombre, String descripcion, BigDecimal precio, String categoria, byte[] imagen) {
        this.iDPlatillo = iDPlatillo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.imagen = imagen;
    }

    public Integer getIDPlatillo() {
        return iDPlatillo;
    }

    public void setIDPlatillo(Integer iDPlatillo) {
        this.iDPlatillo = iDPlatillo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    /*@XmlTransient
    public Collection<CuentaGerente> getCuentaGerenteCollection() {
        return cuentaGerenteCollection;
    }

    public void setCuentaGerenteCollection(Collection<CuentaGerente> cuentaGerenteCollection) {
        this.cuentaGerenteCollection = cuentaGerenteCollection;
    }
*/
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPlatillo != null ? iDPlatillo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Platillo)) {
            return false;
        }
        Platillo other = (Platillo) object;
        if ((this.iDPlatillo == null && other.iDPlatillo != null) || (this.iDPlatillo != null && !this.iDPlatillo.equals(other.iDPlatillo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Platillo[ iDPlatillo=" + iDPlatillo + " ]";
    }
    
}
