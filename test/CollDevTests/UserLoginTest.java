/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package CollDevTests;

import collaborativeDev.UserLogin;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jazzm
 */
public class UserLoginTest {
    
   
    /**
     * Test of userLogin method, of class UserLogin.
     */
    @Test
    public void testUserLogin() {
        String userName = "alberto";
        char[] password = "pass".toCharArray();
        UserLogin instance = new UserLogin();
        int expResult = 1;
        int result = instance.userLogin(userName, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
