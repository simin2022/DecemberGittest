package variousconcept;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintest_junit {
	
	  WebDriver driver;
     
		
		
		   @Before
		    public void launchbrowser(){
			System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://www.techfios.com/billing/?ng=admin/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
		}
		    @Test
		    public  void logintest() {
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			driver.findElement(By.id("password")).sendKeys("abc123");
			driver.findElement(By.name("login")).click();
			
		} 
		    @Test
		    public  void neglogintest() {
			
		    	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
				driver.findElement(By.id("password")).sendKeys("abc123456");
				driver.findElement(By.name("login")).click();
				
		}
		    @After
		    public  void teardown() {
			
			driver.close();
			driver.quit();
		}

		
		}





