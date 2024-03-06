package animales.animales;

public class terrestres extends animales {

    boolean patas;
    boolean cola;
    boolean pelaje;
    String tipoTerrestre;

    public terrestres(String nombre, String especie, String raza, String color, String sexo, String edad,
                      String peso, String altura, String tipo, String habitat, String alimentacion, String reproduccion,
                      String cuidados, String enfermedades, String vacunas, int id, boolean salud, boolean comportamiento,
                      boolean patas, boolean cola, boolean pelaje, String tipoTerrestre) {
        super(nombre, especie, raza, color, sexo, edad, peso, altura, tipo, habitat, alimentacion, reproduccion, cuidados,
                enfermedades, vacunas, id, salud, comportamiento);
        this.patas = patas;
        this.cola = cola;
        this.pelaje = pelaje;
        this.tipoTerrestre = tipoTerrestre;
    }

    public boolean isPatas() {
        return patas;
    }

    public void setPatas(boolean patas) {
        this.patas = patas;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public String getTipoTerrestre() {
        return tipoTerrestre;
    }

    public void setTipoTerrestre(String tipoTerrestre) {
        this.tipoTerrestre = tipoTerrestre;
    }
}