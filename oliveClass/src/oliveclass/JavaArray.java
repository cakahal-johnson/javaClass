/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oliveclass;

import static java.lang.System.in;

/**
 *
 * @author Cakahal Johnson
 */
public class JavaArray {
    
    JavaArray(){
    
    //JAVA ARRAYS
    /*
    Arrays are use to store multiple values in a single variable,
    instead of declaring sparate variables for each value.
    
    to declare an arry, define the variable type with square brackets:
    */
    
    String[] name = {"Olive", "cakahal", "johnson", "Etoo"};
        System.out.println(name.length);
//        name[3] = "vitalis"; ///to change an Array list by index
        System.out.println(name[3]);
        
    int[] age = {50,16, 22, 25, 35, 40};
    
        System.out.println(age.length);
        
        System.out.println("My name is " +name[2] +" im " +age[2] +" years old");
    
        //NB: to use an array you need to import java.util.Arrays;
        
        
        //Arrays on a FOR Loop
        //NB: zero is alwaya your first index
        
        String[] cars = {"Benz", "BMW", "FORD", "TAYOTA"};
        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
        
        //Array for-each Loop
        String[] car = {"Benz", "BMW", "FORD", "TAYOTA"};
        for(String i : car){
            System.out.println(i);
        }
        
        
        //Multidimensional Arrays
        /*
        is an array containing one or more arrays. to create a two-dimensinal
        array, add each within its own set of curly braces 
        
        */
        
        int[][] numbers = { {1,2,3}, {4,5,6}, {7,8,9}};
        int x = numbers[0][1];
        System.out.println(numbers.length);
        System.out.println(x);
        
        
        String[][] alph = { {"A", "B", "C", "D"},{"E","F","G"},{"H", "I", "J"} };
        String a = alph[1][2];
        System.out.println(a);
        
        for(int n = 0; n < alph.length; ++n){
            System.out.println(n);
            for(int w = 0; w < alph[n].length; ++w){
                System.out.println(alph[n][w]);
            }
        }

    
    }
}
