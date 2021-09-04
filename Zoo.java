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
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bird bird = new Bird(); 
        bird.setAnimalName("seagull");
        bird.setSex("Male");
        bird.setBirthdate(1999);
        bird.setID(6);
        bird.setColor_of_feathers("black");
        bird.The_Output();
        bird.set_the_classification();
        
        Mammal mammal = new Mammal(); 
        mammal.setAnimalName("Deer");
        mammal.setSex("Male");
        mammal.setBirthdate(2010);
        mammal.setID(10);
        mammal.setHair_type("yellow fur");
        mammal.The_Output();
        mammal.set_the_classification();
        
        
        
    }
    
    
   
}
    
   

