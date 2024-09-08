/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia.Entidades;

/**
 *
 * @author rramirez
 */
public class ClienteEntidad {

    int idCliente;
    String Nombre;
    String ApPaterno;
    String ApMaterno;
    boolean estatus;

    public ClienteEntidad() {
    }

    public ClienteEntidad(String Nombre, String ApPaterno, String ApMaterno, boolean estatus) {
        this.Nombre = Nombre;
        this.ApPaterno = ApPaterno;
        this.ApMaterno = ApMaterno;
        this.estatus = estatus;
    }

    public ClienteEntidad(int idCliente, String Nombre, String ApPaterno, String ApMaterno, boolean estatus) {
        this.idCliente = idCliente;
        this.Nombre = Nombre;
        this.ApPaterno = ApPaterno;
        this.ApMaterno = ApMaterno;
        this.estatus = estatus;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApPaterno() {
        return ApPaterno;
    }

    public void setApPaterno(String ApPaterno) {
        this.ApPaterno = ApPaterno;
    }

    public String getApMaterno() {
        return ApMaterno;
    }

    public void setApMaterno(String ApMaterno) {
        this.ApMaterno = ApMaterno;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "ClienteEntidad{" + "idCliente=" + idCliente + ", Nombre=" + Nombre + ", ApPaterno=" + ApPaterno + ", ApMaterno=" + ApMaterno + ", estatus=" + estatus + '}';
    }

}
