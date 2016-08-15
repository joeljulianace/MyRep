import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

//all data providers for all classes
public class Data_Provider {
	
	@DataProvider(name="regtestDataProvider")
	public static Object[][] getData(){
		Object data[][] = new Object[2][3];
		
		data[0][0] = "U1";
		data[0][1] = "P1";
		data[0][2] = "xyz@gmail.com";
		
		data[1][0] = "U2";
		data[1][1] = "P2";
		data[1][2] = "abc@gmail.com";
		
		return data;
	}
	
	@DataProvider(name="loginTestDataProvider")
	public static Object[][] getLoginData(){
		Object data[][] = new Object[2][2];
		
		data[0][0] = "U1";
		data[0][1] = "P1";
		
		data[1][0] = "U2";
		data[1][1] = "P2";
		
		return data;
	}

	@DataProvider(name="sampleProvider")
	public static Object[][] xyzData(Method m){
		Object data[][] = null;
		
		if(m.getName().equals("testA")){
		
			data = new Object[2][2];
			
			data[0][0] = "U1";
			data[0][1] = "P1";
			
			data[1][0] = "U2";
			data[1][1] = "P2";
			
			
		}else if(m.getName().equals("testB")){
			
			data = new Object[2][3];
			
			data[0][0] = "U1";
			data[0][1] = "P1";
			data[0][2] = "xyz@gmail.com"; 
					
			
			data[1][0] = "U2";
			data[1][1] = "P2";
			data[1][2] = "abc@gmail.com";
			
			
		}
		
		return data;
	}

}
