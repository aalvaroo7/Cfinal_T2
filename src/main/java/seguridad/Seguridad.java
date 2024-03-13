package seguridad;

import animales.animal;
import gestion_habitats.habitats;
public class Seguridad{
    private String nombreTrabajador;
    private int edadTrabajador;
    private animal animalMonitoreado;
    private habitats habitatMonitoreado;

    public Seguridad(String nombreTrabajador, int edadTrabajador, animal animalMonitoreado, habitats habitatMonitoreado) {
        this.nombreTrabajador = nombreTrabajador;
        this.edadTrabajador = edadTrabajador;
        this.animalMonitoreado = animalMonitoreado;
        this.habitatMonitoreado = habitatMonitoreado;
    }

    public String obtenerNombreTrabajador() {
        return nombreTrabajador;
    }

    public int obtenerEdadTrabajador() {
        return edadTrabajador;
    }

    public animal obtenerAnimalMonitoreado() {
        return animalMonitoreado;
    }

    public habitats obtenerHabitatMonitoreado() {
        return habitatMonitoreado;
    }

    // Este método realiza el seguimiento del animal y su hábitat
    public void realizarMonitoreo() {
        System.out.println("El trabajador " + nombreTrabajador + " está realizando monitoreo al animal: " + animalMonitoreado.getNombre());
        // Ensure the method 'mostrarInformacion()' exists in the 'animal' and 'habitats' classes
        // animalMonitoreado.mostrarInformacion();
        // habitatMonitoreado.mostrarInformacion();
    }
}