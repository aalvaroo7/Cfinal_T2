package main;

import animales.animal;

public class Visitor {
    private String nombre;
    private int edad;

    public Visitor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void visitarAnimal(animal animal) {
        System.out.println("El visitante " + nombre + " está viendo al animal: " + animal.getNombre());
        animal.manage();
    }
}