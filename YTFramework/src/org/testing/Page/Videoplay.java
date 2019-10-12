package org.testing.Page;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Videoplay {
	ChromeDriver driver;
	Properties pr;
	
	public Videoplay(ChromeDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;
	}
	
	public void video(int num) throws InterruptedException {
		List<WebElement> ls = driver.findElements(By.xpath(pr.getProperty("videono")));
		System.out.println("Total videos : "+ls.size());
		ls.get(0).click();
		Thread.sleep(10000);
	}
}
