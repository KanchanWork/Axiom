package rightChoiceTailorBase;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Base 
{
	protected static WebDriver driver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
	    ChromeOptions options = new ChromeOptions(); 
	    options.addArguments("--remote-allow-origins=*");
	    WebDriver driver= new ChromeDriver(options);
	    driver.get("http://www.rightchoicetailor.com/");
	    driver.manage().window().maximize();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		
}
}
