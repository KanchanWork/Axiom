package rightChoiceTailorPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	//Declaration 
	@FindBy(xpath="(//a[@class='nav-link dropdown-toggle'])[1]") private WebElement Registration;
	@FindBy(xpath="(//a[text()='Client'])[1]")private WebElement Client;

	//Initialization
	public HomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	public void clickonRegistrationbutton(WebDriver driver)
	{
		Registration.click();
	}
	public void clickonClient(WebDriver driver)
	{
		Client.click();
	}

}
