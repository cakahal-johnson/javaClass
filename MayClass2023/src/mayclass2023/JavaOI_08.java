/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayclass2023;

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
public class JavaOI_08 {
    JavaOI_08(){
        
        /*
           Java IO: is just a way of creating a file in java, 
       Java files to be imported:
        javaio.File package and java.io.IO.Exception 
        
        Steps:
        We need a folder to copy the path: C:\Users\JOHNSON\Desktop\SnigglezClass
        we create the file name and end with extension type need i.e txt, doc, html....:
        */
        
        //here we create the file
        String filename = "juneClass.txt";
        
        //here we pass file variable into the Java package we need import
        File file = new File("C:\\Users\\JOHNSON\\Desktop\\SnigglezClass\\" + filename); // use alt enter key to import
        
        // here we try catch to hold the block code
        try{
            // here we check for codition if file is already in the folder
            if(!file.exists()){
                file.createNewFile();
                
                //here we pass a massage box
                JOptionPane.showMessageDialog(null, "wow! you've Successfully Created a file");
            }else{
                JOptionPane.showMessageDialog(null, "opps!! File already Exists");

            }
            
            // here we add content inside the FIle we create
            String content = "java is awesome to learn \n yes we need a new line";
            // here we execute the content
            FileWriter fw = new FileWriter(file, true); // import fileWriter
            
            // to append a doc you need to add the true value in other to keep the updating automatically
            //here we pass the file checking using BufferWriter
            BufferedWriter bw = new BufferedWriter(fw); // import BufferedWriter
            
            // here we pure the checked content into the file
            bw.write(content); // here we saved the file
            
            bw.close(); // we need the close the program
            
            // nest class we read the content in out terminal
            FileInputStream fis = new FileInputStream(file); // we need to import FileInputStream
            BufferedInputStream bis = new BufferedInputStream(fis); // we need to import BufferedInputStream
            
            while(bis.available() > 0){
                System.out.println((char) bis.read());
            }
            
            //Here we Rename the file to a new file name 
            String url = "C:\\Users\\JOHNSON\\Desktop\\SnigglezClass\\";
            String NewName = "updateJuneClass";
            
            // here we pass it to file
            File newFile = new File(url + NewName);
            
            //we need a boolen to to toggel the name
            boolean result = file.renameTo(newFile);
            
            if(result){
               JOptionPane.showMessageDialog(null, "Successfully Renamed");
            }else{
                JOptionPane.showMessageDialog(null, "No File Found!!!");

            }
            
            // Deleting The file
            
            // so we use a boolean to check for the Delete COndition
            boolean result2 = file.delete();
            
             if(result2){
               JOptionPane.showMessageDialog(null, "Successfully Deleted");
            }else{
                JOptionPane.showMessageDialog(null, "No File to Delete!!!");

            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    
    }// end of block code
} // end of public class
