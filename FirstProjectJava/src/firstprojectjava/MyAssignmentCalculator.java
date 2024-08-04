/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprojectjava;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Cakahal Johnson
 */
public class MyAssignmentCalculator {
    
    MyAssignmentCalculator(){
        
        
        ///assignment that displays a Multiplication_Table

//        Scanner s = new Scanner(System.in);
//	System.out.print("Enter number:");        
//	int n=s.nextInt();
//        for(int i=1; i <= 10; i++)
//        {
//            System.out.println(n+" * "+i+" = "+n*i);
//        }
        
        
        ///Write a program that computes your initials from your full name 
        ///and displays them.
        
        ///assignment that displays Even number
        
//        String name = "John Matthew Adams";
//      System.out.println("The full name is: " + name);
//      System.out.print("Initials with surname is: ");
//      int len = name.length();
//      name = name.trim();
//      String str1 = "";
//      for (int i = 0; i < len; i++) {
//         char ch = name.charAt(i);
//         if (ch != ' ') {
//            str1 = str1 + ch;
//         } else {
//            System.out.print(Character.toUpperCase(str1.charAt(0)) + ". ");
//            str1 = "";
//         }
//      }
//      String str2 = "";
//      for (int j = 0; j < str1.length(); j++) {
//         if (j == 0)
//            str2 = str2 + Character.toUpperCase(str1.charAt(0));
//         else
//            str2 = str2 + Character.toLowerCase(str1.charAt(j));
//      }
//      System.out.println(str2);
        
      
      ///assignment that displays Even number
//        int number=100;  
//        System.out.print("List of even numbers from 1 to "+number+": ");  
//        for (int i=1; i<=number; i++)   
//        {  
//        //logic to check if the number is even or not  
//        //if i%2 is equal to zero, the number is even  
//        if (i%2==0)   
//        {  
//        System.out.print(i + " ");  
//        }  
//        }  
        
        
      ///assignment that displays Even number
//        int number=100;  
//            System.out.print("List of odd numbers from 1 to "+number+": ");  
//            for (int i=1; i<=number; i++)   
//            {  
//            //logic to check if the number is odd or not  
//            //if i%2 is not equal to zero, the number is odd  
//            if (i%2!=0)   
//            {  
//            System.out.print(i + " ");  
//            }  
//            }  
        
//        int[] array_nums = {5, 7, 2, 4, 9};
//	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
//	int ctr = 0;
//	for(int i = 0; i < array_nums.length; i++)
//	{
//		if(array_nums[i] % 2 == 0)
//			ctr++;
//	}
//	System.out.println("Number of even numbers : "+ctr);
//	System.out.println("Number of odd numbers  : "+(array_nums.length-ctr));
        
        //print out the odd numbers and the even numbers in 100 - 100
        
        
 }
        
//        Scanner sc = new Scanner(System.in);
//        int num = 20;
//        switch(num){
//            case 10:
//                System.out.println("Number is 10");
//                break;
//            case 20:
//                System.out.println("Number is 20");
//                break;
//            case 30:
//                System.out.println("Number is 30");
//            default:
//                System.out.println("Non of the above");
//                break;
//        }
//        
//        for(int i = 0; i < 10; i++){
//            System.out.println(i);
//        }
//        
//        int age = 0;
//        while(age < 50){
//            System.out.println(age);
//            age++;
//        }
        
//        Scanner sc = new Scanner(System.in);
//
//		// taking input from the user using the Scanner
//		// class
//		System.out.print(
//			"Enter the first and the Second number - ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//
//		// selecting the operand for the calculations
//		System.out.print(
//			"Choose and Enter the type of operation you want to perform (+, -, *, /, %) - ");
//		char op = sc.next().charAt(0);
//		solve(a, b, op);
//		
//	}
//	public static int solve(int a, int b, char op)
//	{
//		int ans = 0;
//		// addition
//		if (op == '+') {
//			ans = a + b;
//			// subtraction
//		}
//		else if (op == '-') {
//			ans = a - b;
//			// multiplication
//		}
//		else if (op == '*') {
//			ans = a * b;
//			// modulo
//		}
//		else if (op == '%') {
//			ans = a % b;
//			// division
//		}
//		else if (op == '/') {
//			ans = a / b;
//		}
//
//		// printing the final result
//		System.out.println("Your answer is - " + ans);
//		return ans;
//	}
        
//        for the mindGame...
        
//        Scanner sc = new Scanner(System.in);
        

	// Telling the user to Hold a number in mind
//            System.out.println("Hi there! just pick a number in your mind ");
//
//            System.out.println("Okay! Add 7 to it in your mind");
//                    int a = sc.nextInt();
//    		int b = sc.nextInt();
//            System.out.println("Okay! Add 10 to it in your mind");
//                    int b = sc.nextInt();
//
//            System.out.println("Okay! minus by 5 to it in your mind");
//                    int c = sc.nextInt();
//
//            System.out.println("Okay! multiply by 10 to it in your mind");
//                    int d = sc.nextInt();
//
//                    // now remove the number in your mind to get answer
//            System.out.println(" now remove the number in your mind to get answer ");
//                    char op = sc.next().charAt(0);
//                    solve(a, b, c, d, op);
//
//	}
//
//        public static int solve(int a, int b, int c, int d, char op)
//	{
//		int ans = 0;
//		// addition
//		if (op == '+') {
//			ans = a + b;
//			// subtraction
//		}
//		else if (op == '-') {
//			ans = a + b - c;
//			// multiplication
//		}
//		else if (op == '*') {
//			ans = a + b - c * d;
//			// modulo
//		}
////		
//
//		// printing the final result
//		System.out.println("Your answer is - " + ans);
//		return ans;
//	}
//        
        
//     other guess scanners
        //        public class GuessingGame {
        //  public static final int MAX = 100;
        //  public static void main(String[] args) {
        //  Scanner console = new Scanner(System.in); //to use scanner
        //  Random r = new Random(); //to use random numbers
        //
        //  intro(); 
        //  int totalGuesses = guess(console, r); 
        //
        //  System.out.print("Do you want to play again? ");
        //  String answer = console.next();
        //  int plays = 1;
        //  //while loop reads user input and determines wether 
        //  //or not to play the game again
        //  while(answer.charAt(0) == 'y' || answer.charAt(0) == 'Y') {  
        //     System.out.println(); 
        //     guess(console, r); 
        //     System.out.print("Do you want to play again? ");  
        //     answer = console.next();
        //     plays++;  
        //  } 
        //  System.out.println();
        //  results(plays, totalGuesses); 
        //  }     
        //
        //      }
        //
        //       //method that creates the guessing game and congratulatory message
        //     public static int guess(Scanner console, Random r) {
        //      System.out.println("I'm thinking of a number between one and " + MAX + "...");
        //        int theNumber = 50; //creates a random answer between one and the MAX       class constant
        //
        //     int userGuess = 0;//establishes the integer for the user's guess
        //    int guesses = 0; //establishes the amount of guesses 
        //     int totalGuesses = 0;
        //    while(userGuess != theNumber) { //while loop that executes until answer is correct
        //     System.out.print("Your guess? ");
        //     userGuess = console.nextInt();
        //     if(userGuess > theNumber) {
        //        System.out.println("It's lower.");
        //     } else if (userGuess < theNumber) {
        //        System.out.println("It's higher.");
        //     }
        //     guesses++;        
        //  }
        //  if(guesses == 1) {
        //     System.out.println("You got it right in 1 guess!");
        //  } else {
        //     System.out.println("You got it right in " + guesses + " guesses!");
        //  }
        //  totalGuesses += guesses;
        //  return totalGuesses; 
        //   }
        //
        //   //prints out the stats of the game
        //   public static void results(int plays, int totalGuesses) {
        //      System.out.println("Overall results:");
        //      System.out.println("Total games = " + plays);
        //      System.out.println("Total guesses = " + totalGuesses);
        //      System.out.println("Guesses/game = ");
        //      System.out.println("Best game = ");
        //   }
        //
        //}    other guess scanners
        //        public class GuessingGame {
        //  public static final int MAX = 100;
        //  public static void main(String[] args) {
        //  Scanner console = new Scanner(System.in); //to use scanner
        //  Random r = new Random(); //to use random numbers
        //
        //  intro(); 
        //  int totalGuesses = guess(console, r); 
        //
        //  System.out.print("Do you want to play again? ");
        //  String answer = console.next();
        //  int plays = 1;
        //  //while loop reads user input and determines wether 
        //  //or not to play the game again
        //  while(answer.charAt(0) == 'y' || answer.charAt(0) == 'Y') {  
        //     System.out.println(); 
        //     guess(console, r); 
        //     System.out.print("Do you want to play again? ");  
        //     answer = console.next();
        //     plays++;  
        //  } 
        //  System.out.println();
        //  results(plays, totalGuesses); 
        //  }     
        //
        //      }
        //
        //       //method that creates the guessing game and congratulatory message
        //     public static int guess(Scanner console, Random r) {
        //      System.out.println("I'm thinking of a number between one and " + MAX + "...");
        //        int theNumber = 50; //creates a random answer between one and the MAX       class constant
        //
        //     int userGuess = 0;//establishes the integer for the user's guess
        //    int guesses = 0; //establishes the amount of guesses 
        //     int totalGuesses = 0;
        //    while(userGuess != theNumber) { //while loop that executes until answer is correct
        //     System.out.print("Your guess? ");
        //     userGuess = console.nextInt();
        //     if(userGuess > theNumber) {
        //        System.out.println("It's lower.");
        //     } else if (userGuess < theNumber) {
        //        System.out.println("It's higher.");
        //     }
        //     guesses++;        
        //  }
        //  if(guesses == 1) {
        //     System.out.println("You got it right in 1 guess!");
        //  } else {
        //     System.out.println("You got it right in " + guesses + " guesses!");
        //  }
        //  totalGuesses += guesses;
        //  return totalGuesses; 
        //   }
        //
        //   //prints out the stats of the game
        //   public static void results(int plays, int totalGuesses) {
        //      System.out.println("Overall results:");
        //      System.out.println("Total games = " + plays);
        //      System.out.println("Total guesses = " + totalGuesses);
        //      System.out.println("Guesses/game = ");
        //      System.out.println("Best game = ");
        //   }
        //
        //}
    }    

