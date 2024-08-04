/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayclass2023;

import assignmentClass.connections;
//import java.time.LocalTime;
/**
 *
 * @author Cakahal Johnson
 */
// public class MayClass2023 extends Thread { // this is for extends threads
public class MayClass2023 implements Runnable {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        MayClass2023 thread = new MayClass2023(); // for extends
//        
//        thread.start();
//        System.out.println("This code is outside of the thread");
        
        MayClass2023 obj = new MayClass2023();
        Thread thread = new Thread(obj);
        thread.start();
        
        System.out.println("This code is outside of the thread");
        
        

         
        
        
        System.out.println("java is awesome");
        
        System.out.print("java is awesome");
        
                System.out.println("java is awesome2");
        System.out.println("java is awesome3");
        
        // shortcut connection
//        new variables();
        
//        connection as an Object
//        variables var = new variables();
        
        
        // must be an Object connection
        connections conn = new connections();
        
        System.out.println(conn.Name);
//        new Operators();
        
//        new controlStatement_03();
//        new StringMethods_04();
        
//        new scanner_05();
//        new LoopForDOWhile();
//        new ExceptionHanding_07();
        
//        new JavaOI_08();
//        new JavaMethod_09();
//        new ObjectClasses_10();
//        new JavaOs_11();
//        new JavaExtras_12();
        
       // LocalTime myTm = LocalTime.now();  // Create a date object
//        System.out.println(myTm);
        
        
        


        
        
    } // here ends the main class
    
    public void run(){
        System.out.println("This code is running in a Thread");
    }
    
}
