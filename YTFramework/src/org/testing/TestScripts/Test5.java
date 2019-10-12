package org.testing.TestScripts;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Page.Assertionclass;
import org.testing.Page.Signin;
import org.testing.Page.Urlpage;
import org.testing.Page.Videoplay;
import org.testing.utilities.Logfile;
import org.testing.utilities.Screenshot;
import org.testng.annotations.Test;

public class Test5 extends Base{
	@Test
	public void TC5() throws InterruptedException, IOException {
		System.out.println("Test5");
		Signin s = new Signin(driver, pr);
		s.Login("user", "pass");
		Urlpage u= new Urlpage(driver, pr);
		u.Urllink();
		Logfile.logs("Test5", "test5 URL pass");
		Assertionclass a = new Assertionclass(driver, pr);
		a.classss();
		Logfile.logs("Test5", "test5 Assertion pass");
		Thread.sleep(5000);
		Logfile.logs("Test5", "test5 login successfull");
		Videoplay v= new Videoplay(driver, pr);
		v.video(1);
		Logfile.logs("Test5", "test5 videoplayed successfull");
		Screenshot.take_screenshot(driver, "D:\\dc classes\\day5\\tc5a.png");
		Thread.sleep(15000);
		WebElement guide = driver.findElement(By.xpath(pr.getProperty("guidepath")));
		guide.click();
		Logfile.logs("Test5", "test5 guide click successfull");
		Screenshot.take_screenshot(driver, "D:\\dc classes\\day5\\tc5b.png");
		Thread.sleep(5000);
		WebElement history = driver.findElement(By.xpath(pr.getProperty("historypath")));
		history.click();
		Logfile.logs("Test5", "test5 history click successfull");
		Screenshot.take_screenshot(driver, "D:\\dc classes\\day5\\tc5c.png");
		Thread.sleep(5000);
	}


}
