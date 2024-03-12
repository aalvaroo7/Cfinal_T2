package main;

import java.util.List;

public class Boss extends Person {
    private List<Habitat> habitats;
    private List<Camera> cameras;
    private List<Resource> resources;

    public Boss(List<Habitat> habitats, List<Camera> cameras, List<Resource> resources) {
        this.habitats = habitats;
        this.cameras = cameras;
        this.resources = resources;
    }

    public String identify() {
        return "Boss";
    }

    public List<Habitat> getHabitats() {
        return habitats;
    }

    public List<Camera> getCameras() {
        return cameras;
    }

    public List<Resource> getResources() {
        return resources;
    }
}