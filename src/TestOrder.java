/**
 * @author Joseph.
 * @description Demonstrates the order class.
 */

public class TestOrder {
 
    public static void main(String[] args) {
        //--- Create a new order
        Order myOrder = new Order();
        
        //--- Add 2 pizzas to the order
        myOrder.addPizza(new Pizza(1, Size.SMALL, Crust.THIN, Sauce.PESTO, 
                Topping.CHILLI,
                Topping.PEPPERONI
        ));
        
        myOrder.addPizza(new Pizza(2, Size.MEDIUM, Crust.STUFFED, Sauce.PESTO, 
                Topping.OLIVES,
                Topping.ONION
        ));
        
        //--- Print order
        System.out.println("--- FIRST ORDER ---");
        System.out.println(myOrder.toString());
        
        //--- Update second pizza
        myOrder.updatePizza(2, new Pizza(2, Size.LARGE, Crust.THIN, Sauce.PESTO, 
                Topping.OLIVES,
                Topping.ONION
        ));
        
        //--- Print order
        System.out.println("--- UPDATE PIZZA WITH ID 2 ---");
        System.out.println(myOrder.toString());
        
        //--- Remove first pizza
        myOrder.removePizza(1);
        
        //--- Print order
        System.out.println("--- REMOVE PIZZA WITH ID 1 ---");
        System.out.println(myOrder.toString());
    }
    
}
