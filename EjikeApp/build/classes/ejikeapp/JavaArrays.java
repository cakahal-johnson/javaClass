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
public class JavaArrays {
    JavaArrays(){
        /*
        JAVA ARRAYS
        this is also used to store multiple values in a single variable,
        instead of declaring separate variables for each value.
        
        To declare an Array, we define the variable type with square brackets[]
        i.e String[] arrayName;
        
        */
        System.out.println("here is for JAva Arrays");
        
        String[] name = {"Johnson", "Ejike", "Emma", "Joy"};
        System.out.println(name.length);
        
        
        name[2] = "Cakahal";
        System.out.println(name[2]);
        
        int[] MyAge = {50, 100, 20, 40, 70};
        System.out.println("My Name is : " +name[2] +"\n i'm "+MyAge[2] +" Years old");
        
        /*Loop Through an Array
        you can loop through an array elements with the FOR loop, and use the Length
        property to specify how many times the loop should run
        */
        
//        for (String i : name){
//            System.out.println(i);
//    }
//        
        /*
        Multidimensional Arrays
        is an arry containing one or more arrays.
        to create a two-dimensional array, we add each array within its own set of curly braces
        
        */
        
        int[][] myNumbers = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int x = myNumbers[0][3];
        System.out.println(x);
        System.out.println(myNumbers.length);
        
        String[][] alph = {{"A", "B", "C"},{"D", "E", "F"},{"G", "H", "I"}};
        for (int n = 0; n < alph.length; ++n){
            System.out.println(n);
            for(int w = 0; w < alph.length; ++w){
                System.out.println(alph[n][w]);
        }
        
        
    }
        
        //SORTING AN ARRAY: it's usually starts as an asending number
        int[] students = {50,20,1,0,8,40,25};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        
        String[] stud = {"Johnson", "ejike", "Emma", "Joy", "aja"};
        Arrays.sort(stud, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(stud));
        
        //COPYING AN ARRAY
        int[] NewStudent = Arrays.copyOf(students, students.length);
        System.out.println(Arrays.toString(NewStudent));
        
//        ARRAY BINARY SEARCH
        System.out.println(Arrays.binarySearch(students, 0));
        
        System.out.println(Arrays.equals(students, NewStudent));
        
        
//                   int i, j, n=8;  
//        // Outer for loop for number of lines  
//        for (i = 0; i<=n; i++) {   
//         
//        // Inner for loop for logic execution  
//        for (j = 0; j<= n / 2; j++)  {   
//        
//        // prints two vertical lines  
//        if ((j == 0 || j == n / 2) && i != 0 ||  
//        // print first line of alphabet  
//        i == 0  && j != n / 2 ||   
//        // prints middle line  
//        i == n / 2)   
//        System.out.print("*");  
//        else  
//        System.out.print(" ");  
//        }  
//        System.out.println();  
//        } 
        
        
        //Using an array to design a RightTriangle Pattern
        //i for rows and j for columns      
        //row denotes the number of rows you want to print  
       int i, j, row=6;   
        //outer loop for rows  
        for(i=0; i<row; i++)   
        {   
        //inner loop for columns  
        for(j=0; j<=i; j++)   
        {   
        //prints stars   
        System.out.print(" * ");   
        }   
        //throws the cursor in a new line after printing each line  
        System.out.println();   
        }
        
//        Assignment
//
//Write a Java program to find the number of even and odd integers in a given array of integers.
        
        
    }
    
    
}
