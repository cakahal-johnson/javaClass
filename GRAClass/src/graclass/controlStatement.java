/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graclass;


import java.util.Scanner;

/**
 *
 * @author Cakahal Johnson
 */
public class controlStatement {
    controlStatement(){
        /*
                If-else Statement
                Switch Statement
                For Loop
                While Loop
                Do-While Loop
                Break Control
                Continue Control
                return
        
         Arithmetic operators
        Assignment operators
        Comparison operators
        Logical operators
        Bitwise operators
                */
        
         
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
            
//            int age = 18;
//            
//            if (age >= 18){
//                System.out.println("are you an adult");
//            }else{
//                System.out.println("i'm not an adult");
//            }
//            
//            if (age < 18){
//                System.out.println("are you an adult");
//            }else{
//                System.out.println("i'm not an adult");
//            }
//            
//            int time = 17;
//            if (time > 18){
//                System.out.println("Good Day");
//            }else{
//                System.out.println("Good Evening");
//            }
            
//            Comparison operators
            /*
            Java Booleans
Very often, in programming, you will need a data type that can only have one of two values, like:

YES / NO
ON / OFF
TRUE / FALSE
For this, Java has a boolean data type, which can take the values true or false.

Boolean Values
A boolean type is declared with the boolean keyword and can only take the values true or false:
            */
            
//            int x = 10;
//            int y = 9;
//                System.out.println(x > y); // returns true, because 10 is higher than 9
//                
//            int a = 10;
//            System.out.println(a == 10); // returns true, because the value of x is equal to 10
//            
//            System.out.println(10 == 15); // returns false, because 10 is not equal to 15
//            
//            int age1 = 20;
//            
//            if (age1 > 18 || age < 18){
//                System.out.println("You are 18 years or above" );
//                
//            }else{
//            System.out.println("you are 18yrs or below");
//        
//        }
//         
//            
//        if (age <= 18 || age >= 18 ){ //True will run
//            System.out.println("true");
//            }else{
//                System.out.println("False");
//        }
        ///NB: the  || "OR" type Returns true if one of the statements is true
        ///    the  && "AND" type Returns true if both statements are true
        ///    the !   "NOT" type Reverse the result, returns false if the result is true
            
        
        
//        int old = 20;
//        
//        if (old > 20 && old < 20){
//            System.out.println("you're 20yrs or above");
//        }else{
//            System.out.println("you are less than 20yrs");
//        }
//            
//        if (old == 20 && old != 20){
//            System.out.println("True");
//        }else{
//            System.out.println("False");
//        }
//        
//        if (old != 20){
//            System.out.println("You are 20yrs or above");
//        }else{
//            System.out.println("you are 20yrs or below");
//        }
            
        
        ///JAVA SWITCH STATEMENTS
        //you use the switch statement to select one of many code blocks to be executed.
//        this means that it is used for a STATIC VALUES
        
        /*
                    Syntax
            switch(expression) {
              case x:
                // code block
                break;
              case y:
                // code block
                break;
              default:
                // code block
            }
        
        
        This is how it works:

The switch expression is evaluated once.
The value of the expression is compared with the values of each case.
If there is a match, the associated block of code is executed.
The break and default keywords are optional, and will be described later in this chapter
        */
        
//        int day = 10;
//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//        }
//        
//        switch (day) {
//            case 8:
//                System.out.println("Today is Saturday");
//                break;
//            case 9:
//                System.out.println("Today is Sunday");
//                break;
//            case 10:
//                System.out.println("Today is Sit at home");
//                break;
//            default:
//                System.out.println("Looking forward to the Weekend");
//        }
            
        ///SMALL PROJECT USING SCANNER
        /*
          // creates an object of Scanner
            Scanner input = new Scanner(System.in);

            System.out.print("Enter your name: ");

            // takes input from the keyboard
            String name = input.nextLine();

            // prints the name
            System.out.println("My name is " + name);

            // closes the scanner
            input.close();
        */
        
//       Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your Age");
//        age = sc.nextInt();
//        
//        if (age < 13){
//            System.out.println("You are a Kid");
//        }else if(age >= 13 && age <= 19){
//            System.out.println("You are a teenager");
//        }else if(age < 20 && age <= 40){
//            System.out.println("Your are a Youth");
//        }else if(age >= 40 && age <= 200){
//            System.out.println("You are a old manh");
//        }else{
//            System.out.println("You are leaving by grace");
//        }
        
        
        ////JAVA LOOP
        //It allows us to execute an item multiple times.
        //TYPES OF LOOP
        /*
        When you know exactly how many times you want to loop through a block
        of code, use the for loop instead of a while loop:
        */
        
        /*
        FOR LOOP
        There are three forms of "FOR" loop in Java namely:
        Simple, Foreachand LabelledFor Loop.
        
        WHILE LOOP
        ist has a DO-while loop
        */
        
        /*
        The for loop is a construct which does execute a set of instructions
        a specified number of times. It’s usually used when you know the 
        definite number of times the loop is to run. There three forms of a
        for loop in Java namely: Simple, Foreachand LabelledFor Loop.
        */
        
       /*
        Syntax:
        for (<initialization>; <loop condition>; <increment/decrement expression>){
        <loop body>
        }
        */ 
        //Simple FOR LOOP
//        for (int i = 0; i < 10; i++){
//        System.out.println(i);
//        }
//        
//        for (int i = 9; i > 0; i--){
//            System.out.println(i);
//        }
//        
//        //While Loop Control
//        int val = 10;
//        while(val<20){
//            System.out.println(val);
//            val++;
//        }
        
        ///Do-While Loop
        /*
        The do/while loop is a variant of the while loop.
        This loop will execute the code block once, before checking if the
        condition is true, then it will repeat the loop as long as the condition is true.
        */
//        int man = 0;
//        do{
//            System.out.println(man);
//            man++;
//        }while(man < 6);
        
//          int man2 = 50;
//         do{
//             System.out.println(man2);
//             man2--;
//         }while(man2 > 0);
        
        /*
        BREAK CONTROL
        You have already seen the break statement used in an earlier chapter
        of this tutorial. It was used to "jump out" of a switch statement.
        The break statement can also be used to jump out of a loop.
        
        CONTINUE CONTROL 
        The continue statement breaks one iteration (in the loop), if
        a specified condition occurs, and continues with the next iteration
        in the loop.
        */
        
        ///EXAMPLE OF BREAK WITH FOR LOOP
//        for (int i = 0; i < 11; i++) {
//            if (i > 6) {
//              break;
//            }
//            System.out.println(i);
//          }
        
//        ///EXAMPLE OF CONTINUE WITH FOR LOOP
//        for (int i = 10; i < 21; i++) {
//            if (i == 4) {
//              continue;
//            }
//            System.out.println(i);
//        }
        
//        ///EXAMPLE FOR BREAK WITH WHILE LOOP
//        int i = 0;
//        while(i < 10 ){
//            System.out.println(i);
//            i++;
//            if(i == 4){
//                break;
//            }
//        }
        
//        
//        ////EXAMPLE FOR CONTINUE IN WHILE LOOP
        int c = 0;
        while(c < 15){
            if( c == 5){
                c++;
                continue;
            }else if(c == 8){
                c++;
                continue;
                
            }else if( c == 10){
                c++;
                break;
            }else
                c++;
            System.out.println(c);
            c++;
        }  
//            
            
            
            
            
//        Scanner Fullname = new Scanner(System.in);
//        System.out.println("Enter my Name");
//        
//        String myName = Fullname.nextLine();
//        System.out.println("Your name is: " + myName);
//        
        
       //Assignment 
//         with scanner print input to display your name, age and salary in one line code
    // with Scanner create a mind game that hold an input number then:
//        add 10 add another 20 mius 2 then * 4 to then remove the mind number i display the answer:
        
      
            
            
            
       
       
       
       
       
            
            
            
            
      
        
         
//         how to clear white space Strings 222 + 225 and add the + to print in one line
//         s = s.trim;
//         s = s.replaceAll()
         
            
           
    }

    
    
}
