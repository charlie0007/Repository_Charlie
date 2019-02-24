package com.financial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//***********************************************************************************
//Application Name
//Module
//Test Script
//Date Created
//Author
//Reviewed by
//***********************************************************************************
public class Methods {
	public WebDriver driver;
	public Workbook wb;
	public Sheet sh;
	public FileInputStream f;
	public File snap;
	public int i=0;

//**********************************************************************************	
	//Launching application
	public void launchApp(String url){
	driver= new FirefoxDriver();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
}
//**********************************************************************************
	//closing application
	public void closeApp(){
		driver.close();
	}
//**********************************************************************************
	//screenshot facility
	public void snapshot(String sspath) throws Exception{
		snap= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(snap, new File(sspath));

	}
//*********************************************************************************
	//excelRead
	public String excelRead(String fileread,String sheet, int c, int r) throws Exception{
		f=new FileInputStream(fileread);
		wb=Workbook.getWorkbook(f);
		sh=wb.getSheet(sheet);
		sh.getCell(c, r).getContents();
		return sh.getCell(c,r).getContents();
	}
//***********************************************************************************
	//Snapcounter
	public void snapcounter(){
	
	i=i+1;}
//*************************************************************************************
	//Windowswitch
	public void windowHand(){
		Set<String> wind = driver.getWindowHandles();
		ArrayList<String> w = new ArrayList(wind);
		driver.switchTo().window(w.get(1));
	}
//************************************************************************************
	//FrameSwitch
	public void frameswitch(WebElement framelocator){
		driver.switchTo().frame(framelocator);
	}
//************************************************************************************	
}
