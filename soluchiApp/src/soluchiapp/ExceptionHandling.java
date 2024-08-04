/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soluchiapp;

/**
 *
 * @author Cakahal Johnson
 */
public class ExceptionHandling {
    ExceptionHandling(){
        /*
         Exception Handling is an error that occurs during the program running
        whereby Java management handles the error by diverting controls to special 
        block of code that execute when the error occured...
        
        Type of ExceptionHandling
        --- Unchecked and Checked
        
        to avoid this errors we use try catch
        try {
            here is where you write your codes
        }catch(Exception e){
          here is for the code to handle the errors
        }finally{
           holds all the type of an errors in catch methods while we can select 
           the type of exception we want to check
        example: for int you can use (NumberFormatException nfe) at the catch method
        }
        
        We need some JAVA Exception Classes to import
        java.lang.Object
        java.lang.Throwable
        java.lang.Exception
        java.lang.IllegalArgumentException
        */
        
        //example checked 
//        string name = "Cakahal Johnson";
        
        //Unchecked Examples:
      //  int[] myNumber = {1, 2, 3, 4, 5}; //Array
       // System.out.println(myNumber[10]); 
        
        try{
            
//            int[] myNumber = {1, 2, 3, 4, 5}; //Array
//            System.out.println(myNumber[10]); 
            System.out.println("Code is working");
        }catch(Exception e){
         System.out.println("code error");
        }finally{
            System.out.println("The try catch finished!");
        }
        
        /*
          the Throw Keyword
        the throw statement is used together with an 'exception type'
        basically with OOP
        
        # we write OOP Classes or function outside the block code and now call the function inside
        the block code
        */
        
        // inside the block
        checkAge(20);
        
        
        
        System.out.println("End of block code");
    } //end of block code
    
   static void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("Access Denied - you must be 18 to vote!");
        }else{
            System.out.println("Access Granted - You're old enough to vote");
        }
    }
}
