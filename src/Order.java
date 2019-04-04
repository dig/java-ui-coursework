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
    
    public boolean removePizza(int id) {
        for (Pizza pizza : this.pizzas) {
            if (pizza.getId() == id) {
                return this.pizzas.remove(pizza);
            }
        }
        
        return false;
    }
    
    public void updatePizza(int id, Pizza newPizza) {
        for (int i = 0; i < this.pizzas.size(); i++) {
            Pizza pizza = this.pizzas.get(i);
            
            if (pizza.getId() == id) {
                this.pizzas.set(i, newPizza);
            }
        }
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
        String str = "";
        
        for (Pizza pizza : this.pizzas) {
            str += pizza.toString() + "\n\n";
        }
        
        return str;
    }
    
}
