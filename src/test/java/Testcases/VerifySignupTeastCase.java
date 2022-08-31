package Testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LogInPageObjects;
import PageObjectModel.SignUpPageObject;
import Resourses.BaseClass;
import Resourses.TestCaseData;
import Resourses.commonutilities;

public class VerifySignupTeastCase extends BaseClass{
	
	@Test
	public void SignupTestCase() throws IOException, InterruptedException {
		
		browserLaunch();
			
		driver.get("https://login.salesforce.com/?locale=in");
		
		LogInPageObjects lpo=new LogInPageObjects(driver);

        lpo.ClickOnTryforfree().click();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        SignUpPageObject spo=new SignUpPageObject(driver);

		spo.Enterfristname().sendKeys(TestCaseData.firstname);
		
		spo.Enterlastname().sendKeys(TestCaseData.lastname);
		
		spo.Enteremail().sendKeys(TestCaseData.email);
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 
		spo.Enterphonenumber().sendKeys(TestCaseData.phoneno);

		
		Select s=new Select(spo.EnterJobtitle());
		s.selectByIndex(1);
		
		spo.Entercompanyname().sendKeys(TestCaseData.companyname);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Select s1=new Select(spo.Enteremployee());
         s1.selectByIndex(2);
		

         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Select y=new Select(spo.Entercountry());
         y.selectByValue("India");
         
         //commonutilities.dropdownHandle(spo.Enteremployee(), 2)
		
		//spo.Enterchechbox().click();
	}

}
