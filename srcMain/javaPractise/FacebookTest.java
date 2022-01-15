package javaPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FacebookTest {
	WebDriver driver = null;	
	@Parameters("Browser")
	@BeforeTest
	public void OpenBrowser(String Browser) {
		if(Browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver =new ChromeDriver();
		}
		
		if(Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","driver\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
		
	}

	@Test
	public void FacebookLaunch() {
		
		String URL="https://www.facebook.com";
		driver.manage().window().maximize();
		driver.get(URL);
		String PageTitle=driver.getTitle();
		System.out.println("Page title is : "+PageTitle);
		SoftAssert sa1=new SoftAssert();
		sa1.assertEquals(PageTitle, "Facebook – log in or sign u");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}		

