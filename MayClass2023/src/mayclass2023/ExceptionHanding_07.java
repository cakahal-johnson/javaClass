/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayclass2023;

/**
 *
 * @author Cakahal Johnson
 */
public class ExceptionHanding_07 {
    ExceptionHanding_07(){
        
        /*
        Exception Handling is an error that occurs during the running of a program
        which Java facilitated the managemnet of such errors by diverting controls 
        to special program blocks that execute when the errors occur...
        
        Cakahal Johnson
        
        
        TYPE OF EXCEPTION HANDLING:
        UNCHECKED AND CHECKED EXCEPTION HANDLING
    
        */
        
//        string name = "cakahal"; // checked Exception handling
        /*
         to use the unchecked Exception Handling we throw a Try and Catch statment
        
        SYNTAX:
        try{
            here you write your block code to try
        }catch(Exception e){
            here is for the code to handle the errors
        }
        
        finally:
        NB: Exception e holds all the type of an errors in catch methods while we can 
        select the type of exception we want to check
        example: for Int you can use (NumberFormatException nfe) at the catch method
        
            THE CLASSES OF JAVA EXCEPTION WHICH NEEDS TO BE IMPORT
        java.lang.Object
        java.lang.Throwable
        java.lang.Exception
        java.lang.IllegalArgumentException
        */
        
        //example of unchacked Exception handling
        System.out.println("uncheked");
        
//        int[] myNumber = {1, 2,3,};
//        System.out.println(myNumber[10]);
        
        
        try {
            int[] myNumber = {1, 2,3,};
            System.out.println(myNumber[10]);
        } catch (Exception e) {
            System.out.println("Ops! somthing went wrong!!");
        }finally{
            System.out.println("The 'try catch' is finished");
        }
        
            System.out.println("hey what's wrong?");
            
            //FINALLY: thi inally statement lets you  execute code, after try...catch,
            // regardless of the result, 
            // once the code is correct where the Exeception Message will be removed
            //if finally is inclusive if the code is wrong the two message will show
            
        try {
//          int[] myNumber = {1, 2,3,};
//          System.out.println(myNumber[10]);
            System.out.println("yes is woking");
        } catch (Exception e) {
            System.out.println("Ops! somthing went wrong!!");
        }finally{
            System.out.println("The 'try catch' is finished");
        }
        
        /*
            THE THROW KEYWORD
        the throw statement is used together  with an 'exception type' 
        basically with OOP
        
        // we write the OOP code oustside and then call it in the main function

        */
        
       
        
        try {
             //checkAge(17); // calling up the function outside the main
        //if the Age if above 20, you would not get an exception
         checkAge(20); // calling up the function outside the main

        } catch (Exception e) {
            System.out.println("somthing went wrong while checking the Age");
        }
 
        
    } // here ends the code block
            // OUTSIDE THE MAIN CLASS FOR THE oop
       static void checkAge(int age){
            if (age < 18){
               throw new ArithmeticException("Access denied - You must be at least 18 years to vote!");
            }else{
                System.out.println("Access granted - You are old enough! to vote");
            }
        }     
    
}// here ends the public class
