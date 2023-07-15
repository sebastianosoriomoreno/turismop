package com.example.pruebapueblofinal.moldes;

public class Restaurantesmodel {
    private String nombre;
    private String descripcion;
    private String rengoPrecion;
    int foto;

    public Restaurantesmodel() {

    }

    public Restaurantesmodel(String nombre, String descripcion, String rengoPrecion, int foto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.rengoPrecion = rengoPrecion;
        this.foto = foto;
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

    public String getRengoPrecion() {
        return rengoPrecion;
    }

    public void setRengoPrecion(String rengoPrecion) {
        this.rengoPrecion = rengoPrecion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
