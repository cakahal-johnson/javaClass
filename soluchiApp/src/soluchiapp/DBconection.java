/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soluchiapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Cakahal Johnson
 */
public class DBconection {
    
    DBconection(){
        /*
        5 steps to connect to JavaDatabase
        
        Register the Driver class
        Create connection
        Create Statement
        Execute queries
        close connection
        
        DRIVER is connected at the Libraries package
        
        Connection: is method of DriverManager class which is used to establish connection with the 
        database, which will also imported
        
        Stetament: is method of Connection interface which is used to create statement, 
        here the object of statemet is resposible to execute queries with the database
        which will also be imported
        
        Execute queries: is method for the Statement interface which is used to execute queries to the database
        this method returns the object of ResultSet that can be used to get all the recodes of the table
        
        close() is used to close the connection
        
        */
        
        Connection con = null; // we use alt enter key to import
        Statement stm = null;  // we use alt enter key to import
        // ResultSet interface: maintains a cursor pointing to a row of a table, initially
//        corsor points before the first row
        
        ResultSet rs = null; // we import using alt enter
        
        PreparedStatement ps = null; // we import 
        // jdbc:derby://localhost:1527/AugustDb [root on ROOT]
        String url = "jdbc:derby://localhost:1527/AugustDb";
        String Username = "root";
        String Password = "root";
        
        try{
            
            con = DriverManager.getConnection(url, "root", "root");
            
            /*
            The DriverManager class is the component of JDBC API and also a member of the
            java.sql package. The DriverManager class acts as an interface between users
            and drivers. It keeps track of the drivers that are available and handles 
            establishing a connection between a database and the appropriate driver. 
            It contains all the appropriate methods to register and deregister the 
            database driver class and to create a connection between a Java application
            and the database. The DriverManager class maintains a list of Driver classes
            that have registered themselves by calling the method DriverManager.registerDriver().
            Note that before interacting with a Database, it is a mandatory process to register 
            the driver; otherwise, an exception is thrown.
            
            */
            
            stm = con.createStatement();
            ps = con.prepareStatement("SELECT * FROM Salary"); // Table Name
            /*
            Creates a PreparedStatement object for sending parameterized SQL statements to the 
            database.A SQL statement with or without IN parameters can be pre-compiled and 
            stored in a PreparedStatement object. This object can then be used to efficiently
            execute this statement multiple times.
            */
            rs = ps.executeQuery();
            
            // Printing out Data from the DataBase
            while(rs.next()){
                String Name = rs.getString("Name");  // columnLabel
                double salary = rs.getDouble("salary"); //columnLabel
                System.out.println(Name);
                System.out.println(salary);
            }
            
            //Inserting into the database
            
//           ps = con.prepareStatement("INSERT INTO Salary (id, Name, salary) values (?,?,?) ");
//           ps.setInt(1, 3);
//           ps.setString(2, "Soluchi OBI");
//           ps.setDouble(3, 1000);
//           
//           int status = ps.executeUpdate();
//           
//           if(status > 0){
//               JOptionPane.showMessageDialog(null, "Name Successully Added!");
//           }else{
//               JOptionPane.showMessageDialog(null, "Failed to save");
//           }
           
           // Updating / editing the database
           ps = con.prepareStatement("UPDATE Salary SET Name=?, salary=?, WHERE id=?");
           ps.setString(1, "Somoto Mba");
           ps.setDouble(2, 2000);
           ps.setInt(1, 3);
           
           int status = ps.executeUpdate();
           
           if(status > 0){
               JOptionPane.showMessageDialog(null, "Name Successully Updated!");
           }else{
               JOptionPane.showMessageDialog(null, "Failed to Update");
           }
           
            
        }catch(Exception e){
            e.printStackTrace();
            /*
            Prints this throwable and its backtrace to the standard error stream. 
            This method prints a stack trace for this Throwable object on the error
            output stream that is the value of the field System.err. The first line 
            of output contains the result of the Throwable.toString() method for this
            object. Remaining lines represent data previously recorded by the method 
            Throwable.fillInStackTrace(). The format of this information depends on 
            the implementation, but the following example may be reg
            */
            
            
        }
            
        
  
        
        
        
    }
    
}
