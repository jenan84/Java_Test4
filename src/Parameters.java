import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters {
	WebDriver driver = new ChromeDriver();

	SoftAssert myassert = new SoftAssert();
	
	String URL = "https://www.google.co.uk/";

	@BeforeTest
	public void MySetup() {

		driver.get(URL);

	}

	@AfterTest
	public void EndTest() {
		driver.close();
	}

}
