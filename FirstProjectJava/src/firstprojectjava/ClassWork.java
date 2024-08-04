/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprojectjava;
import java.util.Scanner;
import java.lang.Exception;




/**
 *
 * @author Cakahal Johnson
 */
public class ClassWork {
    ClassWork(){
        
               Scanner sc = new Scanner(System.in);
        

	 //Telling the user to Hold a number in mind
           System.out.println("Hi there! just pick a number in your mind ");

            System.out.println("Okay! Add 7 to it in your mind");
                    int a = sc.nextInt();
                    
    		//int b = sc.nextInt();
            System.out.println("Okay! Add 10 to it in your mind");
                    int b = sc.nextInt();

            System.out.println("Okay! minus by 5 to it in your mind");
                    int c = sc.nextInt();

            System.out.println("Okay! multiply by 10 to it in your mind");
                    int d = sc.nextInt();

                    // now remove the number in your mind to get answer
            System.out.println(" now remove the number in your mind to get answer ");
                    char op = sc.next().charAt(0);
                    solve(a, b, c, d, op);

	}
    
    public static int solve(int a, int b, int c, int d, char op)
	{
		int ans = 0;
		// addition
		if (op == '+') {
			ans = a + b;
			// subtraction
		}
		else if (op == '-') {
			ans = a + b - c;
			// multiplication
		}
		else if (op == '*') {
			ans = a + b - c * d;
			// modulo
		}
		

		// printing the final result
		System.out.println("Your answer is - " + ans);
		return ans;
	}
      
}


