/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juneclass;

/**
 *
 * @author Cakahal Johnson
 */
public class ExceptionHanding {
    ExceptionHanding(){
        /*
         Exception Handling this is when an error occurs, Java will normally stop and generate
        an error message. The technical term for this is called throwing an Exception(throw an error)
        
        Types of Exception Handling
        --Unchecked and --Checked Exception
        
        Unchecked
        To control the exception is called trycatch mode
        
        try statement: allows you to define a block of code to be tested for errors while it is being executed
        
        the catch statement: allows you to define a block of code to be executed, if an error occurs in the 
                             in the try block
        
        The trycatch keyword come in pairs
        
        Type trycatch and tab key;
        
        Finally:
        these Exception e holds all type of an errors in catch methids while we can select the type of an
        exception we want to check
        
        example for integers: we use (NumberFormatException nfe) at the catch method
        
        then we also need to import JAVA classes for the Exception to work
        eg: import java.lang.Object
            import java.lang.Throwable
            import java.lang.Exception
            import java.lang.IllegalArgumentException

        */
        
//        int[] myNumber = {1, 2, 3, 4};
//        System.out.println(myNumber[10]);
        
        System.out.println("Cahakal johnson");
        
        try {
            int[] myNumber = {1, 2, 3, 4};
            System.out.println(myNumber[10]);
            
        } catch (Exception e) {
            System.out.println("Opps!! your statement is not correct");
        } finally{
            System.out.println("try catch block finished");
            //this finally statement lets you execute code, after try...catch, regardless of the result
        }
        
        System.out.println("hope i'm safe");
        
        // Exception using OOP
        try {
            checkAge(20);
        } catch (Exception e) {
            System.out.println("passing anything which occured");
        }finally{
            System.out.println("code is finished");
        }
        
    } // here ends the block code 
    
    //here is off the block code for the OOP function
   static void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("Access denied, you must be 18 to vote ");
            
        }else{
            System.out.println("Access Granted to vote");
        }
    }
    
} // here ends the public class
