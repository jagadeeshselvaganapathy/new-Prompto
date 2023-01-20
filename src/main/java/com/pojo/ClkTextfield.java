package com.pojo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ClkTextfield  extends BaseClass{
	public ClkTextfield() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@class='Button_button__label__1h86U Button_spanStyle__2u_Xo']")
	private WebElement addProjectButton;
	
	@FindBy(xpath = "//input[@id='projectTitle']")
	private WebElement addProjectName;
	
	@FindBy(xpath = "//input[@placeholder='Enter an address']")
	private WebElement Address;
	
	@FindBy(xpath = "//span[normalize-space()='cancel']")
	private WebElement cancelButton;

	@FindBy(xpath = "(//p[contains(text(),'Open project')])[1]")
	private WebElement projectOpen;
	
	@FindBy(xpath = "//div[@role='textbox']")
	private WebElement textBox;
	
	@FindBy(xpath = "//div[@class='RichTextField_editIcon__2FvU8']")
	private WebElement nodePadEdit;
	
	@FindBy(xpath = "(//div[@data-slate-object='block'])[2]")
	private WebElement nodePadEditText;
	
	@FindBy(xpath = "//span[normalize-space()='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//p[normalize-space()='USPs']")
	private WebElement uspButton;
	
	@FindBy(xpath = "//span[@class='Button_button__label__1h86U Button_spanStyle__2u_Xo']")
	private WebElement addUspButton;
	
	@FindBy(xpath = "//input[@id='headline']")
	private WebElement addUspheadline;
	
	@FindBy(xpath = "//div[@data-slate-object='block']")
	private WebElement addUspTextBox;
	
	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")
	private WebElement cancelButtontwo;
	
	
		
	public WebElement getAddProjectButton() {
		return addProjectButton;
	}



	public WebElement getAddProjectName() {
		return addProjectName;
	}



	public WebElement getAddress() {
		return Address;
	}



	public WebElement getCancelButton() {
		return cancelButton;
	}



	public WebElement getProjectOpen() {
		return projectOpen;
	}



	public WebElement getTextBox() {
		return textBox;
	}



	public WebElement getNodePadEdit() {
		return nodePadEdit;
	}



	public WebElement getNodePadEditText() {
		return nodePadEditText;
	}



	public WebElement getSaveButton() {
		return saveButton;
	}



	public WebElement getUspButton() {
		return uspButton;
	}



	public WebElement getAddUspButton() {
		return addUspButton;
	}



	public WebElement getAddUspheadline() {
		return addUspheadline;
	}



	public WebElement getAddUspTextBox() {
		return addUspTextBox;
	}



	public WebElement getCancelButtontwo() {
		return cancelButtontwo;
	}



	public void clkTextFields() throws InterruptedException, AWTException {

		clickButton(getAddProjectButton());
		insertText(getAddProjectName(), "Demo Project");
		insertText(getAddress(), "India");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		clickButton(getCancelButton());
		
		clickButton(getProjectOpen());
		insertText(getTextBox(), "Selenium Automation");
		clickButton(getNodePadEdit());
		clickButton(getNodePadEditText());
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
        insertText(getNodePadEditText(), "Enter");
        clickButton(getSaveButton());
        
        clickButton(getUspButton());
        clickButton(getAddUspButton());
        insertText(getAddUspheadline(), "uspheadline");
        insertText(getAddUspTextBox(), "usptextbox");
        Thread.sleep(10000);
        clickButton(getCancelButtontwo());
        
		
	
	}
	
	
	
}