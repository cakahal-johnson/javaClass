/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelsonclass;

/**
 *
 * @author Cakahal Johnson
 */
public class String_method_07 {
    String_method_07(){
        
        /*
         Java String method which is primitives dataType is method we use to manipulating a string
        
        Type 48 methods()
        
        //creating a string as an Object
        String name = new String("hello, 12345");
        
        //Shortcut for string()
        String name = "text here, or numbers";
        
        // Escape characters are ways to add a programmable format to codes
        List of JAVA ESCAPE characters
        \t (backSlash t) we use this to display tab format (indentation)
        \\ (double BackSlash) is used to display a single slash in the String text
        \n (backSlash n) we use to move to next line
        \r (backSlash r) is used as a return function
        \b this is returns a backSpace
        
        
        */
        
        String eg = "this is how to use a backslah t where\tis indented away from is";
        System.out.println(eg);
        
        
        //concatination used plus sign + to concatination
        String fname = "Cakahal\t";
        String lname = "Johnson";
        String fullname = fname.concat(lname);
        System.out.println(fullname);
        
//        checking for the length index in a string we use length()
        System.out.println(eg.length()); //also include the white-space 62
        
//        SubStrings takes params starting and ending index
        String check_subS = eg.substring(21, 29); // the first index of array is Zero 
        System.out.println(check_subS);
        
        // where we want to search for a keyword we can use indexOf()
        
        int data = eg.indexOf("b"); // 21
        System.out.println(data);
        
        
        
        //checking Equality is equal() which returns boolean
        String check_eq1 = "abcd";
        String check_eq2 = "ABCD";
        String check_eq3 = "Abcd";
        String check_eq4 = "abcd";
        
                System.out.println("is check_eq1 equal to check_eq2"+ check_eq1.equals(check_eq2));

        
        

        
        

        
    }
    
}
