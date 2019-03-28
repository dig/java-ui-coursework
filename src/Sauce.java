public enum Sauce {
    
    TOMATO("Tomato", 0),
    PESTO("Pesto", .50);
    
    private String name;
    private double cost;
    
    Sauce(String name, double cost) {
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
        return String.format("%s Sauce: £%.2f", this.name, this.cost);
    }
    
}
