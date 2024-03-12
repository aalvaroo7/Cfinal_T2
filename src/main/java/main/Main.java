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

        Person user ;
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