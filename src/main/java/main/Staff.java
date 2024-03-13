package main;

import gestion_recursos.Recursos;
import java.util.List;

public class Staff extends Person {
    private List<Recursos> resources;

    public Staff(List<Recursos> resources) {
        this.resources = resources;
    }

    public String identify() {
        return "Staff";
    }

    public List<Recursos> getResources() {
        return resources;
    }

    public void manage() {
        System.out.println("Managing the resources...");
        for (Recursos resource : resources) {
            System.out.println("Current food: " + resource.obtenerTotalAlimentos());
            System.out.println("Current medicine: " + resource.obtenerTotalMedicamentos());
            System.out.println("Current personnel: " + resource.obtenerTotalPersonal());
        }
    }
}