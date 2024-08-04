/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelsonclass;

/**
 *
 * @author Cakahal Johnson
 */
public class ExceptionHanding_02 {
    
    ExceptionHanding_02(){
        
        /* 
        Exception Handling this is when an error occurs, Java will normally stop and generate
        an error message. The technical term for this is: Java will throw an Exception (Throw an error)
        
        TYPES of Exception Handling
        Unchecked and Checked Exception 
        */
        
        // Unchecked
        /*
        Exception Handler is called trycatch mode
        try statement allows you to define a block of code to be tested for errors while it is being executed
        
        the catch statement allows you to define a block of code to be executed, if an error occurs in the try block
        
        The try catch keyword come in pairs
        
        trycatch and tab key
        
        finally:
        Exception e holds all type of an errors in catch methods while we can select the type 
        of an exception we want to check
        example: for integers we use (NumberFormatException nfe) at the catch method
        
        then ALSO need import JAVA class for the Exception to work
        eg: import java.lang.Object
            import java.lang.Throwable
            import java.lang.Exception
            import.lang.IllegalArgumentException
        
        */
        
//        int[] myNumber = {1, 2 ,3 ,4};
//        System.out.println(myNumber[10]);
        
        try {
            int[] myNumber = {1, 2 ,3 ,4};
        System.out.println(myNumber[10]);
            
        } catch (Exception e) {
            System.out.println("Ops!! your statement is not correct");
        }finally{
            System.out.println("Ops!! your statement is not correct i'm the final guy!!!");
            // this fianlly statement lets you execute code, after try...catch, regardless of the result
        }
        
        String name = "after the exception code above";
        System.out.println(name);
        
        try {
            checkAge(20);
        } catch (Exception e) {
            System.out.println("somting exception occured");
        }finally{
            System.out.println("code exe done");
        }
        
        /* THE throw Keyword
        is used together with an exception message type basically withh OOP
        // where we write the OOP code outside then call it in the main function
        */
        
    } // here ends Exception Block of code
//    System.out.println("this is an exception");
    
    //here is OUTside the main block of code
    static void checkAge(int age){
        if (age < 18){
            throw new ArithmeticException("Acees denied, you must be 18 to vote");
        }else{
            System.out.println("Access Granted to vote");
        }
    }
    
}
