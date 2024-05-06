package com.paymentnegative;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Negative {

	public WebDriver driver;

	public Payment_Negative(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver2, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath  = "(//input[@class='ant-input'])[1]")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(xpath =   "(//input[@class='ant-input'])[2]")

	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "//button[@type='submit']")

	private WebElement signinbtn;

	public WebElement getSigninbtn() {
		return signinbtn;
	}

	@FindBy(xpath = "//*[@id='root']/div/div/div[2]/div/div[3]/div[2]/div[2]/div[37]/div[1]/div[2]/div/div[1]")

	private WebElement cliapp;

	public WebElement getcliapp() {
		return cliapp;
	}

	@FindBy(xpath = "(//div[@id='appt_tabs-tab-2'])[1]")

	private WebElement cliser;

	public WebElement getcliser() {
		return cliser;
	}

	@FindBy(xpath = "(//input[@id='appt_service_findcpt for_search_scroll_issue'])[1]")

	private WebElement sendcp;

	public WebElement getsendcp() {
		return sendcp;
	}

	@FindBy(xpath = "(//button[@id='cal-btn-day'])[1]")

	private WebElement clickday;

	public WebElement getclickday() {
		return clickday;
	}

	@FindBy(xpath = "(//a[normalize-space()='Calendar'])[1]")

	private WebElement clickschedule;

	public WebElement getclickschedule() {
		return clickschedule;
	}

	@FindBy(xpath = "(//button[@class='appt-det-full-screen-btn false btn btn-primary'])[1]")

	private WebElement clickeditappointment;

	public WebElement getclickeditappointment() {
		return clickeditappointment;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='86152--Cell enumeration &id'])[1]")

	private WebElement selecp;

	public WebElement getselecp() {
		return selecp;
	}

	@FindBy(xpath = "(//button[@id='CPT_4NDAdd0'])[1]")

	private WebElement addndc;

	public WebElement getaddndc() {
		return addndc;
	}

	@FindBy(xpath = "(//input[@id='cpt_4_units0'])[1]")

	private WebElement quanal;

	public WebElement getquanal() {
		return quanal;
	}

	@FindBy(xpath = "(//input[@id='CPT_4_NDC_Code0'])[1]")

	private WebElement ndcqu;

	public WebElement getndcqu() {
		return ndcqu;
	}

	@FindBy(xpath = "(//input[@id='CPT_4_NDC_Code0'])[1]")

	private WebElement searnd;

	public WebElement getsearnd() {
		return searnd;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='142--sodium carbonate'])[1]")

	private WebElement selectndc;

	public WebElement getselectndc() {
		return selectndc;
	}

	@FindBy(xpath = "(//input[@id='appt_icd10_code'])[1]")

	private WebElement senicd10;

	public WebElement getsenicd10() {
		return senicd10;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='E67.0--Hypervitaminosis A'])[1]")

	private WebElement selic10;

	public WebElement getselic10() {
		return selic10;
	}

	@FindBy(xpath = "(//input[@id='appt_hcpcs_code'])[1]")

	private WebElement hcpc;

	public WebElement gethcpc() {
		return hcpc;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='A7505--Hmes or trach valve housing'])[1]")

	private WebElement hcpcsele;

	public WebElement gethcpcsele() {
		return hcpcsele;
	}

	@FindBy(xpath = "(//input[@id='appt_service_icd9'])[1]")

	private WebElement icd9;

	public WebElement geticd9() {
		return icd9;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='278.2-- Hypervitaminosis A'])[1]")

	private WebElement seleic9;

	public WebElement getseleic9() {
		return seleic9;
	}

	@FindBy(xpath = "(//input[@id='appt_service_custom'])[1]")

	private WebElement cusco;

	public WebElement getcusco() {
		return cusco;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='demo--csa'])[1]")

	private WebElement cuscose;

	public WebElement getcuscose() {
		return cuscose;
	}

	@FindBy(xpath = "(//button[normalize-space()='Patient Super Bill'])[1]")

	private WebElement patientsuper;

	public WebElement getpatientsuper() {
		return patientsuper;
	}

	@FindBy(xpath = "(//span[@aria-hidden='true'][normalize-space()='×'])[2]")

	private WebElement closesuper;

	public WebElement getclosesuper() {
		return closesuper;
	}

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Done'])[3]")

	private WebElement seldo;

	public WebElement getseldo() {
		return seldo;
	}

}
