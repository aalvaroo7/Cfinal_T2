package gestion_recursos;

public class ConcreteResource extends Resource {
    public ConcreteResource() {
        super("ConcreteResource", 0, null, "food", "medicine", "equipment");
    }

    @Override
    public void manage() {
        // Add your management logic here
        System.out.println("Managing the concrete resource...");
        System.out.println("Current food: " + getFood());
        System.out.println("Current medicine: " + getMedicine());
        System.out.println("Current equipment: " + getEquipment());
    }
}