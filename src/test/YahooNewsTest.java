package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooNewsTest {

	@BeforeTest
	public void xyz(){
		System.out.println("Before Executing Yahoo News Test");
		//throw new SkipException("Skipping because of XYZ Reason");
	}
	
	@Test
	public void testNews(){
		System.out.println("Executing Yahoo News Test");
		//selenium code
		//expected, actual
		//text is present
		//link is present
		
		//Assert.assertEquals("Good", "GoodX");
		try{
			//click - assertions
			Assert.assertTrue(false, "Error message from assert true");
			//code - to report the error in the report
		}catch(Throwable t){
			System.out.println("Caught the error");
		}
		Assert.assertFalse(false, "Error message from assert false");
		System.out.println("After assertion");
		
	}
}