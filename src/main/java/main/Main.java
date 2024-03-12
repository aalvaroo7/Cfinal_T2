package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué tipo de persona eres? (staff, boss, visitor)");
        String userType = scanner.nextLine();

        Person user;

        switch (userType.toLowerCase()) {
            case "staff":
                user = new Staff();
                break;
            case "boss":
                user = new Boss();
                break;
            case "visitor":
                user = new Visitor();
                break;
            default:
                System.out.println("Tipo de usuario no reconocido.");
                return;
        }

        System.out.println(user.identify());
    }
}