/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ot_class;

/**
 *
 * @author Cakahal Johnson
 */
public class ExceptionHandling {
    ExceptionHandling(){
        
        /*
        This Exceptions handlimngm ia a way where an error occures during the program
        execution which has to stop the code from run as well
        
        Java facilitates the management of such error by diverting the control to
        special program blocks that will execute when the errors occur...
        
        TYPE OF eXCEPTION hANDLING:
        ---Unchecked and checked
        
        */
        
        // Checked exceptions handling
        
//        string name = "cakahal";
        
        /*
        to debug the unchecked ExceptionHandling we throw a TRY and Catch statement
        
        Syntax:
        try{
            here you write your blocks of codes to try
            
        }catch(Exception e){
        here is for the code name errors handlings
        }
        
        finally:
        
        NB: Exception e holds all the type of an errors in catch methods while we can 
        select the type of exception we wnat to check
        eg. for Int you can use (NumberFormatException nfe)
        
        The classes of Java Exception we need to import
        java.lang * meams import all java exceptions handling
        
        java.lang.Object
        java.lang.Throwable
        java.lang.Exception
        java.lang.RuntimeException
        java.lang.IllegalArgumentException
        java.lang.NumberFormtException
        
        */
        
        // Unchecked Errors
//        int[] myMoney = {100, 200, 2000,};
//        System.out.println(myMoney[10]);
        
        System.out.println("Hereby we use try  and catch to hold this exception");
        
        // put the array as above in try and catch method
        try {
              int[] myMoney = {100, 200, 2000,};
              System.out.println(myMoney[10]);
        } catch (Exception e) {
            System.out.println("Opps! something went wrong...");
        }
        
        System.out.println("Yea we're good to go the above error is not for us!");
        
        
        // checkAge(10); // using OOP error
                checkAge(100); // using OOP

       
        System.out.println("hi");
        
        // Finally Exception Handling
        try {
            int[] myNumbers = {500, 200, 600};
            System.out.println(myNumbers[10]); // error execution 

        } catch (Exception e) {
            System.out.println("Opps! something went wrong...with our code");
        } finally{
            System.out.println("The 'try catch.' finished execution");
        }
        
        System.out.println("Thank you for banking Us!");
        
        
    } // here stops our block of code
    
    
// here is outside our code block for our check age function
    private void checkAge(int i) {
        //To change body of generated methods, choose Tools | Templates.
        if(i < 18){
            throw new ArithmeticException("Acces denied - You must be at least 18 for you to vote!");
            
        }else if(i >= 18 ){
            System.out.println("Access Granted");
        }else{
            System.out.println("Access Granted - You're old enough to vote!");
        }
    }
//          System.out.println("hi"); // error b'cos is outside the code block

}
