/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.modelo.Cuenta;

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
@Table(name = "Cuenta_Cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CuentaCliente.findAll", query = "SELECT c FROM CuentaCliente c"),
    @NamedQuery(name = "CuentaCliente.findByIDCliente", query = "SELECT c FROM CuentaCliente c WHERE c.iDCliente = :iDCliente"),
    @NamedQuery(name = "CuentaCliente.findByNombre", query = "SELECT c FROM CuentaCliente c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CuentaCliente.findByApellidoP", query = "SELECT c FROM CuentaCliente c WHERE c.apellidoP = :apellidoP"),
    @NamedQuery(name = "CuentaCliente.findByApellidoM", query = "SELECT c FROM CuentaCliente c WHERE c.apellidoM = :apellidoM"),
    @NamedQuery(name = "CuentaCliente.findByCorreo", query = "SELECT c FROM CuentaCliente c WHERE c.correo = :correo"),
    @NamedQuery(name = "CuentaCliente.findByUserName", query = "SELECT c FROM CuentaCliente c WHERE c.userName = :userName"),
    @NamedQuery(name = "CuentaCliente.findByPassword", query = "SELECT c FROM CuentaCliente c WHERE c.password = :password"),
    @NamedQuery(name = "CuentaCliente.findByTelefono", query = "SELECT c FROM CuentaCliente c WHERE c.telefono = :telefono"),
    @NamedQuery(name = "CuentaCliente.findByTipoCuenta", query = "SELECT c FROM CuentaCliente c WHERE c.tipoCuenta = :tipoCuenta")})
public class CuentaCliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Cliente")
    private Integer iDCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ApellidoP")
    private String apellidoP;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ApellidoM")
    private String apellidoM;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Correo")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "UserName")
    private String userName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Telefono")
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Tipo_Cuenta")
    private String tipoCuenta;
   /* @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDCliente")
    private Collection<Mesa> mesaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDCliente")
    private Collection<Pedido> pedidoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDCliente")
    private Collection<Direccion> direccionCollection;*/

    public CuentaCliente() {
    }

    public CuentaCliente(Integer iDCliente) {
        this.iDCliente = iDCliente;
    }

    public CuentaCliente(Integer iDCliente, String nombre, String apellidoP, String apellidoM, String correo, String userName, String password, String telefono, String tipoCuenta) {
        this.iDCliente = iDCliente;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.correo = correo;
        this.userName = userName;
        this.password = password;
        this.telefono = telefono;
        this.tipoCuenta = tipoCuenta;
    }

    public Integer getIDCliente() {
        return iDCliente;
    }

    public void setIDCliente(Integer iDCliente) {
        this.iDCliente = iDCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

   /* @XmlTransient
    public Collection<Mesa> getMesaCollection() {
        return mesaCollection;
    }

    public void setMesaCollection(Collection<Mesa> mesaCollection) {
        this.mesaCollection = mesaCollection;
    }

    @XmlTransient
    public Collection<Pedido> getPedidoCollection() {
        return pedidoCollection;
    }

    public void setPedidoCollection(Collection<Pedido> pedidoCollection) {
        this.pedidoCollection = pedidoCollection;
    }

    @XmlTransient
    public Collection<Direccion> getDireccionCollection() {
        return direccionCollection;
    }

    public void setDireccionCollection(Collection<Direccion> direccionCollection) {
        this.direccionCollection = direccionCollection;
    }
*/
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDCliente != null ? iDCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CuentaCliente)) {
            return false;
        }
        CuentaCliente other = (CuentaCliente) object;
        if ((this.iDCliente == null && other.iDCliente != null) || (this.iDCliente != null && !this.iDCliente.equals(other.iDCliente))) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "CuentaCliente{" + "iDCliente=" + iDCliente + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + 
                ", correo=" + correo + ", userName=" + userName + ", password=" + password + ", telefono=" + telefono + ", tipoCuenta=" + tipoCuenta + '}';
    }

    
}
