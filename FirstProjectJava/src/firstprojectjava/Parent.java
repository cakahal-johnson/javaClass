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
public class Parent {///Java, inheritance
    String land = "10 plots";
    private int wife = 1;//private is protected
    
    Parent(){
        child ch = new child();
        System.out.println(ch.land);
//        System.out.println(ch.wife); it won't wrk b'coz is protected
    }
    
}

class child extends Parent{//overloader is one it has more then constrctor nor DF param
        child(){
        
        }
        
        child(String name){///in overloading you just need to add param in other to call it out
        
        }
        
        //super.ver is the super key word in other to call the parent class

}
