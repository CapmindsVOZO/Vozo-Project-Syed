package com.reportnegativemumbai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Report_Negative {

	public WebDriver driver;

	public Report_Negative(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver2, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "(//input[@class='ant-input'])[1]")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(xpath = "(//input[@class='ant-input'])[2]")

	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "//button[@type='submit']")

	private WebElement signinbtn;

	public WebElement getSigninbtn() {
		return signinbtn;
	}

	@FindBy(xpath = "(//a[normalize-space()='Reports'])[1]")

	private WebElement repneg;

	public WebElement getrepneg() {
		return repneg;
	}

	@FindBy(xpath = "(//a[normalize-space()='Payment Analysis'])[1]")

	private WebElement clicpay;

	public WebElement getclicpay() {
		return clicpay;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")

	private WebElement patsea;

	public WebElement getpatsea() {
		return patsea;
	}

	@FindBy(xpath = "(//div[contains(@class,'ant-select-item-option-content')][contains(text(),'Test')])[3]")

	private WebElement clipat;

	public WebElement getclipat() {
		return clipat;
	}

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")

	private WebElement cliupda;

	public WebElement getcliupda() {
		return cliupda;
	}

	@FindBy(xpath = "(//select)[1]")

	private WebElement seleoff;

	public WebElement getseleoff() {
		return seleoff;
	}

	@FindBy(xpath = "(//input[@placeholder='Start date'])[1]")

	private WebElement stada;

	public WebElement getstada() {
		return stada;
	}

	@FindBy(xpath = "(//input[@placeholder='End date'])[1]")

	private WebElement endda;

	public WebElement getendda() {
		return endda;
	}

	@FindBy(xpath = "(//a[normalize-space()='Product & Procedures'])[1]")

	private WebElement propr;

	public WebElement getpropr() {
		return propr;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")

	private WebElement codese;

	public WebElement getcodese() {
		return codese;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='CPT4:0029U:Rx metab advrs trgt seq alys'])[1]")

	private WebElement clico;

	public WebElement getclico() {
		return clico;
	}

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")

	private WebElement cliup;

	public WebElement getcliup() {
		return cliup;
	}

	@FindBy(xpath = "(//a[normalize-space()='Appointment Report'])[1]")

	private WebElement cliappr;

	public WebElement getcliappr() {
		return cliappr;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")

	private WebElement searpa;

	public WebElement getsearpa() {
		return searpa;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='Test ins das'])[1]")

	private WebElement selpa;

	public WebElement getselpa() {
		return selpa;
	}

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")

	private WebElement cliupdap;

	public WebElement getcliupdap() {
		return cliupdap;
	}

	@FindBy(xpath = "(//a[normalize-space()='Patient Report'])[1]")

	private WebElement patr;

	public WebElement getpatr() {
		return patr;
	}

	@FindBy(xpath = "(//select[@name='race'])[1]")

	private WebElement selerac;

	public WebElement getselerac() {
		return selerac;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")

	private WebElement medse;

	public WebElement getmedse() {
		return medse;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='RETIN-A (Topical)'])[1]")

	private WebElement Selectmedication;

	public WebElement getSelectmedication() {

		return Selectmedication;
	}

	@FindBy(xpath = "(//div[contains(@class,'content')])[1]")

	private WebElement medsesel;

	public WebElement getmedsesel() {
		return medsesel;
	}

	@FindBy(xpath = "(//button[normalize-space()='Search'])[1]")

	private WebElement clisear;

	public WebElement getclisear() {
		return clisear;
	}

	@FindBy(xpath = "(//a[normalize-space()='Telehealth Report'])[1]")

	private WebElement telehealr;

	public WebElement gettelehealr() {
		return telehealr;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")

	private WebElement patsear;

	public WebElement getpatsear() {
		return patsear;
	}

	@FindBy(xpath = "(//div[@class='title'])[1]")

	private WebElement patsearsele;

	public WebElement getpatsearsele() {
		return patsearsele;
	}

	@FindBy(xpath = "(//button[normalize-space()='Search'])[1]")

	private WebElement searte;

	public WebElement getsearte() {
		return searte;
	}

	@FindBy(xpath = "(//a[normalize-space()='Productivity Report'])[1]")

	private WebElement selepro;

	public WebElement getselepro() {
		return selepro;
	}

	@FindBy(xpath = "(//input[@placeholder='Start date'])[1]")

	private WebElement starda;

	public WebElement getstarda() {
		return starda;
	}

	@FindBy(xpath = "(//input[@placeholder='End date'])[1]")

	private WebElement enddap;

	public WebElement getenddap() {
		return enddap;
	}

	@FindBy(xpath = "(//select[@id='b-l-34'])[1]")

	private WebElement clisele;

	public WebElement getclisele() {
		return clisele;
	}

	@FindBy(xpath = "(//option[@value='2'])[1]")

	private WebElement selof;

	public WebElement getselof() {
		return selof;
	}

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")

	private WebElement cliupp;

	public WebElement getcliupp() {
		return cliupp;
	}

	@FindBy(xpath = "(//a[normalize-space()='User Report'])[1]")

	private WebElement userre;

	public WebElement getuserre() {
		return userre;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")

	private WebElement serus;

	public WebElement getserus() {
		return serus;
	}

	@FindBy(xpath = "(//button[normalize-space()='Search'])[1]")

	private WebElement serusse;

	public WebElement getserusse() {
		return serusse;
	}

	@FindBy(xpath = "(//button[contains(text(),'Search')])[1]")

	private WebElement serrep;

	public WebElement getserrep() {
		return serrep;
	}

}
