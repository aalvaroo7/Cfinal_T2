package main;

import gestion_habitats.habitats;
import gestion_recursos.Recursos;
import seguridad.Seguridad;

import java.util.List;

public class Boss extends Person {
    private List<habitats> habitats;
    private List<Seguridad> cameras;
    private List<Recursos> resources;

    public Boss(List<habitats> habitats, List<Seguridad> cameras, List<Recursos> resources) {
        this.habitats = habitats;
        this.cameras = cameras;
        this.resources = resources;
    }

    public String identify() {
        return "Boss";
    }

    public List<habitats> getHabitats() {
        return habitats;
    }

    public List<Seguridad> getCameras() {
        return cameras;
    }

    public List<Recursos> getResources() {
        return resources;
    }
}