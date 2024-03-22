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
 * Class to delete customer notes from the DB
 * child of DeleteData class
 */
public class DeleteItem extends DeleteData{
    
    /**
     * 
     * @param noteID passes an id value to delete the note associated
     */
    @Override
    public void deleteData(String noteID) {
        
        try{
                 
            String sql = "DELETE FROM tb_items WHERE id = ?";
                        
            PreparedStatement pS = con.prepareStatement(sql);

            pS.setString(1,noteID);
            pS.executeUpdate();    
                
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, "Error " + e);
        }  
        
        
    }
    
}
