/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejikeapp;

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
     JavaIO is just a way of creating a file in java, you will need to import
        Javaio.File package into your application and also java.io.IO.Exception 
        for catching of exceptions
        
        we opened a folder from our desktop then we opened the folder and copy
        the folder file paths...
    */
        
        //file extension in computer means the dot points that always ends a file path
//        example: notepad ends with .txt, .pdf, .doc, .html etc...
       String filename = "Ejike0_notepad1.html";
       String name2 = "Ejike_notepad.html";
       
       File file = new File ("C:\\Users\\JOHNSON\\Desktop\\New_folder\\"+filename); //then import
        try {
            if (!file.exists()) {
                file.createNewFile();
                JOptionPane.showMessageDialog(null, "Successfully Created" +file.getName());
            }else{
                JOptionPane.showMessageDialog(null, "File already Exists" +file.getName());
            }
            
            
//            to add a content
            String content = "This is a Java class Thank You! \n \r it's awesome to learn Java";
            FileWriter fw = new FileWriter(file,true); // then import
            BufferedWriter bw = new BufferedWriter(fw); //the import
            
            bw.write(content);
            bw.close();
            
//            To Read a file
            FileInputStream fis = new FileInputStream(file); //then import
            BufferedInputStream bis = new BufferedInputStream(fis); //then import
            
            while(bis.available() > 0){
                System.out.println((char)bis.read());
            }
            
            
            // HOW TO RENAME A FILE:
            File newFile = new File("C:\\Users\\JOHNSON\\Desktop\\New_folder\\"+name2);
//            boolean result = file.renameTo(newFile);
            
            if (!newFile.exists()) {
                file.renameTo(newFile);

                JOptionPane.showMessageDialog(null, "Successfully Renamed " +file.getName()); 
            }else{
                JOptionPane.showMessageDialog(null, "An Error occured " +file.getName());

            }
            
            //To Delect a File
//            boolean result2 = file.delete();
            
            if (!newFile.exists()) {
                newFile.delete();
                JOptionPane.showMessageDialog(null, "Successfully Deleted " +file.getName());
 
            }else{
                JOptionPane.showMessageDialog(null, "Failed To Delete " +file.getName());

            }
//            
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
      
       
    }
    
}
