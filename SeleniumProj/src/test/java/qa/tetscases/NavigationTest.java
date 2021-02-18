package qa.tetscases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationTest {

	@Test
	public void newProg() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.lntinfotech.com/");
		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
