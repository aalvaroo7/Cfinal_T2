package animales;

public class Maintenance {
    private String name;

    public Maintenance(String name) {
        this.name = name;
    }

    public void manageAnimal(animales animal) {
        // logic to manage an animal
        if (animal instanceof animal_acuaticos) {
            // logic to manage aquatic animals
        } else if (animal instanceof animal_terrestres) {
            // logic to manage terrestrial animals
        } else if (animal instanceof animal_aviarios) {
            // logic to manage aviary animals
        }
    }

    public void careForAnimal(animales animal) {
        // logic to care for an animal
        if (animal instanceof animal_acuaticos) {
            // logic to care for aquatic animals
        } else if (animal instanceof animal_terrestres) {
            // logic to care for terrestrial animals
        } else if (animal instanceof animal_aviarios) {
            // logic to care for aviary animals
        }
    }

    // getters and setters
}