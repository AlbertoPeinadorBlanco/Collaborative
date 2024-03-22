/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package CollDevTests;

import collaborativeDev.ReadData;
import java.awt.List;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author jazzm
 */
public class ReadDataTest {
    
 
    /**
     * Test of readData method, of class ReadData.
     */
    @Test
    public void testReadData() {
       
        ReadData readData = new ReadData();
        
        
        List list = readData.readData("aloy"); 
        char[] actual = list.getItem(0).toCharArray();
        char[] expected = "1_alberto_pass_3".toCharArray();
               
        
        //Assertions.assertEquals("aloy_admin_N/A", item);
        Assertions.assertArrayEquals(expected, actual);
        
    }
    
}
