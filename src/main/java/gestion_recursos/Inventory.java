public class Inventory {
    private List<Food> foodList = new ArrayList<>();
    private List<Medicine> medicineList = new ArrayList<>();
    private List<Equipment> equipmentList = new ArrayList<>();

    // Method to add food
    public void addFood(Food food) {
        foodList.add(food);
    }

    // Method to remove food
    public void removeFood(Food food) {
        foodList.remove(food);
    }

    // Method to check food
    public boolean checkFood(Food food) {
        return foodList.contains(food);
    }

    // Method to add medicine
    public void addMedicine(Medicine medicine) {
        medicineList.add(medicine);
    }

    // Method to remove medicine
    public void removeMedicine(Medicine medicine) {
        medicineList.remove(medicine);
    }

    // Method to check medicine
    public boolean checkMedicine(Medicine medicine) {
        return medicineList.contains(medicine);
    }

    // Method to add equipment
    public void addEquipment(Equipment equipment) {
        equipmentList.add(equipment);
    }

    // Method to remove equipment
    public void removeEquipment(Equipment equipment) {
        equipmentList.remove(equipment);
    }

    // Method to check equipment
    public boolean checkEquipment(Equipment equipment) {
        return equipmentList.contains(equipment);
    }
}