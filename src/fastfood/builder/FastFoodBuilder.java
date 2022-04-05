/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

Recuperado de: https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 */
package fastfood.builder;

/**
 *
 * @author marianamtzcelis
 * Recuperado de: https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 */
public class FastFoodBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      MealBuilder mealBuilder = new MealBuilder();

      Meal vegMeal = mealBuilder.prepareVegMeal();
      System.out.println("Veg Meal");
      vegMeal.showItems();
      System.out.println("Total Cost: " + vegMeal.getCost());

      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
      System.out.println("\n\nNon-Veg Meal");
      nonVegMeal.showItems();
      System.out.println("Total Cost: " + nonVegMeal.getCost());
        
    }
    
}
