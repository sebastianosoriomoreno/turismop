package com.example.pruebapueblofinal.moldes;

public class Moldehotel {

    private String nom;
    private String precio;
    private int foto;


    public Moldehotel() {
    }

    public Moldehotel(String nom, String precio, int foto) {
        this.nom = nom;
        this.precio = precio;
        this.foto = foto;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}

