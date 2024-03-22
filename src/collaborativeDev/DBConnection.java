package collaborativeDev;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Alberto Peinador Blanco
 * 
 * Class to connect to the DB
 * created from IDBconnection interface
 */
public class DBConnection implements IDBConnection{
    
    /**
     * 
     * @return returns the DB connection
     */
   
    @Override
    public Connection dbConnect(){
        
        return Connect();
    }
    
    public static Connection Connect() {
        
        try{
            Class.forName("org.sqlite.JDBC");
           
            Connection conn = DriverManager.getConnection("jdbc:sqlite:CollaborativeDev.DB.db");
            return conn;
        }
        catch(ClassNotFoundException | SQLException e){
           
            JOptionPane.showMessageDialog(null, "Error " + e);

            return null;
        }
    }
    
}
