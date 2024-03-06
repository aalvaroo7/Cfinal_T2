package gestion_habitats;

public class habitats_aviario extends Habitats{

    boolean puedeVolar;

    public HabitatAviario(float temperatura,float humedad,boolean limpieza, boolean puedeVolar) {
        super(temperatura, humedad, limpieza);
        this.puedeVolar = puedeVolar;
    }

    @Override
    public String toString() {
        return "Aviario [puedeVolar=" + puedeVolar + "]";
    }

    @Override
    public HabitatAviario clone() throws CloneNotSupportedException {
        return (HabitatAviario) super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof HabitatAviario))
            return false;
        HabitatAviario other = (HabitatAviario) obj;
        return puedeVolar == other.puedeVolar;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + (puedeVolar ? 1231 : 1237);
        return result;
    }

    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }
}
