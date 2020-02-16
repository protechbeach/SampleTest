package versionmatch;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testcase1 {
	public static void main(String[] args){
	WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver", "E:\\JavaProject\\Demo1\\TestProject\\driver\\chromedriver\\2.35.528161\\chromedriver.exe");
	driver = new ChromeDriver();	
	System.out.println(" ----> : "+((ChromeDriver)driver).getSessionId());
	/*
	System.setProperty("webdriver.gecko.driver", "E:\\JavaProject\\Demo1\\TestProject\\driver\\firefoxdriver\\geckodriver.exe");
	driver = new FirefoxDriver();
	*/
	/*	
	System.setProperty("webdriver.ie.driver", "E:\\JavaProject\\Demo1\\TestProject\\driver\\internetexplorerdriver\\IEDriverServer.exe");
	driver = new InternetExplorerDriver();
	*/
	
	driver.get("https://www.google.co.in");	
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	try{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("D:\\screenShot1.png"));
	}catch(Exception e){
		e.printStackTrace();
		System.out.println("Hello");
	}
	
	
	
	driver.close();	
	}

}

