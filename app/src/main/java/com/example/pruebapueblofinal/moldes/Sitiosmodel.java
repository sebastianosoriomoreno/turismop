package com.example.pruebapueblofinal.moldes;

public class Sitiosmodel {
    private String nombre;
    private double telefomo;

    public Sitiosmodel() {

    }

    public Sitiosmodel(String nombre, double telefomo) {
        this.nombre = nombre;
        this.telefomo = telefomo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTelefomo() {
        return telefomo;
    }

    public void setTelefomo(double telefomo) {
        this.telefomo = telefomo;
    }
}
