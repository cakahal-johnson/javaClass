/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayclass2023;

/**
 *
 * @author Cakahal Johnson
 */
public class Operators_02 {
    Operators_02(){
        /*
        Operators_02 are used to perform operations on variables and values:
        
        GROUPS OF JAVA OPERATORS:
        ARITHMETIC OPERATORS
        ASSIGNMENT OPERATORS
        COMPARISON OPERATORS
        LOGICAL OPERATORS
        BITWISE OPERATORS
        
        
        */
        
//                ARITHMETIC OPERATORS
        /*
         Basic Operators_02: + - * /
        
        % (Modulus): after dividing left-hand operand by right-hand operand and returns remainder
        
        ++ (increment) : Inceases the value of the operand by 1
        -- (decerment) : Deceases the values of the operand by 1
        
        */
        
        System.out.println("starting from modulus");
        int a = 10;
        int b = 20;
        int c = 15;
        int x = 15;
        int y = 15;
        int z = 15;
        
        int ans = b%a;
        System.out.println(ans); // 0
        
        System.out.println(11%2); // returns 1 b'cos 2 by 10 is equal remaining is 1 which is modulus
        
        System.out.println(10%2); // 0
        
        // check for increment decrement with loop but let's modulus
        System.out.println(c++); // still stable
        
        System.out.println(x--); // still stable
        
        System.out.println(--y); // when is adding
        
        System.out.println(++z); // when is adding


        //        ASSIGNMENT OPERATORS

        /*
         = (Assign values)
        
        += (it adds to assign values)
        
        -= (is substract to assign values)
        
        *= (it multiply to assign values)
        
        /= (it divides to assign values)
        
        %= (is solves modulus to assign values)
        
        <<= (Left shift And assignment operator)
        
        >>= (Right shift And assignment operator)
        
        &= (Bitwise And assignmnet operators
        
        ^= bitwise exclusive or and assignment operator
        
        |= bitwise inclusive or ANd assignment operator
        
        */
        
        //Assigning
        int g = 10;
        int h = 20;
        int j = 0;
        
          //RE-assigning
        j = g + h; // g10 + h20 = 30
        
        System.out.println("here we re-assign the j to have the operand of g + h: "+ j); // 30
        
        j += h;
        System.out.println("here the j to have the + operand of h: "+ j); // 30 + 20 = 50        
        
        j -= h;
        System.out.println("here the j to have the - operand of h: "+ j); // 30 - 20 = 10
        
        j *= h;
        System.out.println("here the j to have the * operand of h: "+ j); // 30 * 20 = 600            
        
        float k = 4;
        float l = 30;
        l /= k;
        System.out.println("here the j to have the / operand of h: "+ l); // 30 / 4 = 0  
        
        int i = 12;
        
        System.out.println(k);
        
        //
//        modulus
        i %= k;
        System.out.println("12%4 is: "+ i); // 12%4 = 0  
        
//        Left shift operator
        
        int p = 22;
        p <<= 2;
        System.out.println("here the for Left Shift: "+ p); // 88
        
        int u = 22;
        u >>= 2;
        System.out.println("here the for Right Shift: "+ u); // 05
        
        // AND OPerator
        int r = 22;
        int e = 2;
        r &= e;
        System.out.println("here the for & AND bitwise: "+ r); // 02
                
       int w = 22;
       int q = 2;
       
       w ^= q;
       System.out.println("here the for exclusive "+ w); // 20
                       
       
       int s = 22;
       int v = 2;
       
       s |= v;
       System.out.println("here the for inclusive "+ s); // 20
       
//               COMPARISON OPERATORS means Conditional Statements
       /* This is also called Relational Operators_02 bascially for boolean which returns True or False
       
       == (equal to) : This checks if the values of two operands are equal or not,
                        if yes then condition becomes true
       
       != (not equal to) : This checks if the values of two operands are equal or not,
                         if values are not equal than condition becomes true
       
       > (greater Than) : Checks is the values of operands, is greater then if yes it returns true
       
       < (Less Than) : Checks is the values of operands, is less than; then if yes it returns true
       
       >= (greater Than or equal to) : Checks is the values of operands, is greater or equal to
                        then if yes it returns true
       
       <= (less Than or equal to) : Checks is the values of operands, is less or equal to
                        then if yes it returns true       
               
       */
       
        System.out.println("===========Conditional Statement==============");
        
        int condition1 = 10;
        int condition2 = 20;
        int condition3 = 10;
        int condition4 = 11;
        
        // for equal to: ==
        System.out.println(condition1 == condition2); 
// since the statement is not true this will Returns False
        
                
        // for not equal to: !=
        System.out.println(condition1 != condition2); 
// since the statement is not true but with "not" this will Returns true
        
                
        // for greater than: >
        System.out.println(condition1 > condition2); 
// since the statement is not true this will Returns False
       
        
        // for less than: <
        System.out.println( condition1 < condition2); 
// since the statement is true this will Returns True
       

        // for greater than or Equal to: >=
        System.out.println("greater or equal");
        System.out.println(condition1 >= condition2); 
// since the statement is not true this will Returns False
                                              

        // for less than or Equal to: >=
        System.out.println("less or equal");
        System.out.println(condition1 >= condition3); 
// since the statement is true this will Returns True
        
        
        
/*
                LOGICAL OPERATORS
for this let's assume we have boolean where one is true and other is false
        Syntax:
        && (logical and) : this works if 'both' the operands are non-zero then the condition becomes true
        
        || (logical or) : this works if 'any' the operands are non-zero then the condition becomes true
        
        ! (logical not) : this use to reverse the logical state of its operand where if a condition is
                          True the the logical 'NOT' operand will return False
        
*/

        System.out.println("Logical Operators");
        
        Boolean A = true;
        Boolean B = false;
        
        System.out.println(A && B);  // is false
        
        System.out.println(A || B); // is True
        
        System.out.println(!(A && B)); // this returns True
        
        
        /*
        
        BITWISE OPERATORS
        
        Assume if I = 60 and P = 13;
        
        we use integer types, long, int, short, char and byte
        
        
        */
        
        
        // convertin to binary
        int I = 60;
        int P = 13;
        int U = 0;
        
        // & (bitwise AND) : Binary AND Operator it copies a bit to the result if it exists both operands
        int answer = I & P;
          System.out.println("Bitwise of &"+ answer); // Returns 0000 1100 is binary of 12
          
        // ! ( bitwise OR) : Binary 'OR' operator which copies a bit if it exists in either operands
        answer = I & P;
        System.out.println("bitwise of OR: "+ answer); // Returns 0011 1101 is binary of 61

        // ^ (bitwise XOR) : this operator copies the bit if it is set in one operand but not both
        answer = I ^ P;
        System.out.println("bitwise of XOR: "+ answer); // Returns 0011 0001 is binary of 49
        
        // ~ (bitwise of compliment) is Binary where one complement operator is unary and has the 
                // effect of fipping bits which compliment from when signing this binary numbers
        
        answer = ~I;
        System.out.println("compliment sign ~"+ answer);// 1100 0011 is binary of -61
        
        // <<(left shift) : This Binary Left Shift Operator where the left operands values is 
        //                  moved left by the number of the bits specified by the right operand
        answer = I << 2;
        System.out.println("left shift by << 2"+ answer); // 1111 0000 is a binary 240
        
         // >> (Right shift) : This Binary Right Shift Operator where the left operands values is 
        //                  moved right by the number of the bits specified by the right operand
        answer = I >> 2;
        System.out.println("left shift by >> 2"+ answer); // 1111 is a binary 15
        
        // >>> (Zero fill Right Shift) : this is where the left operands values is moved right 
        // by the number of bits specified by the right operand and shifted values are filled up with zero
        
        answer = I >>> 2;
        System.out.println("Zero filled right shift >>> 2 :"+ ans); // 0000 1111 is binary of 15
        
        //Next Conditional Statements....thanks banking with us!!
                


        

    }
}
