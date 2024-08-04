/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emmaclass;

/**
 *
 * @author Cakahal Johnson
 */
public class Operators {
    
    Operators(){
        
        /*
         JAVA OPERATORS
        This is used to perform operations on variables and values
        
        GROUPS OF JAVA OPERATORS:
        ARITHMETIC OPERATORS
        ASSIGNMENT OPERATORS
        COMPARISON OPERATORS
        LOGICAL OPERATORS
        BITWISE OPERATORS
        
        
        ARITHMETIC OPERATORS
        basic Operators: + - / * 
        % (Modulus): after dividing the left-hand operand by right-hand operand and returns remainder
        
        ++ (means Increment): Inceases the values of the operand by 1
        -- (means decrement): Deceases the values of the operand by 1

        */
        
        // Starting with the modulus
        int a = 10;
        int b = 20;
        int c = 0;
        
        
        int mod = b%a;
        System.out.println(mod); // 0
        
        System.out.println(11%2); // returns 1 b'cos 2 by 10 is equal then remaining is 1 which is the modulus
        
        System.out.println(10%2); //0
        
        // checking for increment and decrement works well with loop but still
        System.out.println(c++); // used for Looping function
        
        System.out.println(++c);
        
        System.out.println(c--); // used for Looping function
        
        System.out.println(--c);
        
        
        
        //     ASSIGNMENT OPERATORS
        
        /*
         = means Assign to new value
        += means To add the old value to the new assigned value
        -= , *= , /= , %= 
        
        <<= means left-shift and assignment operator
        >>= Right-shift and Assignment operator
        &= (Bitwise and assignment operators
        ^= bitwise exclusive or and assignment operands
       |= bitwise inclusive or And assignment operands
      
      */
        
        
        int age = 60;
        int new_age = 80;
        int old_age = 10;
        
        // Re-assignment
        age = 40;
        age = 50;
//        int age = 50;
        int result = 0;
        result += age;
        System.out.println("The re-assigned value is: "+ result); // 50
        
        
        int left_shift = 22; // power value
        left_shift <<= 2;
        
        int right_shift = 22;
        right_shift >>= 2;
        
        System.out.println("The left-shift is: "+ left_shift); // 88
        System.out.println("The right-shift is: "+ right_shift); // 05
 
        //And Operands
        int _and = 22;
        int _value = 2;
        _and &= _value;
        System.out.println("This a And Bitwise: "+ _and); //02
        
        int _exclusive = 22;
        _exclusive ^= _value;
        System.out.println("This a Bitwise Exclusive: "+ _exclusive); //20
        
        int _inclusive = 22;
        _inclusive |= _value;
        System.out.println("This a Bitwise Inclusive: "+ _inclusive); //22

        

        
    }
    
}
