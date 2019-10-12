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

public class Test3 extends Base {
	@Test
	public void TC3() throws InterruptedException, IOException {
		System.out.println("Test3");
		Signin s = new Signin(driver, pr);
		s.Login("user", "pass");
		Thread.sleep(5000);
		Logfile.logs("Test3", "test3 login successfull");
		Urlpage u= new Urlpage(driver, pr);
		u.Urllink();
		Logfile.logs("Test3", "test3 URL pass");
		Assertionclass a = new Assertionclass(driver, pr);
		a.classss();
		Logfile.logs("Test3", "test3 Assertion pass");
		Videoplay v= new Videoplay(driver, pr);
		v.video(1);
		Logfile.logs("Test3", "test3 videoplayed successfull");
		Screenshot.take_screenshot(driver, "D:\\dc classes\\day5\\tc3a.png");
		Thread.sleep(15000);
		WebElement like = driver.findElement(By.xpath(pr.getProperty("likepath")));
		like.click();
		Logfile.logs("Test3", "test3 video like successfull");
		Screenshot.take_screenshot(driver, "D:\\dc classes\\day5\\tc3b.png");
		Thread.sleep(5000);
	}

}
