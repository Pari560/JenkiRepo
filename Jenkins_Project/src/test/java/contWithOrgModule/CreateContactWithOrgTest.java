package contWithOrgModule;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateContactWithOrgTest {
	@Test(groups="SmokeTest")
	public void printo(){
		String URL=System.getProperty("url");
		Reporter.log(URL,true);
		String BROWSER=System.getProperty("browser");
		Reporter.log(BROWSER,true);
		String USER_NAME=System.getProperty("userName");
		Reporter.log(USER_NAME,true);
		String PASSWORD=System.getProperty("password");
		Reporter.log(PASSWORD,true);
		Reporter.log("Created ContactWithOrg successfully");
	}

}
