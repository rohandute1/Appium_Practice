package com.bridgelabz;

import com.google.common.collect.ImmutableMultimap;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AmazonWebApp {
    AndroidDriver driver;
    @Test
    public void setUrl() throws InterruptedException, MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"192.168.200.102:5555");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
        cap.setCapability("chomeOptions", ImmutableMultimap.of("w3c",false));
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        System.out.println("Chrome started successfully");
        Thread.sleep(2000);
        driver.get("https://www.amazon.in");
        Thread.sleep(6000);
//        String xPath = "bd6eb0a8-56bf-4b85-b38c-189f2741d39d";
//        WebElement element = driver.findElement(By.xpath("//*[@elementId='xPath']"));
//        element.sendKeys("Iphone");
//        element.click();
        TouchAction touch = new TouchAction(driver);
        touch.tap(PointOption.point(396,396)).perform();
        WebElement element = driver.findElement(By.xpath("//*[text()='Clear search keywords']"));
        element.sendKeys("Mobiles");
    }
}
