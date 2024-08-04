/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbtesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Cakahal Johnson
 */
public class DbTesting {

    /**
     * @param args the command line arguments
     */
    
    static final String Db_url = "jdbc:derby://localhost:1527/newDb";
    static final String User = "cakahal";
    static final String Pass = "123";
    
    
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        //Open a connection
        
        try(Connection conn = DriverManager.getConnection(Db_url, User, Pass);
                Statement smt = conn.createStatement();
                ){
                String sql = "CREATE TABLE REGISTRATION "+
                        "(id INTEGER not NULL, "+
                        " username VARCHAR(25), "+
                       " email VARCHAR(25 ) "+
                        " PRIMARY KEY (id))";
                
                smt.executeUpdate(sql);
                System.out.println("Created table in the given database...");
            
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
}
