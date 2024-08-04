/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayclass2023;

import java.util.Scanner;

/**
 *
 * @author Cakahal Johnson
 */
public class controlStatement_03 {
    
    controlStatement_03(){
        
        /*
         CONTROL STATEMENT:
        this helps to output an additional controls to our codes, 
        it's all about decision making, if, else, for
        
        
        JAVA CONDITIONAL STATEMENT
        1) if (sets the conditions):
        else if or if else (adds additional conditions)
        else (is the default of what happens if the condition is not meant)
        
        2) Switch Case:
        
        3) For Loop:
        
        4) while Loop:
        
        5) do-while looop:
        
        6) Break Controls, Continue control, Return
        
        */
                    System.out.println("=========ControlStatement=========");

//        int age = 18;
          int age = 20;
        
        // here we check if someone is less than 18, What happens
        if (age <= 18){
            System.out.println("Yea you're old enough to vote");
        }else if(age > 18 && age < 20){ // making this to be true we add = sign to 20 i.e <=
           System.out.println("yes you're above 18 and old enough to vote");

        }else if(age > 18 || age < 20) {
            System.out.println("yea are in right age to vote");
        }else{
            System.out.println("Sorry not old enough");
        }
        
        // where we have conditions where we can use Lambda functions shortcut to IF statement
        float money = 1000;
        String bal = (money < 900) ? "You can't withdraw" : "Your Bal is too low";
        System.out.println(bal); // the first statement is return
        
        String Bal = (money < 9000) ? "You can't withdraw" : "Your Bal is too low";
        System.out.println(Bal);  // the Second statement is return
        
        System.out.println("==============SECTION 2 SWIRCH CASE =================");
        /*
        RULES:
        the switch expressions is evaluated at once, if the value of the expression
        is compared with the values of each CASE:,
        if there is a match, the associated block of code is executed
        
        Then? the Break ends each code or CASE block
        
        where! the Default as keyword is also optional just like the else?
        */
        
        int days = 2;
        //Assignment:
        // create case, if statement, that will greet when time is morning, afternoon, evening and night 
        
        switch(days){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("day 4 is not active");
        }
        
        System.out.println("=============JAVA SCANNER================");
        /*
         scanner is use to test a user interface in the terminal
        to use this scanner we need to import scanner...
        
 
        */
        
        
        int time = 24;
        
        Scanner sac = new Scanner(System.in);
        System.out.println("Here Enter Your Day Time");
        time = sac.nextInt();
        
        if (time < 12){
            System.out.println("Good Morning");
            
        }else if (time >= 12 && time <= 16){
            System.out.println("Good Afternoon");

        }else if (time >= 17 && time <= 22){
            System.out.println("Good Night");
            
        }else{
            System.out.println("it's too late to greet!");
            
        }
        
    }
}
