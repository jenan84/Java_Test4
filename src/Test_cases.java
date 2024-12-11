import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Test_cases extends Parameters {


	
	@Test()
	public void verify_the_search_results() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//*[@id='SIvCob']/a")).click();

		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("jenan" + Keys.RETURN);
		driver.findElement(By.xpath("//*[@id=\"hdtb-tls\"]")).click();

		int expected_results = 10;
		String search_results = (driver.findElement(By.xpath("//*[@id=\"result-stats\"]"))).getText();

		String splitted_text[] = search_results.split(" ");

		String number_of_results = splitted_text[1];
		int actual_result = Integer.parseInt(number_of_results.replace(",", ""));

		myassert.assertEquals(actual_result, expected_results);
		myassert.assertAll();
	}
}
