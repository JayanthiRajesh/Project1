package com.maven_Project.Maven_Project1;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Customer_Details {
	public WebDriver driver;
	@FindBy(id="first_name") private WebElement firstname;
	@FindBy(id="last_name") private WebElement lastname;
	@FindBy(id="address") private WebElement address;
	@FindBy(id="cc_num") private WebElement cc_num;
	@FindBy(id="cc_type") private WebElement cc_type;
	@FindBy(id="cc_exp_month") private WebElement exp_mnth;
	@FindBy(id="cc_exp_year") private WebElement exp_year;
	@FindBy(id="cc_cvv") private WebElement cvv;
	@FindBy(id="book_now") private WebElement book;
	@FindBy(xpath="//a[@href='BookedItinerary.php']") private WebElement it;
	@FindBy(xpath="//a[@href='Logout.php']") private WebElement logout;
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCc_num() {
		return cc_num;
	}
	public WebElement getCc_type() {
		return cc_type;
	}
	public WebElement getExp_mnth() {
		return exp_mnth;
	}
	public WebElement getExp_year() {
		return exp_year;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBook() {
		return book;
	}
	public WebElement getIt() {
		return it;
	}
	public WebElement getLogout() {
		return logout;
	}

	public Customer_Details(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);

	}

	}



