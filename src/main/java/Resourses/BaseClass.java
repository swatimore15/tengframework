package Resourses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
    public Properties prop;
	public WebDriver browserLaunch() throws IOException {
		
		//THIS WILL HELP US TO READ DATA FROM PROPERTIES FILE
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resourses\\data.properties");
		
		//THIS WILL ACSSES DATA.PROPERTIES FILE
		 prop=new Properties();
		
		//TO READ DATA.PROPERTIES FILE
		prop.load(fis);
		
		String browsername=prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		} 
		
		else if(browsername.equalsIgnoreCase("firefox")) {
			//firefox code
		}
		
		
		else if(browsername.equalsIgnoreCase("Edge")) {
			
			//Edge code
		}
		
		else {
			System.out.println("please select valid browser");
		}
			
		return driver;
		
	}
		
		@BeforeMethod
	public void LaunchBrowser() throws IOException {
		
		browserLaunch();
		driver.get(prop.getProperty("url"));
	}
		
	
		@AfterMethod
		public void tearDown() throws IOException {
			
			driver.quit();
			
		}
	
	

}
