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
@Table(name = "Cuenta_Empleados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CuentaEmpleados.findAll", query = "SELECT c FROM CuentaEmpleados c"),
    @NamedQuery(name = "CuentaEmpleados.findByIDCuentaEmpleados", query = "SELECT c FROM CuentaEmpleados c WHERE c.iDCuentaEmpleados = :iDCuentaEmpleados"),
    @NamedQuery(name = "CuentaEmpleados.findByNombre", query = "SELECT c FROM CuentaEmpleados c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CuentaEmpleados.findByApellidoP", query = "SELECT c FROM CuentaEmpleados c WHERE c.apellidoP = :apellidoP"),
    @NamedQuery(name = "CuentaEmpleados.findByApellidoM", query = "SELECT c FROM CuentaEmpleados c WHERE c.apellidoM = :apellidoM"),
    @NamedQuery(name = "CuentaEmpleados.findByCorreo", query = "SELECT c FROM CuentaEmpleados c WHERE c.correo = :correo"),
    @NamedQuery(name = "CuentaEmpleados.findByUserName", query = "SELECT c FROM CuentaEmpleados c WHERE c.userName = :userName"),
    @NamedQuery(name = "CuentaEmpleados.findByPassword", query = "SELECT c FROM CuentaEmpleados c WHERE c.password = :password"),
    @NamedQuery(name = "CuentaEmpleados.findByTelefono", query = "SELECT c FROM CuentaEmpleados c WHERE c.telefono = :telefono"),
    @NamedQuery(name = "CuentaEmpleados.findByTipoCuenta", query = "SELECT c FROM CuentaEmpleados c WHERE c.tipoCuenta = :tipoCuenta")})
public class CuentaEmpleados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Cuenta_Empleados")
    private Integer iDCuentaEmpleados;
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
    @Size(min = 1, max = 13)
    @Column(name = "Telefono")
    private String telefono;

    @Basic(optional = false)
    @NotNull
    @Column(name = "Tipo_Cuenta")
    private String tipoCuenta;
    /*@JoinColumn(name = "ID_Mesa", referencedColumnName = "ID_Mesa")
    @ManyToOne(optional = false)
    private Mesa iDMesa;
*/
    public CuentaEmpleados() {
    }

    public CuentaEmpleados(Integer iDCuentaEmpleados) {
        this.iDCuentaEmpleados = iDCuentaEmpleados;
    }

    public CuentaEmpleados(Integer iDCuentaEmpleados, String nombre, String apellidoP, String apellidoM, String correo, String userName, String password, String telefono, String puesto, String tipoCuenta) {
        this.iDCuentaEmpleados = iDCuentaEmpleados;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.correo = correo;
        this.userName = userName;
        this.password = password;
        this.telefono = telefono;
        this.tipoCuenta = tipoCuenta;
    }

    public Integer getIDCuentaEmpleados() {
        return iDCuentaEmpleados;
    }

    public void setIDCuentaEmpleados(Integer iDCuentaEmpleados) {
        this.iDCuentaEmpleados = iDCuentaEmpleados;
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

   /* public Mesa getIDMesa() {
        return iDMesa;
    }

    public void setIDMesa(Mesa iDMesa) {
        this.iDMesa = iDMesa;
    }
*/
 
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CuentaEmpleados)) {
            return false;
        }
        CuentaEmpleados other = (CuentaEmpleados) object;
        if ((this.iDCuentaEmpleados == null && other.iDCuentaEmpleados != null) || (this.iDCuentaEmpleados != null && !this.iDCuentaEmpleados.equals(other.iDCuentaEmpleados))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CuentaEmpleados{" + "iDCuentaEmpleados=" + iDCuentaEmpleados + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + 
                ", correo=" + correo + ", userName=" + userName + ", password=" + password + ", telefono=" + telefono + ", tipoCuenta=" + tipoCuenta + '}';
    }

    

    
}
