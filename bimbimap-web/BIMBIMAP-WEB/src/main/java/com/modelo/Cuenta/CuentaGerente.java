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
@Table(name = "Cuenta_Gerente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CuentaGerente.findAll", query = "SELECT c FROM CuentaGerente c"),
    @NamedQuery(name = "CuentaGerente.findByIDGerente", query = "SELECT c FROM CuentaGerente c WHERE c.iDGerente = :iDGerente"),
    @NamedQuery(name = "CuentaGerente.findByNombre", query = "SELECT c FROM CuentaGerente c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CuentaGerente.findByApellidoP", query = "SELECT c FROM CuentaGerente c WHERE c.apellidoP = :apellidoP"),
    @NamedQuery(name = "CuentaGerente.findByApellidoM", query = "SELECT c FROM CuentaGerente c WHERE c.apellidoM = :apellidoM"),
    @NamedQuery(name = "CuentaGerente.findByCorreo", query = "SELECT c FROM CuentaGerente c WHERE c.correo = :correo"),
    @NamedQuery(name = "CuentaGerente.findByUserName", query = "SELECT c FROM CuentaGerente c WHERE c.userName = :userName"),
    @NamedQuery(name = "CuentaGerente.findByPassword", query = "SELECT c FROM CuentaGerente c WHERE c.password = :password"),
    @NamedQuery(name = "CuentaGerente.findByTelefono", query = "SELECT c FROM CuentaGerente c WHERE c.telefono = :telefono"),
    @NamedQuery(name = "CuentaGerente.findByTipoCuenta", query = "SELECT c FROM CuentaGerente c WHERE c.tipoCuenta = :tipoCuenta")})
public class CuentaGerente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Gerente")
    private Integer iDGerente;
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
   /* @JoinColumn(name = "ID_Mesa", referencedColumnName = "ID_Mesa")
    @ManyToOne(optional = false)
    private Mesa iDMesa;
    @JoinColumn(name = "ID_Pedido", referencedColumnName = "ID_Pedido")
    @ManyToOne(optional = false)
    private Pedido iDPedido;
    @JoinColumn(name = "ID_Platillo", referencedColumnName = "ID_Platillo")
    @ManyToOne(optional = false)
    private Platillo iDPlatillo;
*/
    public CuentaGerente() {
    }

    public CuentaGerente(Integer iDGerente) {
        this.iDGerente = iDGerente;
    }

    public CuentaGerente(Integer iDGerente, String nombre, String apellidoP, String apellidoM, String correo, String userName, String password, String telefono, String tipoCuenta) {
        this.iDGerente = iDGerente;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.correo = correo;
        this.userName = userName;
        this.password = password;
        this.telefono = telefono;
        this.tipoCuenta = tipoCuenta;
    }

    public Integer getIDGerente() {
        return iDGerente;
    }

    public void setIDGerente(Integer iDGerente) {
        this.iDGerente = iDGerente;
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

    /*public Mesa getIDMesa() {
        return iDMesa;
    }

    public void setIDMesa(Mesa iDMesa) {
        this.iDMesa = iDMesa;
    }

    public Pedido getIDPedido() {
        return iDPedido;
    }

    public void setIDPedido(Pedido iDPedido) {
        this.iDPedido = iDPedido;
    }

    public Platillo getIDPlatillo() {
        return iDPlatillo;
    }

    public void setIDPlatillo(Platillo iDPlatillo) {
        this.iDPlatillo = iDPlatillo;
    }
*/
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDGerente != null ? iDGerente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CuentaGerente)) {
            return false;
        }
        CuentaGerente other = (CuentaGerente) object;
        if ((this.iDGerente == null && other.iDGerente != null) || (this.iDGerente != null && !this.iDGerente.equals(other.iDGerente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.CuentaGerente[ iDGerente=" + iDGerente + " ]";
    }
    
}
