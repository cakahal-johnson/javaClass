/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sam_sam;

/**
 *
 * @author Cakahal Johnson
 */
public class Sam_Sam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("java is awesome");
//        System.out.print("java is so so awesome");
        
        //connecting from java class to another java class within the same source package
        new variables();
//        variables vn = new variables();
        
        // comments
        /*
            multi-line comments
        */
        
        String name = "cakahal johnson";
        int age = 70;
        
        double moni = 1000;
        float money = 2000;
        System.out.println(moni);
        System.out.println(money);
        
        // Variable definition...
        
//        Types of variables... primitive n non-primitive
        
        // concatination means joining variables together by using the + sign or concat()
        
        System.out.println("My name is: "+name +" i'm "+age+ "years old");
        
//        Rules of Java variables
        /*
        *   very case sensitive
        *   cannot reserved keywords
        *   no whitespace
        *   use of underscore, name, dollar
        *   cannot start with digits
        
        *   
        */
        
        // java casing of Data types
        /*
            these is when you assign a value of one primitive data types to another
        
            --widening Casting(automatically) - converting a smaller type to a larger type size
                byte --> short --> char --> int --> long --> float --> double
        
            -- Narrowing casting(manually) - conver oppsite of the above
        
            double down to byte
        
        */
        
        //Operators
        /*
            Groups of Java Operators
            -- Arithmetic Operators
            -- Assignment Operators 
            -- Comparison Operators
            -- Logical Operators
            -- Bitwise Operators
        
        */
        
        //            -- Arithmetic Operators
/*        + / * - 
            % (modulus) : Divides left-hand operand by right-hand operand and returns remainder
        
        ++ (Incerment) : Inceases the values of the operand by 1
        -- (decerment) : Deceases the values of the operand by 1
 */      
        
        System.out.println("===========example of modulus===============");
        int a = 15;
        int b = 34;
        int ans = b % a;
        System.out.println(ans); // returns 4
        System.out.println(11%2); // returns 1
        
        
        /*
                    -- Assignment Operators 
                    = (assign values)
                    += (it adds to assigned value)
                    -= 
                    *=
                    /=
                    %=
                    
                    <<= (Left shift And assignment Operators)
                    >>= (right shift And assignment Operators)
        
                    &= (Bitwise and assignment)
                    ^= (Bitwise exclusive or and assignment operator)
                    |= (bitwise inclusive OR and assignment operator)
        
        */
        
        b <<= 2;
        System.out.println("left shift by 2: " + b);
        
        a >>= 2;
        System.out.println("Right shift by 2: " + a);
        
        int c = 10;
        int d = 15;
        
        d &= c;
        System.out.println("bitwise: "+ d);
        
        d ^= c;
        System.out.println(d);
        
        d |= c;
        System.out.println(d);
        
        
        
        /*
                        -- Comparison Operators
             it's also called a Relational Operators (Booleans) returns true or false
        
        == ( equal to) : checks if the values of two operands are equal or not
        != (not equal to) : if values are not equal then the condition becomes true
        
        > (greater than) : 
        
        < (less than) :
        
        >= (greater than or equal)
        <= (less than or equal)

        
        */
        
        System.out.println("=============Conditional Statement+++++++++++");
        System.out.println(a == b ); // is not true so false returns
        
        System.out.println(a != b); // is true so true returns
        
        System.out.println(a > b); // not true
        System.out.println(a < b); // not true
        
        System.out.println(a >= b ); // is not true
        System.out.println(a <= b); // is true
        
        
        /*
                        -- Logical Operators
        let assume we have a boolean where one is true and other is false
        
        syntax:
        && (logical and) : works if both the operands are non-zero then the condition becomes true
        
        || (logical or) : if any of two operands are non-zero then the condition becomes true
        
        ! (logical not) : use to reverses the logical state of its operands if a condition is true then logical 
                           Not operand will make false
       
        */
        
        Boolean A = true;
        Boolean B = false;
        
        System.out.println( A && B); // is false
        System.out.println(A || B ); // is true
        System.out.println("exception");
        System.out.println(!A && B); // is true
        
        System.out.println(!(A && B)); // is true
        
        
        /*
                        -- Bitwise Operators
        Assume if i = 60 and p = 13;
        where we can use integer, long, shorts and char n byte
        
        
        */
        // converting to binary
        int i = 60;
        int p = 13;
        int u = 0;
        
        // & (Bitwise and) the Binary AND Operator copies a bit to the result if it exists in both operands
        int anss = i & p;
        System.out.println("bitwise of & : " + anss); // returns 12 which is 0000 1100
        
        // | (Bitwise Or) the Binary OR Operator copies a bit to the result if it exists in either operands
        anss = i | p;
        System.out.println("bitwise of Or : "+ anss); // returns 61 which is 0011 1101
        
        // ^ (bitwise XOR) The Binary XOR operator copies the bit if it is set in one operands but not both
        anss = i ^ p;
        System.out.println("bitwise of Xor: "+ anss); // returns 49 which is 0011 0001
        
//        ~ (bitwise compliment) : Binary Ones compliment operator when is unary and has the effects of flipping bits
        //which compliments from due to a signed binary number
        
        anss = ~i;
        System.out.println("comlipment of sign ~ is: " +anss); // -61 = 1100 0011
        
        // << (left shift) : Binary Left shift Operator where the left operands values
//            is moved left by the number of bits specified by the right operans
        
        anss = i << 2;
        System.out.println(anss); // 240 which is 1111 0000
        
         // >> (Right shift) : Binary Right shift Operator where the left operands values
//            is moved Right by the number of bits specified by the right operans
        
        anss = i >> a;
        System.out.println(anss); // 7 1111
        
         // >>> (Zero fill right shift) : shift right zero fill Operator where the left operands values
//            is moved right by the number of bits specified by the right operans and shifted values are filled up with zero
        
        anss = i >>> 2;
        System.out.println("zero "+ anss); // 15 0000 1111
        
        
        
        
    }
    
}
