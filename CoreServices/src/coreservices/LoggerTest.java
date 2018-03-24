package coreservices;

import coreservices.Logger;
 import static org.junit.Assert.*;

public class LoggerTest implements Validator{
	
	private Logger classUnderTest;

	//@Before
	public void setUp() throws Exception{
		classUnderTest = new Logger();
	}
	
	//@Test
	public void testValidate(){
		//fail("Should fail.");
		if(true == false) //will fail.
                else
                    return 5555; //will pass.
	}


}