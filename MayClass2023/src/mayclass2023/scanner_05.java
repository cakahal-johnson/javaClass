/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayclass2023;

import java.util.Scanner;

/**
 *
 * @author Cakahal Johnson
 */
public class scanner_05 {
    scanner_05(){
        /*
        The java.util.Scanner class is a simple text scanner which can parse Primitive types
        and it's also a stings using requla expressions.
        
        A Scanner breaks its input into tokens using a delimiter pattern, which by default matches
        whitespace.
        
        A Scanner operation may block, a waiting input i.e it stops other codes from runing till scanner is executed
        
        A Scanner is not safe for multithreaded use without external synchronization.
        
      
        */
        
        /*
         Using Scanner in String Datatype, Checking for Vowel or Consonant in Java
        note: vowels are: a, e, i, o, u
        */
        
        // initializers
        char ch;
        int count = 0;
        
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter an Alphabet to check if it's a Vowel or Consonant");
        ch = scan.next().charAt(0);
        
        // here we set the conditions
        if(count == 0){
            //for vowel
         for(int i = 0; i < 10; i++){
             if (ch == vowels[i]){
                 count++;
                 break;
             }
         }
         
         // for consonant
         if(count == 0){
             System.out.println("\n"+ "You selected Letter:" + ch +  " which is a Consonant");
         }else{
             System.out.println("\n"+ "You selected Letter:" + ch +  " which is a Vowel");
             
         }
        }
        
        // how to print out a Maths TimesTable
        // 2 x 2 = 4 to the range of 12
        int num = 2, g;
        System.out.println("\n ============ Multiplication Table for 2x2 ================");
        // here we use For Loop
        for(g = 1; g <= 12; g++){
            System.out.println("Num * g");
            
        }
        
        // stage two:
        int Num = 2, b = 1;
        System.out.println("\n ============ Multiplication Table for 2x2 stage2 ================");
        while(b <= 12)
        {
           System.out.println(Num+" * " +b + " = " +(Num*b));
           b++;

        }
        
        // here is for Pyramid
        // i for rows and j for columns
        // row denotes the number of rows you want to print
        int i, j, row = 6;
        
        //The Outer Looping for rows
        for(i = 0; i < row; i++){
          // inner loop for space
            for (j=row; j>1; j--){
                //lets print space between two stars
                System.out.print(" ");
            }
            
            //inner loop for columns
            for(j=0; j<=i; j++){
                // this will print out a star
                System.out.print("* ");

            }
            // this throws the cursor in a new line after printing each line
                            System.out.println();

        }
        
       

       
        
        
            
        
    } // end of my current java class
} // end of my current public java class
