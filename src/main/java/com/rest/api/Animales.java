package com.rest.api;

public class Animales {
    private String nombre;
    private String tipo;
    private int edad;
    private int peso;
    private String color;

    public Animales(String nombre, String tipo, int edad, int peso, String color) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.peso = peso;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
