/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graoop;

/**
 *
 * @author Cakahal Johnson
 */
public class GRaOop {

    /**
     * @param args the command line arguments
     */
    static void myMethod(String fname, int age){//parameters and arguments
        System.out.println(fname + " Obident family" +" is " +age +" Years Old");
//        System.out.println("menh this is so hard to understand");
    }
    
    ///The Return Values
    static int myMath(int x, int y){
        return x * y;
    }
    
    static void checkAge(int old){
        if(old < 18){
            System.out.println("Access denied - You are not old enough!");
        }else{
            System.out.println("Access granted - You are old enough!");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int z = myMath(48, 6);
        System.out.println(z);
        myMethod("Dave", 90);
        myMethod("Krist", 100);
        checkAge(18);
//        myMethod();
        
        
//        JAVA RECURSION
        int result = sum(10);
        System.out.println(result);
        
//        USING TWO PARA INT
        int result2 = sum2(5, 10);
        System.out.println(result2);
        
        /*
        Example Explained
        When the sum() function is called, it adds parameter k to the sum of all 
        numbers smaller than k and returns the result. When k becomes 0, 
  the function just returns 0. When running, the program follows these steps:
        
        10 + sum(9)
        10 + ( 9 + sum(8) )
        10 + ( 9 + ( 8 + sum(7) ) )
        ...
        10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
        10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
        */

    }
    /*
    Java Recursion
Recursion is the technique of making a function call itself. 
This technique provides a way to break complicated problems down into simple
problems which are easier to solve.

Recursion may be a bit difficult to understand. 
The best way to figure out how it works is to experiment with it.
    */
    
    
//    JAVA RECURSION
    public static int sum(int k){
        if ( k > 0){
            return k + sum(k - 1);
    }else{
            return 0;
        }
    
}

    public static int sum2(int start, int end){
        if(end > start){
            return end + sum2(start, end - 1);
        }else{
            return end;
        }
    }
}
