package com.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.BaseClass;
import com.pojo.Add_Project;
import com.pojo.Add_Project2;
import com.pojo.Archive_Project;
import com.pojo.ChkNewTab;
import com.pojo.ClkCheckBox;
import com.pojo.ClkChldObjs;
import com.pojo.ClkColor;
import com.pojo.ClkDragAndDrop;
import com.pojo.ClkHover;
import com.pojo.ClkIcons;
import com.pojo.ClkLink;
import com.pojo.ClkPopups;
import com.pojo.ClkTab;
import com.pojo.ClkTextfield;
import com.pojo.ClkUpload;
import com.pojo.ClkUrl;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class NoRuleSingleFlow extends BaseClass {
	

	@Given("user with valid credentials they login")
	public void userWithValidCredentialsTheyLogin() throws InterruptedException, IOException {
		
		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));
		
	}

	@When("user validate click button")
	public void userValidateClickButton() throws AWTException, InterruptedException {

//		Add_Project a = new Add_Project();
//		a.addProject();
	
	}

	@Then("user logout")
	public void userLogout() throws InterruptedException, IOException {
		
//		LogoutPage l = new LogoutPage();
//		l.logOut();

	}
	
	
	
	 @When("user validate click checkbox")
	    public void userValidateClickCheckbox() throws AWTException, InterruptedException {
	    	
	    	ClkCheckBox c = new ClkCheckBox();
	    	c.clkCheckBox();

	    
	    }

	    @Then("user logout tenth time")
	    public void userLogoutTenthTime() throws InterruptedException, IOException {
	    	
	    	LogoutPage l = new LogoutPage();
			l.logOut();

	    
	    }
	    
	    
	 
	    
	    
	    @When("user validate click chldobjs")
	    public void userValidateClickChldobjs() throws InterruptedException, AWTException {
	    	
	 //   	ClkChldObjs c = new ClkChldObjs();
	 //   	c.clkChldObjs();

	    
	    }

	    @Then("user logout twelth time")
	    public void userLogoutTwelthTime() throws InterruptedException, IOException {
	    	
//	    	LogoutPage l = new LogoutPage();
//			l.logOut();
			
	    }
	    
	    
	    
	    
	    
	    
	    @When("user validate click color")
	     public void userValidateClickColor() throws InterruptedException, AWTException {

	 //   	 ClkColor c = new ClkColor();
	 //   	 c.clkColor();

	     }

	     @Then("user logout sixteenth time")
	     public void userLogoutSixteenthTime() throws InterruptedException, IOException {
	    	 
//	    	 LogoutPage l = new LogoutPage();
//	 		l.logOut();


	     }
	     
	     
	     
	     
	 	@When("user validate click dropdown")
		public void userValidateClickDropdown() throws AWTException, InterruptedException {
			
//			Archive_Project a = new Archive_Project();
//			a.dropdown();

		
		}

		@Then("user logout third time")
		public void userLogoutThirdTime() throws InterruptedException, IOException {
			
//			LogoutPage l = new LogoutPage();
//			l.logOut();
			
		}
		
		
		   @When("user validate click Hover")
		    public void userValidateClickHover() throws AWTException, InterruptedException {
		    	
		 //   	ClkHover c = new ClkHover();
//		    	c.clkHover();

		    
		    }

		    @Then("user logout eleventh time")
		    public void userLogoutEleventhTime() throws InterruptedException, IOException {
		    	
		  //  	LogoutPage l = new LogoutPage();
//				l.logOut();

		    
		    }
		    
		    
		    
		    @When("user validate click Link")
		    public void userValidateClickLink() throws AWTException, InterruptedException {
		    	
//		    	ClkLink c = new ClkLink();
		 //   	c.clkLink();
		    	
		    }

		    @Then("user logout Sixth time")
		    public void userLogoutSixthTime() throws InterruptedException, IOException {
		    	
//		    	LogoutPage l = new LogoutPage();
//				l.logOut();
			
		    }
		    
		    
		    @When("user validate click thumbnail")
			public void userValidateClickThumbnail() throws AWTException, InterruptedException {
				
//				Add_Project2 a = new Add_Project2();
//				a.thumbNail();

			}

			@Then("user logout secound time")
			public void userLogoutSecoundTime() throws InterruptedException, IOException {
				
//				LogoutPage l = new LogoutPage();
//				l.logOut();
			
			}
			
			
			
			@When("user validate click Icons")
			public void userValidateClickIcons() throws InterruptedException {
				
//				ClkIcons c = new ClkIcons();
//				c.clkIcons();
				
			}

			@Then("user logout forth time")
			public void userLogoutForthTime() throws InterruptedException, IOException {
				
//				LogoutPage l = new LogoutPage();
//				l.logOut();
				
			}
			
			
			  @When("user validate click newtab")
			    public void userValidateClickNewtab() throws InterruptedException, AWTException {

			  //  	ChkNewTab c = new ChkNewTab();
			  //  	c.chkNewTab();
			    
			    }

			    @Then("user logout fiftinth time")
			    public void userLogoutFiftinthTime() throws InterruptedException, IOException {

			    
			  //  	LogoutPage l = new LogoutPage();
//					l.logOut();
			    
			    }
			    
			    
			    @When("user validate click tab")
			    public void userValidateClickTab() throws AWTException, InterruptedException {
			    	
			 //   	ClkTab c = new ClkTab();
			 //   	c.clkTab();

			    }

			    @Then("user logout ninth time")
			    public void userLogoutNinthTime() throws InterruptedException, IOException {
			    	
//			    	LogoutPage l = new LogoutPage();
//					l.logOut();

			    }
			    
			    
			    @When("user validate click popups")
			    public void userValidateClickPopups() throws InterruptedException, AWTException {
			    	
			 //   	ClkPopups c = new ClkPopups();
			 //   	c.clkPopups();
			 
			    }

			    @Then("user logout thirth time")
			    public void userLogoutThirthTime() throws InterruptedException, IOException {
			    	
			 //   	LogoutPage l = new LogoutPage();
//					l.logOut();

			    }
			    
			    @When("user validate click TextField")
			    public void userValidateClickTextField() throws InterruptedException, AWTException {
			    	
			  //  	ClkTextfield c = new ClkTextfield();
			 //   	c.clkTextFields();

			    
			    }

			    @Then("user logout fifth time")
			    public void userLogoutFifthTime() throws InterruptedException, IOException {
			    	
			 //   	LogoutPage l = new LogoutPage();
//					l.logOut();
					
			    }
			    
			    
			    @When("user validate click upload")
			    public void userValidateClickUpload() throws AWTException, InterruptedException {

//			    	ClkUpload c = new ClkUpload();
//			    	c.clkUpload();
			    
			    }

			    @Then("user logout eighth time")
			    public void userLogoutEighthTime() throws InterruptedException, IOException {
			    	
//			    	LogoutPage l = new LogoutPage();
//					l.logOut();

			    }
			    
			    
			    @When("user validate click url")
			    public void userValidateClickUrl() throws InterruptedException, AWTException {
			    	
			 //   	ClkUrl c = new ClkUrl();
			 //   	c.clkUrl();
			    	
			    }

			    @Then("user logout fourtinth time")
			    public void userLogoutFourtinthTime() throws InterruptedException, IOException {
			    	
			 //   	LogoutPage l = new LogoutPage();
//					l.logOut();

			    }
	
	
	
	
	
	

    
    
    
    @When("user validate click draganddrop")
    public void userValidateClickDraganddrop() throws AWTException, InterruptedException {
    	
 //   	ClkDragAndDrop c = new ClkDragAndDrop();
  //  	c.clkDragAndDrop();

    
    }

    @Then("user logout seventh time")
    public void userLogoutSeventhTime() throws InterruptedException, IOException {
    	
//    	LogoutPage l = new LogoutPage();
//		l.logOut();

    }
    

    
    
    
	
    
  
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
 
    
    
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
 
    
    
    
    
    
    
    

  
    
    
    
    
    
    
    
    
    

  
     
     
     
     
    
	
	
	}
	

	


