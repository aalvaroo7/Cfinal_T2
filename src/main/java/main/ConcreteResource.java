package main;

import gestion_recursos.Resource;

public class ConcreteResource extends Resource {
    public ConcreteResource() {
        super("ConcreteResource", 0, null);
    }


    public void manage() {
        // Add your management logic here
        System.out.println("Managing the concrete resource");
    }
}