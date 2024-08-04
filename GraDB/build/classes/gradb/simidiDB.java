/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cakahal Johnson
 */
public class simidiDB {
    simidiDB(){
        /*
        JAVA DATABASE CONNECTION
        
        JAVA uses JDBC (Java Database Connectivity) to connect to database
        it has a JDBC API, which is the programming part and a JDBC Driver Manager,
        
        which make your programms to connect to the JDBC database
        
        Java also allows you to connect to a wide-range database (Oracle, MySql, Firebase, Postgres...etc)
        
        This Database is also called JAVA DB, with a version of Apache Derby. it runs on virtual server,
        which you can stop and starts this DB from within NetBeans....
        
        DATABASE CREATION
        ...Click on window and services
        ...click on Database ---> Driver
        
        STARTING THE VIRTUAL SERVER:
        --Rightclick on Java Db and click start server
        --right click on Java Db and click Create database
        ...fill the form as follows:
        your Database name:
        Your Database Username
        Your Database password
        Your Database re-comfirm password
        
        --Right click on the Username you Created or derby//host...
        right click on it and connect or disconnect
        
        
        TABLE CREATION 
            --doubleclick on the database paths plus
        ---open the Db username from the + ---> TABLE right click to create table
       ...when the create table dialogue window open,
        ...type login-info on table name space
        
        NB: The should start with Integer, which is your Id. and primary Key checked
        
            --Creating Tables
            ***click on add column tab and type the following:
        key: checked
        index: checked
        Null: Unchecked
        Unique: checked
        Column Name: ID
        Data Type: Integer
        NB: we add based on what we have in our form...
        here you lick on Add column trab and type the following:
        Key: Unchecked
        index: Unchecked
        Null: Unchecked
        Unique: Unchecked
        Column name: first_Name
        Data Type: VARCHAR
        Size: 20
        
        Adding New Record to table:
        ---Right click on the Table name ...from the menu that appears
        ---click on view Data and new window will appear in the main NetBeans window
        ---Use the bottom half side of the window to enter new table rows
        ---To add a new row, click the icon with the green plus symbol, in the bottom half of the window:
        
        ---when you click the new row icon, a dialogue box appears:
        
        
        */
        
        //DEFAULT CONNENCT SETTING we use alt enter to import
        Connection con = null; ///and import connection
        Statement stm = null; ///and import statement
        ResultSet rs = null; ///and import ResultSet
        PreparedStatement ps = null; // and import PreparedStatement
        
        String url = "jdbc:derby://localhost:1527/DBgra";
        String uName = "root";
        String uPass = "root";
//        int currentIndex = 0;
//        DefaultTableModel tm; //and import tm
        
        
        try {
            
            con = DriverManager.getConnection(url, uName, uPass);
            stm = con.createStatement();
            ps = con.prepareStatement("SELECT * FROM dbSim");
            rs = ps.executeQuery();
                while(rs.next()){
                    String fname = rs.getString("Firstname");
                    System.out.println(fname);
                }
                
                //TO SAVING TO DATABASE
                ps = con.prepareStatement("INSERT INTO dbSim (id, FirstName, LastName, Salary) values(?,?,?,?)");
                ps.setInt(1, 1);
                ps.setString(2, "Cakahal");
                ps.setString(3, "Johnson");
                ps.setDouble(4, 50000);
                
                int status = ps.executeUpdate();
                
                if (status > 0) {
                    JOptionPane.showMessageDialog(null, "Successfully Saved!");
                
                }else{
                    JOptionPane.showMessageDialog(null, "Failed to Saved!");

                }
                
//                updating the Db
                ps = con.prepareStatement("UPDATE dbSim SET FirstName = ? LastName = ? Salary = ? where id = ?");
                ps.setString(1, "Simidi");
                ps.setString(2, "Chisimidi");
                ps.setDouble(3, 1000);
                ps.setInt(4, 2);
                
                int status2 = ps.executeUpdate();
                
                  if (status2 > 0) {
                    JOptionPane.showMessageDialog(null, "Successfully Saved!");
                
                }else{
                    JOptionPane.showMessageDialog(null, "Failed to Saved!");

                }
                  
                  ///Deleting our Db
                
              

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }
    
    
}
