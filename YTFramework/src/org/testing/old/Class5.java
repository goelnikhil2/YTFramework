package org.testing.old;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testng.annotations.Test;

public class Class5 extends Base{
	@Test
	public void TC5() throws InterruptedException {
		System.out.println("Test5");
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
		Thread.sleep(10000);
		WebElement guide = driver.findElement(By.xpath(pr.getProperty("guidepath")));
		guide.click();
		Thread.sleep(5000);
		WebElement history = driver.findElement(By.xpath(pr.getProperty("historypath")));
		history.click();
		Thread.sleep(5000);
	}

}
