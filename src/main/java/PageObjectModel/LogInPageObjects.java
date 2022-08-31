package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPageObjects {

	public WebDriver driver;
	
	//we have achieved encalpsulation here
	private By username=By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
    private By LoginButtton=By.xpath("//input[@id='Login']");
	private By tryforfree=By.xpath("//a[@id='signup_link']");
     private By error=By.xpath("//div[@id='error']");
 


public LogInPageObjects(WebDriver driver2) {
	this.driver=driver2;
	}


public WebElement EnterUsername() {
	 
	return driver.findElement(username);
	}
	
	
public WebElement Enterpassword() {
		return driver.findElement(password);
	}
	
	
public WebElement ClicLogin() {
	    return driver.findElement(LoginButtton);
	
   }

	 
public WebElement ClickOnTryforfree() {
    return driver.findElement(tryforfree);

}


public WebElement Entererror() {
	 
	return driver.findElement(error);
	}
	
	
	
	
}


