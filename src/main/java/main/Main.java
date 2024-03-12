package main;
import java.util.Scanner;
import java.util.ArrayList;
import animales.animal;
import gestion_habitats.habitats;
import main.Staff;
import gestion_recursos.Resource;

public class Main {
    private animal animal;
    private habitats habitatManagement;
    private Staff staffManagement;
    private Resource resourceManagement;

    public Main() {
        // Initialize the modules here
        // Replace the parameters with appropriate values
        this.animal = new animal("name", "species", "breed", "color", "sex", "age", "weight", "height", "type", "habitat", "feeding", "reproduction", "care", "diseases", "vaccines", 1, true, true);
        this.habitatManagement = new habitats(25.0f, 50.0f, true);
        this.staffManagement = new Staff(new ArrayList<>(), new ArrayList<>());
        // You cannot instantiate an abstract class. You need to instantiate a class that extends Resource.
        // this.resourceManagement = new Resource();
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
                    // Call methods related to managing animals
                    // animal.manage();
                    break;
                case "2":
                    // Call methods related to managing habitats
                    // habitatManagement.manage();
                    break;
                case "3":
                    // Call methods related to managing staff
                    // staffManagement.manage();
                    break;
                case "4":
                    // Call methods related to managing resources
                    // resourceManagement.manage();
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