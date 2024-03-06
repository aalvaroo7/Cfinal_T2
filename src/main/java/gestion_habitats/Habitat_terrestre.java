package gestion_habitats;

import gestion_habitats.Habitats;
import java.util.Objects;

public class Habitat_terrestre extends Habitats {

    private boolean canWalk;

    public Habitat_terrestre(float temperatura, float humedad, boolean limpieza, boolean canWalk) {
        super(temperatura, humedad, limpieza);
        this.canWalk = canWalk;
    }

    @Override
    public String toString() {
        return "Habitat_terrestre [canWalk=" + canWalk + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Habitat_terrestre that = (Habitat_terrestre) obj;
        return canWalk == that.canWalk;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canWalk);
    }

    public boolean isCanWalk() {
        return canWalk;
    }

    public void setCanWalk(boolean canWalk) {
        this.canWalk = canWalk;
    }
}