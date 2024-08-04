/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprojectjava;

/**
 *
 * @author Cakahal Johnson
 */
public class OOPobject2 {
    OOPobject2(){
        Calculator cal = new Calculator ();
        cal.add();
        
        double ans = cal.addTwoNum();
        System.out.println(ans);
        
        double ans2 = cal.sum(10, 8);
        System.out.println(ans2);
        
        double ans3 = cal.sum2(10, 8, false);
        System.out.println(ans2);
        
        System.out.println(cal.calculator(45, 45, "+"));
    }
    
}

class Calculator{
    public void add(){
        System.out.println(2+2);
        
    }
    
    double addTwoNum(){// a return type methods
        return 3+3;
    }
    
    double sum(int num1, int num2){// this sections takkes parameters in other
        //to make it dinamic by just chaging the + to *
        return num1 + num2; 
    }
    
     double sum2(int num1, int num2, boolean isAdd){// this sections takkes parameters in other
        //to make it dinamic by just chaging the + to *
         if(isAdd){
             return num1 + num2;
         }
        return num1 * num2; //return in any code stops the excution as well    
    }
     
     double calculator(int num1, int num2, String operator){
         switch (operator){
             case "+":
             return num1 + num2;
             case "*":
                 return num1 * num2;
             case "/":
                 return num1 / num2;
             case "-":
                 return num1 * num2;
             case "%":
                 return num1 % num2;
             default:
                 return -1;
            } 
                 
         }
          
        
        
    
}

//methods and functions 