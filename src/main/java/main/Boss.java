package main;

import gestion_habitats.habitats;
import gestion_personal.Camera;
import gestion_recursos.Resource;
import java.util.List;
public class Boss {
    private List<gestion_habitats.habitats> habitats;
    private List<Camera> cameras;
    private List<Resource> resources;

    public Boss(List<habitats> habitats, List<Camera> cameras, List<Resource> resources) {
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

    public List<Camera> getCameras() {
        return cameras;
    }

    public List<Resource> getResources() {
        return resources;
    }
}