package com.pojo;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ClkHover extends BaseClass{
	public ClkHover() {
		PageFactory.initElements(driver, this);
	}
	

	
	
	@FindBy(xpath = "(//*[name()='svg'][@height='1em'][@width='1em'])[5]")
	private WebElement editThumbnail;
	
	
	@FindBy(xpath = "(//div[@class='sc-ksHpcM bwZhyF'])[1]")
	private WebElement unitThumbNail;
	
	@FindBy(xpath = "//span[normalize-space()='Settings']")
	private WebElement settingButton;
	
	@FindBy(xpath = "(//li[@class='sc-cTAIfT iFKgzA'])[1]")
	private WebElement mediaHover;
	
	
	public WebElement getEditThumbnail() {
		return editThumbnail;
	}


	public WebElement getUnitThumbNail() {
		return unitThumbNail;
	}


	public WebElement getSettingButton() {
		return settingButton;
	}


	public WebElement getMediaHover() {
		return mediaHover;
	}


	public void clkHover() throws AWTException, InterruptedException {
		
		
		Actions a  = new Actions(driver);
		a.moveToElement(getEditThumbnail()).build().perform();
		Thread.sleep(5000);
		a.moveToElement(getUnitThumbNail()).build().perform();			
		Thread.sleep(5000);
		a.moveToElement(getSettingButton()).build().perform();
		Thread.sleep(5000);
		clickButton(getEditThumbnail());
		a.moveToElement(getMediaHover()).build().perform();
		Thread.sleep(5000);
		
		
			
	}
	
	

}
