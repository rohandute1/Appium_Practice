package com.bridgelabz;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator {
    public AndroidDriver driver;
    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("platformVersion","9.0");
        capabilities.setCapability("appPackage","com.android.calculator2");
        capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
        driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        System.out.println("It is Starting");
    }
    @Test(priority = 1)
    public void addition() throws InterruptedException{
        WebElement nine = driver.findElement(By.id("com.android.calculator2:id/digit_9"));
        nine.click();
        WebElement eight = driver.findElement(By.id("com.android.calculator2:id/digit_8"));
        eight.click();
        WebElement plus = driver.findElement(By.id("com.android.calculator2:id/op_add"));
        plus.click();
        WebElement seven = driver.findElement(By.id("com.android.calculator2:id/digit_7"));
        seven.click();
        WebElement six = driver.findElement(By.id("com.android.calculator2:id/digit_6"));
        six.click();
        WebElement equal = driver.findElement(By.id("com.android.calculator2:id/eq"));
        equal.click();
        WebElement result = driver.findElement(By.id("com.android.calculator2:id/result"));
        Assert.assertEquals(result.getText(),"174");

    }
    @Test(priority = 2)
    public void multiplication(){
        WebElement nine = driver.findElement(By.id("com.android.calculator2:id/digit_9"));
        nine.click();
        WebElement multiply = driver.findElement(By.id("com.android.calculator2:id/op_mul"));
        multiply.click();
        WebElement six = driver.findElement(By.id("com.android.calculator2:id/digit_6"));
        six.click();
        WebElement equal = driver.findElement(By.id("com.android.calculator2:id/eq"));
        equal.click();
        WebElement result = driver.findElement(By.id("com.android.calculator2:id/result"));
        Assert.assertEquals(result.getText(),"54");
    }
    @Test(priority = 3)
    public void division(){
        WebElement five = driver.findElement(By.id("com.android.calculator2:id/digit_5"));
        five.click();
        WebElement zero = driver.findElement(By.id("com.android.calculator2:id/digit_0"));
        zero.click();
        WebElement divide = driver.findElement(By.id("com.android.calculator2:id/op_div"));
        divide.click();
        WebElement one = driver.findElement(By.id("com.android.calculator2:id/digit_1"));
        one.click();
        WebElement four = driver.findElement(By.id("com.android.calculator2:id/digit_4"));
        four.click();
        WebElement equal = driver.findElement(By.id("com.android.calculator2:id/eq"));
        equal.click();
    }
    @Test(priority = 4)
    public void subtraction(){
        WebElement five = driver.findElement(By.id("com.android.calculator2:id/digit_5"));
        five.click();
        WebElement sub = driver.findElement(By.id("com.android.calculator2:id/op_sub"));
        sub.click();
        WebElement one = driver.findElement(By.id("com.android.calculator2:id/digit_1"));
        one.click();
        WebElement zero = driver.findElement(By.id("com.android.calculator2:id/digit_0"));
        zero.click();
        WebElement equal = driver.findElement(By.id("com.android.calculator2:id/eq"));
        equal.click();
    }
}
