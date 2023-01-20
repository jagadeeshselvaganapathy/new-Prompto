package com.pojo;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ChkNewTab  extends BaseClass{
	public ChkNewTab() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[name()='svg'][@height='1em'][@width='1em'])[5]")
	private WebElement projectClick;
	
	@FindBy(xpath = "//p[normalize-space()='Field Builder']")
	private WebElement fieldBuilder;
	
	@FindBy(xpath = "//button[@class='sc-bLxsvN dFSfdT']")
	private WebElement customField;
	
	@FindBy(xpath = "//span[@class='Button_button__label__1h86U Button_spanStyle__2u_Xo']")
	private WebElement addCustomField;

	@FindBy(xpath = "//input[@id='localizedFieldName']")
	private WebElement fieldName;
	
	@FindBy(xpath = "//input[@id='localizedFieldInstructions']")
	private WebElement fieldInstruction;
	
	@FindBy(xpath = "//button[@class='sc-fQwXoG sc-jiFqbx LTysb jtUTHP']")
	private WebElement createField;
	
	@FindBy(xpath = "//p[normalize-space()='USPs']")
	private WebElement uspTab;
	
	@FindBy(xpath = "//span[@class='Button_button__label__1h86U Button_spanStyle__2u_Xo']")
	private WebElement addNewUsp;
	
	@FindBy(xpath = "//input[@id='headline']")
	private WebElement uspHeadline;
	
	@FindBy(xpath = "//div[@data-slate-object='block']")
	private WebElement UspTextBox;
	
	@FindBy(xpath = "//button[@class='sc-gsHYby sc-dwnnvz cWkERl gGKXZW']")
	private WebElement uspCreateButton;
	
	@FindBy(xpath = "//p[normalize-space()='Units']")
	private WebElement unitTab;
	
	@FindBy(xpath = "//button[@class='sc-jPVqqI fwxmsz']")
	private WebElement unitTypes;
	
	@FindBy(xpath = "//span[@class='Button_button__label__1h86U Button_spanStyle__2u_Xo']")
	private WebElement addNewUnitType;
	
	@FindBy(xpath = "//input[@id='name']")
	private WebElement unitTypeName;
	
	@FindBy(xpath = "//button[@class='sc-hNoEer sc-eFTzqW iqDmms icQyca']")
	private WebElement createUnitType;
	
	
	public WebElement getProjectClick() {
		return projectClick;
	}

	public WebElement getFieldBuilder() {
		return fieldBuilder;
	}

	public WebElement getCustomField() {
		return customField;
	}

	public WebElement getAddCustomField() {
		return addCustomField;
	}

	public WebElement getFieldName() {
		return fieldName;
	}

	public WebElement getFieldInstruction() {
		return fieldInstruction;
	}

	public WebElement getCreateField() {
		return createField;
	}

	public WebElement getUspTab() {
		return uspTab;
	}

	public WebElement getAddNewUsp() {
		return addNewUsp;
	}

	public WebElement getUspHeadline() {
		return uspHeadline;
	}

	public WebElement getUspTextBox() {
		return UspTextBox;
	}

	public WebElement getUspCreateButton() {
		return uspCreateButton;
	}

	public WebElement getUnitTab() {
		return unitTab;
	}

	public WebElement getUnitTypes() {
		return unitTypes;
	}

	public WebElement getAddNewUnitType() {
		return addNewUnitType;
	}

	public WebElement getUnitTypeName() {
		return unitTypeName;
	}

	public WebElement getCreateUnitType() {
		return createUnitType;
	}

	public void chkNewTab() throws InterruptedException, AWTException {

		clickButton(getProjectClick());
		clickButton(getFieldBuilder());
		clickButton(getCustomField());
		clickButton(getAddCustomField());
		insertText(getFieldName(), "besttst");
		insertText(getFieldInstruction(), "yyyy");
		clickButton(getCreateField());
		clickButton(getUspTab());
		clickButton(getAddNewUsp());
		insertText(getUspHeadline(), "besttst");
		insertText(getUspTextBox(), "yyyy");
		clickButton(getUspCreateButton());
		clickButton(getUnitTab());
		clickButton(getUnitTypes());
		clickButton(getAddNewUnitType());
		insertText(getUnitTypeName(), "besttst");
		clickButton(getCreateUnitType());
		
		
			}
	
	
	
}