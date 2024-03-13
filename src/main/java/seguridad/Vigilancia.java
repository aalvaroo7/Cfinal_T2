package seguridad;

import gestion_habitats.habitats;

public class Vigilancia {
    private String nombreSupervisor;
    private int edadSupervisor;
    private habitats habitatSupervisado;

    public Vigilancia(String nombreSupervisor, int edadSupervisor, habitats habitatSupervisado) {
        this.nombreSupervisor = nombreSupervisor;
        this.edadSupervisor = edadSupervisor;
        this.habitatSupervisado = habitatSupervisado;
    }

    public String obtenerNombreSupervisor() {
        return nombreSupervisor;
    }

    public int obtenerEdadSupervisor() {
        return edadSupervisor;
    }

    public habitats obtenerHabitatSupervisado() {
        return habitatSupervisado;
    }

    // Este método realiza la supervisión del hábitat
    public void realizarSupervision() {
        System.out.println("El supervisor " + nombreSupervisor + " está supervisando el hábitat: " + habitatSupervisado.getTemperatura());
        // Ensure the method 'mostrarInformacion()' exists in the 'habitats' class
        // habitatSupervisado.mostrarInformacion();
    }
}