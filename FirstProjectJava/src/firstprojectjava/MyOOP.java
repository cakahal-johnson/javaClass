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

///Textual Repersentation of an Object
//NB:   what we write in class is the property of object as we describe the object
class Product{
    ///Attributes
    int pid;
    String name;
    int price;
    
    ///Constructor
    Product(){
        System.out.println(">> Product Object Construted");
    }
    
    ///Methods (Behaviour)
    ///To write data in Product Object we have this method
///if you want anything which should belong to class make it static!!
    void setProductDetails(int pid, String name, int price){
        this.pid = pid;
        this.name = name;
        this.price = price;
        System.out.println(">>> Data Written in Product Object");
    }
    
    ////To read from Product Object
    void showProductDetails(){
        System.out.println("-----Product ID: "+pid+"------");
        System.out.println("Name:\t"+name);
        System.out.println("Price:\t"+price);
        System.out.println("--------------------------");
        
    }
}

public class MyOOP {
    
    ///main is executed by JVM when my program will run!!!
    public static void main(String[] args){
        ///Create an Object :
        Product product = new Product();
        ///product is not an Object its a reference variable which holds the hashCode of the
        ///object in a hexadecimal notation
        System.out.println("product is: "+product);
        ///Writing data in Object
        product.setProductDetails(101, "iPhone", 2500);
        
    }
  
// 
}
 
//  MyOOP(){
        
//        public String brand = null;
//        public String model = null;
//        public String color = null;
//        
//    
//   public void setColor(String newColor) {
//        this.color = newColor;
//    }
    
    
//        System.out.println("text");
//    
//} 

//static void myMethod(){
//        System.out.println("i just got executed!");
//    }
//    
//    public static void main(String[] args){
//        myMethod();
//        myMethod();
//        myMethod();
//
//    }