package main;

import java.util.List;
import gestion_recursos.Resource;

public class Staff extends Person {
    private List<Resource> resources;

    public Staff(List<Resource> resources) {
        this.resources = resources;
    }

    public String identify() {
        return "Staff";
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void manage() {
        System.out.println("Managing the resources...");
        for (Resource resource : resources) {
            System.out.println("Resource name: " + resource.getName());
            System.out.println("Current food: " + resource.getFood());
            System.out.println("Current medicine: " + resource.getMedicine());
            System.out.println("Current equipment: " + resource.getEquipment());
        }
    }
}