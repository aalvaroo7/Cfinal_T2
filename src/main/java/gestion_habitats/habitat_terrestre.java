package gestion_habitats;

public class habitat_terrestre {

    boolean puede_caminar;

    public habitat_terrestre(float temperatura,float humedad,boolean limpieza, boolean puede_caminar) {
        this.puede_caminar = puede_caminar;
    }

    @Override
    public String toString() {
        return "terrestres []";
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

    public boolean isPuede_caminar() {
        return puede_caminar;
    }

    public void setPuede_caminar(boolean puede_caminar) {
        this.puede_caminar = puede_caminar;
    }

}