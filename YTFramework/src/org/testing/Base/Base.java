package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
	public void Before() throws InterruptedException, IOException {
		System.out.println("Browser Launch");
		File f = new File("D:\\eclipse_photon\\YTFramework\\obj.properties");
		FileInputStream fi = new FileInputStream(f);
		pr = new Properties();
		pr.load(fi);
		System.setProperty("webdriver.chrome.driver",pr.getProperty("path"));
		driver = new ChromeDriver();
		driver.get(pr.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void After() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Driver close");
		driver.close();
	}

}
