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
        
        
        
    }
    
}
