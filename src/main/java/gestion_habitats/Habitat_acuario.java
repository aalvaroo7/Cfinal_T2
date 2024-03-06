package gestion_habitats;

public class Habitat_acuario {
    boolean puede_nadar;

    public Habitat_acuario(float temperatura, float humedad, boolean limpieza, boolean puede_nadar) {
        this.puede_nadar = puede_nadar;
    }

    @Override
    public String toString() {
        return "Habitat_acuario [puede_nadar=" + puede_nadar + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public boolean isPuede_nadar() {
        return puede_nadar;
    }

    public void setPuede_nadar(boolean puede_nadar) {
        this.puede_nadar = puede_nadar;
    }
}