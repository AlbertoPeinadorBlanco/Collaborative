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
 * @author jazzm
 */
public class ItemNameList extends ReadData{
    
     @Override
    public List readData(String data){
        
        String sql = "SELECT name FROM tb_items WHERE type_id = ? AND availabily_id = '1'";

        try{      
            
                                       
           PreparedStatement pS = con.prepareStatement(sql);
           pS.setString(1, data);
           ResultSet rS = pS.executeQuery();
            
            
            while(rS.next()){
                
                String itemName = rS.getString("name");
                
            
                list.add(itemName, positionCount);
                positionCount++;
                
            }
            
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, "Error " + e);
        }   
        
        return list;
       
        
    }
    
}
