package com.maven_Project.Maven_Project1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Runner_Class extends Base_Class {
	public static WebDriver driver=Base_Class.getBrowser("chrome");
	public static Log_In lg = new Log_In(driver);
	public static Hotel_Details hd = new Hotel_Details(driver);
	public static Customer_Details cd= new Customer_Details(driver);
	public static Select_Hotel sh=new Select_Hotel(driver);
	public static void main(String[] args) throws IOException {
	
		getUrl("http://adactinhotelapp.com/HotelAppBuild2/");
		maxi();
		sendKeys(lg.getUsername(), "JayanthiThiruppathi");
		sendKeys(lg.getPassword(), "232541");
		click(lg.getLogin());
		dropDown("byvisibletext", hd.getLocation(), "London");
		dropDown("byvisibletext", hd.getHotel(),"Hotel Sunshine");
		dropDown("byindex", hd.getRoom(), "2");
		dropDown("byindex", hd.getNo(), "1");
		clear(hd.getDate());
		sendKeys(hd.getDate(), "17/11/2021");
		dropDown("byindex", hd.getChild(), "2");
		click(hd.getSubmit());
	
		click(sh.getRadio());
		click(sh.getCon());
		sendKeys(cd.getFirstname(), "Jayanthi");
		sendKeys(cd.getLastname(), "Thiruppathi");
		sendKeys(cd.getAddress(), "M.G.R Nagar,Madurai");
		sendKeys(cd.getCc_num(), "1234567891234567");
		sendKeys(cd.getCc_type(), "VISA");
		sendKeys(cd.getExp_mnth(), "May");
		sendKeys(cd.getExp_year(), "2022");
		sendKeys(cd.getCvv(), "999");
		click(cd.getBook());
		click(cd.getIt());
		takeScreenshot();
		click(cd.getLogout());
	}
}
