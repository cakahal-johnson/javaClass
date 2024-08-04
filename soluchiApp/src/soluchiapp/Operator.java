/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soluchiapp;

/**
 *
 * @author Cakahal Johnson
 */
public class Operator {
    Operator(){
        /*
         Operators are used to perform operands on variables and values
        
        Groups of JAVA Operators
        ARITHEMATIC OPERATORS
        ASSIGNMENT OPERATORS
        COMPARISON OPERATORS
        LOGICAL OPERATORS
        BITWISE OPERATORS
       
        */
        
        /**
         * BASIC OPERATORS -+/ * 
         * % (Modulus) : Divides left-hand operand by right-hand operand and returns a remainder
         * 
         * ++ (Increment) which increment the values of the by 1
         * -- (Decrement) which decrement the values of the by 1

         */
        
        System.out.println("Modulus");
        int a = 10;
        int b = 20;
        
        System.out.println(b%a); //0
        System.out.println(11%2); //1
        
        System.out.println(10%2); //0
        
        System.out.println(b++); //20 functioning in a Loop
        System.out.println(++b); // here by 1 increment
        
        System.out.println(a--); // normal
        System.out.println(--a); // decrement by 1
        
        int x = 1;
        int z = 1;
        
        System.out.println(++x);
//        ASSIGNEMENT OPERATORS
        /*
         = (Assign values)
        
        += (it adds to assign values)
        
        -= same as += , *=, /=, %=, 
        
        <<= (Left SHift and assignment operator)
        
        >>= (Right Shift and Assignment operator)
        
        &= means Bitwise and assignment operator
        
        ^= means exclusive or and assignment operator
        
        != means bitwise inclusive OR and assignemnt operator
        
        
        */
        
        int Aopt = 10;
        int Aop = 20;
        int Ao = 0;
        
        int new_Aopt = Aop + Ao;
        System.out.println(new_Aopt); // 20
        
//        reAssigning
        new_Aopt += Aopt;
        System.out.println(new_Aopt); // 20+10 = 30
        
        
        /*
        is also Relational Operators which Boolean DataType
        Conditional Statement
        
        == means equal To: checks is the values of two operand are equal o not , 
        than is Yes then condition becomes true
        
        != means Not Equal
        
        > means Greater Than
        < means LessThan
        
        >= and <=
        
        */
        
        
        
        
        
        
    }
}
