package gestion_recursos;

public abstract class Resource {
    private String name;
    private int quantity;
    private Supplier supplier;
    private String food;
    private String medicine;
    private String equipment;

    public Resource(String name, int quantity, Supplier supplier, String food, String medicine, String equipment) {
        this.name = name;
        this.quantity = quantity;
        this.supplier = supplier;
        this.food = food;
        this.medicine = medicine;
        this.equipment = equipment;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return this.supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public String getFood() {
        return this.food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getMedicine() {
        return this.medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getEquipment() {
        return this.equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public void manage() {
        System.out.println("Managing the resource...");
        System.out.println("Current food: " + this.food);
        System.out.println("Current medicine: " + this.medicine);
        System.out.println("Current equipment: " + this.equipment);
    }
}