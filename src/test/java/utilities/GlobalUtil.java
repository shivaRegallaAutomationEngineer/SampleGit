package utilities;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;


public class GlobalUtil {
	
	private static AndroidDriver Mdriver = null;
	
	public static void setMDriver(AndroidDriver driver) {
		Mdriver = driver;
	}
}
