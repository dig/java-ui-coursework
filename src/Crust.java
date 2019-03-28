public enum Crust {
    
    THIN(1.08),
    DEEP(1.10),
    STUFFED(2.14);
    
    double cost;
    
    Crust(double cost) {
        this.cost = cost;
    }
    
}
