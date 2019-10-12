package org.testing.old;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testng.annotations.Test;

public class Class3 extends Base{
	@Test
	public void TC3() throws InterruptedException {
		System.out.println("Test3");
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
		Thread.sleep(10000);
		List<WebElement> ls = driver.findElements(By.xpath(pr.getProperty("videono")));
		System.out.println("Total videos : "+ls.size());
		ls.get(0).click();
		Thread.sleep(15000);
		WebElement like = driver.findElement(By.xpath(pr.getProperty("likepath")));
		like.click();
		Thread.sleep(5000);
	}

}
