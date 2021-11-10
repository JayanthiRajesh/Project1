package com.maven_Project.Maven_Project1;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Hotel_Details {
		public WebDriver driver;

		@FindBy(id="location")private WebElement location;
		public WebElement getLocation() {
			return location;
		}
		public WebElement getHotel() {
			return hotel;
		}
		public WebElement getRoom() {
			return room;
		}
		public WebElement getNo() {
			return no;
		}
		public WebElement getDate() {
			return date;
		}
		public WebElement getChild() {
			return child;
		}
		@FindBy(id="hotels") private WebElement hotel;
		@FindBy(id="room_type") private WebElement room;
		@FindBy (id="room_nos") private WebElement no;
		@FindBy(id="datepick_out") private WebElement date;
		@FindBy(id="child_room") private WebElement child;
		@FindBy(id="Submit") private WebElement submit;
		
		public WebElement getSubmit() {
			return submit;
		}
		public Hotel_Details(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
		
		}
		
		

	}


