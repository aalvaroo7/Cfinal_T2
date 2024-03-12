import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("¿Eres un visitante, un trabajador o deseas ver los recursos del zoológico? (V/T/R)");
    String userTypeInput = scanner.nextLine();
    UserType userType = null;
    switch (userTypeInput.toUpperCase()) {
        case "V":
            userType = UserType.VISITOR;
            break;
        case "T":
            userType = UserType.WORKER;
            break;
        case "R":
            userType = UserType.RESOURCE_MANAGER;
            break;
        default:
            System.out.println("No se reconoce el tipo de usuario seleccionado.");
            scanner.close();
            return;
    }
