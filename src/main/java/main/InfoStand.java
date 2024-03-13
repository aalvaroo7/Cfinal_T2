package main;
public class InfoStand {
    private String standName;
    private String standLocation;

    public InfoStand(String standName, String standLocation) {
        this.standName = standName;
        this.standLocation = standLocation;
    }

    public String fetchStandName() {
        return standName;
    }

    public void updateStandName(String standName) {
        this.standName = standName;
    }

    public String fetchStandLocation() {
        return standLocation;
    }

    public void updateStandLocation(String standLocation) {
        this.standLocation = standLocation;
    }
}