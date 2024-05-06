package com.schedulemumbai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_Page {

	public WebDriver driver;

	public Signin_Page(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {

		return driver;
	}

	@FindBy(id = "normal_login_username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(id = "normal_login_password")

	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "//button[@type='submit']")

	private WebElement signinbtn;

	public WebElement getSigninbtn() {
		return signinbtn;
	}

	@FindBy(xpath = "(//a[normalize-space()='Forgot password ?'])[1]")

	private WebElement forgotpassword;

	public WebElement getforgotpassword() {

		return forgotpassword;
	}

	@FindBy(xpath = "(//input[@placeholder='Enter your email'])[1]")

	private WebElement enteremail;

	public WebElement getenteremail() {

		return enteremail;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]")

	private WebElement bactologin;

	public WebElement getbactologin() {

		return bactologin;
	}

	@FindBy(xpath = "(//input[@placeholder='Enter your email'])[1]")

	private WebElement forgotemail;

	public WebElement getforgotemail() {

		return forgotemail;
	}

	@FindBy(xpath = "(//button[normalize-space()='Reset Button'])[1]")

	private WebElement resetbutton;

	public WebElement getresetbutton() {

		return resetbutton;
	}

}
