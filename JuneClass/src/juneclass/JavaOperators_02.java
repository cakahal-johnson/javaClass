/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juneclass;

/**
 *
 * @author Cakahal Johnson
 */
public class JavaOperators_02 {
    JavaOperators_02(){
        /*
            Operators are used to perform (Maths)Operations on variables and values
        
        JAVA OPERATORS GROUPS:
        -- ARTHMETIC OPERATORS
        -- ASSIGNMENT OPERATORS
        -- COMPARISON OPERATORS
        -- LOGICAL OPERATORS
        -- BITWISE OPERATORS
        
        
        
        */
        
        // ARTHMETIC OPERATORS
        /*
            THESE ARE BASIC OPERATORS + * - /
        
            % (modulus): is after dividing leaft-hand operand by right-hand operand
                          and returns the remainder
        
            ++ (increment): Increment is the value of the operand by 1
            -- (decrement): is Decease of the value of the operand by 1
        */
        
        System.out.println("Examples of ARTHMETIC OPERATORS");
        int z = 22;
        int y = 90;
//        int x = 08; // int error starting int with 0(zero)
        int x = 80;
        
        //Additional Operators using + /*-
        System.out.println(z + y); // 112
        
        // Assinging the values in a variable
        int the_plus_operand = y + z;
        System.out.println(the_plus_operand);
        
        int ans = y % z;
        System.out.println(ans);
        
        System.out.println(11 % 2); // 1
        System.out.println(10 % 2); // 0
        
        // checking for increment and decrement we will use loop 
        //        while decrement is at right-hand operand it's for loop function
//        System.out.println(x++); // still stable without a function
//        System.out.println(x--); // still stable without a function
//        
//        while decrement is at left-hand operand for normal decrement 
        System.out.println(x);
        System.out.println(--x); // returns without a function - 79 where x is 80
        System.out.println(x);
        System.out.println(++x); // returns without a function - 81 where x is 80
        
        //         ASSIGNMENT OPERATORS

            
        /*
            = MEANS  assign values
            += means: its adds to assign values
            -= means: is substract to assign values
            same as *= and /= even %= to assign values
        
            <<= means: left shift assignment operators
            >>= means: right shift and assignment operator
        
            &= means: Bitwise and assignment operations
            ^= means: exclusive or 'and' assignment operator
        
            |= bitwish inclusive or 'AND' assignemnt operator 
        
        */
        
        //Assigning
        int g = 10;
        int h = 20;
        int j = 0;
        
        // Re-assignment values without passing the dataType
        j = g + h;
        System.out.println("Re-assingment operator");
        System.out.println(j); // returns 30
        
        
        System.out.println(j);
        
        j += 2;
        j += h;
        System.out.println(j); // returns 52
        
        j-=h;
        System.out.println(j);
        
        j *= 2;
        System.out.println(j);
        
        float k = 4;
        float l = 30;
        
        l /= k;
        System.out.println(k);
        
        int t = 5;
        int i = 9;
        
        //modulus for Assignment Operator
        i  %= t;
        System.out.println(i);
        
        // Left shift Operator
        int p = 22;
        p <<= 2;
        System.out.println("here for the left shift Operand " +p); //88
        
        int u = 22;
        u >>= 2;
        System.out.println("Right Operand " +u); //05
        
        // AND Operand
        int r = 22;
        int e = 2;
        r &= e;
        System.out.println("here is for AND bitwise: "+r); //02
        
        int w = 22;
        int q = 2;
        w ^= q;
        System.out.println("here is for the Exclusive "+w); //
        
        int s = 22;
        int v = 2;
        
        s |= v;
        System.out.println("here is for the inclusive "+s);
        
        
        
        // COMPARISON OPERATORS means Conditinal Statements
        // These operators are called Boolean returns true or false
        
        /*
        * == (Equal to): Checks if the value of two operands are equal or not,
                          if Yes then the condition becomes true
        
          != (Not Equal to): Checks if the values of two operands are equal or not,
                   if values are not equal then the condition becomes true
        
          > (Greater Than): Checks if the values of two operands, is Greater,
                             it returns True
        
          < (Less Than): Checks if the values of two operands, is Lesser,
                             it returns True
        
          >= (Greater Than or Equal to): Checks if the values of two operands, is Greater,
                            or equal to, it returns True
        
          <= (Less Than or Equal to ): Checks if the values of two operands, is Lesser,
                            or Equals To, it returns True      
                
        */
        
        System.out.println("Conditional for Equal TO for String values");
        String a = "ABC";
        String b = "abc";
        System.out.println(a == b); //false   
        System.out.println(a != b); //true
        
        System.out.println("Conditional for Equal TO for int values");
        int c = 22;
        int d = 10;
        int E = 10;
        
        System.out.println(d > c); //
        System.out.println(d > E); //
        System.out.println(d >= E); //
        
        System.out.println(d < c); //
        System.out.println(d < E); //
        System.out.println(d <= E); //
        
        
        /**
         * LOGICAL OPERATORS
         * 
         * IS JAVA BUILT-IN FUNCTION Returns a boolean 
         * Syntax:
         *       
         *       $$ (Logical and): This works both the operands are non-zero 
         *           then the conditions becomes true
         * 
         *       || (Logical OR): if any of the two operands are non-zero the 
         *           condition becomes true
         * 
         *       !(Logical Not): this is used to reverse the logical state of its operand
         *            if a condition is true then logical NOt operand will make false
         */
        
        System.out.println("Logical Operators");
        Boolean is_he_married = true;
        Boolean has_kids = false;
        
        System.out.println(is_he_married && has_kids); // false
         
        System.out.println(is_he_married || has_kids); // is true
        
        System.out.println(!(is_he_married && has_kids)); // true
        
        
        /**
         * BITWISE OPERATORS
         * Assume if i = 60 and p = 13;
         * where we integer types:
         *  long (24bit), int (11bits), short(8bits), char(1bits), byte (less than 1 bits) 
         */
        
        // converting to binary
        int ii = 60; //0011 1100
        int pp = 13; // 0000 1101
        int uu = 0;
        
        System.out.println(" & (bitwise and) : This 'and'operator copies a bit to the  " +
"result if it exists in both operands");
        int and_ans = ii & pp;
        System.out.println(and_ans); //12 0000 1100
        
        System.out.println(" | (bitwise or) : The 'or' operator copies a bit if it "
                + "exists in either operands");
        
        and_ans = ii | pp;
        System.out.println(and_ans); // 61 0011 1101
        
         System.out.println(" ^ (bitwise xor) : The 'xor' operator copies a bit if it "
                + "is set in one operand or both operands");
         
         and_ans = ii ^ pp;
         System.out.println(and_ans); // 49 0011 0001
         
          System.out.println(" ~ (bitwise compliment) : The '~' where one compliments an operator "
                + "is unary and has the effects of filling bits which compliment from "+
                  "due to a signed binary number");
          
          and_ans = ~ ii;
          System.out.println(and_ans); // -61 1100 0011
          
          System.out.println(" << (bitwise Left shift) : These operators is where the left operand "+
                  "values is moved left by the number of bits specified by the right operand");
          
          and_ans = ii << 2;
          System.out.println(and_ans); // 240 1111 0000
          
          System.out.println(" >> (bitwise Right shift) : These operators is where the left operand "+
                  "values is moved Right by the number of bits specified by the right operand");
          
          and_ans = ii >> 2;
          System.out.println(and_ans); // 15 1111
          
          System.out.println(" >>> (bitwise Zero fill right shift) : These operators is where the left operand "+
                  "values is moved Right by the number of bits specified by the right operand"+
                  " and the shifted values are filled up with zero");
          
           
          and_ans = ii >>> 2;
          System.out.println(and_ans); // 15 0000 1111
        
        
        

        
        
        
        
        
        
        
        

        

        
        
        
        
        
    } // end of Java operators class
} // end of public class
