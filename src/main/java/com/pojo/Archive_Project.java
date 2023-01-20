package com.pojo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Archive_Project extends BaseClass{
	public Archive_Project() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//p[@class='sc-dwsnSq fAfTxU']")
	private WebElement sortTabProjectList;
	
	@FindBy(xpath = "(//div[@class='CardOverlay_hoverBackground__1Rp_v'])[1]")
	private WebElement openProjectTab;
	
	@FindBy(xpath = "//div[@class='sc-lcDUFh MmbNG']//*[name()='svg']")
	private WebElement editProject;
	
	@FindBy(xpath = "//div[@class='sc-jlRLRk cbTvaY css-2b097c-container']")
	private WebElement projectStatus;
	
	@FindBy(xpath = "//div[contains(text(),'Ongoing')]")
	private WebElement ongoingStatus;
	
	@FindBy(xpath = "//span[normalize-space()='Update project']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//p[normalize-space()='Units']")
	private WebElement unitTabButton;
	
	@FindBy(xpath = "//p[@class='sc-dwsnSq fAfTxU']")
	private WebElement unitTabSort;
	
		
	
	public WebElement getSortTabProjectList() {
		return sortTabProjectList;
	}



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



	public WebElement getSaveButton() {
		return saveButton;
	}



	public WebElement getUnitTabButton() {
		return unitTabButton;
	}



	public WebElement getUnitTabSort() {
		return unitTabSort;
	}



	public void dropdown() throws AWTException, InterruptedException {
		
		clickButton(getSortTabProjectList());
		selectKey(getSortTabProjectList(), "Project name");
		
		
        clickButton(getOpenProjectTab());
		clickButton(getEditProject());
		clickButton(getProjectStatus());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", getOngoingStatus());
		clickButton(getSaveButton());
		
		
		clickButton(getUnitTabButton());
		clickButton(getUnitTabSort());
		selectKey(getUnitTabSort(), "Status");
				
	}
	
}
