import java.util.ArrayList;

public class Pizza {
    
    private Size size;
    private Crust crust;
    private Sauce sauce;
    private ArrayList<Topping> toppings;
    
    public Pizza(Size size, Crust crust, Sauce sauce) {
        this.size = size;
        this.crust = crust;
        this.sauce = sauce;
        this.toppings = new ArrayList<>();
    }
    
    public Pizza(Size size, Crust crust, Sauce sauce, Topping topping1) {
        this(size, crust, sauce);
        this.toppings.add(topping1);
    }
    
    public Pizza(Size size, Crust crust, Sauce sauce, Topping topping1, Topping topping2) {
        this(size, crust, sauce, topping1);
        this.toppings.add(topping2);
    }
    
    public Size getSize() {
        return this.size;
    }
    
    public void setSize(Size size) {
        this.size = size;
    }
    
    public Crust getCrust() {
        return this.crust;
    }
    
    public void setCrust(Crust crust) {
        this.crust = crust;
    }
    
    public Sauce getSauce() {
        return this.sauce;
    }
    
    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }
    
    public ArrayList<Topping> getToppings() {
        return this.toppings;
    }
    
    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }
    
    public void removeTopping(Topping topping) {
        this.toppings.remove(topping);
    }
    
}
