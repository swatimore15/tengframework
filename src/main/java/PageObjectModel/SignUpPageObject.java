package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SignUpPageObject {
	public WebDriver driver;

	
	//private By tryforfree=By.xpath("//a[@id='signup_link']");
	private By firstname=By.xpath("//input[@name='UserFirstName']");
	private By lastname=By.xpath("//input[@name='UserLastName']");
	private By email=By.xpath("//input[@name='UserEmail']");
	private By jobtitle=By.xpath("//select[@name='UserTitle']");
	private By companyname=By.xpath("//input[@name='CompanyName']");
	private By employee=By.xpath("//select[@name='CompanyEmployees']");
	private By userphone=By.xpath("//input[@name='UserPhone']");
	private By country=By.xpath("//select[@name='CompanyCountry']");
	private By checkbox=By.xpath("(//div[@class='checkbox-ui'])");
    
    public SignUpPageObject(WebDriver driver2) {
    	this.driver=driver2;
	}
    
   /* public WebElement ClickOnTryforfree() {
		// TODO Auto-generated method stub
		return driver.findElement(tryforfree);
	}*/

	public WebElement Enterfristname() {
   	 
    	return driver.findElement(firstname);
    	}
    	
    public WebElement Enterlastname() {
    	return driver.findElement(lastname);
    }
    
    public WebElement Enteremail() {
    	return driver.findElement(email);
    }
    
    public WebElement EnterJobtitle() {
    	return driver.findElement(jobtitle);
    }
    
    public WebElement Entercompanyname() {
    	return driver.findElement(companyname);
    }
    
    public WebElement Enteremployee() {
    	return driver.findElement(employee);
    }
    
    public WebElement Enterphonenumber() {
    	return driver.findElement(userphone);
    }
    
    public WebElement Entercountry() {
    	return driver.findElement(country);
    }
    
    
    public WebElement Enterchechbox() {
    	return driver.findElement(checkbox);
    }

	
    
    
    
    
    
    
    
}
