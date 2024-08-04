/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acclass;

//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.PreparedStatement;
//import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;




/**
 *
 * @author Cakahal Johnson
 */
public class DBconnection {
    
    DBconnection(){
            Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    String url = "jdbc:derby://localhost:1527/mayClass";
    
    String uName = "root";
    String uPass = "root";
    
    try{
        con = DriverManager.getConnection(url, "root", "root");
        stm = con.createStatement();
        ps = con.prepareStatement("SELECT * FROM student");
        rs = ps.executeQuery();
        
        while(rs.next()){
            String fname = rs.getString("firstName");
            System.out.println();
        }
        
        // let save to database
        ps = con.prepareStatement("INSERT INTO student (id, firstName, lastName, salary) values(?,?,?,?) ");
        ps.setInt(1,2);
        ps.setString(2, "Peter");
                ps.setString(3, "Obi");
        ps.setInt(4, 40000);
        
        int status = ps.executeUpdate();
        
        if(status > 0){
            JOptionPane.showMessageDialog(null," Successfully saved!");
        }else{
            JOptionPane.showMessageDialog(null," Failed to save!");
            
        }
        
        // Updating
        ps = con.prepareCall("UPDATE student SET firstName = ?, lastName = ?, Salary = ? where id = ?");
        ps.setString(1, "Joy");
        ps.setString(2, "nneoma");
        ps.setInt(3, 80000);
        ps.setInt(1, 2);
        
        int status1 = ps.executeUpdate();
        
        if(status1 > 0){
            JOptionPane.showMessageDialog(null," Successfully saved!");
        }else{
            JOptionPane.showMessageDialog(null," Failed to save!");
            
        }            
        

    
    }catch(Exception e){
    e.printStackTrace();
    }
    
    
}
    }
    

