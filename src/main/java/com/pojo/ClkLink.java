package com.pojo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ClkLink extends BaseClass{
	public ClkLink() {
		PageFactory.initElements(driver, this);
		}
	
	
	@FindBy(xpath = "//span[normalize-space()='Settings']")
	private WebElement settingsButton;
	
	@FindBy(xpath = "//p[normalize-space()='Team']")
	private WebElement teambutton;

	@FindBy(xpath = "//a[@class='sc-GwHqw cFREJO']")
	private WebElement faqLink;
	
	@FindBy(xpath = "//li[@class='kb-header__company-website-link']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//span[normalize-space()='forgot password?']")
	private WebElement forgetPassword;
	
		
	public WebElement getSettingsButton() {
		return settingsButton;
	}


	public WebElement getTeambutton() {
		return teambutton;
	}


	public WebElement getFaqLink() {
		return faqLink;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public WebElement getForgetPassword() {
		return forgetPassword;
	}


	public void clkLink() throws AWTException, InterruptedException {
		
	clickButton(getSettingsButton());
	
	clickButton(getTeambutton());
	
	clickButton(getFaqLink());
	// to get parent window id
	String par = driver.getWindowHandle();
	//to get all window id
	Set<String> all = driver.getWindowHandles();
	for (String x : all) {
		if (!par.equals(x)) {
			driver.switchTo().window(x);
			Thread.sleep(5000);
			
			
			clickButton(getLoginButton());
			// to get parent window id
			String par1 = driver.getWindowHandle();
			//to get all window id
			Set<String> all1 = driver.getWindowHandles();
			for (String x1 : all) {
				if (!par1.equals(x)) {
					driver.switchTo().window(x);
					Thread.sleep(5000);
					clickButton(getForgetPassword());
					driver.close();
				}
			}
			Thread.sleep(5000);
			driver.close();
		}
	}
	Thread.sleep(5000);
		
	}

}
	
	


	


