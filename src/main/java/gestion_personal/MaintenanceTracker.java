package gestion_personal;
import java.util.ArrayList;
import java.util.List;
public class MaintenanceTracker {

    public List<Camera> getAllCameras() {
        List<Camera> allCameras = new ArrayList<>();
        for (Facility facility : this.facilities) {
            allCameras.addAll(facility.getCameras());
        }
        return allCameras;
    }

    public List<Sensor> getAllSensors() {
        List<Sensor> allSensors = new ArrayList<>();
        for (Facility facility : this.facilities) {
            allSensors.addAll(facility.getSensors());
        }
        return allSensors;
    }
    private List<Facility> facilities;
    private List<Maintenance> maintenances;
    private List<Repair> repairs;

    public void addFacility(Facility facility) {
        // add facility to facilities
    }

    public void scheduleMaintenance(Maintenance maintenance) {
        this.maintenances.add(maintenance);
    }


    public void registerRepair(Repair repair) {
        this.repairs.add(repair);
    }

    public List<Maintenance> getMaintenancesForFacility(int facilityId) {
        List<Maintenance> facilityMaintenances = new ArrayList<>();
        for (Maintenance maintenance : this.maintenances) {
            if (maintenance.getFacilityId() == facilityId) {
                facilityMaintenances.add(maintenance);
            }
        }
        return facilityMaintenances;
    }

    public List<Repair> getRepairsForFacility(int facilityId) {
        List<Repair> facilityRepairs = new ArrayList<>();
        for (Repair repair : this.repairs) {
            if (repair.getFacilityId() == facilityId) {
                facilityRepairs.add(repair);
            }
        }
        return facilityRepairs;
    }
}