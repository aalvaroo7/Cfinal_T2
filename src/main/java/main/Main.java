package main;
import java.util.Scanner;
import java.util.ArrayList;

import animales.animal; // Import the animal class
import gestion_habitats.habitats;
import main.Staff; // Import the Staff class
import gestion_recursos.Resource;
import gestion_recursos.ConcreteResource; // Assuming you have a ConcreteResource class

public class Main {
    private animal animal;
    private habitats habitatManagement;
    private Staff staffManagement;
    private Resource resourceManagement;

    public Main() {
        this.animal = new animal("name", "species", "breed", "color", "sex", "age", "weight", "height", "type", "habitat", "feeding", "reproduction", "care", "diseases", "vaccines", 1, true, true);
        this.habitatManagement = new habitats(25.0f, 50.0f, true);
        this.staffManagement = new Staff(new ArrayList<>(), new ArrayList<>());
        this.resourceManagement = new ConcreteResource(); // Instantiate a concrete subclass of Resource
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Manage animals");
            System.out.println("2. Manage habitats");
            System.out.println("3. Manage staff");
            System.out.println("4. Manage resources");
            System.out.println("5. Exit");

            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    // Ensure the manage method exists in the animal class
                    animal.manage();
                    break;
                case "2":
                    // Ensure the manage method exists in the habitats class
                    habitatManagement.manage();
                    break;
                case "3":
                    // Ensure the manage method exists in the Staff class
                    staffManagement.manage();
                    break;
                case "4":
                    // Ensure the manage method exists in the Resource class
                    resourceManagement.manage();
                    break;
                case "5":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        Main system = new Main();
        system.start();
    }
}