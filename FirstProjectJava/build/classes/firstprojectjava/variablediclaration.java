/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprojectjava;

import newpackage.NewClass;

/**
 *
 * @author Cakahal Johnson
 */
public class variablediclaration {
    variablediclaration(){
        // TODO code application logic here
        //System.out.println("my name is cakahal");
        
        String name = "i'm Cakahal";
        int age = 24;
        double per = 34.9; //it's also holds single numbers as well
        char a = 'r'; //it only holds a single alphbates
        float num = 123456789; //it only hold number from 1 to 9 numbers
        boolean isTrue = true;
        
        System.out.println(name);
        System.out.println(age);
        System.out.println(per);
        System.out.println(name);
        
        String my_name = "akahal"; //ways of decaring variables
        String myNameIs = "chinonso";
        
        //non permitive data type:
        //mostly for games
        String name1 = new String("Johnson");
        System.out.println(name1);
        
        //callin var from another imported file
        NewClass n = new NewClass();
        System.out.println(n.name);
    }
    
}
