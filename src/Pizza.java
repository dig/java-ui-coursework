/**
 * @author Joseph.
 */

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
    
    public double getBaseCost() {
        return this.size.getCost() 
                + this.crust.getCost();
    }
    
    public double getTotalCost() {
        double totalCost = this.getBaseCost()
                + this.sauce.getCost();
        
        //--- Loop over every topping on pizza and add to cost
        for (int i = 0; i < this.toppings.size(); i++) {
            Topping topping = this.toppings.get(i);
            
            //--- If topping is first then 5 tablespoonfills else 4.
            totalCost += topping.getCost() * (i > 0 ? 4 : 5);
        }
        
        return totalCost;
    }
    
    @Override
    public String toString() {
        String str = "";
        
        str += String.format("TOTAL COST: £%.2f\n", this.getTotalCost());
        str += this.size.toString() + "\n";
        str += this.crust.toString() + "\n";
        
        str += String.format("BASE COST: £%.2f\n", this.getBaseCost());
        
        for (int i = 0; i < this.toppings.size(); i++) {
            Topping topping = this.toppings.get(i);
            str += topping.toString(i > 0 ? 4 : 5) + "\n";
        }
        
        str += this.sauce.toString();
        
        return str;
    }
    
}
