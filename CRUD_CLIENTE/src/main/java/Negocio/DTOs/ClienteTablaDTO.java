/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.DTOs;

/**
 *
 * @author rramirez
 */
public class ClienteTablaDTO {

    int id;
    String Nombre;
    String ApPaterno;
    String ApMaterno;
    boolean Estatus;

    public ClienteTablaDTO() {
    }

    public ClienteTablaDTO(String Nombre, String ApPaterno, String ApMaterno, boolean Estatus) {
        this.Nombre = Nombre;
        this.ApPaterno = ApPaterno;
        this.ApMaterno = ApMaterno;
        this.Estatus = Estatus;
    }

    public ClienteTablaDTO(int id, String Nombre, String ApPaterno, String ApMaterno, boolean Estatus) {
        this.id = id;
        this.Nombre = Nombre;
        this.ApPaterno = ApPaterno;
        this.ApMaterno = ApMaterno;
        this.Estatus = Estatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return Estatus;
    }

    public void setEstatus(boolean Estatus) {
        this.Estatus = Estatus;
    }

    @Override
    public String toString() {
        return "ClienteTablaDTO{" + "id=" + id + ", Nombre=" + Nombre + ", ApPaterno=" + ApPaterno + ", ApMaterno=" + ApMaterno + ", Estatus=" + Estatus + '}';
    }

}
