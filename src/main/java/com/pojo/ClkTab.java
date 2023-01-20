package com.pojo;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ClkTab extends BaseClass{
	public ClkTab() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "(//p[contains(text(),'Open project')])[1]")
	private WebElement projectOpen;
	
	@FindBy(xpath = "//p[normalize-space()='Sharecodes']")
	private WebElement shareCodesTab;
	
	@FindBy(xpath = "//button[@id='sidebarButton_settings']")
	private WebElement settingTab;
	
	@FindBy(xpath = "//p[normalize-space()='Units']")
	private WebElement unitTab;
	
	
	@FindBy(xpath = "//button[@class='sc-ttenJ fobWv']")
	private WebElement unitTypeTab;
	

	public WebElement getProjectOpen() {
		return projectOpen;
	}


	public WebElement getShareCodesTab() {
		return shareCodesTab;
	}


	public WebElement getSettingTab() {
		return settingTab;
	}


	public WebElement getUnitTab() {
		return unitTab;
	}


	public WebElement getUnitTypeTab() {
		return unitTypeTab;
	}


	public void clkTab() throws AWTException, InterruptedException {
		
	clickButton(getProjectOpen());
	clickButton(getShareCodesTab());
	Thread.sleep(5000);
	
	clickButton(getSettingTab());
	
	clickButton(getProjectOpen());
	clickButton(getUnitTab());
	Thread.sleep(5000);
	clickButton(getUnitTypeTab());
	Thread.sleep(5000);
	
			
	}
	
	

}
