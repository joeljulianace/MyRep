package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class YahooRegistrationTest {
	
	@Test(dataProvider="registerData")
	public void testRegister(String username, String password, String email, String city){
		//selenium code
		//username
		//password
		//email
		//city
		
		System.out.println(username + " -- " + password + " -- " + email + " -- " + city);
		
	}
	
	@DataProvider
	public Object[][] registerData(){
		//rows - no. of times the data has to be repeated
		//cols - parameters in the data
		Object data[][] = new Object[3][4];
		
		//first row
		data[0][0] = "user1";
		data[0][1] = "pass1";
		data[0][2] = "email1";
		data[0][3] = "city1";
		
		//second row
		data[1][0] = "user2";
		data[1][1] = "pass2";
		data[1][2] = "email2";
		data[1][3] = "city2";
		
		//third row
		data[2][0] = "user3";
		data[2][1] = "pass3";
		data[2][2] = "email3";
		data[2][3] = "city3";
		
		return data;
	}

}
