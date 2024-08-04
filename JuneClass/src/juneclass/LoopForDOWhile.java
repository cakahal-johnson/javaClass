/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juneclass;

/**
 *
 * @author Cakahal Johnson
 */
public class LoopForDOWhile {
    LoopForDOWhile(){
        
        // Declaring and initializing variables DOWhile loop
        /*
        for Loop: is used when you know exactly how many times you want to loop through
        a block of code, instead of a while loop:
        
        syntax:
        for(statement 1; statement2; statement 3 ){
        TODO CODE here.....
        statement 1 is executed(one time) before the execution of the code block
        
        statement 2 defines the conditions for executing the code block
        
        statement 3 is executed (every time) after the code block has executed
        }
        
        */
        
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        
        for(int i = 0; i <= 10; i = i + 2){
            System.out.println(i);

        }
        
//        FOR-EACH LOOP
        // Is used exclusively to loop through elements in an array:
        /*
        for(Datatype variableName : arrayName){
        CODE TODO here
        }
        
        */
        
        String[] cars = {"Benz", "Ford", "Mazda", "BMW"};
        
        for(String i : cars){
            System.out.println(i);
        }
        
        for(int i = 0; i <= 10; i++){
            
            // condition statement If where condition will break
            if(i == 6){
                break;
            }
            
            System.out.println(i);
            
        }
        
            
        for(int i = 0; i <= 10; i++){
            
            // condition statement If where condition will skipped
            if(i == 6){
                continue;
            }
            
            System.out.println(i);
            
        }
        
//        here we print out statement with loop
        int num = 2, g; // hard coding the variables
        
        System.out.println("\n ====== Multiplication Table for 2 x 2 =========");
        // here we use For Loop
        for(g = 1; g <= 12; g++){
            System.out.println("Num * "+ g);
        }
        
        // using while 
        int Num = 2, b =1;
        System.out.println("\n ====== Multiplication Table for 2 x 2 =========");
//        using While Loop
        while(b <=12){
            System.out.println(Num+" * "+ b +" = " +(Num*b));
            b++;
        }
        
        // here we create a Pyramid shape using for loop nested for loop
        // i for rows and j for columns
        
        //row denotes the number of rows you want to print
        int i, j, row = 12;
        
        //the Outer shape looping for the rows
        for(i = 0; i < row; i++){
            //inner loop for space
            for(j = row; j > i; j--){
                //lets print space between
                System.out.print(" ");
            }    
            
            //inner loop for columns
            for(j=0; j<= i; j++){
              // this will print out a star
                System.out.print("* ");
            }
            // this throws the cursor in a new line after printing each line
            System.out.println();
        }
        
        
//              use above example and print Star shape
        
        // Triangle Character Pattern
        for (int a = 0; a <= 8; a++){
          int alph = 65; // local var
             for(int A = 8; A > a; A--){
                 System.out.print(" ");
             }
             
             for(int B = 0; B <= a; B++){
                 System.out.print((char) (alph + B) + " ");
             }
                System.out.println();

        
        }
        
        
    }
}
