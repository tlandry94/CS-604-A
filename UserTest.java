/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coreservices.Tests;

/**
 *
 * @author stevenharvey
 */
public class UserTest extends User{
    private User classUnderTest;
    String firstName = "dummy";
    String lastName = "dummy";
    String userEmail = "dummy";
    String password = "dummy";
    
    //@Before
    public void setUp() throws Exception{
	classUnderTest = new UserTest();
	}
    
    //@Test
    private String testgetFirstName(){
        //assertEquals(firstName, classUnderTest.testgetFirstName());
    }
    private String testgetLastName(){
        //assertEquals(lastName, classUnderTest.testgetLastName());
    }
    private String testgetEmail(){
        //assertEquals(userEmail, classUnderTest.testgetEmail());
    }
    private String testgetPassword(){
        //assertEquals(password, classUnderTest.testgetPassword());
    }
    private void testlogIn(){
        testTrue = true;
        //assertEquals(testTrue, classUnderTest.testlogin());
        
        testFalse = false;
        //assertEquals(testFalse, classUnderTest.testlogin());
    }
    private void testlogOut(){
        testTrue = true;
        //assertEquals(testTrue, classUnderTest.testlogout());
        
        testFalse = false;
        //assertEquals(testFalse, classUnderTest.testlogout());
    }
    
    private Boolean testisLoggedIn(){
        boolean broken = false;
        //assertEquals(broken, classUnderTest.testisLoggedIn());
        boolean equalsBroken = classUnderTest.testisLoggedIn();
        boolean brokenEqualsBroken = (broken == equalsBroken);
        return brokenEqualsBroken;
    }
    
    private String getHospital(){
        return hospitalName;
    }
    private String getSpecialty(){
        return speciality;
    }
}
