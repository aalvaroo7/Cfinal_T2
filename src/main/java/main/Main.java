package main;
import gestion_habitats.habitats;
import java.util.Scanner;
import gestion_personal.Camera;
import gestion_recursos.Resource;
import animales.animal;
import java.util.ArrayList;
import java.util.List;
import main.Boss;
import main.Staff;
import main.Visitor;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué tipo de persona eres? (staff, boss, visitor)");
        String userType = scanner.nextLine();

        Person user;

        switch (userType.toLowerCase()) {
            case "staff":
                List<Resource> staffResources = new ArrayList<>();
                List<animal> staffAnimals = new ArrayList<>();
                user = new Staff(staffResources, staffAnimals);
                break;
            case "boss":
                List<habitats> bossHabitats = new ArrayList<>();
                List<Camera> bossCameras = new ArrayList<>();
                List<Resource> bossResources = new ArrayList<>();
                user = new Boss(bossHabitats, bossCameras, bossResources);
                break;
            case "visitor":
                // Corrected the constructor call for habitats
                habitats visitorHabitat = new habitats(1.0f, 1.0f, true);
                Camera visitorCamera = new Camera(1, "Camera1");
                animal visitorAnimal = new animal("Animal1", "Type1", "Description1", "Habitat1", "Diet1", "Status1", "Image1");
                user = new Visitor(visitorHabitat, visitorCamera, visitorAnimal);
                break;
            default:
                System.out.println("Tipo de usuario no reconocido.");
                return;
        }

        System.out.println(user.identify());
    }
}