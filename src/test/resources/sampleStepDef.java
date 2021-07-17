import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sampleStepDef {
	@given(^"lunch browser")
	public void lunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\AutomationProject\\test-delete plz\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bing.com/search");
		WebDriverWait wait= new WebDriverWait(driver,20); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='sb_form_q']")));
		driver.findElement(By.xpath("//input[@id='sb_form_q']")).sendKeys("selenium webdriver");
		WebDriverWait wait1= new WebDriverWait(driver,20); 
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='sb_form_go']")));
		driver.findElement(By.xpath("//label[@for='sb_form_go']")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.close();
	}

}
