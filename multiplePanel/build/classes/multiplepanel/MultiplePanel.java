/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplepanel;

import javax.swing.JFrame;

/**
 *
 * @author Cakahal Johnson
 */
public class MultiplePanel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Splash splash = new Splash();
        splash.setVisible(true);
        MultipleScreen1 ms = new MultipleScreen1();
       
        
        try {
            for(int i = 0; i <= 100; i++){
                Thread.sleep(30);
                splash.loadnum.setText(Integer.toString(i)+"%");
                splash.loadbar.setValue(i);
                
                if(i == 100){
                    splash.setVisible(false);
                    ms.setVisible(true);
                }
            }
        } catch (Exception e) {
        }
        
    }
    
}
