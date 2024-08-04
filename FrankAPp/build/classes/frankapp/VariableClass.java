/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frankapp;

/**
 *
 * @author Cakahal Johnson
 */
public class VariableClass {
    VariableClass(){
        
        /*
        DEFINITION OF A VARIABLE
        is a memory control like a containers for storing data values
        
        TYPES OF VARIABLE
        Primitive data type and Non-Primitive data type
        
            Primitive Data types: are predefined types of data, which are supported by
                                  the programming language. Example: Integer, 
                                                            character and
                                                            string...etc
        
            Non-primitive Data types: are not defined by the programming language,
                                    but are instead created by the programmer.
                                    they are sometimes called "Reference variable",
                                    or "Object reference" since they reference
                                    a memory location, which stores data.
        
        LIST of java primitive type:
        String: for storing text, such as "Holy molly". String values are surrounded by double quotes
        
        int: stores integers(whole numbers), without decimals, such as 123 or -123
        
        float: stores floating point numbers, with decimal such as 19.00 or -19.99
        
        char: stores single characters, such as 'a' or 'B'. char values are surrounded by single quotes
        
        boolean: stores values with two states: true or false or On or Off 
        
        Syntax:
        type variable = value;
       
        */
        
        //Declaring(creating)
        String myName = "Frank";
        int age = 70;
        float acc = 12000;
        char initial = 'F';
        boolean areYOUsure = true;
        
        System.out.println(myName);
        System.out.println(age);
        System.out.println(initial);
        System.out.println(acc);
        System.out.println(areYOUsure);
        System.out.println("Here is \n were the inline type starts");
        System.out.print(myName);
        System.out.print(age);
        System.out.print(initial);
        System.out.print(acc);
        System.out.println(areYOUsure);
        
        System.out.println("my name is " +myName + "\n my age " +age+ "\n my chr "+initial+ "\n my acc bal. "+acc + "\n arrgs "+ areYOUsure);
       
        //NB: however, you can add the final keyword if you don't want others (or yourself) to overwrite existing values
               //(this will declare the variable as "final" 0f "constant", which means unchangeable and read-only)
        
        final float myMoney = 59;
//        myMoney = 20;
        System.out.println(myMoney);
        
        String Fname = "Cakahal";
        String Lname = "Johnson";
        String fullname = "My fullname is "+Fname+ " "+Lname;
        System.out.println(fullname);
        
        float dr = 1000;
        float cr = 10000;
        float bal = cr - dr;
        System.out.println("My bal is:"+bal);
        
        /*
        THE GENERAL RULES FOR CONSTRUCTING NAMES OF VARIABLE (UNIQUE IDENFIFIES) ARE:
        Names can contain letters, digits, underscores, and dollar signs
        Names must begin with a letter
        Names should start with a lowercase letter and it cannot contain whitespace
        Names can also begin with $ and _ 
        Names are case sensitive(MyVar and myvar are different variables)
        Reserved words (like java keywords, such as int or boolean) cannot be used as names 
        
        */

        
    }
    
}
