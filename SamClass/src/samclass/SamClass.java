/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samclass;

/**
 *
 * @author Cakahal Johnson
 */
public class SamClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome To SAM Class");
        System.out.println("Java is awesome");
        System.out.print("wow what happened?");
        System.out.println("wow what happened?");
        
        // this is also a comments in java and which is single line comment with crt/ keyword... or //
        // where the double slash comes before the contents
        // while the crl / can execuate 'once in the line of code...
       
        /*
        here is the multi-line comments 
        whereby we can write in a new lines without an error
        just like what we are doing now...
        if you try this in a single line comment it hit an error
        
        */
        
        //Here we make a connection to the new JavaClass
//        operatorClass oc = new operatorClass();
        
       new operatorClass();
       
       //NB: always remember to close all line of code with the ; semi-column
       //   always write inside the { body }
       //   always start a method with uppercase e.g: System.out.println
       
       /*
        DEFINITION OF JAVA VARIABLE
       This is a memory control like a containers for storing data values
       
       TYPES OF VARIABLES
       we have two types of Variable in Java: PRIMITIVE DATA TYPES AND NON-PRIMITIVE DATA TYPE
       
       PRIMITIVE DATA TYPE:
       This is the predefinmed types of data, which are supported by the programming languages guys
       
       Example:
       integer which offers figuares, is denoted by keyword = int (i is lowercase)
       String which offers words, is denoted by keyword = String (S is uppercase) 
       char which offers character, is denotes by keyword = char (c is lowercase)
       
       
       NON-PRIMITIVE DATE TYPE:
       This are perdefined types of data, which are not define by the programming language
       but are instead created by the programmer. they are sometimes called "Reference Variable"
       or Object reference since ther are a reference memory location, as storage
       
       
       LIST OF THE PRIMITIVE DATA TYPES
       
       --String: for storing text, such as names using this quote " content inside " or 'single qoute '
       --int: stores integers(whole number), without decimals, e.g 1234567890 or -1234567890 without a qoute
       --float or double: stores floating point numbers, with decimals such as 19.0 0r -19.0 without a qoute
       --char: stores single characters, such as name initials 'A' or 'a' in single qoutes
       --boolean: stores just two states like True or False 
       
       VARIABLE SYNTAX:
       type variable = value;
       
       */
       
       //JAVA DECARATION
       String Fname = "Cakahal Johnson is 7 years old";
        System.out.println("Fname");
        System.out.println(Fname);
        
        int age = 90;
        System.out.println(age);
        
        int Age = 100;
        System.out.println(Age);
        
        double My_money = 10;
        System.out.println(My_money);
        
        char initail = 'C';
        System.out.println(initail);
        
        boolean areYouSure = true;
        System.out.println(areYouSure);
        
        
        //Concatination means joining variables together by using the + sign
        String name = "Cakahal Johnson";
        System.out.println("My name is: " +name +" I am "+Age +"Years old and i have  "+My_money +"Billion $" );
        
        /*
        
        ASSIGNMENT:
        ---1)   know the d/f b/w an IDE and Code eidtors
        ---2)   float cr = 1000;
                float dr = 750;
                float bal = fine a value that will solve this maths for us;
                sout("Here is my Balance: " +bal)
        --3)    do a connection from this newpackage source package to the main package
                where you can just sout("Cakahal Johnson")
        */
        
       

    }

//    private static void operatorClass() {
//        System.out.println("Here is the new method class");
//    }
    
}
