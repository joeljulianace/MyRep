import org.testng.annotations.Test;

public class RegTest {
	
	@Test(dataProviderClass=Data_Provider.class,dataProvider="regtestDataProvider")
	public void doRegister(String username, String password, String email){
		
	}
	
	
	
}
