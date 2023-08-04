package utility;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class BaseTest extends GenericMethods {
	
	
	
	@BeforeSuite
	public void reportMethod() {
		
			report=new ExtentReports("./Reports/report.html");
	}
	@BeforeMethod
	public void beforeMethod(Method method) {
		String methodName=method.getName();
		test=report.startTest(methodName);
		test.log(LogStatus.INFO, methodName+" started");
	}
	
	@BeforeClass
	public static void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("./Drivers/chrome/chrome.exe");		
		//Launch Browser
		driver=new ChromeDriver(options);
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//Implicitly wait for 5 seconds if element is not found
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		
		initObjects();
		
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		driver.quit();
		test.log(LogStatus.INFO, method.getName()+" completed");
	}
	@AfterSuite
	public static void closeBrowser() {
		
		report.endTest(test);
		report.flush();
	}
}