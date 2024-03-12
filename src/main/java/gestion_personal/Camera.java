package gestion_personal;
import java.util.ArrayList;
import java.util.List;

public class Camera {
    private int id;
    private String location;
    private List<String> accessLog;

    public Camera(int id, String location) {
        this.id = id;
        this.location = location;
        this.accessLog = new ArrayList<>();
    }

    public void record(String access) {
        // lógica para grabar
        this.accessLog.add(access);
    }

    public List<String> getAccessLog() {
        return this.accessLog;
    }

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

    public void setAccessLog(List<String> accessLog) {
        this.accessLog = accessLog;
    }
}