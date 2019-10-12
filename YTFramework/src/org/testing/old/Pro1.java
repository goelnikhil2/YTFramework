package org.testing.old;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pro1 {
	ChromeDriver driver;
	@BeforeMethod
	public void Before() throws InterruptedException {
		System.out.println("Browser Launch");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikhil\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test
	public void TC1() throws InterruptedException {
		System.out.println("Test1");
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
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement trend = driver.findElement(By.xpath("//ytd-guide-entry-renderer/a[@title='Trending']"));
		trend.click();
		Thread.sleep(5000);
	}
	@AfterMethod
	public void After() throws InterruptedException {
	//	Thread.sleep(5000);
		System.out.println("Driver close");
	//	driver.close();
	}
	
}
