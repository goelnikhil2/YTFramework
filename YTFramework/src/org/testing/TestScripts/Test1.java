package org.testing.TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Page.Assertionclass;
import org.testing.Page.Signin;
import org.testing.Page.Urlpage;
import org.testing.utilities.Logfile;
import org.testing.utilities.Screenshot;

public class Test1 extends Base {
	@Test
	public void TC1() throws InterruptedException, IOException {
		System.out.println("Test1");
		Signin s = new Signin(driver, pr);
		s.Login("user", "pass");
		Logfile.logs("Test1", "test1 URL pass");
		Logfile.logs("Test1", "test1 login successfull");
		Urlpage u= new Urlpage(driver, pr);
		u.Urllink();
		Assertionclass a = new Assertionclass(driver, pr);
		a.classss();
		Logfile.logs("Test1", "test1 Assertion pass");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement trend = driver.findElement(By.xpath(pr.getProperty("Trendingpath")));
		trend.click();
		Logfile.logs("Test1", "test1 trending click successfull");
		Thread.sleep(5000);
		Screenshot.take_screenshot(driver, "D:\\\\dc classes\\\\day5\\\\tc1.png");
		Thread.sleep(2000);
	}
}
