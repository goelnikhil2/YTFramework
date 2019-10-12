package org.testing.Page;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.assertion.Assert1;
import org.testng.Assert;

public class Urlpage {
	ChromeDriver driver;
	Properties pr;
	
	public Urlpage(ChromeDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;
	}
	public void Urllink() throws InterruptedException {
		String expurl = pr.getProperty("url");
		String urlmatch = driver.getCurrentUrl();
		Thread.sleep(5000);
		System.out.println("url"+urlmatch);
		System.out.println("ExpectedURL"+expurl);
		Assert.assertTrue(Assert1.Assert1(urlmatch, expurl));
	}

}
