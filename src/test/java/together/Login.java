package together;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Login {

	public static void main(String[] args) throws InterruptedException, MalformedURLException   {
		//Set Desired Capabilities of Android Device
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		//Set path of apk file of given Application
		dc.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\Together_base.apk");
		
		dc.setCapability("uiautomator2ServerInstallTimeout",900000); // Timeout in milliseconds used to wait for an uiAutomator2 server to be installed
		dc.setCapability("adbExecTimeout",20000000);//Timeout in milliseconds used to wait for adb command execution.
		dc.setCapability("appPackage","com.avegen.together");//Identiy Java package of app (unique Id)
		dc.setCapability("appActivity","com.avegen.together.MainActivity");//No. of Activities of App
		
		dc.setCapability(MobileCapabilityType.TIMEOUTS, 20000000);
	    URL url = new URL("http://127.0.0.1:4723/wd/hub");// URL of Appium Server
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);// Instantiate Android Driver
		Thread.sleep(5000);
		
		WebElement eng= driver.findElement(By.xpath("//*[@class='android.view.ViewGroup' and @index='4']"));
		eng.click();
		
		WebElement next= driver.findElement(By.xpath("//*[@class='android.view.ViewGroup' and @index='5']"));
		next.click();
		Thread.sleep(3000);
		
		
		WebElement name= driver.findElement(By.xpath("//*[@class='android.widget.EditText' and @index='2']"));
		name.sendKeys("Pratiksha");
		Thread.sleep(3000);
		
		WebElement next2= driver.findElement(By.xpath("//android.widget.TextView[@text='Next']"));
		next2.click();
		Thread.sleep(3000);
		
		WebElement SelectMonth= driver.findElement(By.xpath("//android.widget.TextView[@text='4']"));
		SelectMonth.click();
		Thread.sleep(3000);
		
		WebElement next3= driver.findElement(By.xpath("//android.widget.TextView[@text='NEXT']"));
		next3.click();
		Thread.sleep(3000);
		
				
		WebElement Noabove=driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Choose an Account\"]/android.widget.LinearLayout/android.widget.Button"));
		Noabove.click();
        Thread.sleep(3000);
       	
		WebElement signIngoogle= driver.findElement(By.xpath("//android.widget.TextView[@text='Sign in with Google']"));
		signIngoogle.click();
		 Thread.sleep(3000);
				
		WebElement selectMail= driver.findElement(By.xpath("//*[@class='android.widget.LinearLayout' and @index='1']"));
		selectMail.click();
		Thread.sleep(5000);
		   
		WebElement allow= driver.findElement(By.xpath("//android.widget.TextView[@text='Allow']"));
		allow.click();
		Thread.sleep(3000);
		
		WebElement appAllow= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]"));
		appAllow.click();
		Thread.sleep(3000);
		
		WebElement ok= driver.findElement(By.id("android:id/button1"));
		ok.click();
		Thread.sleep(3000);
		

	}
}
	

