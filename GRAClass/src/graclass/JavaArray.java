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
public class JavaArray {
    JavaArray(){
        /*
       Java Arrays
    Arrays are used to store multiple values in a single variable,
    instead of declaring separate variables for each value.

    To declare an array, define the variable type with square brackets: 
        String[] cars;
                
    */         
        String[] name = {"christian", "Dave", "Cakahal"};
        name[2] = "Johnson"; ///To change the value of a specific element, refer to the index number:
//        System.out.println(name[2]);
        
        int[] OurAge = {90, 40, 50, 600, 10, 0 };
        OurAge[2] = 100; ///To change the value of a specific element, refer to the index number:
//        System.out.println(OurAge[1]);
        
        System.out.println(name.length); ///To find out how many eleme
        System.out.println("My age is: "+OurAge[2] +" years: here is my name: " +name[2]);
//        nts an array has, use the length property:
        System.out.println(OurAge.length);
       
        
        ///ARRAY ON A for LOOP
//        NB: zero is always your first index
        
//        String[] cars = {"Benz", "BMW", "FORD", "TAYOTA"};
//        for (int i = 0; i < cars.length; i++){
//            System.out.println(cars[i]);
//        }
        
        ///ARRAY ON A for-each LOOP
        String[] car = {"Benz", "BMW", "FORD", "TAYOTA"};
        for (String i : car){
            System.out.println(i);
        }
        
        
        //Multidimensional Arrays
       /* A multidimensional array is an array containing one or more arrays.
        To create a two-dimensional array, add each array within
        its own set of curly braces:*/
        
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7}, {2,2,2,8,9} };
        int x = myNumbers[2][3];
        System.out.println("we have:" +myNumbers.length +" Arrys");
        System.out.println(x);
        
        String[][] alph = {{"A", "B", "C", },{"D", "E", "F"}};
        String a = alph[1][2];
//        System.out.println(a);
       
        for (int n = 0; n < alph.length; ++n){
            System.out.println(n);
            for(int w = 0; w < alph[n].length; ++w){
                
                System.out.println(alph[n][w]);
            }
        }
        
        ///SORTING AN ARRAY it usually an asending number
        int[] students = {2,5,1,9,4,6,7,8};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        
        String[] Ourname = {"Zen","zen", "Christian", "Ken", "cakahal", "Cakahal"};
        Arrays.sort(Ourname, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(Ourname));
       
        ///ARRAY COPY   
        int[] original = {1,2,3,4,5,6};
        int[] newOriginal = Arrays.copyOf(original, original.length);
        System.out.println(Arrays.toString(newOriginal));
        
        ///ARRAY BINARY SEARCH
        System.out.println(Arrays.binarySearch(original,2)); ///it returns the index number
        
        
        System.out.println(Arrays.equals(original, newOriginal)); //boolen 
        
        /////
        /*
        Assignment

Write a Java program to find the number of even and odd integers in a given array of integers.
        READ ABOUT JAVA METHODS
        */
//        /////
                int i, j, n=8;  
        // Outer for loop for number of lines  
        for (i = 0; i<=n; i++) {   
         
        // Inner for loop for logic execution  
        for (j = 0; j<= n / 2; j++)  {   
        
        // prints two vertical lines  
        if ((j == 0 || j == n / 2) && i != 0 ||  
        // print first line of alphabet  
        i == 0  && j != n / 2 ||   
        // prints middle line  
        i == n / 2)   
        System.out.print("*");  
        else  
        System.out.print(" ");  
        }  
        System.out.println();  
        } 
                
              
 
        //Using an array to design a RightTriangle Pattern
        //i for rows and j for columns      
        //row denotes the number of rows you want to print  
//        int i, j, row=6;   
//        //outer loop for rows  
//        for(i=0; i<row; i++)   
//        {   
//        //inner loop for columns  
//        for(j=0; j<=i; j++)   
//        {   
//        //prints stars   
//        System.out.print("* ");   
//        }   
//        //throws the cursor in a new line after printing each line  
//        System.out.println();   
//        }
        
        
        
        
        //////endpoint/////
    }
        
}
