/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprojectjava;

/**
 *
 * @author Cakahal Johnson
 */
public class OPP3 {
    OPP3(){
        
        Car2 car = new Car2();
        Car2 car2 = new Car2();
        car.setColor("red");
        car2.setColor("green");
        car.setBrand("Toyota");
        car2.setBrand("Lexux");
        
        System.out.println(car.getColor());
        System.out.println(car2.getColor());
        System.out.println(car.getBrand());
        System.out.println(car2.getBrand());
        
        Human2 human2 = new Human2(150, "brown");
        
        System.out.println(human2.height+" "+human2.skinColor);

    
    
    }
    
}

//set methods means the default setting n get methods:

class Car2{
    String color;//color = "black 
    String brand;
    int num_of_exulsts;
    double engine_number;
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public String getBrand(){
        return this.brand;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return this.color;
    }

}

class Human2{
    int height;
    String skinColor;
    
    Human2(int height, String skinColor){
        this.height = height;
        this.skinColor = skinColor;
    }
}
