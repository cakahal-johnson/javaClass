/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emmaclass;

/**
 *
 * @author Cakahal Johnson
 */
public class ExceptionHandling {
    
    ExceptionHandling(){
        
        /*
        Exception Handling is an error that occurs during the running of a program
        which Java facilitated the management of such errors by divering controls
        to special programmable blocks that execute when the errors occur...
        
        
        TYPES OF EXCEPTION HANDLING:
        UNCHECKED AND CHECKED EXCEPTION HANDLING
        
        HOW USE ExceptionHandling:
        for the Unchecked Errors we throw a Try and Catch statement
        while the Checked is underlined with a red line in the line of code
        */
        
        // Checked Error 
        
//        string name = "cakahal";
        String name = "cakahal";
        
        int age = 70;
                
       System.out.println(age);
       
       // Unchecked Error
       int[] myNumber = {12, 13, 14, 15};
     //  System.out.println(myNumber[10]);
       
       System.out.println("I'm still here...");
       
       try{
            int[] myNumber2 = {12, 13, 14, 15};
            System.out.println(myNumber2[10]); // error
            // System.out.println(myNumber2[1]); // correct

       }catch(Exception e){
           
                  System.out.println("Opps... code not correct");
           
       } finally{
           // this statement let you execute code, after try..catch, regardless of the result
           System.out.println("End of code Exception Block");
       }
       
              System.out.println("I'm still here2...");

       
       /* THE THROW KEYWROD */
              // This is used together with an 'exception type;
              //basically writing an OOP function
              
              //CALLING FUNCTION INSIDE THE MAIN CLASS
              checkingAge(12);
              
              System.out.println(myNumber[1]); // correct

              
              
       
    } // end of class section
    
//                System.out.println(myNumber2[10]); // error
    
    static void checkingAge(int Age){
        if(Age < 18){
            throw new ArithmeticException("Access Denied - You must be at least 18 yrs to vote!");
        }else{
            System.out.println("Access Granted - You are old enough to vote");
        }
             
    }

    
}
