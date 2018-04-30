package Test_GitIntegration.Test_GitIntegration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Google_Search {
	
	private WebDriver oDriver;
	
	@BeforeTest
	public void setupDriver() {
		oDriver= new ChromeDriver();
		
	}
	
	@Test
	public void google_Search() {
		
		oDriver.get("http://www.google.com");
		oDriver.findElement(By.name("q")).sendKeys("Salman Khan");
		oDriver.findElement(By.name("btnK")).click();
		WebElement wd= new WebDriverWait(oDriver, 30L).until(ExpectedConditions.presenceOfElementLocated(By.id("logocont")));
		System.out.println(oDriver.getTitle());
	}
	
	@AfterTest
	public void closeDriver()
	{
		oDriver.close();
	}


}
