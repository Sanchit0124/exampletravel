package Test;






import org.testng.annotations.Test;

import GenericUtils.DriverUtils;
import GenericUtils.PropertyReader;
import Pages.RegisterPage;


public class RegisterTest extends BaseTest {
 @Test
 public void Registersuccessfull() throws InterruptedException {
//	 WebDriver obj1=DriverUtils.getDriver();
	 DriverUtils.getDriver().get("https://examples.testsigma.com/");
	 RegisterPage rp= new RegisterPage();
			
		rp.clickSignup();
		rp.enterName(PropertyReader.getProperty("fullname"));
		rp.enterEmail(PropertyReader.getProperty("email"));
		rp.enterAddress(PropertyReader.getProperty("address"));
		rp.enterTelephone(PropertyReader.getProperty("telephone"));
		rp.clickContinue();
		rp.selectAge();
		rp.selectGender();
		rp.selectemp();
		rp.clickedContinue();
		
//		rp.selectProfile();
		rp.enterPassword(PropertyReader.getProperty("password"));
		rp.RenterPassword(PropertyReader.getProperty("repassword"));
		rp.clickSubmit();
		rp.clickedaccept();

	 
	 
	 
		
    
	 
}
 
	 
	 
	 
	 
	 


	

}
