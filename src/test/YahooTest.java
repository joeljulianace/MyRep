package test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class YahooTest {
	
	@BeforeSuite
	public void initializeSelenium(){
		//selenium object - webdriver
		System.out.println("In the very beginning - intialize selenium");
	}
	
	@AfterSuite
	public void shutDownSelenium(){
		//webdriver object destroyed
		System.out.println("In the very end - destroy selenium");
	}
	
  @Test
  public void testReceiveMail() {
	  //selenium code to test the application
	  System.out.println("Testing receiving email");
  }
  
  @Test
  public void testSendMail() {
	  //selenium code to test the application
	  System.out.println("Testing sending email");
  }
  
  @BeforeMethod
  public void openBrowser() {
	  System.out.println("Opening browser");
	  //Opening a browser
  }
  
  @AfterMethod
  public void closeBrowser(){
	  System.out.println("Closing browser");
  }

  @BeforeTest
  public void openConnection() {
	  System.out.println("Connecting to database");
	  //connection with database
  }
  
  @AfterTest
  public void closeConnection(){
	  System.out.println("Closing database connection");
  }

}
