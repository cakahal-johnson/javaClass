/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejikeapp;

//import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author Cakahal Johnson
 */
public class dbConnection {
   dbConnection(){
        Connection con = null; //we use alt enter key to import or use .* to import all 
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    String username = "root";
    String password = "root";
    
    String url = "jdbc:derby://localhost:1527/money";
    
    // we use try and catch
   try{
        con = DriverManager.getConnection(url, "root", "root");
        stm = con.createStatement();
        ps = con.prepareStatement("select * from cash");
        rs = ps.executeQuery();
        while(rs.next()){
            String FirstName = rs.getString("firstName");
            System.out.println(FirstName);
        }
        
        ps = con.prepareStatement("INSERT INTO cash(id, firsName, lastName) values(????)");
        
    }catch(Exception e){
        e.printStackTrace();
    } 

    }
            
}
