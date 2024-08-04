/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addcart;

/**
 *
 * @author Cakahal Johnson
 */
class Product{
        ///Attributes
    int pid;
    String name;
    int price;
    
   //    Constructor 
    Product(){
        System.out.println(">>> Product Object Construted");
   
}
//    Methods (Behaviour)
    //To write data in product Object we have this method
    void setProductDetails(int pid, String name, int price){
        this.pid = pid;
        this.name = name;
        this.price = price;
        System.out.println(">>> Data Written in Product Object");
    }
    
//    To read from Product Object
    void showProductDetails(){
        System.out.println("------Product Id: "+pid+"-------");
        System.out.println("Name:\t"+name);
        System.out.println("Price:\t"+price);
        System.out.println("---------------------------------");
    }
    
//    setter
    void setPid(int pid){
        this.pid = pid; //this means reference to current object
    }
    
//    getter
    int getPid(){
        return pid;
    }
}
//    =======constructor=======
class Mobile extends Product{ 
//    IS-A Relation. Mobile IS-A Product, Mobile is child, Product is Parent
//    additional attribute of mobile other than the product
    String Os;
    int ram;
    int sdCardSize;
    
    //we have redefined the same method from parent into the child  with different inputs
    //we have now 2 methods in the child, 1 from parent and 1 of child
    //both are different as in based on inputs (even though name is same
    //Method Overloading : same method name with different inputs
    
    Mobile(){
        System.out.println(">>> Mobile Object Constructed");
    }
    
    void showProductDetails(int pid, String name, int price, String os, int ram, int sdCardSize){
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.Os = os;
        this.ram = ram; 
        this.sdCardSize = sdCardSize;
        System.out.println(">>> Data Written in Product Object");
        
    }
    
    //Lets Redefine showProductDetails as well
    //but where we have smae inputs
    //2 methods, 1 from parent 1 in child and with same signature!!!
    //the child methods will be executed and not the parent method
    //METHOD OVERRIDING: same method Name with same inputs in parent child relationship
    @Override
    void showProductDetails(){
        System.out.println("-----Product ID: "+pid+"-------");
        System.out.println("Name:\t"+name);
        System.out.println("Price:\t"+price);
        System.out.println("OS:\t"+Os);
        System.out.println("Ram:\t"+ram);
        System.out.println("SdCared:\t"+sdCardSize);
        
        System.out.println("======Thank you for Banking with Us!========");
    }
    
}

   


public class AddCart {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
//        loading directly from the main
        
        System.out.println("THIS SECTION IS FOR LOADING FROM MAIN ");
        
        Product productM = new Product();
       productM.pid = 404; ///MARK AS PRIVATE
        productM.setPid(419);
        productM.name = "Laptop";
        productM.price = 10000;
        
        productM.showProductDetails();
        
        
       System.out.println("======Thank you for Banking with Us IN LOADING FROM MAIN !========");

//        
//        
////        Create an Object:
//        
//        Product product = new Product();
////        Product is not an Object its a reference variable which holds the hashcode of the 
////        object in a hexadecimal notation
//        System.out.println("Product is: "+product);
////        Writing data in Object
//        product.setProductDetails(101, "iPhone", 2000);
//        
////        Reading data from Object
//        product.showProductDetails();
//        
//        System.out.println("");
//                product.showProductDetails();
//                
//                System.out.println("=====Product Ends here!!!====");
////        Requesting to get mobile object contructed!!
//                
//               Mobile mobile = new Mobile();
////     Product Object gets contructed before the mobile Object >>>Rule ot Inhertance (Object to object)
//               
//               mobile.showProductDetails(501, "iPhoneX", 6000, "iOS", 128, 300);
//               mobile.showProductDetails();
//                
//                

    }
    
}
