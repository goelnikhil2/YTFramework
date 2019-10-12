package org.testing.old;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;

public class Class1 extends Base{
	@Test
	public void TC1() throws InterruptedException {
		System.out.println("Test1");
		WebElement signin = driver.findElement(By.xpath(pr.getProperty("signpath")));
		signin.click();
		WebElement email = driver.findElement(By.xpath(pr.getProperty("emailpath")));
		email.sendKeys(pr.getProperty("emailid"));
		WebElement next = driver.findElement(By.xpath(pr.getProperty("nextpath")));
		next.click();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		WebElement password = driver.findElement(By.xpath(pr.getProperty("passpath")));
		password.sendKeys(pr.getProperty("pass"));
		Thread.sleep(5000);
		WebElement next1 = driver.findElement(By.xpath(pr.getProperty("next1path")));
		next1.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement trend = driver.findElement(By.xpath(pr.getProperty("Trendingpath")));
		trend.click();
		Thread.sleep(5000);
	}

}
