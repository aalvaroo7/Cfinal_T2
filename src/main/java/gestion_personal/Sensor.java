package gestion_personal;

public class Sensor {

    private int id;
    private String location;
    private boolean accessDetected;
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isAccessDetected() {
        return this.accessDetected;
    }

    public void setAccessDetected(boolean accessDetected) {
        this.accessDetected = accessDetected;
    }
}