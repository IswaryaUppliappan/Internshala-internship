package internshala.testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import week7.day1.ReadExcel;

public class ProjectSpecificMethod1 {
	public static ChromeDriver driver;
	String excelfile;
	@Parameters({"url","email","password"})
	@BeforeMethod
	public void launchBrowser(String url,String email,String password){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement email1 = driver.findElement(By.xpath("(//label[text()='Email']/following::input)[1])"));
		email1.sendKeys(email);
	    WebElement password1 = driver.findElement(By.xpath("(//label[text()='Email']/following::input)[2]"));
	    password1.sendKeys(password);
	    driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

@AfterMethod
public void tearDown() {
	driver.close();
}
@DataProvider(name="fetchData")
public String[][]getData() throws IOException {
	String[][] readdata = ReadExcel.readdata(excelfile);
	return readdata;
}
}