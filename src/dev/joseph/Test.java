/**
 * @author Joseph.
 * @description Demonstrates the pizza class.
 */

package dev.joseph;

public class Test {
    
    public static void main(String[] args) {
        //--- First sample pizza
        Pizza samplePizza1 = new Pizza(1, Size.MEDIUM, Crust.THIN, Sauce.PESTO, 
                Topping.EXTRA_CHEESE,
                Topping.CHILLI
        );
        System.out.println("--- SAMPLE PIZZA ONE ---");
        System.out.println(samplePizza1.toString() + "\n");
        
        //--- Second sample pizza
        Pizza samplePizza2 = new Pizza(2, Size.MEDIUM, Crust.STUFFED, Sauce.PESTO, 
                Topping.OLIVES,
                Topping.ONION
        );
        System.out.println("--- SAMPLE PIZZA TWO ---");
        System.out.println(samplePizza2.toString() + "\n");
        
        //--- Third sample pizza
        Pizza samplePizza3 = new Pizza(3, Size.SMALL, Crust.THIN, Sauce.PESTO, 
                Topping.CHILLI,
                Topping.PEPPERONI
        );
        System.out.println("--- SAMPLE PIZZA THREE ---");
        System.out.println(samplePizza3.toString() + "\n");
         
        //--- Fourth sample pizza
        Pizza samplePizza4 = new Pizza(4, Size.SMALL, Crust.THIN, Sauce.PESTO, 
                Topping.OLIVES,
                Topping.OLIVES
        );
        System.out.println("--- SAMPLE PIZZA FOUR ---");
        System.out.println(samplePizza4.toString() + "\n");
        
        //--- Testing adding and removing toppings methods
        Pizza samplePizza5 = new Pizza(5, Size.SMALL, Crust.THIN, Sauce.PESTO);
        
        System.out.println("--- ADDING TOPPINGS ---");
        samplePizza5.addTopping(Topping.JALAPENOS);
        samplePizza5.addTopping(Topping.ONION);
        System.out.println(samplePizza5.toString() + "\n");
        
        System.out.println("--- REMOVING TOPPINGS ---");
        samplePizza5.removeTopping(Topping.JALAPENOS);
        System.out.println(samplePizza5.toString() + "\n");
        
        System.out.println("--- GET SIZE, CRUST & SAUCE ---");
        System.out.println(samplePizza5.getSize().getName());
        System.out.println(samplePizza5.getCrust().getName());
        System.out.println(samplePizza5.getSauce().getName());
    }
    
}
