/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cllifclass;

/**
 *
 * @author Cakahal Johnson
 */
public class CllifClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Outputs in Java
        System.out.println("Cakahal Johnson");
        System.out.println("hello world"); // Ln means a new line
        System.out.print("tell me the difference");
        System.out.println("new line \n");
        
//        let's talk about Java Comment;
        /*
            Java Comments: is used for documentation of our code line which will
        be active in this development mode (offine mode) both not in production 
        mode (server mode)
        
        we have two types:
            single line comment // double slah
        and multi-line comment / * * /
        
        shortcut for comment ctrl / inside the code line and also to uncomment it
        
        */
        
        // Connecting to others Java Class just like the next page of your project
        /*
        connection the main class and child class:
        1)    we have to hold them as JavaClassName() using "new as keyword surfix"
        
        2) having them as Objects: 
                variable var = new Variable()
        
        after this checking if the connection is right
        we use : ctrl + clicking on it
        
        */
        
        // new variableClass(); // connectin in the same source package
        
       // variableClass vc = new variableClass(); // connectin in the d/f  source package
        new Operators_02();
        
        
    }
    
}
