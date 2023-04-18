package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class CalculatorTest {
	

	static AppiumDriver driver;
	
	
	public static void main(String[] args) throws Exception {
		try {
		openCalculator();
		}
		catch(Exception exp)
		{
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		
	}

	public static void openCalculator() throws MalformedURLException
	{
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Lenovo TB-8705F");
		cap.setCapability("udid", "HA10BBZQ");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("appPackage", "com.google.android.calculator");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
		driver=new AppiumDriver(url, cap);
		
		System.out.println("Application started");
		
		 WebElement two = driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
		 WebElement plus = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
		 WebElement three = driver.findElement(By.id("com.google.android.calculator:id/digit_3"));
		 WebElement equals = driver.findElement(By.id("com.google.android.calculator:id/eq"));
		 
		 two.click();
		 plus.click();
		 three.click();
		 equals.click();
		
	}
}
