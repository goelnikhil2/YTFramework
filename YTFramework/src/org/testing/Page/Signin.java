package org.testing.Page;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signin {
	ChromeDriver driver;
	Properties pr;
	
	public Signin(ChromeDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;
	}
	public void Login(String user, String pass) throws InterruptedException {
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
		Thread.sleep(5000);
	}

}
