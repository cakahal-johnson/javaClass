/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprojectjava;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.lang.Exception;
import javax.swing.JOptionPane;

/**
 *
 * @author Cakahal Johnson
 */
public class JavaIO {
    JavaIO(){
        //you need to import java.io.File; alt+enter
        //import java.lang.Exception
        //open folder in the desktop open it and copy the Url
      String fileName = "javaio.txt";
      String name2 = "javaio2.txt";
      
        File file = new File ("C:\\Users\\JOHNSON\\Desktop\\javaIO\\"+fileName);
        try{
            if(!file.exists()){
                file.createNewFile();
                
                JOptionPane.showMessageDialog(null, "Successfully created");//import javax.swing.JOptionPane
            }else {
                   JOptionPane.showMessageDialog(null, "file already Exists");
            }
            
            String content = "Obi is a boy and we are learning\nyes testing";
            FileWriter fw = new FileWriter(file,true);//import java.io.FileWriter;
            //to apend a doc you need to add the true value in other to keep updating automatically
            BufferedWriter bw = new BufferedWriter(fw);//import java.io.BufferedWriter;
            
            bw.write(content);//this is save the content
            bw.close();
            
            
            //to read a file
            
            FileInputStream fis = new FileInputStream(file); //import
            BufferedInputStream bis = new BufferedInputStream(fis);
          
            while( bis.available() > 0){
                System.out.print((char)bis.read());
            }
//            
            // to rename a file
            
//            File newFile = new File("C:\\Users\\JOHNSON\\Desktop\\javaIO\\"+name2);
//            boolean result = file.renameTo(newFile);
//            
//            if(result){
//                JOptionPane.showMessageDialog(null, "Successfully renamed");
//            }else{
//                JOptionPane.showMessageDialog(null, "Error occured");
//            }
            
            // to delete
            
            boolean result2 = file.delete();
            
                if(result2){
                    JOptionPane.showMessageDialog(null, "Successfully deleted");
                }else{
                    JOptionPane.showMessageDialog(null, "failed Deleted");
                }
            
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
    }
    
}
