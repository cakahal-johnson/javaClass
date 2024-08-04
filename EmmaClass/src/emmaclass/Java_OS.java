/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emmaclass;

import java.util.Scanner;

/**
 *
 * @author Cakahal Johnson
 */
public class Java_OS {
    
    Java_OS(){
        
        /*
         Java OS means Operating System whereby we communicating with the system Runtimes
        
        so we also need java.io.* and scanner for output
        
        
        */
        
        Runtime runtime = Runtime.getRuntime();
        
//        try{
//            System.out.println("Shutting down the system after 5 seconds ");
//            runtime.exec("shutdown -s -t 5"); // -s means shutdown -r restart -t means time interval
//            
//        }catch(Exception e){
//            System.out.println("Exception: "+e);
//        }
        
        //using scanner
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the Number of Seconds");
        int seconds = scan.nextInt();
        Runtime rt = Runtime.getRuntime();
        try{
            System.out.println("Shutting down the system after 5 seconds ");
            runtime.exec("shutdown -r -t" +seconds); // -s means shutdown -r restart -t means time interval
            
        }catch(Exception e){
            System.out.println("Exception: "+e);
        }
    }
    
}
