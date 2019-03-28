public enum Crust {
    
    THIN("Thin", 1.08),
    DEEP("Deep", 1.10),
    STUFFED("Stuffed", 2.14);
    
    private String name;
    private double cost;
    
    Crust(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getCost() {
        return this.cost;
    }
    
    @Override
    public String toString() {
        return String.format("%s Crust: £%.2f", this.name, this.cost);
    }
    
}
