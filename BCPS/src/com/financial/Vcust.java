package com.financial;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//Application Name
//Test Script
//Author
//Reviewed by
//Date Created


public class Vcust {
	
	public @FindBy(xpath="//*[@id='Display']") WebElement vcust_frame;
	public @FindBy(xpath="//*[@id='T1R_VEND_CUSTinsert']") WebElement insert;
	public @FindBy(xpath="//*[@id='txtT1VEND_CUST_CD']") WebElement vendor;
	public @FindBy(xpath="//*[@id='txtT1LGL_NM']") WebElement lname;
	public @FindBy(xpath="//*[@id='T1R_VEND_CUSTSaveAll']") WebElement save;


}
