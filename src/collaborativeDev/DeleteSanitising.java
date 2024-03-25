/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collaborativeDev;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alberto Peinador Blanco
 * 
 * Class to delete orders from the DB by id
 * child of DeleteData class
 */
public class DeleteSanitising extends DeleteData {
    
    /**
     * 
     * @param sanitisingID passes an id value to delete the subscription associated
     */ 
    @Override
    public void deleteData(String sanitisingID) {
        
         try{
                 
            String sql = "DELETE FROM tb_sanitising WHERE id = ?";
                        
            PreparedStatement pS = con.prepareStatement(sql);

            pS.setString(1,sanitisingID);
            pS.executeUpdate();    
                
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, "Error " + e);
        }  
        
        
    }
    
}
