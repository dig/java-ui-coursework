public enum Size {
    
    SMALL("Small", 9.45),
    MEDIUM("Medium", 11.87),
    LARGE("Large", 15.90);
    
    private String name;
    private double cost;
    
    Size(String name, double cost) {
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
        return this.name + " Size: £" + this.cost;
    }
    
}
