package org.testing.Page;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertionclass {
	ChromeDriver driver;
	Properties pr;
	
	public Assertionclass(ChromeDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;
	}
	public void classss() throws InterruptedException {
		WebElement menusignin = driver.findElement(By.xpath(pr.getProperty("menusignin")));
		menusignin.click();
		Thread.sleep(5000);
		String expemail = pr.getProperty("emailid");
		System.out.println("Expected Email : "+expemail);
		WebElement emailmatch = driver.findElement(By.xpath(pr.getProperty("emailmatch")));
		String email = emailmatch.getText();
		Thread.sleep(5000);
		System.out.println("Actual Email : "+email);
		Assert.assertEquals(email, expemail);
	}

}
