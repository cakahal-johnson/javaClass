/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayclass2023;

/**
 *
 * @author Cakahal Johnson
 */
public class LoopForDOWhile_06 {
    LoopForDOWhile_06(){
 
    
       // Declaring and initializing variables DOWHILE LOOP
 
        // Variable initialized to the row where max star
        // should be there as after that they decreases to
        // give diamond pattern
//        int number = 7;
// 
//        // Diamond starting with single star in first row,so
//        // initialized
//        int m = 1;
// 
//        // Columnar printing
//        int n;
// 
//        // Outer loop 1
//        // Prints the first half diamond
//        do {
//            n = 1;
// 
//            // Inner loop 1
//            // Prints space until ++n <= number - m + 1 is
//            // false
//            do {
//                // Print whitespace between
//                System.out.print(" ");
// 
//            }
// 
//            // Condition for inside do-while loop 1
//            while (++n <= number - m + 1);
// 
//            // Now
//            n = 1;
// 
//            // Inner loop 2
//            // Prints star until ++n <= m * 2 - 1 is false
// 
//            do {
// 
//                // Print star
//                System.out.print("*");
//            }
// 
//            // Condition for inner do-while loop 2
//            while (++n <= m * 2 - 1);
// 
//            // A new row requires a new line
//            System.out.println();
// 
//        }
// 
//        // Condition for outer do-while loop 1
//        while (++m <= number);
// 
//        // Now we are done with printing the upper half
//        // diamond.
// 
//        // Note: Not to print the bottom row again in lower
//        // half diamond printing Hence variable to be
//        // initialized should one lesser than number
//        m = number - 1;
// 
//        // Outer loop 2
//        // Prints the second half diamond
//        do {
//            n = 1;
// 
//            // Inner loop 1
//            // Prints space until ++n <= number - m + 1 is
//            // false
//            do {
//                // Print whitespace between
//                System.out.print(" ");
// 
//            } while (++n <= number - m + 1);
// 
//            n = 1;
// 
//            // Inner loop 2
//            // Prints star until ++n <= m * 2 - 1 is false
//            do {
//                // Prints star
//                System.out.print("*");
// 
//            } while (++n <= m * 2 - 1);
// 
//            // By now done with one row of lower diamond
//            // printing so a new line is required
//            System.out.println();
// 
//        }
// 
//        // Condition for outer do-while loop 2
//        while (--m > 0);
//        ========================================================================
//        ===========================================================================
        // USING WHILE LOOP
//        int number = 7;
//        
//        int m = 1;
//        
//        int n;
//        
//        while(m <= number){
//            n = 1;
//            
//            while (n++ <= number - m){
//                System.out.print(" ");
//        }
//            n = 1;
//            
//            while(n++ <= m * 2 -1){
//                System.out.print("*");
//            }
//            
//            System.out.println(); //  ending line ,after each row
//            m++;
//        }
//        
//        //outside the first loop we start the second loop
//        m = number - 1;
//        while(m > 0){
//            n = 1;
//            
//            while(n++ <= number - m){
//                System.out.print(" ");
//        }
//            n = 1;
//            
////            inner loop 2
//            while(n++ <= m * 2 - 1){
//                System.out.print("*");
//        }
//            System.out.println(); //  ending line ,after each row
//            m--;
//        }   
        
//        ==========================================================================
//        ===========================================================================
        // USING for LOOP
        int number = 7;
        
        int m, n;
        
        // first loop
        for (m = 1; m <= number; m++){
            //first inner loop
            for(n=1; n <= number - m; n++){
                System.out.print(" ");
            }
            
            //second inner loop
            for(n= 1; n <= m * 2 - 1; n++){
                System.out.print("*");
            }
            
                System.out.println(); // end of the upper phase
        }
        
        // outside the first For loop Seconnd loop starts
        for(m = number - 1; m > 0; m--){
            // inner first loop for whitespace
            for (n = 1; n <= number - m; n++){
                System.out.print(" ");
            }
            // second loop for the star
            for(n = 1; n <= m * 2 -1; n++){
                System.out.print("-");
            }
            
            // outside the for loop we end it with New line LN
            System.out.println();

                
        }
        
    }
}
    //  end of code body class
    // end of public class    

