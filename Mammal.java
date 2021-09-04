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
 public class Mammal extends  Animal {
    private String Hair_type;
    @Override
     public void set_the_classification(){
           
            System.out.println("This classification is Mammal and has Hair "+getHair_type());
    }

        public String getHair_type() {
            return Hair_type;
        }

        public void setHair_type(String Hair_type) {
            this.Hair_type = Hair_type;
        }
 }
