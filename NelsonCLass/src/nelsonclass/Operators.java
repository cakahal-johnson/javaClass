/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelsonclass;

/**
 *
 * @author Cakahal Johnson
 */
public class Operators {
    
    Operators(){
        /*
        Operators we use this to perform operations on variables and values as operand
        
        GROUPS OF JAVA OPERATORS:
        ARITHMETIC OPERATION
        ASSIGNMENT OPERATORS
        COMPARISON OPERATORS
        LOGICAL OPERATORS
        BITWISE OPERATORS
        
        */
        
        /*
        ARITHMETIC OPERATION:
        BASIC OPERAND: + - / *
        
        % (MODULUS) is a result after dividing left-hand operad by right-hand operad the returned remainder
                     is the modulus
        
        ++ (INCREMENT) inceases the value of the operand by 1
        -- (desermnet) it deceases the values of the operand by 1
        
        */
        
        System.out.println("Artithemtic operators");
        int a = 10;
        int b = 20;
        
        int c = 1;
        int d = 5;
        
        int ans = b % a;
        System.out.println(ans); // 0
        
        System.out.println(11 % 2); // this returns 1 b'cos 2 by 10 is 5 5 remaining 1 which is the modulus 
        
        // checking for increment and decrement we need a loop function
        
        System.out.println(b++); // for loop but still stable
        System.out.println(++a); // for non loop which returns 11
        
        System.out.println(--c); // 0
        System.out.println(d++); // still stable
        
        
        System.out.println("==========ASSIGNMENT OPERATORS==============");
        
        /*
            = (Assign values)
            += (it adds to assign values)
            -= (substract to assign values)
            *= (multiply to assign values)
            /= (divids to assign values)
            %= (it solves modulus to assign values)
            <<= (Left shift and Assignment operators)
            >>= (Right shift and Assignment operator)
            &= (Bitwise and assignment operator)
            ^= (Bitwise exclusive or and assignment operator)
            |= bitwise inclusive or and assignment operator)
        
        */
        
        int e = 10;
        int f = 20;
        int g = 0;
        
        int x = 30; // multiple assignment
        System.out.println("initail X: "+ x); //30
        x = 20; // here we re-assignm x to be 20
        System.out.println("re-assigning X: "+ x); //20
        
        System.out.println(x);
        
        e += f;
        System.out.println("where e += f value: "+e); // same to -=, /=, *=, %=
        
        //Left shift operator
        int s = 22;
        s <<= 2;
        System.out.println("left shift by 2: "+s); // 88
        
        int r = 22;
        r >>= 2;
        System.out.println("here for the right shift by 2 "); // 05
        
        //AND OPERATOR
        r &= e;
        System.out.println("AND bitwise: "+r); //
        
        int bt = 22;
        int bts = 2;
        bt ^= bts;
        System.out.println("Exclusive "+bt); // 20
        
        int inc = 22;
        int inec = 2;
        inc |= inec;
        System.out.println("Inclusive "+inc);
        
        /*
        COMPARISON OPERATOR means Conditional Statements
        which is also called Relational Operators bascially for boolean which returns True or false
        
        == (equal to): This checks if the values of two operans are equal or not,
                        if YES then the condition becomes true.
        
        != (not equal to): this checks if the values of two operands are equal or not,
                           if values are not equal then the condition becomes true.
        
        > (greater Than): checks if the value of the operands, is greater than, then it returns true
        
        < (Less Than): checks if the value of the operands, is less than, then it returns true
        
        >= (greater Than or equal to): checks if the value of the operands, 
                    is greater than or equal to, then it returns true
        
        <= (less Than or equal to): checks if the value of the operands, 
                    is less than or equal to, then it returns true
        
        
        */
        
        System.out.println("===========Conditional Statement===================");
        int condit = 10;
        int condi = 20;
        int condo = 10;
        int condon = 11;
        // NB: it's returns Boolean
        System.out.println(condo == condon); // returns False b'cos the conditional statement is not true
        
        // for != 
        System.out.println(condo != condon); // True b'cos the conditional statement is true
        
        // for Greater Than same as Less than
        System.out.println(condi > condit); // true
        System.out.println(condit > condi); // false
        
        // for Greater than or Equal To same as the Less Than or Equal
        System.out.println(condit >= condo); //true
        // classwork use our to write a statement that will be false
        System.out.println("classwork");
        System.out.println(condi <= condit); // false
        
        System.out.println("Logical Operators");
        Boolean ONE = true;
        Boolean TWO = false;
        
        System.out.println(ONE && TWO); //
        System.out.println(ONE || TWO); //
        System.out.println(!(ONE && TWO)); //
        
        System.out.println("BITWISE OPERATORS");
        
        //NB: we use integers types, long, int, short, char and byte
        
        // it's also a a binary conversion
        int I = 60;
        int P = 13;
        int X = 56;
        int Z = 22;
        
        // Bitwise for & (AND)
        /* the AND binary copies a bit to the result if it exists in both operands */
        int answer = X & Z;
        System.out.println("Bitwise for &(AND) "+answer); //16
        
        // Bitwise for | (OR)
        /* the OR binary copies a bit to the result if it exists in either operands */

        answer = X | Z;
        System.out.println("Bitwise for or(|) " +answer); //
        
        //Bitwise for XOR (^)
        /*the XOR(^) copies the bits if is set in one operand but not both*/
        answer = X ^ Z;
        System.out.println("Bitwise for XOR (^) "+answer); //
        
        
//        Bitwise for COmplement (~)
        /*here is where one complement operantor is unary and has the effect of flipping bits which compliment
        from when signing this binary numbers*/
        
        answer = ~Z;
        System.out.println("Compliment (~) "+answer);//
        
//        Left shift (<<)
        /*This Binary is where the Left operands values is moved left by number of the bits specified
        by the right operand*/
        answer = X << 2;
        System.out.println("Left SHift by 2 "+answer);
        
        //        Right shift (>>)
        /*This Binary is where the Right operands values is moved Right by number of the bits specified
        by the right operand*/
        answer = X >> 2;
        System.out.println("Right SHift by 2 "+answer);
        
        // Zero Fill (>>>)
        /*This Binary is where the Left operands values is moved Right by number of the bits specified
        by the right operand and shifted values are filled up with zero*/
        
        answer = X >>> 2;
        System.out.println("Zero filled Right shift by 2 "+answer);
        
        
        
        
        
        
        
        
        
        
        
        
    } //Watchout!!
    
}
