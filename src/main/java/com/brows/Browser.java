package com.brows;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) throws InterruptedException, AWTException {
		  WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://devapp.prompto.com/en/projects/mP6KrpvAs5/projectShowcase");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			driver.findElement(By.id("username")).sendKeys("wario");
			driver.findElement(By.id("password")).sendKeys("test");
			driver.findElement(By.id("button_signInButton")).click();
			Thread.sleep(40000);
			
			driver.findElement(By.xpath("(//*[name()='svg'][@height='1em'][@width='1em'])[14]")).click();
			driver.findElement(By.xpath("//p[normalize-space()='Showcase Editor']")).click();
			driver.findElement(By.xpath("//div[normalize-space()='Map']")).click();
			//((JavascriptExecutor) driver).executeScript("document.getElementById('locatorid').style.backgroundColor = 'lightblue';");
			driver.findElement(By.xpath("//button[@title='Draw a shape']")).click();
			WebElement elem = driver.findElement(By.cssSelector("body > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2)"));
	       Thread.sleep(5000);
			Actions a = new Actions(driver);
	        a.moveByOffset(500, 200).click().pause(Duration.ofSeconds(5)).moveByOffset(0, 200).click().pause(Duration.ofSeconds(5)).moveByOffset(150, 0).doubleClick().build().perform();
	        Thread.sleep(5000);  
	        driver.findElement(By.xpath("//button[@title='Stop drawing']//span")).click();
	        Thread.sleep(3000);
	        a.moveByOffset(0, 0).clickAndHold().pause(Duration.ofSeconds(5)).moveByOffset(50, 0).click().build().perform();
		
	        Thread.sleep(5000);
			
			
			
			System.out.println("click");
			
			

			
			
			
			
		
			
	}}
