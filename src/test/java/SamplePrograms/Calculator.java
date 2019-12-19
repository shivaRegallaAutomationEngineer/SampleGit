package SamplePrograms;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator"); // Android Emulator

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");

        dc.setCapability("appPackage", "com.mobile.producersonline");
        dc.setCapability("appActivity", "com.mobile.producersonline.SplashActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        AndroidDriver driver = new AndroidDriver(url, dc);
        MobileElement allow = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
     allow.click(); Thread.sleep(3000);
        MobileElement Buyer = (MobileElement) driver.findElementByXPath("//*[@text='BUYER']");
        Buyer.click();Thread.sleep(5000);
        
        //enter valid user id
        MobileElement Userid = (MobileElement) driver.findElementById("com.mobile.producersonline:id/edtEmailOrPhone");
        Userid .sendKeys("ONLINEP");
         Thread.sleep(5000);
         //enter valid password
         MobileElement Password = (MobileElement) driver.findElementById("com.mobile.producersonline:id/edtPassword");
         Password.sendKeys("12345"); Thread.sleep(5000);
//         driver.hideKeyboard();
//           driver.hideKeyboard();
//         driver.scrollTo("R");
         //click on submit button
         MobileElement Signinbtn = (MobileElement) driver.findElementById("com.mobile.producersonline:id/btnSignIn");
         Signinbtn.click(); Thread.sleep(5000);
       // driver.navigate().back();
         //click on allow msg
         //click on heart symbol
          MobileElement el2 = (MobileElement) driver.findElementById("com.mobile.producersonline:id/btnFavorite");
          el2.click();Thread.sleep(5000);
          //click on ok button
          MobileElement el3 = (MobileElement) driver.findElementById("com.mobile.producersonline:id/btnInfoOk");
          el3.click();Thread.sleep(5000);
        //  MobileElement el4 = (MobileElement) driver.findElementById("com.mobile.producersonline:id/btnFavorite");
         // el4.click();Thread.sleep(5000);
        
        
        
    }
        }

