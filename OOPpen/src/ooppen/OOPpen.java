/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooppen;

/**
 *
 * @author Cakahal Johnson
 */
public class OOPpen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PenChild p = new PenChild();
        
        System.out.println(p.color);
        System.out.println(p.point);
        System.out.println(p.type);
        
        System.out.println(p.clicked);
        
        
        p.click();
        
        System.out.println(p.clicked);
        
        OOPHead h = new OOPHead();
        
        System.out.println(h.charge);

    }
    
}
