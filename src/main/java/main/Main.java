packet main;

public class main {

switch(userType)

    {
        case "V":
            System.out.println("Información del animal: " + animal.toString());
            System.out.println("Información del hábitat: " + habitatManagement.toString());
            break;
        case "S":
            System.out.println("Información del animal: " + animal.toString());
            System.out.println("Información del hábitat: " + habitatManagement.toString());
            System.out.println("Información del personal: " + staffManagement.toString());
            System.out.println("Información del recurso: " + resourceManagement.toString());
            break;
        default:
            System.out.println("Opción no válida. Inténtalo de nuevo.");
    }
}