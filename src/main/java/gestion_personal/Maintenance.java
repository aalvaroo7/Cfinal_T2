package gestion_personal;
import java.util.Date;
public class Maintenance {
    private int id;
    private int facilityId;
    private Date scheduledDate;
    private String maintenanceType;

    // getters
    public int getId() {
        return this.id;
    }

    public int getFacilityId() {
        return this.facilityId;
    }

    public Date getScheduledDate() {
        return this.scheduledDate;
    }

    public String getMaintenanceType() {
        return this.maintenanceType;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setFacilityId(int facilityId) {
        this.facilityId = facilityId;
    }

    public void setScheduledDate(Date scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public void setMaintenanceType(String maintenanceType) {
        this.maintenanceType = maintenanceType;
    }
}