package utilities;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class DriverUtil {

	public static DesiredCapabilities dc = new DesiredCapabilities();
	private DriverUtil(){

	}


	public static AndroidDriver getMobileApp(){
		
		AndroidDriver driver = null;
		
		try {
			 dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator"); // Android Emulator

		        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

		        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");

		        dc.setCapability("appPackage", "com.mobile.producersonline");
		        dc.setCapability("appActivity", "com.mobile.producersonline.SplashActivity");

			
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}
}
