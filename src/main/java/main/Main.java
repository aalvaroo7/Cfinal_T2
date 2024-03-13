package main;

import gestion_habitats.*;
import animales.*;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Assuming userType, acuatico, aviario, terrestre are defined
        String userType = "V";
        habitats acuatico = new acuaticos(25.0f, 65.0f, true, true);
        habitats aviario = new aviario(20.0f, 55.0f, true, true);
        habitats terrestre = new terrestres(30.0f, 45.0f, true, true);

        Scanner scanner = new Scanner(System.in);

        if (userType.equalsIgnoreCase("V")) {
            System.out.println("Eres un visitante. ¿Qué hábitat quieres visitar? (Acuático/Aviario/Terrestre)");
            String habitatChoice = scanner.nextLine();

            habitats habitatSeleccionado;
            switch (habitatChoice.toLowerCase()) {
                case "acuático":
                    habitatSeleccionado = acuatico;
                    break;
                case "aviario":
                    habitatSeleccionado = aviario;
                    break;
                case "terrestre":
                    habitatSeleccionado = terrestre;
                    break;
                default:
                    System.out.println("No se reconoce el hábitat seleccionado.");
                    return;
            }

            // Assuming you have a method to get the list of animals in the habitat
            List<animal> animales = habitatSeleccionado.getAnimales();
            System.out.println("¿Qué animal quieres visitar?");
            for (int i = 0; i < animales.size(); i++) {
                System.out.println((i + 1) + ". " + animales.get(i).getNombre());
            }
            int animalChoice = scanner.nextInt();
            scanner.nextLine(); // consume the new
        }
    }
    // Assuming you have a list of animals for each habitat
    List<animal> acuaticoAnimales = new ArrayList<>();
    List<animal> aviarioAnimales = new ArrayList<>();
    List<animal> terrestreAnimales = new ArrayList<>();

    habitats acuatico = new acuaticos(25.0f, 65.0f, true, true, acuaticoAnimales);
    habitats aviario = new aviario(20.0f, 55.0f, true, true, aviarioAnimales);
    habitats terrestre = new terrestres(30.0f, 45.0f, true, true, terrestreAnimales);
}
