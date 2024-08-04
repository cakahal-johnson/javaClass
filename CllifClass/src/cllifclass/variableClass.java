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
public class variableClass {
    variableClass(){
           /*
        What's a variable
        is a memory control, like a container for storing date values
        
        Types (classification) of Variables
        Primitive dataType and Nomn-Primitive dataType
        
        Primitive: there are predefined types of data, which are supportted by programming Language
        Example: integer, string, characters
        
        List of Java Primitives:
        String: is used to store text, such as "hello", String must be surrounded by double or single
        
        int: (integer: whole numbers it has only 11 characters), it's also without decimals, i.e 
            12345678900 or -1-2....
        
        Float: this stores floating point numbers 4:8 char, must be with decimal values
            10.9999, 10.01, 1.0 or -10.99,...
        
        double: same as flaot with 8 char
        
        character (char): is used to store single characters such as 'a' or 'A' in a single only
        
        boolean: this stores values with two states: true or false
        
        etc... find the rest
        
        NON-Primitive:
            this are not defined by the programming language, but are instead created
            by the programmer i.e where have a referes variabales name
        NB: Object reference since they reference in a memory location, which stores data locally
        
        NB:
        Syntax:
            dataType(primitive) Reference (variable name) = (assigning) "Value" or 'Value'
            which mean it stored as an object reference
        
        */
        
        
        // creating a String variable
        String student_name = "Cakahal Johnson";
        System.out.println(student_name);
        
        // creating for an integer variable
        int age = 70;
        System.out.println(age);
        
        // creating for a floating number
        float Age = 40;
        System.out.println(Age);
        
        double moni = 10;
        System.out.println(moni);
        
        
        /*
            Rules of Variable
        -- All variables Must start with a primitive datatype
        -- Names can contain letters, underscores, and dollar signs as prefix
        -- Names must begin with a letter or signs as memtioned above
        -- Names can start with uppercase or lowercase but without whiteSpace (space b/w words " " )
        -- Names are VERY very case sensitive (name and Name and NAME and nAme all is not same)
        -- Variable can't more than one but can be reassigned
        
        -- variables can only pass through another variable through a converter
        
        */
        
        // we can also store a muliti-text as a variable
        String course_name = "java python php 10 react HTMl";
        System.out.println(course_name);
        
        // common erros
//        int name = "john";
//        String AGE = 70;
    //    string obi = "is a boy"; // class work find the error
        
//        CONCATINATION: means joinning variables the same together we use the + sign
        
        // Concatination with a string and number
        System.out.println("My student name is: "+student_name+" he is "+age+" years old");
        
        
        //Concat in a number
        float cr = 15000;
        float dr = 750;
        float bal = cr - dr;
        System.out.println(bal);
                
        // class work
//        use concatination to express this function
        int x = 5, y= 8, z = 225;
//        int ..... = x + y;
//        output will return 13 then 
//        use z to substract the return
        
        
//        final keyword
        /*
         you can use final keyword if you don't want others to overwrite the existing values 
        is unchangeable and read-only just like the javascript const
        
        */
        
        int num = 15;
        System.out.println("initial num is: "+num);
        num = 25; // the resigned value it comes without the perfix
        System.out.println("the new num is: " + num); //25
      
        // an error will occure be'cos final can not be reassigned
     //   final  int Num = 15;
    //    Num = 25; // the resigned value it comes without the perfix
     //   System.out.println("x is: " + Num); //25
        
        System.out.println("old student_name is: "+ student_name);
        
        student_name = "Peter Obi"; // here we reasigned the student name
        System.out.println("new stucednt name: "+ student_name);
        
        
        
        
        
        
                

    }
    
    
}
