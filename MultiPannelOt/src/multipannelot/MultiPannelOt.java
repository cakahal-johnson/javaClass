/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multipannelot;

/**
 *
 * @author Cakahal Johnson
 */
public class MultiPannelOt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        loader loadd = new loader();
        loadd.setVisible(true);
        TheMainApp ma = new TheMainApp();
        
        try{
            for(int i = 0; i <= 100; i++){
                Thread.sleep(30);
                loadd.loadnumm.setText(Integer.toString(i)+ "%");
                loadd.loadbarr.setValue(i);
                
                if(i == 100){
                    loadd.setVisible(false);
                    ma.setVisible(true);
                }
                
            }
            
        }catch (Exception e){
            
        }
            
    }
    
}
