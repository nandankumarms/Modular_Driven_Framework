package utility;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class GenericMethods {
	
	public static ExtentReports report;
	public static  ExtentTest test;
    public static WebDriver  driver;
    public static TakesScreenshot ts;
    
    public static void initObjects(){
    ts=(TakesScreenshot) driver;
    	}
    public static String getDateAndTime() {
    	LocalDateTime date=LocalDateTime.now();
    	return date.toString().replace(":", "-");
    	
    }
    
	public static String takeScreenShot() {
	 File temp= ts.getScreenshotAs(OutputType.FILE);
	 File dest=new File("./Screenshots/"+getDateAndTime()+".jpg");
	 try {
		FileHandler.copy(temp, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return "."+dest;
	}
	
	
}
