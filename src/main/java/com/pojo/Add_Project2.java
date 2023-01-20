package com.pojo;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;

public class Add_Project2 extends BaseClass {
	
	public Add_Project2() {
     PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@class='CardOverlay_hoverBackground__1Rp_v'])[1]")
	private WebElement openProjectTab;
	
	@FindBy(xpath = "//div[@class='sc-lcDUFh MmbNG']//*[name()='svg']")
	private WebElement editProject;
	
	@FindBy(xpath = "//div[@class='sc-jlRLRk cbTvaY css-2b097c-container']")
	private WebElement projectStatus;
	
	@FindBy(xpath = "//div[contains(text(),'Ongoing')]")
	private WebElement ongoingStatus;
	
	@FindBy(xpath = "//div[contains(text(),'Completed')]")
	private WebElement completeedStatus;
	
	@FindBy(xpath = "//button[@id='sidebarButton_projects']")
	private WebElement projectThumbnail;
	
	@FindBy(xpath = "//button[@id='sidebarButton_portfolio']")
	private WebElement showCaseThumbnail;
	
	@FindBy(xpath = "//div[@class='sc-ksHpcM bwZhyF']") //units on the thumbnail, for loop for view multiple mouse over actions
	private WebElement unitThumbnail;
	

	public WebElement getOpenProjectTab() {
		return openProjectTab;
	}

	public WebElement getEditProject() {
		return editProject;
	}

	public WebElement getProjectStatus() {
		return projectStatus;
	}

	public WebElement getOngoingStatus() {
		return ongoingStatus;
	}
	
	public WebElement getCompleteedStatus() {
		return completeedStatus;
	}
	
	public WebElement getProjectThumbnail() {
		return projectThumbnail;
	}
	
	public WebElement getShowCaseThumbnail() {
		return showCaseThumbnail;
	}
	
	public WebElement getUnitThumbnail() {
		return unitThumbnail;
	}
	
	public void thumbNail() throws AWTException, InterruptedException {

		clickButton(getOpenProjectTab());
		
		clickButton(getEditProject());
		
		clickButton(getProjectStatus());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", getOngoingStatus());
		
		clickButton(getProjectStatus());
		
		js.executeScript("arguments[0].click()", getCompleteedStatus());
		
		clickButton(getProjectThumbnail());
		
		Thread.sleep(5000);
		
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
		
		for (int i = 0; i <= 3; i++) {
			
			Actions a = new Actions(driver);
			a.moveToElement(getUnitThumbnail());
			Thread.sleep(3000);
			
		}
	
			
	}	
	}
