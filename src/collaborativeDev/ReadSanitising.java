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
 * Class to read subscriptions from the DB
 * child of ReadData class
 */
public class ReadSanitising extends ReadData{
    
    /**
     * 
     * @param data empty string
     * @return return a list of subscriptions from the DB
     */
    @Override
    public List readData(String data){
        
        String sql = "SELECT * FROM tb_sanitising";

        try{      
                                                   
            PreparedStatement pS = con.prepareStatement(sql);
            
            ResultSet rS = pS.executeQuery();
            
            
            while(rS.next()){
                
                String id = rS.getString("id");
                String itemID = rS.getString("item_id");
                String dateIn = rS.getString("date_in");
                String dateOut = rS.getString("date_out");
                

            
                list.add(id + "_" + itemID + "_" + dateIn + "_" + dateOut, positionCount);
                positionCount++;
                
            }
            
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, "Error " + e);
        }   
        
        return list;
    }
}
