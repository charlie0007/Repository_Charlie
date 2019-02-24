package com.financial;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//Application Name: BCPS Financial
//Test Script	  : Login Page Objects
//Author 		  : Sehar
//Reviewed by	  : Sehar
//Date Created	  : 02232019
//********************************************************
public class Login_Page {
	
	public @FindBy(name="login") WebElement userid;
	public @FindBy(name="password") WebElement pass;
	public @FindBy(name="vslogin") WebElement button;
//********************************************************
}
