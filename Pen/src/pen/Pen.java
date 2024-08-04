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
public class Pen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ///calling out class from another package
        
        ClassPen p = new ClassPen();
        
        System.out.println("We are using a "+p.color +" pen");
        System.out.println("which has a "+p.point +" point ball");
        System.out.println("Our Pen type is "+p.type +" Ball pen");
        
        System.out.println("====please click your pen to wirte========");
        System.out.println("we just turn oN our pen to wirte " +p.clicked);
                p.unclick();

        
        System.out.println("====please unclick your pen we are done========");
        System.out.println("we have off our pen " +p.clicked);
        
        
        
        HeadPhone h = new HeadPhone();
        System.out.println(h.colour);
        System.out.println(h.charger);
        
        System.out.println(h.power);
        h.powerOn();
        System.out.println(h.power);
        

        
        
    }
    
}
