/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

/**
 *
 * @author vip
 */
public class Bird extends  Animal {
   private String color_of_feathers;
    @Override
     public void set_the_classification(){
           
           System.out.println("This classification is Brid and has Feathers of color "+getColor_of_feathers());
    }
        public String getColor_of_feathers() {
            return color_of_feathers;
        }

        public void setColor_of_feathers(String color_of_feathers) {
            this.color_of_feathers = color_of_feathers;
        }
    
}
