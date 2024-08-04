/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprojectjava;
import java.lang.Math; //in other to use the math oparetorsit
import java.util.Scanner; //its is use for collecting from the console.

/**
 *
 * @author Cakahal Johnson
 */
public class Oparetors {
    
    Oparetors(){
    
    String myName = "cakahal";
    
    int i = 100;
    int ii = 200;
    
    int ans = i + ii;
    int ans2 = i - ii;
    int ans3 = i * ii;
    int ans4 = i / ii;
    int ans5 = i % ii;
    
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
        System.out.println(ans5);
        

    int j = 5; 
    //int ans6 = ++j; or int ans6 = j++
    int ans7 = --j; //or j--
        System.out.println(ans7);

            
            double s9 = Math.sqrt(9); //squreroot: you have to import Math
            
            System.out.println(s9);
            
             int base = 3;
            //exponent = 4;

    long result = 1;

    for (int exponent = 0; exponent != 0; --exponent) {
      result *= base;
    }

    System.out.println("Answer = " + result);
            
//            Scanner sc = new Scanner (System.in); // you have import Scanner
//            //its is use for collecting data from the console.
//            
//            System.out.println("Enter your First Name");
//            String fname = sc.nextLine();
//            System.out.println("Enter your last name");
//            String lname = sc.nextLine();
//            System.out.println("Enter your last name");
//            String sname = sc.nextLine();
//            
//            System.out.println("Your full name is"+ fname +" "+ lname+" "+sname);
            
//           Scanner input = new Scanner (System.in);
//            System.out.print("Input the first number for add: ");
//                int num1 = input.nextInt();
//                System.out.print("Input the second number for add: ");
//                int num2 = input.nextInt();
//                int sum = num1 + num2;
//                System.out.println();
//                System.out.println("Sum: "+sum);
//            
//          
////            System.out.println("Enter your last name");
////            String lname = sc.nextLine();
////            System.out.println("Enter your last name");
////            String sname = sc.nextLine();
//            
//            //System.out.println("Your full name is"+ sum); 
//            
//            //another methods4 is here!
//            
//            //class add
//    
//            {
//                int a,b;
//                Scanner sc=new Scanner(System.in);
//                System.out.println("Enter first number for add2");
//                a=sc.nextInt();
//                System.out.println("Enter second number for add2");
//                b=sc.nextInt();
//                int c=a+b;
//                System.out.println("Addition of two numbers is : "+c);
//            }
//            
//            //class sub
//            {
//                int a,b,c;
//                Scanner s=new Scanner(System.in);
//                System.out.println("Enter first number for sub");
//                a=s.nextInt();
//                System.out.println("Enter second number for sub ");
//                b=s.nextInt();
//                if(a>b)
//                        c=a-b;
//                else
//                        c=b-a;
//                System.out.println("Subtraction of two numbers is : "+c);
//            }
//            
//            //class multi
//            {
//                int x,y;
//                Scanner sc=new Scanner(System.in);
//                System.out.println("Enter first number");
//                x=sc.nextInt();
//                System.out.println("Enter first number");
//                y=sc.nextInt();
//                int z=x*y;
//                System.out.println("Multiplication of two numbers is : "+z);
//            }
//            
//            //class div
//            {
//                int n,d,res;
//                Scanner sc=new Scanner(System.in);
//                System.out.println("Enter numerator value");
//                n=sc.nextInt();
//                System.out.println("Enter denominator value");
//                d=sc.nextInt();
//                if(d!=0)
//                {
//                res=n/d;
//                System.out.println("Division of two numbers is : "+res);
//                }
//                else
//                System.out.println("denominator value should not be 0");
//            }
            
            

            
            
           
    
    }


            
    //static void print()
    //static void main(String[] args) {

   
    //}
    
//     static void main(String[] args) {
//
//    int base = 3, exponent = 4;
//
//    long result = 1;
//
//    while (exponent != 0) {
//      result *= base;
//      --exponent;
//    }
//
//    System.out.println("Answer = " + result);
//  }
}

//assignment solve for power
//use scanner for + - * / %