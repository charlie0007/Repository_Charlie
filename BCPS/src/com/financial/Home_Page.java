package com.financial;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//********************************************************
//Application Name
//Test Script
//Author			
//Reviewed by
//Date Created:
//********************************************************
public class Home_Page {
	public @FindBy(xpath="//*[@id='Startup']") WebElement home_frame;
	public @FindBy(xpath="//*[@id='gotocode']") WebElement jumpto;
	public @FindBy(xpath="//img[@name='OpenSearchWindowImage']") WebElement jumptoclick;
	public @FindBy(xpath="//*[@id='OpenPageWithData']") WebElement go;
}
//***********************************************************