/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ot_class;

/**
 *
 * @author Cakahal Johnson
 */
public class strings_method {
    strings_method(){
        
        System.out.println("Welcome to String method");
        
        //creaing a string
        String myString = new String("hello world 1235456978 ");
        System.out.println(myString);
        
        //shortcut of creating a string
        String anything = "whatever you feel like";
        System.out.println(anything);
        
        
        //Escape characters
        /*
        \\ this translate into a single \ character in the String 
        \t it returns tab format
        \n it returns a single line break to new line
        \r this returns a single carriage character in the tring
        \b returns back space
        
        
        */
//        int MYnumber = 07062119521;
        
        String example = "we're ' learning java";
        System.out.println(example);
        
//        String Example = 'this is me i'm learning java ';
        
        String Example = "this is line one \nThis is line two \nThis is line Three\tand this is the tab line";
        System.out.println(Example);
        
        //Concatenating String 
        String firstName = "cakahal";
        String lastName = "Johnson";
        String FullName = firstName + ""+ lastName;
        System.out.println(FullName);
        
        
        //.lenght() this returns length index of a string
        System.out.println(firstName.length());
        System.out.println(lastName.length());
        System.out.println(FullName.length());
        
        //SubStrings this takes params starting and ending index
        //subStrings sut characters from where you to start and end as well
        String sample = "java is awesome try also to vote for LP";
        String sample_display = sample.substring(0, 16);
        System.out.println(sample);
        System.out.println(sample_display);
        
        // print out the total number of sample_display
        
        // print out LP from sample variable
        
        // print out a word inside a string with quote
        
        String greetings = "Hel\blo World!"; //the \b removes the world behind it
        
        //Searching for keyword inside a a variable
        String database = "here we're looking for a word inside this list";
        //so we indexOf() method
        
        int data = database.indexOf("inside"); // returns 30
        System.out.println(data);
        
        
        // checking for is string are equals equal()
        String LP = "abc";
        String PDP = "ABC";
        String APC = "CBA";
        String NNP = "abc";
        
        System.out.println(LP.equals(PDP)); //false
        System.out.println(LP.equalsIgnoreCase(PDP)); // true
        
        // checking if a list starts with a word or not
        System.out.println(database.startsWith("Here")); // false
        System.out.println(database.startsWith("here")); // true
        
        
          // checking if a list ends with a word or not
        System.out.println(database.endsWith("list")); // true
        System.out.println(database.endsWith("here")); // false
        
        
        // where we want to make a change in the list so we use replace()
        String newDatabase = database.replace("looking", "learning java");
        System.out.println(database);
        System.out.println(newDatabase);
//        System.out.println(database.replace("looking", "learning java "));
        
        // turning small case to upper case
        System.out.println(newDatabase.toUpperCase());
        
        // returning upper to lower
                System.out.println(newDatabase.toLowerCase());
                
                
        // checking if a character is inside a list
                if(LP.contains("c")){
                    System.out.println("Yes c is inside the list");
                }else{
                    System.out.println("NO ");
                }
                
           

        
        
        
        
        
        
        
        
        
        
        
        
        
        

        
        
        

    }
    
    
}
