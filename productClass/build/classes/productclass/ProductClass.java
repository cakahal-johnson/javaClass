/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productclass;

/**
 *
 * @author Cakahal Johnson
 */
 class Products{
        //Attributes of a product
        int pid; 
        String name;
        float price;
        
        ///stating the constructor
        Products(){
            System.out.println(">> Product Object Constructed");
    }
        
        // creating the methods (Behaviour)
        //if you want anything which should belong to the class to show, we make static
        void setProductDetails(int pid, String name, float price){
            this.pid = pid;
            this.name = name;
            this.price = price;
            System.out.println(">>> Data written in product Object");
        }

       // we will use method to write inside product
        void showProductDetails(){
            System.out.println("----------Product ID: " +pid+ "----------");
            System.out.println("Name:\t"+name);
            System.out.println("Price:\t"+price);
            System.out.println("--------Thanks for banking with us!---------");

        }
        
        //after the method we create SETTer ans GETTer
        //setter
        void setPid(int pid){
            this.pid = pid; // this keyword means a reference to current object
            
        }
        
        //getter
        int getPid(){
            return pid;
        }
        
    }
// product ends above

// =============Constructor for the new product ======================
class Mobile extends Products { // IS-A Relation. where mobile IS-A to Product, then mobile will be child, products is Parent
    //additional attributes from Mobile to product
    String Os;
    int ram;
    int rom;
    
    //constructor
    Mobile(){
        System.out.println(">>> Mobile Object Constructed ");
    }
    
    void showProductDetails(int pid, String name, float price, String Os, int ram, int rom){
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.Os = Os;
        this.ram = ram;
        this.rom = rom;
        System.out.println(">>> Data written in Product Object");
    }
    
    @Override
    void showProductDetails(){
            System.out.println("----------Product ID: " +pid+ "----------");
            System.out.println("Name:\t"+name);
            System.out.println("Price:\t"+price);
            System.out.println("Os:\t"+Os);
            System.out.println("RAM:\t"+ram);
            System.out.println("ROM:\t"+rom);
            System.out.println("--------Thanks for banking with us!---------");
    }
    
    
}


//=====/main==============
public class ProductClass {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        //using the created Product class as Object
        Products product = new Products();
        System.out.println("Prodcut is: "+ product);
        
        // writing inseide the product
        product.setProductDetails(0001, "Samsung", 5000);
        
        //reading data from the Object
        product.showProductDetails();
        
        System.out.println("here is for the moible section");
        
        Mobile mobile = new Mobile();
        // Product Object gets contructed before the mobile Object >>> Rule to Inhertance (Object to object)
        
        mobile.setProductDetails(301, "iPhoneX", 5000);
        mobile.showProductDetails();
        
                System.out.println("here is for the override moible section");
                mobile.showProductDetails(404, "itel", 100, "java", 1, 16);
                
                mobile.showProductDetails();

    }
    
}
