package coreservices.Tests;

import coreservices.Logger2;
//import static org.junit.Assert.*;

public class LoggerTest extends Logger2{
	
	private Logger2 classUnderTest;

	//@Before
	public void setUp() throws Exception{
		classUnderTest = new Logger2();
	}
	
	//@Test
	public void testValidate(){
		boolean result = true;
                boolean bootleg;
                
                //Compare this test to what validate gives us.
                //assertEquals(result, classUnderTest.validate(false));
		if (result == (classUnderTest.validate(false))){
                    bootleg = result == (classUnderTest.validate(false)); //bootleg unit test
                    System.out.println(bootleg);
                }
                
                //assertEquals(result, classUnderTest.validate(false));
		if (result == (classUnderTest.validate(true))){
                    bootleg = result != (classUnderTest.validate(false)); //2nd bootleg u-test
                    System.out.println(bootleg);
                } //That's enough bootleg unit tests
	}

}