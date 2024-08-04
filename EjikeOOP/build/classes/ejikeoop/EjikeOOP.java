/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejikeoop;

/**
 *
 * @author Cakahal Johnson
 */

//Carting Product recipt
    class Product{
        //Attributes
        int pID; 
        String name;
        int price;
        
        
        //constructor
        Product(){
            System.out.println(">>> Product Object Constructor <<<");
           
        }
        
        ///Methods (Behaviour)
        //here is to print data in Product Object when we call this method
       void setProductDetails(int pID, String name, int price){
           this.pID = pID;
           this.name = name;
           this.price = price;
           System.out.println(">>> Data Written In product Object <<<<");
        
        }
       
       void showProductDetails(){
           System.out.println("------Product ID: " +pID+ "--------") ;
           System.out.println("Name:\t"+name);
           System.out.println("Price:\t"+price);
           System.out.println("--------- thanks!!!--------------------");
    }
       
       //setter
       void setPid(int pID){
           this.pID = pID; //This means a reference to the current object
       }
       
       ///Getter
       int getPid(){
           return pID;
       }
       
    }
  
//    ===constructor===
    class Mobile extends Product{/// here IS-A Product, Mobile is the child, while Product is the Parent
       ///means an additional attribute of mobile other than the product
        
        String os;
        int ram;
        int sdCardSize;
        
        Mobile(){
            System.out.println(">>>>>Mobile Section<<<<<<");
        }
        
        //we have to define the same method from the parent into the child with different inputs
        //SO we use Method Overloading : same method name with different inputs
        void showProductDetails(int pID, String name, int price, String os, int ram, int sdCardSize){
            this.pID = pID;
            this.name = name;
            this.price = price;
            this.os = os;
            this.ram = ram;
            this.sdCardSize = sdCardSize;
            System.out.println(">>>>>Data Written in Product Object");
        }
        
//        lets Redefine showProductDetails as well
//        2 methods, 1 from parent, 1 in child and we have the same signtures
//        the child methods will be executed and not the parent method

//        Method for Overloading : same method Name with same Inputs in Parent CHild Relationship
        @Override
        void showProductDetails(){
             System.out.println("------Product ID: " +pID+ "--------") ;
           System.out.println("Name:\t"+name);
           System.out.println("Price:\t"+price);
            System.out.println("Os:\t"+os);
            System.out.println("RamSize:\t"+ram);
            System.out.println("SDcard:\t"+sdCardSize);

           System.out.println("--------- thanks!!!--------------------");
        }
    }
    

///main class here
public class EjikeOOP {

    
       
       
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ///let's create an Object:
        /*
        OOP Concepts
        Object-Oriented Programming: is a methodology or paradigm to design
        a program using Classes and Objects
        Object: is the real  world entities that has their own properties and behaviours
        Classes: is the blueprint from which an objects properties and behaviours are decided
        Example:
        class of Dogs:              Properties:      Behaviour:
        Local dog                      Breed           eat()
        size             sleep()
        age              run()
        color            bark()
        THE DIFFERENT B/W OBJECT ORIENTED AND PROCEDUAL PROGRAMMING
         *   Botton Up Approach                  * Top Down Approach
         *   Divided into Objects                * Divided into functions
         *   Has Access Modifiers                * Doesn't have Access Modifiers
         *   Objects can move & communicate      * Data can move freely from function
        with each other through               to function in the system
        member functions
         *   More Secure                         * less Secure
         *   Supports overloading                * Don not support overloading
        NB: The PRIVATE access modifier means: that only code inside the class itself
        can access this java field.
        The PACKAGE access modifiier means: that only code inside the class itself, or
        other classes in the same package, can access the field. 
        i.e You won't actually write the package modifier. By leaving out any maccess modifier
        so this is the access modifier defaults to package scope.
        The PROTECTED access modifier means: it's also like the package modifier,
        except subclasses of the class can also access the field, even if the subclass
        is not located in the same package...
        The PUBLIC access modifier means: that the field can be accessed by all classes
        in your application.
         */
//        Dog dog1 = new Dog();
//        System.out.println(dog1.name);
        
        
        
        
        Product product = new Product();
        
//        System.out.println("Product is: "+product);
        ///product here is not an Object, its a reference variable which holds the hashCode of the
        ///object in a hexadecimal notation
        System.out.println("product is: "+product); //this prints out the products
        ///here we set the products
        product.setProductDetails(100, "Laptop", 300000); ///calling out a parameter
        
//        now our is complete and ready to print
        product.showProductDetails();
        
        System.out.println("=====here is for second Product===== ");
        ////here we add more product
        Product product2 = new Product();
        product2.pID = 101;
        product2.setPid(1001);
        product2.name = "iPhone";
        product2.price = 150000;
        
        //calling out the fuction methods
        product2.showProductDetails();
        
                System.out.println("=====here is for Mobile Product===== ");

        
        Mobile mobile = new Mobile();
//        product Object gets constructed before the mobile Object >>> which is the Rule to Inhertance (Object to object)

        mobile.setProductDetails(301, "Samsung", 500000);
        
        mobile.showProductDetails();
        
       System.out.println("=====here is for Mobile section calling Product===== ");

    mobile.showProductDetails(401, "itel", 2000, "java", 4, 32);
    
    mobile.showProductDetails();
        
  

        
        
        
        
    }
    

   
    
    
}
