/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprojectjava;

import java.util.Scanner;

/**
 *
 * @author Cakahal Johnson
 */
public class ControlStatement {
    ControlStatement(){
        ///// OPERATORS AND CONTROL///
        int age = 18;
        int old = 20;
        
        if (age >= 18){
            System.out.println("you are and adult");
        }
        
        if (age <= 18){
            System.out.println("you are and adult");
        }
        
        if (age > 20){
            System.out.println("you are 20yrs or above");
        }else{
            System.out.println("you are 20yrs or below");
        }
        
        if (age > 20 || age < 20){ //OR if one condition is ment it will run the first
            System.out.println("you are 20yrs or above");
        }else{
            System.out.println("you are 20yrs or below");
        }
        
        if (old <= 20 || old >= 20 ){ //True will run
            System.out.println("true");
        }else{
            System.out.println("False");
        }
        
        if (old <= 20 || old >= 20 ){ //checking for two conditions use else IF
            //nexted is when you use If statement it only runs the True anmd stops
            System.out.println("true");// True will run 
        }else if(old > 40){
            System.out.println("False");
        }else if(old < 40){
            System.out.println("False and true");
        }
        
        if (age > 20 && age < 20){  //ANDboth condition must ment it will run the else
            System.out.println("you are 20yrs or above");
        }else{
            System.out.println("you are 20yrs or below");
        } 
// when you use NOT it means that the != var is not the same...so False will print
        if (old == 20 && old != 20){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
        if (age == 20){ //must be of the same type condition is ment it will run the first
            System.out.println("you are 20yrs or above");
        }else{
            System.out.println("you are 20yrs or below");
        }
        
         if (age != 20){ //NOT EQUAL TO condition is ment it will run the first
            System.out.println("you are 20yrs or above");
        }else{
            System.out.println("you are 20yrs or below");
        }
         
        ///////////////////ELSE IF can take up para and is nexted statement
//        Scanner sc = new Scanner (System.in); ///USE ALT+ENTER to correct the SCANNER IMPORTS
//        System.out.println("Enter your age");
//        age = sc.nextInt();
//        
//        if (age < 13){
//            System.out.println("you are a kid");
//        }else if(age >= 13 && age <=19){
//            System.out.println("you are a teenager");
//        }else if(age >= 20 && age <=40){
//            System.out.println("you are a youth");
//        }else if(age >= 40 && age <=200){
//            System.out.println("you are a old");
//        }else{
//            System.out.println("you are leaving by grace");
//        }       
        
        
//        //////SWITCH STATEMENT DO WITH STATIC VALUES
//         int num = 20;
//         
//         switch(num) {
//             case 10:
//                 System.out.println("Number is 10");
//                 break;
//             case 20:
//                 System.out.println("Number is 20");
//                 break;
//             case 30:
//                 System.out.println("Number is 30");
//                 break;
//             default:
//                 System.out.println("non of the above");
//                 break;
//        }
         
         
        
         
//         how to clear white space Strings 222 + 225 and add the + to print in one line
//         s = s.trim;
//         s = s.replaceAll()
         
         
//         LOOP STATEMENT
         
//         for (int i = 0; i < 10; i++){
//            System.out.println(i);
//    
//    }
         
//         for (int i = 200; i > 0 ; i-- ){
//             System.out.println(i);
//         }
         
         // WHILE LOOP
//         
//         int man = 50;
//         while(man > 0){
//             System.out.println(man);
//             man--;
//         }
         
//         int man = 1;
//         while(man < 201){
//             System.out.println(man);
//             man++;
//         }
         
         //DO WHILE LOOP
         
//         int man = 50;
//         do{
//             System.out.println(man);
//             man++;
//         }while(man < 50);
         
//         int man = 50;
//         do{
//             System.out.println(man);
//             man--;
//         }while(man > 0);
           
    }
    
    
}

    ///create a game that has scanner: that the user will have a number off-hrt
    ///then add more numbers likes 5+10-15*2 the - the off-hrt to produce a result

///assignment print out in one line 8+8 enter to display ans...

/*
Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

    // String input
    String name = myObj.nextLine();

    // Numerical input
    int age = myObj.nextInt();
    double salary = myObj.nextDouble();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
*/