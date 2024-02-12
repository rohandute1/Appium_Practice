package com.bridgelabz;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Clock {
    AndroidDriver driver;
    @Test
    public void setup() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("deviceName","emulator-5554");
        desiredCapabilities.setCapability("platformVersion","9.0");
        desiredCapabilities.setCapability("appPackage","com.google.android.deskclock");
        desiredCapabilities.setCapability("appActivity","com.android.deskclock.DeskClock");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        WebElement alarmElement = driver.findElement(By.className("android.widget.TextView"));
        alarmElement.click();

    }
}
