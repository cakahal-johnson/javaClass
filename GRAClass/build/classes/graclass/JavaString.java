/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graclass;

import java.util.Arrays;

/**
 *
 * @author Cakahal Johnson
 */
public class JavaString {
    JavaString(){
//        creating a String
        
        String myString = new String("hello world 235526554115552");
        System.out.println(myString);
        
        
        //shorter way of creating a new String:
        
        String anything = "Hello World 2 hhhhhhhjl'  kugklh;okug;liy/l,n ";
        System.out.println(anything);
        
        ///Escape characters
//        Esc.Char Description here;
        /*
        \\ it Translate into a single \ character in the String
        
        \t it Translate into a single tab character in the string
        
        \r it Translate into a single carriage return character in the string
        
        \n it Translated into a single new line character in the string
        
        */
        
        String sample1 = "\tThis text is one tab in.\r\n this is a new line";
        System.out.println(sample1);
        
        ////Concatenating Strings and .length()
        String anything1 = "Hello";
        String anything3 = "AND";
        String anything2 = "WORLD";
        System.out.println(anything1 +"" +anything3 +"" +anything2);
        
        ///.Length guy picks all whole length of the index
        
        //SubStrings takes para starting and ending index
        String anything4 = "ANYTHING YOU WANT";
        String substring = anything4.substring(0,9);
        System.out.println(substring);
        System.out.println(anything4.length());
        
        String anything5 = "ANYTHING YOU WANT YOU CAN PRINT";
        String iWantOnlyWant = anything5.substring(13,18);
        System.out.println(iWantOnlyWant);
        System.out.println(iWantOnlyWant.length());
        System.out.println(anything5.length());

        String myname = "Cakahal Johnson";
        String surname = myname.substring(0,7);
        System.out.println(surname);
        System.out.println(myname);
        
//        Searching in String with IindexOf() method.
        
        String text = "Searching in String s with IindexOf() method";
        int index = text.indexOf("with");
        System.out.println(index);
        System.out.println(text.length());
        
        
        //Equals String method Equal();
        
        String one = "abc";
        String two = "def";
        String three = "abc";
        String  four = "ABC";
        
        System.out.println(one.equals(two));
        System.out.println(one.equals(three));
        System.out.println(one.equalsIgnoreCase(four));
        System.out.println(one.equals(one));

         System.out.println(text.startsWith("Searching"));
         System.out.println(text.endsWith("m"));
         
         System.out.println(text.replace("method", "fine woman"));

           ///String to uppercase n lower case
         System.out.println(text.toUpperCase());
        
         
         ///String contains
         if (text.contains("s")){
             System.out.println("Yes s is in the text");
         }else{
             System.out.println("s is not in the text ");
         }
         
         
         //String split method array
        String fullname = "Obi-is-boy";
        String[] textSt = fullname.split("-");
       System.out.println(Arrays.toString(textSt));
        System.out.println(fullname);
        
        String password = "1";
        String comfirm_password = "3";
        
        if (password.equals(comfirm_password)){
            System.out.println("password matched");
        }else if(password.isEmpty() || comfirm_password.isEmpty()){
            System.out.println("please fill in the empty space!");
        }else{
            System.out.println("Invalid password!");
        }
        
        String email = "";
        
             
             
    }
}
