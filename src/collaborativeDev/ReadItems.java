/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collaborativeDev;

import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alberto Peinador Blanco
 * 
 * Class to read notes from the DB
 * child of ReadData class
 */
public class ReadItems extends ReadData{
    
    /**
     * 
     * @param data empty string
     * @return a list of customer notes
     */
     @Override
     public List readData(String data) {
        
        String sql = "SELECT * FROM tb_items";

        try{      
            
                                       
            PreparedStatement pS = con.prepareStatement(sql);
            
            ResultSet rS = pS.executeQuery();
            
            while(rS.next()){
                
                int id = rS.getInt("id");
                String itemName = rS.getString("name");
                int type = rS.getInt("type_id");
                int availability = rS.getInt("availabily_id");
                

            
                list.add(id + "_" + itemName + "_" + type + "_" + availability, positionCount);
                positionCount++;
                
            }
            
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, "Error " + e);
            
        }  
        
         return list;
         
     }
}
