package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.base.BaseClass;
import com.pojo.Add_Project2;
import com.pojo.Archive_Project;
import com.pojo.ClkCheckBox;
import com.pojo.ClkChldObjs;
import com.pojo.ClkColor;
import com.pojo.ClkHover;
import com.pojo.ClkLink;
import com.pojo.ClkShowcase;
import com.pojo.ClkSort;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demo extends BaseClass{
	

	@Given("login into appliocation")
	public void loginIntoAppliocation() throws IOException, InterruptedException, AWTException {

		
		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));
	
	
	}



	

	@When("user validate click showcaseone")
	public void userValidateClickShowcaseone() throws AWTException, InterruptedException {
		
		Add_Project2 a = new Add_Project2();
		a.thumbNail();
		
		

	
	}
	@Then("user logout seventeenth timeone")
	public void userLogoutSeventeenthTimeone() throws InterruptedException, IOException {
		
		LogoutPage l = new LogoutPage();
		l.logOut();

	
	}

	



}
