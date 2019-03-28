public enum Topping {
    
    NONE("None", 0),
    OLIVES("Olive", .08),
    EXTRA_CHEESE("Extra Cheese", .02),
    CHILLI("Chilli", .06),
    PEPPERONI("Pepperoni", .10),
    MUSHROOM("Mushroom", .03),
    ROCKET("Rocket", .05),
    JALAPENOS("Jalapenos", .20),
    ONION("Onion", .07),
    ANCHOVY("Anchovy", .09);
    
    private String name;
    private double cost;
    
    Topping(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getCost() {
        return this.cost;
    }
    
    public String toString(int amount) {
        return String.format("%s Topping: %s* £%.2f = £%.2f", this.name, amount, this.cost, (this.cost * amount));
    }
    
}
