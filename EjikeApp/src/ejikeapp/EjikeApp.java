/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejikeapp;

import newpackage.NewClass_package;

/**
 *
 * @author Cakahal Johnson
 */
public class EjikeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       System.out.println("Welcome To JAVA Class");
              System.out.println("Welcome To JAVA Class2");
       System.out.println("Welcome To JAVA Class3");
       
        System.out.print("Hello");
                System.out.print("Hello 2");
        System.out.println("Hello 3");
        
        new NewClass();
        
//        NewClass n = new NewClass();
        
        NewClass_package p = new NewClass_package();
        System.out.println(p.age);
        System.out.println(p.name);


       
       /*
       we use System.out.print("Hello")
       we use System.out.println("Hello") ln is to start in new line 
        
       Java Comment: crt / or //
        types of comment: single // and multi-line
        
        DFEINITION A JAVA VARIABLE
        This a memory control like a containers for storing data values
        
        TYPES OF VARIABLES
        PRIMITIVES DATA TYPES AND NON-PRIMITIVE DATA TYPES
        
            PRIMITIVE DATA TYPES: are predefined types of data, which are supported by 
                                  the programming language. 
        Example:
        Integer which int:
        String which hold words:
        character which holds char: etc
        
            NON-PRIMITIVE DATA TYPES: there are not defined by the programming language
                                    but are instead created by the programmer.
                                    they are sometimes called "Reference Variable"
                                    or Object reference since they reference a memory location, which store :
       
         
        
       */
        
        // /**/ this java comment syntax:
        
        //List of Primitive Data types
        /*
        --String: for storing text, such as names using this quote " " sign or ''
        --int: stores integers(whole number), without decimals, e.g 123456789 or -123456789
        --float: stores floating point numbers, with decimals such as 19.0 or -19.9
        --char: stores single characters, such as name initials 'A' or 'a' in a single quotes
        --boolean: stores just two states like True or false
        
        VARIABLE SYNTAX:
        type variable = value;
       */
        
        //JAVA Decaration 
        String Fname = "John 89 doe";
        System.out.println(Fname);
        
        int age = 90;
        System.out.println(age);
        
        int Age = 80;
        
        float money = 5002;
        System.out.println(money);
        
        char initail = 'C';
        System.out.println(initail);
        
        boolean areYouSure = true;
        System.out.println(areYouSure);
        
        //concatination means joining variables together by using the + sign
        System.out.println("My Name: "+Fname+ "\n My Age: "+age+ "\n Bal: "+money+ "\n initial: "+initail);
        
        //cr 1000 dr 250 print out my bal:
        float cr = 1000;
        float dr = 250;
        float bal = cr - dr;
        System.out.println("Here is your Bal: "+bal);
        System.out.println(cr - dr);
        
        int x = 5, y = 8, z = 222;
        int result = x - z * y ;
        int ans = z - x;
        System.out.println(x + y + z);
        System.out.println(result);
        System.out.println(ans);
        
        
        //final variables: however, you can add the final keyword if you don't want others (or yourself)
//        to overwrite existing values (this will declare the variable as "final"
//        or "constant", which means unchangeable and read-only):
        
        final int num = 15;
//        num = 20;
        System.out.println(num);
        
        /*
        Rules of java variable
        -- Names can contain letters, digits, underscores, and a dollar signs
        -- Names must begin with a letter or signs
        -- Names should start with a lowercase or upper letter but without white-space
        --Names can also begin $ and _ 
        --Names are case sensitive 
        --Names like Reserved words (like java keywords, such as int or boolean) these cannot be used as names
        
        */
        
        
        //Java Casting of Data types
        
        /*
        Type casting is when you assign a value of one primitive data type to another type.
        
        is of two ways of casting in JAVA
            ---Widening Casting (automatically) - converting a smaller type to a larger type size
            byte --> short --> char --> int --> long --> float --> double
        
           ---Narrowing Casting (Manually) - converting a larger type to a smaller size type
            double --> float --> long --> int --> char --> short --> byte
        
        --Widening Casting: is done automatically when passing a smaller size type to a larger size type
        
        --Narrowing casting: must be done manually by placing the type in parentheses in front of the value:
        
        */
        
        System.out.println("here is 25th oct class");
        
        int Myint = 9;
        double MyDouble = Myint;
        System.out.println(Myint);
        System.out.println(MyDouble);
        
        System.out.println("for Narrowing");
        
        double myDouble = 10.99;
        int myINt = (int) myDouble;
        System.out.println(myDouble);
        System.out.println(myINt);
        
//        new Operator();
//        new controlStatement();
//        new JavaArrays();
//        new JavaStrings();
        new JavaIO();
        
        new dbConnection();
        
        /*
        
        // Declaring and initializing variables
 
        // Variable initialized to the row where max star
        // should be there as after that they decreases to
        // give diamond pattern
        int number = 7;
 
        // Diamond starting with single star in first row
        int m = 1;
 
        // Columnar printing
        int n;
 
        // Outer loop 1
        // Prints the first half diamond
 
        // Condition holding true till
        // number of rows initialized
        while (m <= number) {
            n = 1;
 
            // Inner loop 1
            // Prints space until n++ <= number - m is false
            while (n++ <= number - m) {
 
                // Print whitespaces inbetween
                System.out.print(" ");
            }
 
            n = 1;
 
            // Inner loop 2
            // Prints star until n++ <= m * 2 - 1 is false
            while (n++ <= m * 2 - 1) {
 
                // Print star
                System.out.print("*");
            }
 
            // By now we are done for above pyramid printing
            // ending line after each row
            System.out.println();
 
            // Incrementing as we want pyramid generation
            m++;
        }
 
        // Now we are done with printing the upper half
        // diamond.
 
        // Note: Not to print the bottom row again in lower
        // half diamond printing Hence variable t be
        // initialized should one lesser than number
        m = number - 1;
 
        // Outer loop 2
        // Prints the second half diamond
        while (m > 0) {
            n = 1;
 
            // Inner loop 1
            // Prints spaces until n++ <= number - m is
            // false
            while (n++ <= number - m) {
 
                // Print whitespace in between
                System.out.print(" ");
            }
 
            n = 1;
 
            // Inner loop 2
            // Prints star until n++ <= m * 2 - 1 is false
            while (n++ <= m * 2 - 1) {
 
                // Print star
                System.out.print("*");
            }
 
            // Ending line after each row
            System.out.println();
 
            // Decrementing as we want reverse pyramid
            // generation
            m--;
        }
    }
}
        
        
        
        
        */
        
        
        /*
         // Declaring and initializing variables
 
        // Variable initialized to the row where max star
        // should be there as after that they decreases to
        // give diamond pattern
        int number = 7;
 
        int m, n;
 
        // Outer loop 1
        // prints the first half diamond
        for (m = 1; m <= number; m++) {
 
            // Inner loop 1 print whitespaces inbetween
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }
 
            // Inner loop 2 prints star
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
 
            // Ending line after each row
            System.out.println();
        }
 
        // Outer loop 2
        // Prints the second half diamond
        for (m = number - 1; m > 0; m--) {
 
            // Inner loop 1 print whitespaces inbetween
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }
 
            // Inner loop 2 print star
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
 
            // Ending line after each row
            System.out.println();
        }
    }
}
        
        
        
        */      
        
        
    }
    
}
