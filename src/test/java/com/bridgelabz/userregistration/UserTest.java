package com.bridgelabz.userregistration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @desc: UserTest Class test the methods of the user class
 */
class UserTest {
    public static User user;
    /**
     * @desc: setup before all initialize the user object
     */
    @BeforeAll
    static void setUp() {
        user = new User();
    }
    /**
     * @desc: tests whether user firstname have proper validation
     */
    @Test
    void setFirstName() {
        assertEquals(true , user.setFirstName("Sumit"));
        assertEquals(false , user.setFirstName("Su"));
        assertEquals(false, user.setFirstName("sumit"));
    }
    /**
     * @desc: tests whether user lastname have proper validation
     */
    @Test
    void setLastName() {
        assertEquals(true , user.setLastName("Jangid"));
        assertEquals(false , user.setLastName("Ja"));
        assertEquals(false, user.setLastName("jangid"));
    }

    /**
     * @desc: tests whether user phonenumber have proper validation
     */
    @Test
    void setPhoneNumber() {
        assertEquals(true , user.setPhoneNumber("91 8696969696"));
        assertEquals(false , user.setPhoneNumber("869691181"));
        assertEquals(false, user.setPhoneNumber("+91 8696911813"));
    }

    /**
     * @desc: tests whether user password have proper validation
     */
    @Test
    void setPassword() {
        assertEquals(false , user.setPassword("1023456789"));
        assertEquals(true , user.setPassword("Sumit@123"));
        assertEquals(false , user.setPassword("Sumit1234"));
    }

    /**
     * @desc: tests whether user email have proper validation
     */
    @Test
    void setEmail() {

    }
}