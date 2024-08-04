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
public class HeadPhone {
    String charger = "Micro sub";
    String[] controls = {"power", "volume", "skip", "play/pause"};
    String colour = "Red/Black";
    
    static boolean power = false;
    static int volume = 0;
    
    public static void powerOn(){
        power = true;
    }
    
    public static void powerOff(){
        power = false;
        
    }
    
    public static void volumeUp(){
        volume++;
        
    }
    
    public static void volumeDown(){
        volume--;
    }
    
}
