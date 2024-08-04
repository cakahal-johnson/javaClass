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
public class GraDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new simidiDB();
        // TODO code application logic here
//        Connecting Java Database
        /*
        Java uses JDBC(Java Database Connectivity) to connect to database. 
        it has a JDBC API, which is the programming part and a JDBC Driver Manager, 
        which your programs use to connect to the database
        
        this also allows you to connect to a wide-range of databases (Oracle, MySql, Firebase, Postgres, etc)
        but we're going to use the in-built database you get with java/NetBeans software.
        
        the Database is called JAVA DB, a version of Apache Derby. it runs on virtual server,
        which you can stop and start from within NetBeans...
        
        DATABASE CREATION
        ...click on window and services
        ...click on Database ---> Driver
        
        STARTING THE VIRTUAL SERVER:
        ...Right clict on java DB and click on Start server
        ...To create database, right click on Java DB and click on Create database.
        ...file the form as follows:
            your Database name:
            your database Username:
            your database password
            you have to re-comfirm password:
        ...Right click on the Username you created or derby//host...
            on the right hand side of the window and click on connect to connect to the database created
        
        TABLE CREATION
        ...click on the database paths plus + created
        ...click on the username plus+ username created
        ...right click on Table and click on create table.
        ...when the create table dialogue window open,
        ...type login-info on table name space
        
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
        
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        PreparedStatement ps  = null;
        
        String url = "jdbc:derby://localhost:1527/DBgra";
//        String uName = "root";
//        String uPass = "root";
//        int currentIndex = 0;
//        DefaultTableModel tm;
        
        try{
        con = DriverManager.getConnection(url, "root", "root");
        stm = con.createStatement();
        ps = con.prepareStatement("SELECT * FROM worker");
        rs = ps.executeQuery();
            while(rs.next()){
                String fname = rs.getString("FirstName");
                System.out.println(fname);
            }
            
            //Creating 
            
            ///To Save to DataBase
            ps = con.prepareStatement("INSERT INTO worker (id, FirstName, LastName, Salary) values(?,?,?,?) ");
            ps.setInt(1,1);
            ps.setString(2, "Cakahal3");
            ps.setString(3, "Ben2");
            ps.setDouble(4, 20000);
            
            int status = ps.executeUpdate();
            
            if (status > 0) {
                JOptionPane.showMessageDialog(null, "Successfully Saved");                
            }else{
                JOptionPane.showMessageDialog(null, "Failed to Saved");                

            }
            
            
            //Updating the DB
//            
//            ps = con.prepareStatement("UPDATE worker SET Firstname = ?, LastName = ?, Salary = ? where id = ?");
//            ps.setString(1, "Chris");
//            ps.setString(2, "Obi");
//            ps.setDouble(3, 50000);
//            ps.setInt(4, 2);
//            
//            int status1 = ps.executeUpdate();
//            
//            if (status1 > 0 ) {
//                JOptionPane.showMessageDialog(null, "Successfully Updated");                
//
//            }else{
//               JOptionPane.showMessageDialog(null, "Failed to Update");                
//
//            }
//            
            
            ///Delete Section 
            ps = con.prepareStatement("DELETE FROM worker where id = ?");
            ps.setInt(1, 8);
            ps.executeUpdate();
            
            int status2 = ps.executeUpdate();
                if (status >= 0) {
                    JOptionPane.showMessageDialog(null, "Successfully Deleted");                
            }else{
                JOptionPane.showMessageDialog(null, "Failed to Delete");                

            }
        
        }catch(Exception e){
        e.printStackTrace();
        }
    }
    
}
