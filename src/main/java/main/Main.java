package main;

import java.util.Scanner;

import animales.animal;
import animales.animal_acuatico;
import animales.animal_aviario;
import animales.animal_terrestre;
import seguridad.Seguridad;
import seguridad.Vigilancia;
import gestion_habitats.habitats;
import gestion_habitats.acuaticos;
import gestion_habitats.aviario;
import gestion_recursos.Recursos;
import main.InfoStand;
import main.Boss;
import main.Person;
import main.Staff;
import main.Visitor;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir las variables
        System.out.println("¿Eres un visitante, un trabajador o deseas ver los recursos del zoológico? (V/T/R)");
        String userType = scanner.nextLine(); // Aquí el usuario introduce su tipo

        habitats acuatico = new habitats(100.0f, 75.0f, true);
        habitats aviario = new habitats(200.0f, 150.0f, false);
        habitats terrestre = new habitats(300.0f, 225.0f, true);

        // Crear los animales y añadirlos a los hábitats
        animal tiburon = new animal("Tiburón", "Carnívoro", "Saludable", "Agresivo");
        animal delfin = new animal("Delfín", "Carnívoro", "Saludable", "Amigable");
        animal ballena = new animal("Ballena", "Herbívoro", "Saludable", "Tranquilo");

        acuatico.agregarAnimal(tiburon);
        acuatico.agregarAnimal(delfin);
        acuatico.agregarAnimal(ballena);

        animal aguila = new animal("Águila", "Carnívoro", "Saludable", "Agresivo");
        animal loro = new animal("Loro", "Herbívoro", "Saludable", "Amigable");
        animal pinguino = new animal("Pingüino", "Carnívoro", "Saludable", "Tranquilo");

        aviario.agregarAnimal(aguila);
        aviario.agregarAnimal(loro);
        aviario.agregarAnimal(pinguino);

        animal leon = new animal("León", "Carnívoro", "Saludable", "Agresivo");
        animal elefante = new animal("Elefante", "Herbívoro", "Saludable", "Amigable");
        animal jirafa = new animal("Jirafa", "Herbívoro", "Saludable", "Tranquilo");

        terrestre.agregarAnimal(leon);
        terrestre.agregarAnimal(elefante);
        terrestre.agregarAnimal(jirafa);

        // Crear los recursos
        Recursos recursos = new Recursos(100, 50, 30); // Asegúrate de ajustar estos valores a los recursos actuales del zoológico

        if (userType.equalsIgnoreCase("T")) {
            System.out.println("Eres un trabajador. ¿Qué tarea quieres realizar? (Vigilar/Seguimiento)");
            String tarea = scanner.nextLine();

            if (tarea.equalsIgnoreCase("Vigilar")) {
                System.out.println("¿Qué hábitat quieres vigilar? (Acuático/Aviario/Terrestre)");
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

                System.out.println("Estás vigilando el hábitat: " + habitatSeleccionado.getId()); // Línea agregada

                Vigilancia vigilante = new Vigilancia("Pedro", 30, habitatSeleccionado);
                vigilante.Vigilancia.habitats();

            } else if (tarea.equalsIgnoreCase("Seguimiento")) {
                System.out.println("¿Qué hábitat quieres seleccionar para el seguimiento? (Acuático/Aviario/Terrestre)");
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

                System.out.println("¿Qué animal quieres seleccionar para el seguimiento?");
                for (int i = 0; i < habitatSeleccionado.getAnimales().size(); i++) {
                    System.out.println((i + 1) + ". " + habitatSeleccionado.getAnimales().get(i).getNombre());
                }
                int animalChoice = scanner.nextInt();
                scanner.nextLine(); // consume the newline

                if (animalChoice < 1 || animalChoice > habitatSeleccionado.getAnimales().size()) {
                    System.out.println("No se reconoce el animal seleccionado.");
                    return;
                }

                Seguimiento seguimiento = new Seguimiento("Pedro", 30, habitatSeleccionado.getAnimales().get(animalChoice - 1), habitatSeleccionado);
                seguimiento.hacerSeguimiento();
            } else {
                System.out.println("No se reconoce la tarea seleccionada.");
            }
        } else if (userType.equalsIgnoreCase("V")) {
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

            habitatSeleccionado.mostrarAnimales();
            System.out.println("¿Qué animal quieres visitar? (1/2/3)");
            int animalChoice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            if (animalChoice < 1 || animalChoice > habitatSeleccionado.getAnimales().size()) {
                System.out.println("No se reconoce el animal seleccionado.");
                return;
            }

            animal animalSeleccionado = habitatSeleccionado.getAnimales().get(animalChoice - 1);
            Visitor visitante = new Visitor("Juan", 25);
            visitante.visitarAnimal(animalSeleccionado);
        } else if (userType.equalsIgnoreCase("R")) {
            recursos.gestionarRecursos();
        } else {
            System.out.println("No se reconoce el tipo de usuario seleccionado.");
        }
    }
}