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


public class Test4 extends Base{
	@Test
	public void TC4() throws InterruptedException, IOException {
		System.out.println("Test4");
		Signin s = new Signin(driver, pr);
		s.Login("user", "pass");
		Thread.sleep(5000);
		Logfile.logs("Test4", "test4 login successfull");
		Urlpage u= new Urlpage(driver, pr);
		u.Urllink();
		Logfile.logs("Test4", "test4 URL pass");
		Assertionclass a = new Assertionclass(driver, pr);
		a.classss();
		Logfile.logs("Test4", "test4 Assertion pass");
		Videoplay v= new Videoplay(driver, pr);
		v.video(1);
		Thread.sleep(15000);
		Logfile.logs("Test4", "test4 videoplayed successfull");
		Screenshot.take_screenshot(driver, "D:\\dc classes\\day5\\tc4a.png");
		WebElement subs = driver.findElement(By.xpath(pr.getProperty("subscribe")));
		subs.click();
		Logfile.logs("Test4", "test4 videoplayed successfull");
		Screenshot.take_screenshot(driver, "D:\\dc classes\\day5\\tc4b.png");
		Thread.sleep(5000);
	}


}
