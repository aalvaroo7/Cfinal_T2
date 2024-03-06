package gestion_habitats;

public class Habitats {
    float temperatura;
    float humedad;
    boolean limpieza;

    public Habitats(float temperatura,float humedad,boolean limpieza) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
    }

    @Override
    public String toString() {
        return "Habitats [temperatura=" + temperatura + ", humedad=" + humedad + ", limpieza=" + limpieza + "]";
    }

    @Override
    public Habitats clone() throws CloneNotSupportedException {
        return new Habitats(this.temperatura, this.humedad, this.limpieza);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Habitats other = (Habitats) obj;
        return Float.compare(temperatura, other.temperatura) == 0 && Float.compare(humedad, other.humedad) == 0 && limpieza == other.limpieza;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Float.floatToIntBits(temperatura);
        result = prime * result + Float.floatToIntBits(humedad);
        result = prime * result + (limpieza ? 1231 : 1237);
        return result;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getHumedad() {
        return humedad;
    }

    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }

    public boolean isLimpieza() {
        return limpieza;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }
}