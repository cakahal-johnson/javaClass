/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soluchiapp;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Cakahal Johnson
 */
public class JavaOs {
    
    JavaOs(){
        /*write a program that will shutdown the computer system 5 seconds*/
        
//        Runtime runtime = new Runtime.getRuntime();
        Scanner sc = new Scanner(System.in); // import scanner using alt enter key
        System.out.println("Enter the NUmber of seconds ");
        int seconds = sc.nextInt();
        Runtime r = Runtime.getRuntime();
        
        try{
            System.out.println("Shutting down the Pc after "+ seconds+ " seconds.");
            r.exec("shutdown -s -t "+seconds);
            
        }catch(IOException e){
            System.out.println("Exception: "+ e);
        }
        
        // Restart the computer
        Runtime rt = Runtime.getRuntime();
        try{
            
            rt.exec("shutdown -r -t 5");
            System.out.println("Restartingb in 5 second");
        }catch(IOException e){
            System.out.println("Exception: "+ e);
        }
    }
    
}
