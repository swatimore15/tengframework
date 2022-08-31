package Testcases;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LogInPageObjects;
import Resourses.BaseClass;
import Resourses.TestCaseData;
import Resourses.commonutilities;

public class VerifyLoginTestCase extends BaseClass {
     
	@Test
	public void login() throws IOException {
		
		
		LogInPageObjects lpo=new LogInPageObjects(driver);
		lpo.EnterUsername().sendKeys(TestCaseData.username);
		lpo.Enterpassword().sendKeys(TestCaseData.password);
		lpo.ClicLogin().click();
		//lpo.ClickOnTryforfree().click();
		
		String expected=("Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
		String actual=driver.findElement(By.xpath("//div[@id='error']")).getText();
		
		commonutilities.handleAssertions(actual, expected);
		
	}

}
