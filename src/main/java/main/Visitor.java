package main;

import animales.animal;
import gestion_habitats.habitats;
import gestion_personal.Camera;

public class Visitor extends Person {
    private habitats habitat;
    private Camera state;
    private animal observedAnimal;

    public Visitor(habitats habitat, Camera state, animal observedAnimal) {
        this.habitat = habitat;
        this.state = state;
        this.observedAnimal = observedAnimal;
    }

    public String identify() {
        return "Visitor";
    }

    public habitats getHabitat() {
        return habitat;
    }

    public Camera getState() {
        return state;
    }

    public animal getObservedAnimal() {
        return observedAnimal;
    }

}