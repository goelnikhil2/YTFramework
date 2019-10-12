package org.testing.TestScripts;

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
import org.testng.annotations.Test;

public class Test2 extends Base {
	@Test
	public void TC2() throws InterruptedException, IOException {
		System.out.println("Test2");
		Signin s = new Signin(driver, pr);
		s.Login("user", "pass");
		Logfile.logs("Test2", "test2 login successfull");
		Urlpage u= new Urlpage(driver, pr);
		u.Urllink();
		Logfile.logs("Test2", "test2 URL pass");
		Assertionclass a = new Assertionclass(driver, pr);
		a.classss();
		Logfile.logs("Test2", "test2 Assertion pass");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement subs = driver.findElement(By.xpath(pr.getProperty("Subscription")));
		subs.click();
		Logfile.logs("Test2", "test2 Subscription click successfull");
		Thread.sleep(5000);
		Screenshot.take_screenshot(driver, "D:\\dc classes\\day5\\tc2.png");
		Thread.sleep(5000);
	}

}
