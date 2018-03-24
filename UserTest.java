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
    UserTest classUnderTest;
    String firstName = "dummy";
    String lastName = "dummy";
    String userEmail = "dummy";
    String password = "dummy";
    String hospitalName = "dummy";
    String speciality = "dummy";
    
    //@Before
    public void setUp() throws Exception{
	classUnderTest = new UserTest();
	}
    
    //@Test
    private String testgetFirstName(){
        String firstname = this.firstName;
        //assertEquals(firstName, classUnderTest.testgetFirstName());
        return firstName;
    }
    private String testgetLastName(){
        String firstname = this.lastName;
        //assertEquals(lastName, classUnderTest.testgetLastName());
        return lastName;
    }
    private String testgetEmail(){
        String useremail = this.userEmail;
        //assertEquals(userEmail, classUnderTest.testgetEmail());
        return userEmail;
    }
    private String testgetPassword(){
        String passWord = this.password;
        //assertEquals(password, classUnderTest.testgetPassword());
        return password;
    }
    private void testlogIn(){
        boolean testTrue = true;
        //assertEquals(testTrue, classUnderTest.testlogin());
        
        boolean testFalse = false;
        //assertEquals(testFalse, classUnderTest.testlogin());
    }
    private void testlogOut(){
        boolean testTrue = true;
        //assertEquals(testTrue, classUnderTest.testlogout());
        
        boolean testFalse = false;
        //assertEquals(testFalse, classUnderTest.testlogout());
    }
    
    private Boolean testisLoggedIn(){
        boolean broken = false;
        //assertEquals(broken, classUnderTest.testisLoggedIn());
        boolean equalsBroken = classUnderTest.testisLoggedIn();
        boolean brokenEqualsBroken = (broken == equalsBroken);
        return brokenEqualsBroken;
    }
    
    private String testgetHospital(){
        String brokenHospital = "dummy";
        //assertEquals(brokenHospital, classUnderTest.testgetHospital());
        return brokenHospital;
    } 
    private String getSpecialty(){
        String brokenSpecialty = "dummy";
        //assertEquals(brokenSpeciality, classUnderTest.testgetSpeciality());
        return brokenSpecialty;
    }
}
