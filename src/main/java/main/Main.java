package main;
import animales.animal_acuatico;
import animales.animal_aviario;
import animales.animal_terrestre;
import gestion_habitats.habitats;
import gestion_personal.Camera;
import gestion_recursos.Resource;
import animales.animal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué tipo de persona eres? (staff, boss, visitor)");
        String userType = scanner.nextLine();

        Person user;

        // Create three aquatic animals
        animal_acuatico aquaticAnimal1 = new animal_acuatico("Shark", "Fish", "Great White", "Grey", "Male", "10", "2000kg", "6m", "Predator", "Ocean", "Fish", "Eggs", "None", "None", "None", 1, true, true, true, true, true, "Saltwater");
        animal_acuatico aquaticAnimal2 = new animal_acuatico("Dolphin", "Mammal", "Bottlenose", "Grey", "Female", "8", "150kg", "2.5m", "Mammal", "Ocean", "Fish", "Live Birth", "None", "None", "None", 2, true, true, false, false, false, "Saltwater");
        animal_acuatico aquaticAnimal3 = new animal_acuatico("Turtle", "Reptile", "Green Sea Turtle", "Green", "Male", "80", "150kg", "1.5m", "Reptile", "Ocean", "Seagrass", "Eggs", "None", "None", "None", 3, true, true, false, true, true, "Saltwater");

        // Create three aviary animals
        animal_aviario aviaryAnimal1 = new animal_aviario("Eagle", "Bird", "Bald Eagle", "Brown and White", "Male", "5", "7kg", "1m", "Bird of Prey", "Forest", "Fish", "Eggs", "None", "None", "None", 4, true, true, true, true, true, "Forest Aviary");
        animal_aviario aviaryAnimal2 = new animal_aviario("Parrot", "Bird", "Macaw", "Multicolor", "Female", "10", "1kg", "0.5m", "Bird", "Rainforest", "Fruits", "Eggs", "None", "None", "None", 5, true, true, true, true, true, "Rainforest Aviary");
        animal_aviario aviaryAnimal3 = new animal_aviario("Owl", "Bird", "Barn Owl", "White and Brown", "Male", "3", "1kg", "0.4m", "Bird of Prey", "Forest", "Mice", "Eggs", "None", "None", "None", 6, true, true, true, true, true, "Forest Aviary");

        // Create three terrestrial animals
        animal_terrestre terrestrialAnimal1 = new animal_terrestre("Lion", "Mammal", "African Lion", "Golden", "Male", "8", "190kg", "2m", "Predator", "Savannah", "Meat", "Live Birth", "None", "None", "None", 7, true, true, true, true, true, "Savannah Habitat");
        animal_terrestre terrestrialAnimal2 = new animal_terrestre("Elephant", "Mammal", "African Elephant", "Grey", "Female", "25", "6000kg", "3m", "Herbivore", "Savannah", "Plants", "Live Birth", "None", "None", "None", 8, true, true, true, true, false, "Savannah Habitat");
        animal_terrestre terrestrialAnimal3 = new animal_terrestre("Kangaroo", "Mammal", "Red Kangaroo", "Red", "Male", "6", "85kg", "1.5m", "Herbivore", "Outback", "Grass", "Live Birth", "None", "None", "None", 9, true, true, true, true, true, "Outback Habitat");

        switch (userType.toLowerCase()) {
            case "staff":
                List<Resource> staffResources = new ArrayList<>();
                // Add resources to the list
                user = new Staff(staffResources, new ArrayList<>());
                System.out.println("Resources: " + ((Staff) user).getResources());
                break;
            case "boss":
                List<habitats> bossHabitats = new ArrayList<>();
                List<Camera> bossCameras = new ArrayList<>();
                List<Resource> bossResources = new ArrayList<>();
                user = new Boss(bossHabitats, bossCameras, bossResources);
                System.out.println("¿Quieres un café? (sí, no)");
                String coffee = scanner.nextLine();
                if (coffee.equalsIgnoreCase("sí")) {
                    System.out.println("Aquí está tu café.");
                } else {
                    System.out.println("Jo :(");
                }
                break;
            case "visitor":
                habitats visitorHabitat = new habitats(1.0f, 1.0f, true);
                Camera visitorCamera = new Camera(1, "Camera1");
                animal visitorAnimal = new animal("Animal1", "Type1", "Raza1", "Color1", "Sexo1", "Edad1", "Peso1", "Altura1", "Tipo1", "Habitat1", "Alimentacion1", "Reproduccion1", "Cuidados1", "Enfermedades1", "Vacunas1", 1, true, true);
                user = new Visitor(visitorHabitat, visitorCamera, visitorAnimal);
                System.out.println("¿Qué hábitat deseas visitar?");
                String habitatChoice = scanner.nextLine();
                // Here you should implement the logic to choose an animal based on the habitat
                System.out.println("Has elegido el hábitat: " + habitatChoice);
                System.out.println("Aquí hay un animal de este hábitat: " + visitorAnimal.getNombre());
                break;
            default:
                System.out.println("Tipo de usuario no reconocido.");
                return;
        }

        System.out.println(user.identify());
    }
}