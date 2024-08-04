/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejikeapp;

import java.util.Scanner;

/**
 *
 * @author Cakahal Johnson
 */
public class controlStatement {
    controlStatement(){
        /*
        control statements help out in adding controls to our codes.
        it's all about decision making, just the way it applies in our normal daily life 
        experience.
        
        Java has the following conditional statement:
        if:
        if-else:
        else;
        Switch:
        for loop
        while loop
        do-while loop
        break control
        continue control
        return
        
        if statement: is used to specify a block of code to be executed, if a 
        statement specified condition is true
        
        else if: is to specify a new condition to test, if the first condition is false
        
        else: is use to specify a block code to be, if the same condition is false
            this else ends every line of an "if statement"
        
        switch: is used to specify many alternative block of code to be executed
        
        */
        
        int age = 18;
        
        if (age >= 18) {
            System.out.println("Yea you're now an adult");
        }else{
            System.out.println("sorry am not yet an adult");
        }
        
        String username = "Obi";
        int password = 12345;
        
        if (password == 12345) {
            System.out.println("Login successfully");
            
        }else{
            System.out.println("you're not yet registered");
        }
        
        int password1 = 123456;
        int password2 = 1234567;
        
        if (password1 == password2) {
            System.out.println("you are passed");
            
        }else{
            System.out.println("check your password");
        }
        
        int time = 24;
//        int time2 = 16;
        if (time < 10) {
            System.out.println("Good morning");
            
        }else if(time >= 12 && time <= 16){
            System.out.println("good day");
            
        }else if(time >= 16 && time <= 18){
            System.out.println("good evening");
        }else if(time >= 18 && time <= 22){
            System.out.println("good night");
        }else{
            System.out.println("its too late to greet");
        }
        
        int myMOney = 100;
        String result = (myMOney < 90) ? "i'm rich" : "i'm poor" ;
        System.out.println(result);
        
        /*
        JAVA SWITCH STATEMENT
        is used to one of many code blocks to be executed
        this means that is is used for a Static values
        
        syntax
        
        switch(expression){
        case x:
            code blocks comes here
            break;
        case y:
            code blocks here
            break;
        default:
            code block
        
        }
        
        NB: the switch expression is evaluated once
            the value of the expression is compared with the values of each case
            if there is a match, the associated block of code is executed
            the break and default keywords are optional, and will add when needed.
        
        */
        
        int day = 3;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5: 
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        
//        Scanner can used to test a user interface in the terminal
//        to use this scanner you need to import it
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        age = sc.nextInt();
        
        if (age < 13) {
            System.out.println("You're a kid");
        }else if(age >= 13 && age <=19){
            System.out.println("You're now a teenager");
        }else if(age < 20 && age  <= 40 ){
            System.out.println("You're now Youth");
        }else if(age >= 40 && age <= 200){
            System.out.println("You're a manh now");
        }else{
            System.out.println("You're living by grace");
        }
    }
}
