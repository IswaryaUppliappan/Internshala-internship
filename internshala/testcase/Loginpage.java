package internshala.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage extends ProjectSpecificMethod1 {
	 
		@BeforeTest
		public void openDb() {
			excelfile = "LoginPage";
		}
		@Test(dataProvider ="fetchData")
		public void runLink(String email, String password) {
		
	
		
		}
//		@BeforeMethod
//		public void Login()
//		{
//			System.out.println("Login successfull");
//		}
//		
//		@Test(dataProvider = "getData")
//		{
//			System.out.println(Email + "-----" + Password);
//		    WebElement email1 = driver.findElement(By.xpath("(//label[text()='Email']/following::input)[1])"));
//		    email1.sendKeys(Email);
//		    WebElement password1 = driver.findElement(By.xpath("(//label[text()='Email']/following::input)[2]"));
//		    password1.sendKeys(Password);
//		    driver.findElement(By.xpath("//button[text()='Submit']")).click();
//		    
//		    assert driver.getPageSource().contains(errorMessage);
//		}
//		@DataProvider
//		public Object[][] getData(){
//			Object[][] credentials= {
//					{"email","","The password field is empty"},
//					{"","password","The email field is empty"}
//			};
//			return credentials;
//		}
//							
//		    @Test
//		    public void invalidateEmail() {
//		      WebElement email = driver.findElement(By.id("email"));
//		      email.sendKeys("example_domain.com");
//		      WebElement password = driver.findElement(By.id("password"));
//		      password.sendKeys("password123");
//		      WebElement errorMessage = driver.findElement(By.id("errorMessage"));
//		      Assert.assertTrue(errorMessage.isDisplayed());
//		  }
}
//		
		     
//		    }
//	}    public void verifySuccessful(){
//		    	 String actualurl="https://z3t0c9.csb.app/";
//		        String expectedurl=driver.getCurrentUrl();
//		       
//		        Assert.assertTrue(expectedurl.equals(actualurl));
//		        }
//			@AfterMethod
//			public void Logout()
//			{
//				System.out.println("Logout successfull");
//			}
//		    @AfterTest
//		    public void closedriver(){
//		    driver.close();
	
	

