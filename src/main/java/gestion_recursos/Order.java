package gestion_recursos;
import java.util.ArrayList;
import java.util.List;
public class Order {
    private List<Resource> resources = new ArrayList<>();

    // Method to add a resource
    public void addResource(Resource resource) {
        resources.add(resource);
    }

    // Method to remove a resource
    public void removeResource(Resource resource) {
        resources.remove(resource);
    }

    // Method to check if a resource is in the order
    public boolean checkResource(Resource resource) {
        return resources.contains(resource);
    }
}