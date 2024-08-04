/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ot_class;

/**
 *
 * @author Cakahal Johnson
 */
public class operators_02 {
    
    operators_02(){
        /*
        Operators are use to perform operation on var and values as we in maths
        
            Java Operators is divided into 5 groups
                ---Arithmetic operators 
                ---Assignment Operators
                ---Comparison Operators
                ---Logical Operators
                ---Bitwise Operators
        */
        
        
        //Arithmetic Operation + - * / % ++ means increment while -- is decrement
        System.out.println("===================Arithmetic Operators================");
        int ans = 100 * 50;
        System.out.println(ans);
        
        int x = 50;
        int y = 20;
        int res = x / y;
        System.out.println(res);
        
        
        //Assignment Operators
//        this is used to assign values to a variables with = sign
        int a = 80;
        a += 6;
        System.out.println(a);
        
        //Comparison Operator
        //this is used to compare two vales... which returns a boolean
        /*
            == means Equal to the data type
            != Not Equal
            > Greater than 
            < Less than
            >= Greaterthan or Equal to
            <= Lessthan or Equal to
        
        */
        
      String age = "70";
      int Age = 70;
      
      int X = 5;
      int  Y = 6;
      int  A = 5;
      
        System.out.println(X > Y); // false
        System.out.println(X < Y); //true
        System.out.println(X <= A); //true
//        System.out.println(Age == age);
        
        
        //Logical Operators
        /*
            used to determine the logic between varaibles or values
        
        && the logic of AND which returns true if the both statement are true
        || the logi of OR which returns true if one of the statements is true
        ! the logi of NOT which Reverse the result, returns false if the result is true
        */
        
        System.out.println("Logical operators");
        int n = 9;
        // And logical operation
        System.out.println(n > 10 && n > 4); // false
        
//        Or logical operators
        System.out.println(n > 10 || n > 4); // true
        
        // NOT logical operators for OR
        System.out.println(!(n > 10 || n > 4)); //false
        
                // NOT logical operators for AND
                System.out.println(!(n > 10 && n > 4)); // true
                
                
         System.out.println("other math function");
         double sq = Math.sqrt(25);
         System.out.println(sq);
         
         System.out.println("method for finding the highest value of two values");
         System.out.println(Math.min(465252545, 46578445));
        
         System.out.println("method for finding the lowest value of two values");
         System.out.println(Math.max(465252545, 46578445));
         
         System.out.println("abs method returns the absolute(positive) value of the value");
         System.out.println(Math.abs(-4.7));
         
         System.out.println("random() returns a random values between 0.0(inclusive), and 1.0 (exclusive)");
         System.out.println(Math.random());
         
         int lotto = (int) (Math.random() * 10);
         int lotto1 = (int) (Math.random() * 20);
         int lotto2 = (int) (Math.random() * 30);
         int lotto3 = (int) (Math.random() * 40);
         int lotto4 = (int) (Math.random() * 50);
         
         int lotto_result = lotto + lotto1 + lotto2 + lotto3 + lotto4;

         System.out.println(lotto_result);
         
         
    }
    
    
}
