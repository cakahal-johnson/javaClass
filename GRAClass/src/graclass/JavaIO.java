/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graclass;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Cakahal Johnson
 */
public class JavaIO {
    JavaIO(){
        
        
        /*
        JAVA IO: is just a way of creating a file in java, you will need to 
        import Javaio.File package into your application and also 
        java.io.IO.Exception for catching of exceptionss
        */
        
        String filename = "testing.html";
        String name2 = "testingJavaIO2.txt";
        
        File file = new File ("C:\\Users\\JOHNSON\\Desktop\\javaIO\\"+filename);
        try{
            if(!file.exists()){
                file.createNewFile();
                
                JOptionPane.showMessageDialog(null, "Successlly Created the bad guy");
            }else{
                JOptionPane.showMessageDialog(null, "File already Exists");
            }
            
//            String content = "Obi is a boy and we are learning \n JAVAIO";
//            FileWriter fn = new FileWriter(file);///true is when you want to append
//            BufferedWriter bw = new BufferedWriter(fn);
//            
//            bw.write(content);
//            bw.close();
            
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            
            while(bis.available() > 0){
                System.out.println((char) bis.read());
            }
            
            File newFile = new File("C:\\Users\\JOHNSON\\Desktop\\javaIO\\"+name2);
            
            boolean result = file.renameTo(newFile);
            
            if(result){
                JOptionPane.showMessageDialog(null, "Successfully renamed");
            }else{
                JOptionPane.showMessageDialog(null, "Oops!No file found!");
            }
            
            
            boolean result2 = file.delete();
             
            if (result2) {
                JOptionPane.showMessageDialog(null, "Successfully Deleted");
            }else{
                JOptionPane.showMessageDialog(null, "Oops! Failed ");
            }
                               
            
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    
}
