package com.charlie;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.financial.Home_Page;
import com.financial.Login_Page;
import com.financial.Methods;
import com.financial.Vcust;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.TagName;


public class TC01VCUST {

	public void vendorcreation() throws Exception{			
//***********************************************************************************
		//Reusable Methods object Creation
		Methods m= new Methods();
//************************************************************************************
		//Launching Advantage Financial
		System.out.println("Launching Advantage Financials");
		m.launchApp("http://w2k16-app-fin-1.ams.com/webapp/ah3111ow1/Advantage");
		m.snapshot("C:\\Users\\sehar.jiwan\\Desktop\\Automation Framework\\Test Results\\Charlie\\TC01\\snap"+m.i+".png");
		m.snapcounter();
		System.out.println("Application is launched | Snap clicked");
//***********************************************************************************
		//Implicit wait
		WebDriverWait wait= new WebDriverWait(m.driver, 60);
//***********************************************************************************
		//PageObjects inference
		Login_Page lp= PageFactory.initElements(m.driver, Login_Page.class);
		Home_Page hp= PageFactory.initElements(m.driver, Home_Page.class);
		Vcust vp= PageFactory.initElements(m.driver, Vcust.class);	
//***********************************************************************************

//**********************************************************************************
		//Logging In
		System.out.println("Logging Inside application");
		String value = m.excelRead("C:\\Users\\sehar.jiwan\\Desktop\\Automation Framework\\Test Data\\Login.xls","Sheet1",0,1);
		lp.userid.sendKeys(value);
		value = m.excelRead("C:\\Users\\sehar.jiwan\\Desktop\\Automation Framework\\Test Data\\Login.xls","Sheet1",0,2);
		lp.pass.sendKeys(value);
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*")));
		Thread.sleep(5000);
		m.snapshot("C:\\Users\\sehar.jiwan\\Desktop\\Automation Framework\\Test Results\\Charlie\\TC01\\snap"+m.i+".png");
		m.snapcounter();
		lp.button.click();
		System.out.println("Logged in successfully | Snap clicked | Test Passed");
//**********************************************************************************
		//Window switching
		m.windowHand();
		//Frame switching
		m.frameswitch(hp.home_frame);
//********************************************************************************
		//Searching Vcust page through home page
		System.out.println("Searching Vcust page through home page");
		hp.jumpto.sendKeys("vcust");
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*")));
		Thread.sleep(10000);
		m.snapshot("C:\\Users\\sehar.jiwan\\Desktop\\Automation Framework\\Test Results\\Charlie\\TC01\\snap"+m.i+".png");
		m.snapcounter();
		hp.go.click();
		System.out.println("VCUST search is complete | Snap Clicked | Test Passed");
		m.driver.switchTo().parentFrame();
//**********************************************************************************
		//Saving Vendor customer on Vcust
		System.out.println("Creating Vcust Entry");
		m.frameswitch(vp.vcust_frame);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("input")));
		vp.insert.click();
		value = m.excelRead("C:\\Users\\sehar.jiwan\\Desktop\\Automation Framework\\Test Data\\Login.xls","Sheet1",0,3);
		vp.vendor.sendKeys(value);
		value = m.excelRead("C:\\Users\\sehar.jiwan\\Desktop\\Automation Framework\\Test Data\\Login.xls","Sheet1",0,4);
		vp.lname.sendKeys(value);
		vp.save.click();
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*")));
		Thread.sleep(5000);
		m.snapshot("C:\\Users\\sehar.jiwan\\Desktop\\Automation Framework\\Test Results\\Charlie\\TC01\\snap"+m.i+".png");
		m.snapcounter();
		System.out.println("Vcust entry created successfully | Snap Clicked | Test Passed");
//***********************************************************************************
		//closing app
		System.out.println("Closing application");
		m.closeApp();
//**********************************************************************************
	
	}
}
