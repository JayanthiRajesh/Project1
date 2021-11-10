package com.maven_Project.Maven_Project1;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Select_Hotel {
		public WebDriver driver;
		@FindBy(id="radiobutton_0") private WebElement radio;
		@FindBy(id="continue") private WebElement con;
		public WebElement getRadio() {
			return radio;
		}
		public WebElement getCon() {
			return con;
		}
		public Select_Hotel(WebDriver driver) {
			
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		
		
		
		

	

}
