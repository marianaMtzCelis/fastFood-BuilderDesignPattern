/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Recuperado de: https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 */
package fastfood.builder;

/**
 *
 * @author marianamtzcelis
 * Recuperado de: https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 */
public class Pepsi extends ColdDrink {

   @Override
   public float price() {
      return 35.0f;
   }

   @Override
   public String name() {
      return "Pepsi";
   }
}
