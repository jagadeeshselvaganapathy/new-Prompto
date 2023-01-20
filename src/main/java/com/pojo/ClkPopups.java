package com.pojo;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ClkPopups  extends BaseClass{
	public ClkPopups() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='VizExNotificationBadge__Wrapper-sc-1gx8wf0-0 eQIwfj']")
	private WebElement helpButton;
	
	@FindBy(xpath = "//span[@class='Button_button__label__1h86U Button_spanStyle__2u_Xo']")
	private WebElement addNewProject;
	
	@FindBy(xpath = "//span[normalize-space()='cancel']")
	private WebElement cancelButton;

	@FindBy(xpath = "(//button[@class='ProjectCard_actionButton__2yTLi'])[1]")
	private WebElement marketPage;
	
	@FindBy(xpath = "//div[@class='sc-jWsAeH gHhLRo']")
	private WebElement shareIcon;
	
	@FindBy(xpath = "//div[@class='sc-oUnPI iVVzrr']")
	private WebElement closeShareIcon;
	
	@FindBy(xpath = "//span[normalize-space()='Portfolio']")
	private WebElement portfolioTab;
	
	@FindBy(xpath = "//div[@class='sc-pReKu drCsLG']")
	private WebElement wizardButton;
	
	@FindBy(xpath = "//button[@class='sc-qQlgh dnZKXh']")
	private WebElement closeWizard;
	
	@FindBy(xpath = "//button[@class='sc-qQMSE hcDJHv']")
	private WebElement sortButton;
	
	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")
	private WebElement cancelSort;


	public WebElement getHelpButton() {
		return helpButton;
	}

	public WebElement getAddNewProject() {
		return addNewProject;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getMarketPage() {
		return marketPage;
	}

	public WebElement getShareIcon() {
		return shareIcon;
	}

	public WebElement getCloseShareIcon() {
		return closeShareIcon;
	}

	public WebElement getPortfolioTab() {
		return portfolioTab;
	}

	public WebElement getWizardButton() {
		return wizardButton;
	}

	public WebElement getCloseWizard() {
		return closeWizard;
	}

	public WebElement getSortButton() {
		return sortButton;
	}

	public WebElement getCancelSort() {
		return cancelSort;
	}

	public void clkPopups() throws InterruptedException, AWTException {

		clickButton(getHelpButton());
		clickButton(getHelpButton());
		clickButton(getAddNewProject());
		clickButton(getCancelButton());
		clickButton(getMarketPage());
		// to get parent window id
		String par = driver.getWindowHandle();
		//to get all window id
		Set<String> all = driver.getWindowHandles();
		for (String x : all) {
			if (!par.equals(x)) {
				driver.switchTo().window(x);
				Thread.sleep(5000);
				clickButton(getShareIcon());
				Thread.sleep(5000);
				clickButton(getCloseShareIcon());
				driver.close();
			}
		}Thread.sleep(5000);
		clickButton(getPortfolioTab());
		// to get parent window id
				String par1 = driver.getWindowHandle();
				//to get all window id
				Set<String> all1 = driver.getWindowHandles();
				for (String x1 : all1) {
					if (!par1.equals(x1)) {
						driver.switchTo().window(x1);
						Thread.sleep(5000);
						clickButton(getWizardButton());
						Thread.sleep(5000);
						clickButton(getCloseWizard());
						Thread.sleep(5000);
						clickButton(getSortButton());
						Thread.sleep(5000);
						clickButton(getCancelSort());
						driver.close();
					}
				}
		Thread.sleep(5000);

			
	}
	
	
	
}