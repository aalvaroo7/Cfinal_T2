package animales;

public class Maintenance {
    private String name;

    public Maintenance(String name) {
        this.name = name;
    }

    public void manageAnimal(animal animal) {
        // logic to manage an animal
        if (animal instanceof animal_acuatico) {
            // logic to manage aquatic animals
        } else if (animal instanceof animal_terrestre) {
            // logic to manage terrestrial animals
        } else if (animal instanceof animal_aviario) {
            // logic to manage aviary animals
        }
    }

    public void careForAnimal(animal animal) {
        // logic to care for an animal
        if (animal instanceof animal_acuatico) {
            // logic to care for aquatic animals
        } else if (animal instanceof animal_terrestre) {
            // logic to care for terrestrial animals
        } else if (animal instanceof animal_aviario) {
            // logic to care for aviary animals
        }
    }

    // Getter for name
    public String getName() {
        return this.name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
}