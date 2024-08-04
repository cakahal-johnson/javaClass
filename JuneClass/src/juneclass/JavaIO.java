/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juneclass;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Cakahal Johnson
 */
public class JavaIO {
    
    JavaIO(){
        /*
        JavaIO is just a way of creating a file in a java outside java class
        to use JavaIO we need import: javaio.File package and java.io.IO.Exception
        
        Steps:
        we need a folder outside then copy the path: 
        C:\Users\JOHNSON\Desktop\studentClass\AugustJavaClass
        
        */
        
        String filename = "augustIO.html";
        
        //we will File Object var and import it
        File file = new File("C:\\Users\\JOHNSON\\Desktop\\studentClass\\AugustJavaClass\\" +filename);
        // alt key and enter
        //here we use try
        try{
//            checking if file is already in the folder
            if(!file.exists()){
                file.createNewFile();
                JOptionPane.showMessageDialog(null, "Successfully created");
            }else{
                JOptionPane.showMessageDialog(null, "File already Exists");
            }
            
            
//            here we add a content into the file
            String content = "Java is awesome to learn \nYes you guy's is doing well!!";
            
//            //here we execute the file content using FileWriter
            FileWriter fw = new FileWriter(file, true); // alt key to import
            
//            we Buffer the content with BufferWriter in check the safety
            BufferedWriter bw = new BufferedWriter(fw); // import using alt key
            
//            we use write method to write the content
            bw.write(content); // here we are saved the file
            bw.close();
            
            // Next class we read the content in the terminal
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
            
    }
    
}
