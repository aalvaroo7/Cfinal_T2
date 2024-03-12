package gestion_personal;
import java.util.Date;

public class Repair {
    private int id;
    private int facilityId;
    private Date repairDate;
    private String repairType;
    private boolean isUrgent;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFacilityId() {
        return this.facilityId;
    }

    public void setFacilityId(int facilityId) {
        this.facilityId = facilityId;
    }

    public Date getRepairDate() {
        return this.repairDate;
    }

    public void setRepairDate(Date repairDate) {
        this.repairDate = repairDate;
    }

    public String getRepairType() {
        return this.repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType;
    }

    public boolean isUrgent() {
        return this.isUrgent;
    }

    public void setUrgent(boolean isUrgent) {
        this.isUrgent = isUrgent;
    }
}