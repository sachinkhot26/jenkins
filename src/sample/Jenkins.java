package sample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jenkins {

	@Test
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/driver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
	}

}
