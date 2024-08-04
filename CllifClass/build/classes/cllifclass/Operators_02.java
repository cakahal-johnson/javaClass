/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cllifclass;

/**
 *
 * @author Cakahal Johnson
 */
public class Operators_02 {
    
    Operators_02(){
    /*
       Operators are used to perform operations on variables and values
        
        Java Operators:
        Arithemtic Operators
        Assignment Operators
        Comparison Operators
        Logical Operators
        Bitwise Operators
        
    */
//        Arithemtic Operators
        /*
         + / * - Basic operators
        
        % (Modulus) : it Divides the left-hand operand by right-hand operand and returns the remainder
        
        ++ (Incerment) : Increases the value of the operand by 1
        
        -- (Decerment) : Decreases the value of the operand by 1
        
        */
        
        // Modulus
        System.out.println("examples of a modulus");
        int a = 10;
        int b = 20;
        
        System.out.println("examples of a modulus: "+ b%a); // 0
        System.out.println("examples of a modulu: " + 11 % 2 ); // returns 1 b'cos 2 by 10 is equal remaining 1 which is modulus
        
        System.out.println("examples of a modulu: " + 10 % 2); //0
        
        // Increment
        System.out.println(a++ );
        
        System.out.println(++a );
        
        // Decrement
        System.out.println(a-- );
        System.out.println(--a );
        
        int c = 5;
        System.out.println(c++ );
        System.out.println(++c );
        
        
        /*
                Assignment Operators:
        
        = (Assign a value)
        
        += (it adds to assign values)
        
        -= (it subtract to assign values)
        
        *=  "   "       "   ""
        /=
        %=
        
        <<= (Left shift And Assignment Operator)
        >>= (Right shift and Assignment Operator)
        
        &= (Bitwise and assignment operators)
        
        ^= (bitwise exclusive or and assignment operator)
        
        |= (bitwise inclusive or and assignment operator
        

        
        */
        
        int x = 10;
        int y = 20;
        int Z = 0;
        int v = 21;
        
        int NewNum = x + y;
        System.out.println(NewNum ); // assigning // 30
        
        NewNum += x;
        System.out.println(NewNum ); // 40 where x is 10
        
        int Zn = v - 1;
        System.out.println("Zn" );        
        System.out.println( Zn ); // 0
        
        Zn += x;
        System.out.println(Zn ); // 10
        
        Zn -= x;
        System.out.println(Zn ); // 0
        
    
        System.out.println(++c );
        
        
        NewNum -= y;
        System.out.println(NewNum ); // 20
        
        NewNum *= y;
        System.out.println(NewNum );
        
        NewNum %= x;
        System.out.println(NewNum ); // 0
        
        NewNum <<= 2;
        System.out.println(NewNum );
        
        System.out.println(Zn );
        Zn <<= 2;
        System.out.println(Zn );
        
        Zn >>= 2;
        System.out.println(Zn ); //20
        
        
        Zn &= x;
        System.out.println(Zn );
        
        Zn ^= x;
        System.out.println(Zn );
        
        
        Zn |= x;
        System.out.println(Zn );
        
        
        
        
       
        
        
        
        
        
        
        


        
        




    
    }
    
}
