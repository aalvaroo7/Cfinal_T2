package gestion_recursos;

public abstract class Resource {
    private String name;
    private int quantity;
    private Supplier supplier;

    public Resource(String name, int quantity, Supplier supplier) {
        this.name = name;
        this.quantity = quantity;
        this.supplier = supplier;
    }

    // Getter for name
    public String getName() {
        return this.name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for quantity
    public int getQuantity() {
        return this.quantity;
    }

    // Setter for quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getter for supplier
    public Supplier getSupplier() {
        return this.supplier;
    }

    // Setter for supplier
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}