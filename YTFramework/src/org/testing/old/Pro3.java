package org.testing.old;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pro3 {
	ChromeDriver driver;
	@BeforeMethod
	public void Before() {
		System.out.println("Browser Launch");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikhil\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
	}
	@Test
	public void TC3() throws InterruptedException {
		System.out.println("Test3");
		WebElement signin = driver.findElement(By.xpath("//*[@aria-label='Sign in']"));
		signin.click();
		WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
		email.sendKeys("nikhiltestingemailing@gmail.com");
		WebElement next = driver.findElement(By.xpath("//*[@id='identifierNext']"));
		next.click();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("test@123456789");
		Thread.sleep(5000);
		WebElement next1 = driver.findElement(By.xpath("//*[@id='passwordNext']"));
		next1.click();
		Thread.sleep(10000);
		List<WebElement> ls = driver.findElements(By.xpath("//*[@id='video-title']"));
		System.out.println("Total videos : "+ls.size());
		ls.get(2).click();
		Thread.sleep(15000);
		WebElement like = driver.findElement(By.xpath("//div[@id='menu-container']/div[@id='menu']/ytd-menu-renderer/div[@id='top-level-buttons']/ytd-toggle-button-renderer"));
		like.click();
		Thread.sleep(5000);
	}
	@AfterMethod
	public void After() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Driver close");
		driver.close();
	}

}
