package rightChoiceTailorBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import rightChoiceTailorPOM.HomePage;

public class ValidateTestCase extends Base
{
	 HomePage home;
	 @BeforeClass
	 public void launchRCT()
	 {
	  home=new HomePage(driver);
	 }
	 @BeforeMethod
	 public void LogintoRCT() 
	 {
     home.clickonRegistrationbutton(driver);
     home.clickonClient(driver);
	 }	    
}
