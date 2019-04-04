/**
 * @author Joseph.
 */

import java.util.ArrayList;

public class Order {
    
    private ArrayList<Pizza> pizzas;
    
    public Order() {
        this.pizzas = new ArrayList<>();
    }
    
    public Order(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
    
    public void addPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }
    
    public ArrayList<Pizza> getAllPizzas() {
        return this.pizzas;
    }
    
    public double getTotalCost() {
        double cost = 0;
        
        for (Pizza pizza : this.pizzas) {
            cost += pizza.getTotalCost();
        }
        
        return cost;
    }
    
    public int getAmountOfPizzas() {
        return this.pizzas.size();
    }
    
    @Override
    public String toString() {
        return "";
    }
    
}
