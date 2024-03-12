package main;

import gestion_recursos.Resource;
import animales.animal;
import java.util.List;

public class Staff extends Person {
    private List<Resource> resources;
    private List<animal> animals;

    public Staff(List<Resource> resources, List<animal> animals) {
        this.resources = resources;
        this.animals = animals;
    }

    public String identify() {
        return "Staff";
    }

    public List<Resource> getResources() {
        return resources;
    }

    public List<animal> getAnimals() {
        return animals;
    }
}