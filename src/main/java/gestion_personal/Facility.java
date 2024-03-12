package gestion_personal;
import java.util.Date;
public class Facility {
    private int id;
    private String name;
    private String location;
    private Date lastMaintenanceDate;
    private boolean urgentRepairNeeded;

    // getters
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }

    public Date getLastMaintenanceDate() {
        return this.lastMaintenanceDate;
    }

    public boolean isUrgentRepairNeeded() {
        return this.urgentRepairNeeded;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setLastMaintenanceDate(Date lastMaintenanceDate) {
        this.lastMaintenanceDate = lastMaintenanceDate;
    }

    public void setUrgentRepairNeeded(boolean urgentRepairNeeded) {
        this.urgentRepairNeeded = urgentRepairNeeded;
    }

}