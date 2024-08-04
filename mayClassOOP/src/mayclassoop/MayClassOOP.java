/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayclassoop;

/**
 *
 * @author Cakahal Johnson
 */

/*OOP EXAMPLE ON PRODUCT ECOMM */
class Products{
    // here we create an Attribute of the Product
    int pid;
    String name;
    float price;
    
    // setting a Product Constructor as a method
    Products(){
        System.out.println(">> Product Obejct Constructor <<");
    } // Product constructor ends here
    
    // Here we create lthe Product Mothods(Behaviours)
    void setProductDetails(int pid, String name, float price){
        this.pid = pid;
        this.name = name;
        this.price = price;
        System.out.println(">> Data writen in product Object <<");
    } // setProductDetails ends here
    
    //here we will use the method to write inside product constructor
    void showProductDetails(){
        System.out.println("------------- Product ID: "+pid+"-----------------");
        System.out.println("Name:\t"+name);
        System.out.println("Price:\t"+price);
        System.out.println("-------------- Thanks for Banking with Us! -------------");
    
    }// showProductDetails ends here
    
    //Here we Create a Setter and Getter is what will return method to the User GUI
//    setter
    void setPid(int pid){
        this.pid = pid; // This keyword meas a reference to current object
    }// setPid ends here
    
//    Getter
    int getPid(){
        return pid;
        
    } // getPid ends here


} // product class ends here

//=========================== Overloading a Constructor with a new Product ================
class Mobile extends Products{
    // here is called A Relation, where mobile is-A to product, then mobile will be child, Product is parent
    // Additional Attributes from Mobile to Product
    String Os;
    int ram;
    int rom;
    
    // Constructor for the mobile
      Mobile(){
          System.out.println(">> Mobile Obejct Constructor <<");
      } //mobile ends here
      
      void setProductDetails(int pid, String name, float price, String Os, int ram, int rom){
          this.pid = pid;
          this.name = name;
          this.price = price;
          this.Os = Os;
          this.ram = ram;
          this.rom = rom;
          System.out.println(">> Data written in Mobile Object <<");
      }// show productsDetails ends here
      
      // Here we Override the Product Details
      void showProductDetails(){
          System.out.println("------------- Product ID: "+pid+"-----------------");
          System.out.println("Name:\t"+name);
          System.out.println("Price:\t"+price);
          System.out.println("Os:\t"+Os);
          System.out.println("Ram:\t"+ram);
          System.out.println("Rom:\t"+rom);


        System.out.println("-------------- Thanks for Banking with Us! -------------");
      } // show product override ends here
         
}// Mobile class ends here

public class MayClassOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Products product = new Products();
        System.out.println("Here is the Products Details: "+product);
        
        // here we create a product to sale
        product.setProductDetails(0001, "Iphone X proMax", 6000);
        
        // here we call out the product
        product.showProductDetails();
        
                System.out.println("here is for the mobile section");
                
                // Calling the Mobile Object
                Mobile mobile = new Mobile();
                
                // setting the product to sale
                mobile.setProductDetails(002, "Samsung", 7000, "java12", 8, 256);
                
                // calling out The Mobile product
                mobile.showProductDetails();

               
    }// main class ends here
    
} // main public ends here
