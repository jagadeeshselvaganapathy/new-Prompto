package com.pojo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ClkIcons extends BaseClass{
		public ClkIcons() {
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath = "//div[@class='sc-iukxot ktYUzn']")
		private WebElement tutorialButton;

		@FindBy(xpath = "//iframe[@title='Modal']")
		private WebElement iframeSwich;
		
		@FindBy(xpath = "//a[@class='appcues-button-success appcues-button']")
		private WebElement goButton;
		
		@FindBy(xpath = "//a[normalize-space()='No thanks']")
		private WebElement noThanks;
		
		@FindBy(xpath = "//button[@id='sidebarButton_portfolio']")
		private WebElement showCaseThumbnail;
		
		@FindBy(xpath = "(//*[name()='svg'][@height='1em'][@width='1em'])[5]")
		private WebElement editThumbnail;
	
		
		
	public WebElement getTutorialButton() {
			return tutorialButton;
		}



		public WebElement getIframeSwich() {
			return iframeSwich;
		}



		public WebElement getGoButton() {
			return goButton;
		}



		public WebElement getNoThanks() {
			return noThanks;
		}



		public WebElement getShowCaseThumbnail() {
			return showCaseThumbnail;
		}



		public WebElement getEditThumbnail() {
			return editThumbnail;
		}



	public void clkIcons() throws InterruptedException {

		clickButton(getTutorialButton());
		driver.switchTo().frame(getIframeSwich());
		clickButton(getGoButton());
		clickButton(getNoThanks());
		
		clickButton(getShowCaseThumbnail());
		// to get parent window id
				String par = driver.getWindowHandle();
				//to get all window id
				Set<String> all = driver.getWindowHandles();
				for (String x : all) {
					if (!par.equals(x)) {
						driver.switchTo().window(x);
						Thread.sleep(5000);
						driver.close();
					}
				}
				Thread.sleep(5000);
				
				
		Actions a = new Actions(driver);
		a.moveToElement(getEditThumbnail()).build().perform();
		Thread.sleep(5000);
				
		
	}
		
		

}
