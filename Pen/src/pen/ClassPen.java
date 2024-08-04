/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pen;

/**
 *
 * @author Cakahal Johnson
 */
public class ClassPen {
    String type = "gel";
    String color = "blue";
    int point = 10;
    
    static boolean clicked = true;
    
    public static void click(){
        clicked = true;
    }
    
    public static void unclick(){
        clicked = false;
    }
}
