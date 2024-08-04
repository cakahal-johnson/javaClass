/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprojectjava;
import java.lang.ArithmeticException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.Exception;

/**
 *
 * @author Cakahal Johnson
 */
public class ExceptionHandling {
    ExceptionHandling(){
    //checked is the error is visiable to find
        
   //unchecked or runtime error by importing eceptions java.lang.eception
        //or put it in a try{}catch{} so to return the error message in the catch
        //e.printStackTrace(); to print where the error is
        //for index importing = ArrayIndexOutOfBoundsException
        //Exception handls all the error which starts from top to down 
        
        try{//numberFormate exceptions
            String two = "5";
            int i = Integer.parseInt(two);
            String name = "0.08you";
            double num = Double.parseDouble(name);
        }catch(Exception e){
//            e.printStackTrace();
            System.out.println("You cannot divide by zero");
        }finally{
            System.out.println("no issue");
        }//The finally block follows a try block or a catch block.
        //A finally block of code always executes, irrespective of occurrence of an Exception.
    }
    
}
