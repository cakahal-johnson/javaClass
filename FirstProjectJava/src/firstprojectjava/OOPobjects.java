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
public class OOPobjects {
      OOPobjects(){
//        Car car1 = new Car ("123456", "Red", "Toyota 2.4", "TY789553");
//        Car car2 = new Car ("12388", "Green", "Mazeda 2.2", "MZ789iutT");
//        System.out.println("car1.color");
//        System.out.println("car2.color");
//        car1.dirve("nort");
//        car2.dirve("south");
    
        Human human1 = new Human();
        System.out.println(human1.name);
        System.out.println(Human.haircolor);
        

    }
    
}

//access modifies which is public in other to be accessed in an object freely,
///how other classes can access it's var. which is public String eg: FB IG

//use static String if you need the same objects

//use private String is only when you want your app private from adding Lang. in your app

//proctected is accessable only in the same packages 


    class Human{
        public String name = "Obi";
        static String haircolor = "black";
        private String cloth = "Trouses";
        protected int age = 89;
    }
///to make the object unquine n to eable then to 
    class Car { /// this var is best with Cpas letter
        String plateNumber;
        String color;
        String brand;
        String enginNmuber;
        Car (String plateNumber, String color, String brand, String enginNumber){
            this.plateNumber = plateNumber;
            this.color = color;
            this.brand = brand;
            this.enginNmuber = enginNumber;
            
        }
        
        public void dirve(String direction){
            System.out.println(direction);
        }

    }