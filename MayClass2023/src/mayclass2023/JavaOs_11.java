/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayclass2023;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Cakahal Johnson
 * 
 */
public class JavaOs_11 {
    
    JavaOs_11(){
        /*
        * This Os means Operating system whereby we communicating with the system
        Runtimes...
        so need to import java.io.* and scanner
        */
        
        Runtime runtime = Runtime.getRuntime();
//        try{
//            System.out.println("Shutting down the Pc after 5 seconds ");
//            runtime.exec("shutdown -s -t 5"); // -s means shutdown -r restart 
//            //while -t is time interval 5 per second  
//            
//        }catch(Exception e){
//            System.out.println("Exception: "+e);
//        }
        
        // using scanner
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the Number of Second");
        int seconds = scan.nextInt();
        Runtime rt = Runtime.getRuntime();
         try{
            System.out.println("Shutting down the Pc after " +seconds +"seconds");
            rt.exec("shutdown -s -t "+seconds); // -s means shutdown -r restart 
            //while -t is time interval 5 per second  
            
        }catch(Exception e){
            System.out.println("Exception: "+e);
        }
         
         // ReStarting the System
         Runtime Rt = Runtime.getRuntime();
          try{
            System.out.println("Shutting down the Pc after 5 seconds");
            Rt.exec("shutdown -r -t 5"); // -s means shutdown -r restart 
            //while -t is time interval 5 per second  
            
        }catch(Exception e){
            System.out.println("Exception: "+e);
        }
        
    } // here ends the body code
    
} // here ends the public class
