package com.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumLaunch {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VINOTH\\eclipse-tasks\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement userTxt = driver.findElement(By.id("email"));
	    userTxt.sendKeys("Vinoth");
		
	    Actions a = new Actions(driver);
	    a.doubleClick(userTxt).contextClick(userTxt).build().perform();
	   
	    Robot r = new Robot ();
	    for(int i =0; i<2; i++) {
	     r.keyPress(KeyEvent.VK_DOWN);
	     r.keyRelease(KeyEvent.VK_DOWN);
	    } 	
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     r.keyPress(KeyEvent.VK_TAB);
	     r.keyRelease(KeyEvent.VK_TAB);
	     r.keyPress(KeyEvent.VK_CONTROL);
	     r.keyPress(KeyEvent.VK_V);
	     r.keyRelease(KeyEvent.VK_CONTROL);
	     r.keyRelease(KeyEvent.VK_V);
	     
	     WebElement pass = driver.findElement(By.id("pass"));
	     String s = pass.getAttribute("value");
	     boolean b = s.equals("Vinoth");
	     System.out.println(b);
		}
	

	
}