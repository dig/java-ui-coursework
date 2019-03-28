public enum Topping {
    
    NONE(0),
    OLIVES(.08),
    EXTRA_CHEESE(.02),
    CHILLI(.06),
    PEPPERONI(.10),
    MUSHROOM(.03),
    ROCKET(.05),
    JALAPENOS(.20),
    ONION(.07),
    ANCHOVY(.09);
    
    double cost;
    
    Topping(double cost) {
        this.cost = cost;
    }
    
}
