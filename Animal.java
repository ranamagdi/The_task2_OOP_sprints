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
public class Animal{
       private String sex;
       private String AnimalName;
       private int ID;
       private int Birthdate;
        
        public void set_the_classification(){   }   
            
    
        public void The_Output(){
            System.out.println("This Animal has information  "+getAnimalName()+","+getSex()+","+getID()+","+getBirthdate());
        }
    
        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getAnimalName() {
            return AnimalName;
        }

        public void setAnimalName(String AnimalName) {
            this.AnimalName = AnimalName;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public int getBirthdate() {
            return Birthdate;
        }

        public void setBirthdate(int Birthdate) {
            this.Birthdate = Birthdate;
        }
            
    }
