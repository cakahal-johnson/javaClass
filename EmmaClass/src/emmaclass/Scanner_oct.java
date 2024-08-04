/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emmaclass;

//import java.util.Scanner;

import java.util.Scanner;


/**
 *
 * @author Cakahal Johnson
 */
public class Scanner_oct {
    Scanner_oct(){
        
       /*
        The java.util.Scanner_oct class, this is a simple text scanner which can parse primitive types
        and it's also a strings using regular expressions
        
        A Scanner_oct breaks it's input into tokens using a delimiter pattern, which by default matches whitespace.
        
        A Scanner_oct operation may block, an awaiting input i.e it stops other codes from running till scanner is executed
        
        A Scanner_oct is not safe for multi-threaded use without external synchronization.
        
        These Scanner_oct class of the java.util package is used to read input from different source like:
        input streams, users, files...
        
        
        
        */
        
        // creating an Object of Scanner_oct
        Scanner ebube = new Scanner(System.in); // alt and enter key to import Scanner
        
        System.out.println("Please Enter you Name: ");
        
//        takes input from the user keyboard
        String name = ebube.nextLine(); // nextLine method takes the user to the next Operands
        
//        Outputing the result
        System.out.println("Welcome " + name + " to Java Class");
        
//        closing the scanner with close method
//        ebube.close();
        
        /*
        OTHER METHODS FROM nextLine() is:
        Method	Description
nextInt()	reads an int value from the user
nextFloat()	reads a float value form the user
nextBoolean()	reads a boolean value from the user
nextLine()	reads a line of text from the user
next()	reads a word from the user
nextByte()	reads a byte value from the user
nextDouble()	reads a double value from the user
nextShort()	reads a short value from the user
nextLong()	reads a long value from the user
        
        */
        
//        creating a Scanner Object
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an Integer: ");
        
//        reads an int value
        int result_2 = sc.nextInt();
        
        System.out.println("Using nextInt(): and your result is --- " + result_2);
        
        
        /*
        DIFFERENT BETWEEN NEXTLINE() AND NEXT()
        This is because the next() method reads input up to the whitespace character.
        Once the whitespace is encountered, it returns the string (excluding the whitespace).
        
        */
        
        // checking vowels in the English Alphabet
//        initializing the datatype called character which is a single WORD rap in a Single qoute
        char ebube_vowel;
        int count = 0;
        
//        we create an Arrays of vowels
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        
        Scanner ebube_sc = new Scanner(System.in);
        
        System.out.println("Enter an Alphabet to check if it's a Vowel or Consonant");
        
        ebube_vowel = ebube_sc.next().charAt(0);
        
        
//        so we use the IF statement to check the conditions
        if(count == 0){
            // statement for the vowels
            for(int i = 0; i < 10; i++){
                if (ebube_vowel == vowels[i]){
                    count++;
                    break;
                }
            }
            
            // function for consonants
            if(count == 0){
                System.out.println("\n" + "You selected Letter: "+ ebube_vowel + " which is Consonant");
            }else{
                System.out.println("\n" + "You selected Letter: "+ ebube_vowel + " which is Vowel");

            }
                
        }
        
        
        
        
        
//        
        
    }
}
