package gestion_recursos;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private String name;
    private List<Resource> resources = new ArrayList<>();

    public Supplier(String name) {
        this.name = name;
    }

    // Method to add a resource
    public void addResource(Resource resource) {
        resources.add(resource);
    }

    // Method to remove a resource
    public void removeResource(Resource resource) {
        resources.remove(resource);
    }

    // Method to check if a resource is in the supplier
    public boolean checkResource(Resource resource) {
        return resources.contains(resource);
    }

    // methods to add resources to the supplier
}