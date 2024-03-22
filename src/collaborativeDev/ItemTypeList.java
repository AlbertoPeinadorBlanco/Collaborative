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
public class ItemTypeList extends ReadData {
    
    @Override
    public List readData(String data){
        
        String sql = "SELECT type FROM tb_item_types";

        try{      
            
                                       
           PreparedStatement pS = con.prepareStatement(sql);
            
           ResultSet rS = pS.executeQuery();
            
            
            while(rS.next()){
                
                String typeName = rS.getString("type");
                
            
                list.add(typeName, positionCount);
                positionCount++;
                
            }
            
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, "Error " + e);
        }   
        
        return list;
       
        
    }
    
}
