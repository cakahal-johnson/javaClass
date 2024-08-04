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
public class childOOP {
    String type = "gel";
    String color = "blue";
    int point = 10;
    
    static boolean clicked = false;
    
    public static void click(){
        clicked = true;
        
    }
    
    public static void unclick(){
        clicked = false;
    }
}
