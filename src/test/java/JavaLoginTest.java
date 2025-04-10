/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class JavaLoginTest {
    
    public JavaLoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class JavaLogin.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JavaLogin.main(args);
    }
    /**
     * Test if the username is valid.
     */
    @Test
    public void testValidUsername() {
        String username = "a_bc";
        boolean result = username.matches("^\\w{1,5}$") && username.contains("_");
        assertTrue(result, "Username should be valid.");
    }

    /**
     * Test if the username is invalid.
     */
    @Test
    public void testInvalidUsername() {
        String username = "abcd";
        boolean result = username.matches("^\\w{1,5}$") && username.contains("_");
        assertFalse(result, "Username without underscore should be invalid.");
    }

    /**
     * Test if the invalid username is long.
     */
    @Test
    public void testInvalidUsername_Long() {
        String username = "ab_cd1";
        boolean result = username.matches("^\\w{1,5}$") && username.contains("_");
        assertFalse(result, "Username longer than 5 characters should be invalid.");
    }

    /**
     * Test if the valid password contains at least 8 characters,  capital letter, a number, and  special characters.
     */
    @Test
    public void testValidPassword() {
        String password = "Passw0rd!";
        boolean result = password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$");
        assertTrue(result, "Password should be valid.");
    }

    /**
     * Test if the invalid password does not have special characters.
     */
    @Test
    public void testInvalidPassword_NoSpecialChar() {
        String password = "Password1";
        boolean result = password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$");
        assertFalse(result, "Password without special character should be invalid.");
    }

    /**
     * Test if the invalid password is short in length.
     */
    @Test
    public void testInvalidPassword_ShortLength() {
        String password = "Pw1@";
        boolean result = password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$");
        assertFalse(result, "Password shorter than 8 characters should be invalid.");
    }

    /**
     * Test if the South African phone number is valid.
     */
    @Test
    public void testValidPhoneNumber() {
        String phone = "+27831234567";
        boolean result = phone.matches("\\+27\\d{9,10}");
        assertTrue(result, "Phone number should be valid.");
    }

    /**
     * Test if the invalid phone number does not contain +27 prefix.
     */
    @Test
    public void testInvalidPhoneNumber_NoPrefix() {
        String phone = "0831234567";
        boolean result = phone.matches("\\+27\\d{9,10}");
        assertFalse(result, "Phone number without +27 should be invalid.");
    }

    /**
     * Test if the invalid phone number is short.
     */
    @Test
    public void testInvalidPhoneNumber_Short() {
        String phone = "+2783";
        boolean result = phone.matches("\\+27\\d{9,10}");
        assertFalse(result, "Phone number that is too short should be invalid.");
    }
}
