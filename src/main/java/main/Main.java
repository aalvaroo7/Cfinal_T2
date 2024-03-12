package main;

import java.util.Scanner;
import gestion_personal.MaintenanceTracker;
import gestion_recursos.Inventory;

public class ZooManagementSystem {
    private MaintenanceTracker maintenanceTracker;
    private Inventory inventory;
    private ResourceManagement resourceManagement;
    private HabitatManagement habitatManagement;
    private AnimalManagement animalManagement;
    private PersonnelManagement personnelManagement;

    public ZooManagementSystem() {
        maintenanceTracker = new MaintenanceTracker();
        inventory = new Inventory();
        resourceManagement = new ResourceManagement();
        habitatManagement = new HabitatManagement();
        animalManagement = new AnimalManagement();
        personnelManagement = new PersonnelManagement();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Manage maintenance");
            System.out.println("2. Manage inventory");
            System.out.println("3. Manage resources");
            System.out.println("4. Manage habitats");
            System.out.println("5. Manage animals");
            System.out.println("6. Manage personnel");
            System.out.println("7. Exit");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    manageMaintenance();
                    break;
                case 2:
                    manageInventory();
                    break;
                case 3:
                    resourceManagement.manage();
                    break;
                case 4:
                    habitatManagement.manage();
                    break;
                case 5:
                    animalManagement.manage();
                    break;
                case 6:
                    personnelManagement.manage();
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private void manageMaintenance() {
        // logic to manage maintenance...
    }

    private void manageInventory() {
        // logic to manage inventory...
    }
}