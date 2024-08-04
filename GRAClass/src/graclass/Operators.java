/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graclass;

/**
 *
 * @author Cakahal Johnson
 */
public class Operators {
    //this is the connection from the main Class
    Operators(){
        /*
        Operators are used to perform operations on variables and values.

In the example below, we use the + operator to add together two values:
        
        Java divides the operators into the following groups:

        Arithmetic operators
        Assignment operators
        Comparison operators
        Logical operators
        Bitwise operators
        */
        
//         Arithmetic operators
        
        int number = 10;
       
//        System.out.println(number++);
//        System.out.println(++number);
//        System.out.println(number--);
//        System.out.println(--number);     
        

// Assignment operators
//        Assignment operators are used to assign values to variables.
//In the example below, we use the assignment operator (=) to assign the 
//        value 10 to a variable called myMoney:
        int myMoney = 10;
        myMoney += 5;
        System.out.println(myMoney);
        
        
        
        int number1 = 20;
        int number2 = 5;
        
//        System.out.println(number1+number2);
//        System.out.println(number1-number2);
//        System.out.println(number1*number2);
//        System.out.println(number1/number2);
        System.out.println(number1%number2);
        
        
        int car1 = 200 + 1000;
        System.out.println(car1);
        
        int sum2 = car1 + 250;
        System.out.println(sum2);
        
        int sum3 = sum2 + sum2;
        System.out.println(sum3);
        
       /* Float: this is also similar to double but hold decimal number with a 
                width of 32. It’s being used in this form “float” when declaring 
                a variable.
        */
        
        float basicSalary= 10000.78f;
        System.out.println("my gross salary is: " + basicSalary);
        
        
        
        /*
        To use math functions like square root, power, pi, cosine etc.,
        the math class will need to be imported from the Java langpackage
        e.g. import java.lang.Math;
        */
          double sq9 = Math.sqrt(100); //squreroot: you have to import Math
            
            System.out.println(sq9);
        
        
          
            
        
//        To use math functions like square root, power, pi, cosine etc., 
//        the math class will need to be imported from the Java langpackage e.g.
//                import java.lang.Math;
//Let’s assume we are to find the square root of 9, all we have to do is call 
//        Math.sqrt(9) assigned to a variable.

            
            /*
            Control Statements help out in adding controls to our codes.
            It’s all about decision making, just the way it applies in our 
            normal daily life experiences.
            
            Java has the following conditional statements:

            Use "if":
      to specify a block of code to be executed, if a specified condition is true
            
Use else:
        to specify a block of code to be executed, if the same condition is false
            
Use else if:
        to specify a new condition to test, if the first condition is false
         
Use switch:
        to specify many alternative blocks of code to be executed
            
            */
            
            int age = 18;
            
            if (age >= 18){
                System.out.println("are you an adult");
            }else{
                System.out.println("i'm not an adult");
            }
            
            if (age < 18){
                System.out.println("are you an adult");
            }else{
                System.out.println("i'm not an adult");
            }
            
            int time = 17;
            if (time > 18){
                System.out.println("Good Day");
            }else{
                System.out.println("Good Evening");
            }


//            System.out.println("testing this ");

    }
    
}
