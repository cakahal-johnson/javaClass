/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelsonclass;

import java.util.Scanner;

/**
 *
 * @author Cakahal Johnson
 */
public class ControlStatement {
    
    ControlStatement(){
    
    /* multi-line comment
        -- If-else Statement
        -- Switch case Statement
        --- For Loop
        ---- While Loop
        ---- Do-while Loop
        ---- Break Control
        ---- Continue Control
        ---- return
        
        control statement helps out in adding controls to our codes,
        it's all about decision making, just the way it applies in our normal daily life experiences
        
        "IF":
        to specify a block of code to be executed, if a specified condition is true
        
        then we use "ELSE":
        to specify a block of code to be executed, if the same condition is false
        
        we also have "else if":
        to spcify a new condition to test, if the first condition is false
        
        Switch:
        to specify many alternative blocks of code to be executed
          
    */ 
        
        int ppl_age = 17; // here is the user
        
        if(ppl_age < 18){ // here is the condition to meet
            System.out.println("You're not old enough to vote!");
        }else{
            System.out.println("You're old enough to vote!");

        }
        
        /*
         comparison is Boolean means two state which is something that change like:
        Yes / No
        ON / Off
        True / false
        
        boolean is a keyword
        
        */
        
        if(ppl_age > 18 || ppl_age < 18){ // condition for OR statement ||
            System.out.println("You're old enough to vote! for ||");
        }else{
            System.out.println("You're not old enough to vote! for ||");
        }
    
        if(ppl_age > 18 && ppl_age < 18){ // condition for AND statement &&
            System.out.println("You're old enough to vote! for ||");
        }else if(ppl_age > 18){
                System.out.println("You're old enough to vote! for else if &&");
        }else{
            System.out.println("You're not old enough to vote! for &&");
        }
        
        
        // SWITCH STATEMENT
        /*
        switch syntax:
        
        initailizer var
        
        switch(expression){
        case var:
            // code here
           break; // we use break to pause the case for the next case
        case var2:
            // case code here
        break;
        
        default:
          // code same as else
        
        }
        
        the switch expression is evaluated once
        then the value of the expression is compared with the values of each case
        if there is a match, the associated block of code is executed
        default is same as else statement which executes only if the condition of not match
        then the break and default keyword are optional,
        
        */
                        System.out.println("===========Switch==============");

        int day = 6;
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
                System.out.println("Sunday");
            default:  
                System.out.println("Ops! your day is not match");

    
        }
        
        // SCANNER this is primitive method from java package
        // is used to collect input and comm with terminal
        
       /*
        syntax:
        Scanner sc = new Scanner(System.in);
        need to import scanner alt enter key to import
        
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        
        //takes input from the keyboard
        String name = sc.nextLine();
        
        System.out.println("Enter your Ref name: ");

        String ref = sc.nextLine();
        
        //then the result comes 
        System.out.println("Mr. "+name+"Welcome to Java class"+ "You're referred by: "+ref);
        
//        class work using scanner to produce where if we input any time it will greet us inaccord 
//        with the time in the input
        
        // here we use scanner to print TimeTables
        
        // Vowels and consonants
        char ch;
        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        Scanner vc = new Scanner(System.in);
        
        System.out.println("Enter an Alphabet");
        ch = vc.next().charAt(0);
        // using For Loop        
        for(int i=0; i < 10; i++){
            if(ch == vowels[i]){
                count++;
                break;
            }
                
        }
        
        if(count == 0){
            System.out.println("\n" +ch+ " is a Consonant");
        }else{
            System.out.println("\n" +ch+ " is a Vowel");
        }
        
        //Another way of the above function
        char chh;
        Scanner vcc = new Scanner(System.in);
        System.out.println("Enter an Alphabet");
        chh = vcc.next().charAt(0);
        
        if(chh == 'a' || chh == 'e' || chh == 'i' || chh == 'o' || chh == 'u'){
        System.out.println("\n It's a Vowel ");
        }else{
            System.out.println("\n it's a Consonant ");
        }
        
        /*
        where we have a box 5kg is @ N6
        where the kg is above 5kg we start adding Tax to the box
        the we add an extra charge of N1.2 for each added kg
        
        */
        float weight_kg, new_charge;
        Scanner bx = new Scanner(System.in);
        
        System.out.println("Please Enter the weight of Box ()kg: ");
        weight_kg = bx.nextFloat();
        
        if(weight_kg <= 5)
        {
            new_charge = 6; //cakahal johnson
        }
        else
        {
            weight_kg = weight_kg - 5;
            new_charge = (float) (6 + (weight_kg * 1.2));
        }
        
        /**/
        
        
        

    
    }  // watch out!!!
    
}
