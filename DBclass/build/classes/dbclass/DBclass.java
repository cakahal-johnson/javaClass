/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbclass;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Cakahal Johnson
 */
public class DBclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = null;
            Statement stm = null;
            ResultSet rs = null;
            PreparedStatement ps = null;
            String url = "jdbc:derby://localhost:1527/employee";
            
            try{
                con = DriverManager.getConnection(url, "root", "root");
                    stm = con.createStatement();
                    ps = con.prepareStatement("select * from employee");
                    rs = ps.executeQuery();
                    while(rs.next()){
                        String fname = rs.getString("FirstName");
                        System.out.println(fname);
                    }
                    
                    //////TO SAVE TO DATABASE/////////
                    
                ps = con.prepareStatement("INSERT INTO employee(id, FirstName, LastName,Salary)values(?,?,?,?)");
                    ps.setInt(1, 5);
                    ps.setString(2, "Mark");
                    ps.setString(3, "Ben");
                    ps.setDouble(4, 5000);
                    
                    int status = ps.executeUpdate();
                    
                    if(status > 0){
                        JOptionPane.showMessageDialog(null, "Successfully Saved");
                    }else{
                        JOptionPane.showMessageDialog(null, "Failed to save");
                    }
                
                 
                    ////////////UPDATE DB/////////////
                    ////////UPDATE QUERY/////////////
                    
//                 ps=con.prepareStatement("UPDATE employee SET FirstName =?, LastName = ?, Salary = ? where id = ?");
//                    ps.setString(1, "Chike");
//                    ps.setString(2, "N");
//                    ps.setDouble(3, 10000);
//                    ps.setInt(4, 2);
//                    
//                    int status1 = ps.executeUpdate();
//                        if(status1 > 0){
//                            JOptionPane.showMessageDialog(null, "Successfully UPDATED");
//                            
//                    }else{
//                            JOptionPane.showMessageDialog(null, "Failed to UPDATE");
//                            
//                    }
                    
                 /////DELETE SECTION HERE//////
                    
                ps=con.prepareStatement("DELETE FROM employee where id = ?");
                    ps.setInt(1, 4);
                    ps.executeUpdate();
                    int status2 = ps.executeUpdate();
                        if(status >= 0){
                            JOptionPane.showMessageDialog(null, "Successfully DELETED"); 
                        }else{
                            JOptionPane.showMessageDialog(null, "Failed to DELETE");
                        }
                        
                    
                    
            }catch(Exception e){
                e.printStackTrace();
                
            }
    }
    
}
