package testng_listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(priority=1)
	public void login(){
		
		//error = stop
		//error = continue
		System.out.println("Start");
		try{
			Assert.assertEquals("A", "B");
		}catch(Throwable t){
			System.out.println("Error");
			//code which will report the error
			ErrorUtil.addVerificationFailure(t);
		}
		
		try{
			Assert.assertEquals("C", "C");
		}catch(Throwable t){
			System.out.println("Error");
			ErrorUtil.addVerificationFailure(t);
		}
	}
	
	@Test(priority=2)
	public void AdminLogin(){
		
	}

}
