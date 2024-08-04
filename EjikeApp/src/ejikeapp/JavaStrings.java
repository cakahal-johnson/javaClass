/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejikeapp;

import java.util.Arrays;

/**
 *
 * @author Cakahal Johnson
 */
public class JavaStrings {
    JavaStrings(){
        
        /*
        this is just like a ways of formatting a JavaString...
        
        */
        
//        Creating a String
        
        String myString = new String("Java is awesome 101");
        System.out.println(myString);
        
        
//        shorter way of creating a new String:
        String anything = "Hello world 101";
        System.out.println(anything);
        
        //Escape Characters
        /*
          -- with \ this translate into a single \ character in the string it can also be \\
          -- \t this translates into a single tab character in the string
        -- \r this translates into a single carriage return character in the string
        -- \n it translates into single new line character in the string
        
        */
        
        String backslash = "i'm \t this text is in tab position. "
                + "\r\n this will start in a new line and also have no whitespace ";
        System.out.println(backslash);
        
//        concatenating a String and also .Length()
        String name1 = "Hello";
        String name2 = "Hi";
        String name3 = "bye";
        System.out.println(name1+" " +name2 +" " +name3);
        System.out.println(name1.length());
        
        //SubStrings
        String sub_string = "ANYTHING YOU WANT";
        String substring = sub_string.substring(0, 9);
        System.out.println(substring);
        
        
//        Searching in String with Indexof() method
        String text = "Searching in String with Indexof() method";
        int index = text.indexOf("in");
        System.out.println(index);
        
        
//        Equal String method Equal()
        String one = "abc";
        String two = "def";
        String three = "abc";
        String four = "ABC";
        
        System.out.println(one.equals(two));
        System.out.println(one.equals(three));
        System.out.println(one.equals(four));
        System.out.println(one.equalsIgnoreCase(four));
        
        System.out.println("checking for methods");
        
        System.out.println(text.startsWith("Searching"));
        System.out.println(text.endsWith("meth"));
        
        System.out.println(text.replace("method", "Apple"));
        
        System.out.println(text.toUpperCase());
        
        System.out.println("contains below");
//        String contains
        if (text.contains("z")) {
            System.out.println("Yes z is here");
            
        }else{
            System.out.println("z is not here");
        }
        
        System.out.println("password checking");
//        here for split methods arrays
        String Fullname = "Obi-den-t";
        String[] textSt = Fullname.split("-");
        System.out.println(Arrays.toString(textSt));
        System.out.println(Fullname);
        
        String password = "";
        String comfirm_pass = " ";
        
        if (password.equals(comfirm_pass)) {
            System.out.println("password matched");
            
        }else if (password.isEmpty() || comfirm_pass.isEmpty()) {
            System.out.println("Please fill in the black space");
            
        }else{
            System.out.println("Invalid password");
        }
        
    }
}
