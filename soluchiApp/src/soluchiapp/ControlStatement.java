/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soluchiapp;

import java.util.Scanner;

/**
 *
 * @author Cakahal Johnson
 */
public class ControlStatement {
    
    ControlStatement(){
        /*
        helps to output an additional controls to our codes
        it's all about decision making just as in real life
        using if, else, for etc...
        
        Java Conditional Statement
        
        1) if(set the IF condition){
               #TODO Code
           }else if(another condition){
              #TODO code
           }else{
              #here is what happen when the conditions are met
           }
        
        2) Switch Case:
        
        3) While Loop:
        
        4) do-while loop:
        
        5) For Loop:
        
        6) Break Controls, Continue control, Return
        */
        
//        int age = 18;
        int age = 30;
        
        if(age <= 18){
            System.out.println("You're not old enough to vote");
        }else if(age > 18 && age < 20){
            System.out.println("&& 'and' means where two condition must true");
        }else if(age > 18 || age < 20){
            System.out.println("|| 'or' means where either condition is true");
        }else{
            System.out.println("here is what happens when the condition is false");
        }
        
        
        // Lambda function for If Statement shortcut
        float money = 1000; // the money to widthdraw
        String bal = (money < 900) ? "You can't withdraw" : "Your Bal is 900";
        System.out.println(bal); // here the first statement will be return
        
        String Bal = (money < 9000) ? "You can withdraw" : "Your Bal is 9000";
        System.out.println(Bal); // here the second statement will be return
        
        System.out.println("Switch Case");
        /*
        Rules:
        the switch expressions is evaluated at once, if the value of the expression 
        is compared with the values of each Case:
        if there is a match, the associated block of code is executed
        
        Then? The BREAK ends each code or Case block
        
        where! the Default as keyword is also optional just like else
        
        
        */
        
        int Days = 4;
        switch(Days){
            case 1:
                System.out.println("Sunday");
                break;
            case 2: 
                System.out.println("Monday");
                break;
            default:
                System.out.println("Opps! we only have two case");
        }
        
        
        System.out.println("========JAVA SCANNER===========");
        
        /*
         scanner is used to test a user interface in the terminal
        we need to import Scanner...
        */
        
        int time = 24;
        
        Scanner jsc = new Scanner(System.in); // alt enter key to import
        System.out.println("Here Enter Your Day Time");
        time = jsc.nextInt();
        
        if(time < 12){
            System.out.println("Good Morning!!");

        }else if (time >= 12 && time <= 16){
            System.out.println("Good Afternoon");
        }else if (time >= 17 && time <= 23){
            System.out.println("Good Night");
        }else{
            System.out.println("it's too late greet!");

        }
        
        
        
        
    }
    
}
