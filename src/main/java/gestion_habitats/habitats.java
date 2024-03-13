package gestion_habitats;

import animales.animal;
import java.util.List;

public class habitats {
    private float temperatura;
    private float humedad;
    private boolean limpieza;
    private List<animal> animales; // Add this field

    public habitats(float temperatura, float humedad, boolean limpieza, List<animal> animales) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
        this.animales = animales; // Initialize the field
    }
    public habitats(float temperatura, float humedad, boolean limpieza) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
    }

    public float getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getHumedad() {
        return this.humedad;
    }

    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }

    public boolean isLimpieza() {
        return this.limpieza;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }

    public void manage() {
        System.out.println("Managing the habitat...");
        System.out.println("Current temperature: " + this.temperatura);
        System.out.println("Current humidity: " + this.humedad);
        System.out.println("Is clean: " + (this.limpieza ? "Yes" : "No"));
    }

    public List<animal> getAnimales() {
        return this.animales; // Add this method
    }

    public void agregarAnimal(animal tiburon) {
    }
}