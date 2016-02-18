package Air.MakemyTrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HomePage {
	@Test
	public void homePageLogin(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.makemytrip.com");
		driver.manage().window().maximize();
	}

}
