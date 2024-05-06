package com.schedule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calendarneg {

	public WebDriver driver;

	public Calendarneg(WebDriver driver2) {

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

	@FindBy(xpath = "//button[@id='dropdown-basic cal-btn-crate']")

	private WebElement creapp;

	public WebElement getcreapp() {
		return creapp;
	}

	@FindBy(xpath = "//a[@id='appt_crt-ico-nav']")

	private WebElement creappcl;

	public WebElement getcreappcl() {
		return creappcl;
	}

	@FindBy(xpath = "(//input[@id='new-app-patient_1 appt-inp-patsrch'])[1]")

	private WebElement clcikpatient;

	public WebElement getClcikpatient() {
		return clcikpatient;
	}

	@FindBy(xpath = "(//a[normalize-space()='Today'])[1]")
	private WebElement clcitoda;

	public WebElement getclcitoda() {
		return clcitoda;

	}

	@FindBy(xpath = "(//input[@class='fromTime-toTime'])[1]")
	private WebElement Selecttime;

	public WebElement getSelecttime() {
		return Selecttime;

	}

	@FindBy(xpath = "(//input[@id='date'])[1]")
	private WebElement Selectdate;

	public WebElement getSelectdate() {
		return Selectdate;

	}

	@FindBy(xpath = "(//span[normalize-space()='Ok'])[1]")
	private WebElement Selecttimeok;

	public WebElement getSelecttimeok() {
		return Selecttimeok;

	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")

	private WebElement selectpatient;

	public WebElement getSelectpatient() {
		return selectpatient;
	}

	@FindBy(xpath = "(//div[normalize-space()='Search Patient'])[1]")

	private WebElement serpa;

	public WebElement getserpa() {
		return serpa;
	}

	@FindBy(xpath = "(//input[@type='text'])[2]")

	private WebElement serpa1;

	public WebElement getserpa1() {
		return serpa1;
	}

	@FindBy(xpath = "(//span[@class='text'])[1]")

	private WebElement selpa;

	public WebElement getselpa() {
		return selpa;
	}

	@FindBy(xpath = "(//input[@placeholder='Select date'])[1]")

	private WebElement datp;

	public WebElement getdatp() {
		return datp;
	}

	@FindBy(xpath = "(//input[@id='new-set-time'])[1]")

	private WebElement timp;

	public WebElement gettimp() {
		return timp;
	}

	@FindBy(xpath = "(//span[normalize-space()='Ok'])[1]")

	private WebElement okc;

	public WebElement getokc() {
		return okc;
	}

	@FindBy(xpath = "(//div[normalize-space()='Search Provider'])[1]")

	private WebElement selpro;

	public WebElement getselpro() {
		return selpro;
	}

	@FindBy(xpath = "(//span[contains(text(),'Martin Edward')])[1]")

	private WebElement selpro1;

	public WebElement getselpro1() {
		return selpro1;
	}

	@FindBy(xpath = "(//input[@id='new-app-profile_1 appt-inp-profsrch'])[1]")

	private WebElement selprof;

	public WebElement getselprof() {
		return selprof;
	}

	@FindBy(xpath = "(//div[contains(text(),'Established Patient')])[1]")

	private WebElement selprof1;

	public WebElement getselprof1() {
		return selprof1;
	}

	@FindBy(xpath = "//button[@id='appt-btn-sve']")

	private WebElement savebtn;

	public WebElement getsavebtn() {

		return savebtn;
	}

	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")

	private WebElement cnbtn;

	public WebElement getcnbtn() {

		return cnbtn;
	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[4]")

	private WebElement clickschedule;

	public WebElement getclickschedule() {
		return clickschedule;
	}

	@FindBy(xpath = "(//button[normalize-space()='Day'])[1]")

	private WebElement clickday;

	public WebElement getclickday() {
		return clickday;
	}

	@FindBy(xpath = "(//span[normalize-space()='Video Visit'])[1]")

	private WebElement vdvs;

	public WebElement getvdvs() {

		return vdvs;
	}

	@FindBy(xpath = "(//*[@id='border2']/div/div[2])[2]")

	private WebElement telv;

	public WebElement gettelv() {

		return telv;
	}

	@FindBy(xpath = "(//button[normalize-space()='Create'])[1]")

	private WebElement selapp;

	public WebElement getselapp() {

		return selapp;
	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[15]")

	private WebElement selser1;

	public WebElement getselser1() {

		return selser1;
	}
	
	@FindBy(xpath = "(//div[@id='appt_tabs-tab-2'])[1]")

	private WebElement selser;

	public WebElement getselser() {

		return selser;
	}

	@FindBy(xpath = "(//input[@id='appt_service_findcpt for_search_scroll_issue'])[1]")

	private WebElement fico;

	public WebElement getfico() {

		return fico;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='86152--Cell enumeration &id'])[1]")

	private WebElement selco;

	public WebElement getselco() {

		return selco;
	}

	@FindBy(xpath = "(//td[normalize-space()='86152'])[1]")

	private WebElement serco;

	public WebElement getserco() {

		return serco;
	}

	@FindBy(xpath = "(//input[@id='cptfee0'])[1]")

	private WebElement addam;

	public WebElement getaddam() {

		return addam;
	}

	@FindBy(xpath = "(//input[@id='CPT_4_NDC_Code0'])[1]")

	private WebElement searchndc;

	public WebElement getsearchndc() {

		return searchndc;
	}

	@FindBy(xpath = "(//*[name()='svg'][@class='apptservicedetail_tickicon'])[1]")

	private WebElement seleok;

	public WebElement getseleok() {

		return seleok;
	}

	@FindBy(xpath = "//span[contains(@class,'blue-color')]//span[1]")

	private WebElement amte;

	public WebElement getamte() {

		return amte;
	}

	@FindBy(xpath = "(//button[@id='CPT_4NDAdd1'])[1]")

	private WebElement clinnd;

	public WebElement getclinnd() {

		return clinnd;
	}

	@FindBy(xpath = "(//input[@id='CPT_4_NDC_Code0'])[1]")

	private WebElement findc;

	public WebElement getfindc() {

		return findc;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")

	private WebElement seco;

	public WebElement getseco() {

		return seco;
	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[22]")

	private WebElement deln;

	public WebElement getdeln() {

		return deln;
	}

	@FindBy(xpath = "(//input[@id='CPT_4_NDCQty0'])[1]")

	private WebElement ndqu;

	public WebElement getndqu() {

		return ndqu;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-3'])[1]")

	private WebElement billse;

	public WebElement getbillse() {

		return billse;
	}

	@FindBy(xpath = "(//div[@class='Un-invoiced mgtb-app-mod'])[1]")

	private WebElement billde;

	public WebElement getbillde() {

		return billde;
	}

	@FindBy(xpath = "(//span[normalize-space()='×'])[1]")

	private WebElement cloap;

	public WebElement getcloap() {

		return cloap;
	}

	@FindBy(xpath = "(//a[normalize-space()='Provider Availability'])[1]")

	private WebElement selpr;

	public WebElement getselpr() {

		return selpr;
	}

	@FindBy(xpath = "(//button[normalize-space()='Add Provider Availability'])[1]")

	private WebElement adpr;

	public WebElement getadpr() {

		return adpr;
	}

	@FindBy(xpath = "(//input[@id='date'])[1]")

	private WebElement dateselect;

	public WebElement getdateselect() {

		return dateselect;
	}

	@FindBy(xpath = "(//a[@class='ant-picker-today-btn'])[1]")

	private WebElement todate;

	public WebElement gettodaydate() {

		return todate;
	}

	@FindBy(xpath = "(//span[@aria-hidden='true'])[3]")

	private WebElement cancelproa;

	public WebElement getcancelproa() {

		return cancelproa;
	}

	@FindBy(xpath = "(//input[@placeholder='Select date'])[1]")

	private WebElement appca;

	public WebElement getappca() {

		return appca;
	}

//////////////Appointment Dashboard
	@FindBy(xpath = "//a[contains(text(),'Appointment Dashboard')]")
	private WebElement ClcikAppointmentdashboard;

	public WebElement getClcikAppointmentdashboard() {
		return ClcikAppointmentdashboard;
	}

	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[1]")
	private WebElement Searchoffice;

	public WebElement getSearchoffice() {
		return Searchoffice;
	}

	@FindBy(xpath = "(//label[normalize-space()='Show Status'])[1]")
	private WebElement shst;

	public WebElement getshst() {
		return shst;
	}

	@FindBy(xpath = "(//select[@name='office_1'])[1]")
	private WebElement shstse;

	public WebElement getshstse() {
		return shstse;
	}

	@FindBy(xpath = "(//label[@class='for-show-time-t-d'])[1]")
	private WebElement arrivedtxt;

	public WebElement getarrived() {
		return arrivedtxt;
	}

	@FindBy(xpath = "(//label[contains(text(),'Show Status')])[2]")
	private WebElement shst1;

	public WebElement getshst1() {
		return shst1;
	}

	@FindBy(xpath = "(//select[@name='office_1'])[2]")
	private WebElement shstse1;

	public WebElement getshstse1() {
		return shstse1;
	}

	@FindBy(xpath = "(//div[contains(text(),'defaults hospital')])[1]")
	private WebElement Selecttestfac2;

	public WebElement getSelecttestfac2() {
		return Selecttestfac2;
	}

	@FindBy(xpath = "(//input[@placeholder='From Date'])[1]")
	private WebElement Clickcalender;

	public WebElement getClickcalender() {
		return Clickcalender;
	}

	@FindBy(xpath = "//input[@id='duration']")
	private WebElement Clicktod;

	public WebElement getClicktod() {
		return Clicktod;
	}

	@FindBy(xpath = "//button[@id='appt_dbrd-btn_filt']")
	private WebElement clitoa;

	public WebElement getclitoa() {
		return clitoa;
	}

	@FindBy(xpath = "//button[@id='appt_dbrd-btn_filt']")
	private WebElement Clickupdate;

	public WebElement getClickupdate() {
		return Clickupdate;
	}

	@FindBy(xpath = "(//input[@value='@'])[1]")
	private WebElement Selectnone;

	public WebElement getSelectnone() {
		return Selectnone;
	}

	@FindBy(xpath = "(//label[@class='for-dash-t-h-2'][normalize-space()='Production Vozo'])[1]")
	private WebElement providername;

	public WebElement getprovidername() {
		return providername;
	}

	@FindBy(xpath = "(//label[normalize-space()='Show Status'])[1]")
	private WebElement statsh;

	public WebElement getstatsh() {
		return statsh;
	}

	@FindBy(xpath = "//div[contains(text(),'Telehealth Appointment')]")
	private WebElement telehe;

	public WebElement gettelehe() {
		return telehe;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[2]")
	private WebElement start;

	public WebElement getstartda() {
		return start;
	}

	@FindBy(xpath = "(//a[normalize-space()='Billing Profiles'])[1]")

	private WebElement billingprofile;

	public WebElement getbillingprofile() {

		return cancelproa;
	}

	@FindBy(xpath = "(//input[@placeholder='Search Profile'])[1]")

	private WebElement billingprofilesearch;

	public WebElement getbillingprofilesearch() {

		return billingprofilesearch;
	}
}
