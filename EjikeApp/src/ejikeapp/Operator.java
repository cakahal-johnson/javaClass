/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejikeapp;

/**
 *
 * @author Cakahal Johnson
 */
public class Operator {
    
    Operator(){
        /*
        Operators are used to perform operation on variables and values
        i.e as we have in maths class + - * /
        
        Java Operators is divided into 5 groups:
        Arithmetic operators 
        Assignment operators
        Comparison operators
        Logical operators
        Bitwise operators
        
        */
        
        //Arithmetic
//        used to perform common mathematical operations
//        + - * / % modulus returns the division remainder
//            ++ Increment returns an incresed value by 1
//            -- Decrement returns an Decreases value of the variable by 1
        
        int xt = 100 + 50;
        System.out.println(xt);
        
        int a = 5;
        int b = 2;
        int m = a % b;
        System.out.println(m);
        
        int c = 10;
        --c;
        System.out.println(c);
        
//        Assignment Operation: are used jsut to assign values to variables.
//       which uses the equal sign
        
        int d = 15;
        d +=5;
        System.out.println(d);
        
        /*
        Comparison Operators: are used to compare two values...
        NB: this returns a Boolean data type
        eg:
            == means Equal to of the data types
            != Not equal
            >  Greater than
            <  Less than
            >= Greater than or equal to 
            <= Less than or equal to
        */
        
        int e = 5;
        int f = 5;
        System.out.println(e >= f);
        
        
        /*
        Logical Operator
        used to determine the logic between varaible or values:
        
        && the logic of AND which returns true if the both statements are true
        || the logic of OR which returns true if one of the statements is true
        !  the logic of NOT which Reverse the result, returns false if the result is true
        
        */
        
        System.out.println("logic of AND");
        int g = 5;
        System.out.println(g > 3 && g > 10);
        
        System.out.println("logic of NOT");
        
        int h = 5;
        System.out.println(!(h > 3 && h > 10));
        
        System.out.println("other math functions");
        double sqRoot = Math.sqrt(75);
        System.out.println(sqRoot);
        
        //method for finding the highest value of two values
        System.out.println(Math.min(254544, 4527624));
        
         System.out.println(Math.max(254544, 4527624));
         
//         abs method returns the absolute(positive) value of the value
         System.out.println(Math.abs(-4.7));
         
//         random() which returns a random value between 0.0(inclusive), and 1.0 (exclusive);
         System.out.println(Math.random());
         
         int lotto = (int)(Math.random() * 100);
         System.out.println(lotto);

        
    }
    
}
