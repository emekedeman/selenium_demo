package seleniumBasicsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrame {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver-v0.20\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.firstcry.com/");
		driver.switchTo().frame("iframe_Login");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("Naresh");
		driver.findElement(By.xpath("//div[@class='_pop_close _pop_reg_bg']")).click();
		driver.quit();
	}
		
}
