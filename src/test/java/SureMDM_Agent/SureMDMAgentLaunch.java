package SureMDM_Agent;


	

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class SureMDMAgentLaunch {
	

	static AppiumDriver driver;
	
	
	public static void main(String[] args) throws Exception {
		try {
		launchSureMDMAgent();
		}
		catch(Exception exp)
		{
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		
	}

	public static void launchSureMDMAgent() throws MalformedURLException, InterruptedException
	{
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Lenovo TB-8705F");
		cap.setCapability("udid", "HA10BBZQ");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("appPackage", "com.nix");
		cap.setCapability("appActivity", "com.nix.ui.SureMdmMainActivity");
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
		driver=new AppiumDriver(url, cap);
		

		System.out.println("Application started");
		
		WebElement getStarted = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button"));
		
		getStarted.click();
		Thread.sleep(2000);
		WebElement adminContnue = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button"));
		adminContnue.click();
		
	}
}
