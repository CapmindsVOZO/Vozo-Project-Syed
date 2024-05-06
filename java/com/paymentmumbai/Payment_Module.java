package com.paymentmumbai;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Payment_Module extends Capminds_BaseClass {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	// public static void main(String[] args) throws InterruptedException {

	@Test(priority = 0)
	public void LoginPage() throws InterruptedException {

		// Driver Maximize and Url Launch

		geturl("https://mumbai.vozo.xyz/");

		// Enter Username

		sendkeys(pom.getAppointmentService().getUsername(), "mumbai");

		// Enter Password

		sendkeys(pom.getAppointmentService().getPassword(), "Admin@123");

		// Click Signin Button '

		Clickonelement(pom.getAppointmentService().getSigninbtn());

	}

	@Ignore
	@Test(priority = 1)
	public void Createappointment() throws InterruptedException {

////////////////New Appointment ////////////

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//Get Appointment Option

		Clickonelement(pom.getAppointmentService().getAppointmentoption());

//Click Create app

		Thread.sleep(4000);

		Clickonelement(pom.getAppointmentService().getAppointmentclick());

//sele Type

//Clickonelement(pom.getAppointmentService().getAppointtyp());

//Clcik Patient

		Thread.sleep(5000);

//driver.manage().timeouts().implicitlyWait(12000, TimeUnit.MILLISECONDS);

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement sera = wait2.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//input[@id='new-app-patient_1 appt-inp-patsrch'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", sera);

		Thread.sleep(5000);

		sendkeys(pom.getAppointmentService().getClcikpatient(), "naveen");

//Select Patient

		Thread.sleep(5000);

		Clickonelement(pom.getAppointmentService().getSelectpatient());

//Select Date

		sendkeys1(pom.getAppointmentService().getClcikpatient(), Keys.TAB);

//clear(pom.getAppointmentService().getSelectdate());

		sendkeys(pom.getAppointmentService().getSelectdate(), "2023-06-12");

//Click Today

		Thread.sleep(3000);

//Clickonelement(pom.getAppointmentService().getclcitoda());

//Click Time

		sendkeys1(pom.getAppointmentService().getSelectdate(), Keys.TAB);

		sendkeys(pom.getAppointmentService().getSelecttime(), "11:19 AM");

//Provider Select

//		Clickonelement(pom.getAppointmentService().getSearchProvider());
//
////Select Provider
//
//		Clickonelement(pom.getAppointmentService().getSelectprovider());

//Select Time

//close repeats

//Click Search Provider

//

//Thread.sleep(3000);

//

//// select exam room

//Clickonelement(pom.getAppointmentService().getclickexam());

//

//// select exam room

//Clickonelement(pom.getAppointmentService().getselectexam());

//Click Profile

		Thread.sleep(3000);

		Clickonelement(pom.getAppointmentService().getClickprofile());

//Select Profile

		Thread.sleep(3000);

		Clickonelement(pom.getAppointmentService().getSelectprofile());

//Clcik Status

		Clickonelement(pom.getAppointmentService().getClickstatus());

//select status

		Thread.sleep(5000);

		Clickonelement(pom.getAppointmentService().getSelectstatus());

//// Click Location

//

//Clickonelement(pom.getAppointmentService().getseleexamroom());

//

//Thread.sleep(5000);

//Clickonelement(pom.getAppointmentService().getseleexamroom1());

//Click Save

		Thread.sleep(4000);
		Clickonelement(pom.getAppointmentService().getClicksave());

	}

//	@Ignore
	@Test(priority = 2)

	public void Servicepage() throws InterruptedException {
		////////////// Payment////////////////

		// click pre

		// Clickonelement(pom.getAppointmentService().getclickpre());

		// click appoi

//		try {
//			Thread.sleep(8000);
//
//			Clickonelement(pom.getAppointmentService().getcliccalDay());
//		} catch (Exception e) {
//
//		}
		// clic Date

		// Clickonelement(pom.getAppointmentService().getclidate());

		// click appoi

//		Thread.sleep(8000);
//
//		Clickonelement(pom.getAppointmentService().getclicapp());

		WebDriverWait pats = new WebDriverWait(driver, 20);
		WebElement patsele = pats.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(@class,'rbc-event-content')])[3]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", patsele);

		/////////// ICD ///////////

		// Appointment Maxi

		Thread.sleep(5000);

		Clickonelement(pom.getAppointmentService().getclickEdit());

		// Click Sevices

		Thread.sleep(8000);

		WebDriverWait ser = new WebDriverWait(driver, 20);
		WebElement sersel = ser
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='appt_tabs-tab-2']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", sersel);

		// Clickonelement(pom.getAppointmentService().getClickServices());

		Thread.sleep(5000);

		// click CPT Codes
//		Clickonelement(pom.getAppointmentService().getClickCPTCodes());

		// Enter CPT codes

		Thread.sleep(5000);
		sendkeys(pom.getAppointmentService().getEnterCPTCodes(), "v");

		Thread.sleep(4000);

		Clickonelement(pom.getAppointmentService().getEnterCPTCodes());

		Thread.sleep(4000);
		// click CPT Codes
		Clickonelement(pom.getAppointmentService().getSelectCPTCodes());

		Thread.sleep(4000);
		// Clear fees
//		clear(pom.getAppointmentService().getClearFees());

		// Enter Fees
		sendkeys(pom.getAppointmentService().getEnterFees(), "200");

		// press ok

		Thread.sleep(3000);
		Clickonelement(pom.getAppointmentService().getprok());

		// click A1 Modifiers
		selecttwo(pom.getAppointmentService().getclickModifiersA1(), "23");

		// select A1 Modifiers
		// Clickonelement(pom.getAppointmentService().getselectkModifiersA1());

		Thread.sleep(3000);

		// click Level 2 Modifiers
		selecttwo(pom.getAppointmentService().getclickModifiersA2(), "24");

		// select Level 2 Modifiers
		// Clickonelement(pom.getAppointmentService().getselectkModifiersA2());

		Thread.sleep(3000);

		// click Level 3 Modifiers
		selecttwo(pom.getAppointmentService().getclickModifiersA3(), "23");

		// select Level 3 Modifiers
		// Clickonelement(pom.getAppointmentService().getselectkModifiersA3());

		// click Level 4 Modifiers
		selecttwo(pom.getAppointmentService().getclickModifiersA4(), "25");

		// select Level 4 Modifiers
		// Clickonelement(pom.getAppointmentService().getselectkModifiersA4());

		// Clear quantity
		clear(pom.getAppointmentService().getclearquantity());

		// Enter quantity
		sendkeys(pom.getAppointmentService().getEnterquantity(), "5");

		// Enter pointer
		sendkeys(pom.getAppointmentService().getEnterPointer(), "5");

		// delete cpt

		try {
			Thread.sleep(4000);
			Clickonelement(pom.getAppointmentService().getdeletecpt());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// save data
//		Clickonelement(pom.getAppointmentService().getsavecpt());

//		WebElement element = driver.findElement(By.id("(//input[@id='appt_icd10_code'])[1]"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", element);

		////// ICD 10//////////

		// //click search ICD-10-CM codes///////

		Thread.sleep(5000);
		sendkeys(pom.getAppointmentService().getsearchcodes(), "v");

		Thread.sleep(4000);
		Clickonelement(pom.getAppointmentService().getsearchcodes());

		// select code
		Thread.sleep(4000);

		WebDriverWait icd10 = new WebDriverWait(driver, 20);
		WebElement selicd = icd10.until(ExpectedConditions.elementToBeClickable(
				By.xpath("(//div[contains(@class,'ant-select-item-option-content')][normalize-space()='H50.07--Alternating esotropia with V pattern'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selicd);

//		Clickonelement(pom.getAppointmentService().getselectcode());

		// click appoi
//
//		Thread.sleep(4000);
//
//		Clickonelement(pom.getAppointmentService().getclicserv());

		/////////// HCPCS Code/////////// TODO

		// click HCPCS Code

		Thread.sleep(4000);

		sendkeys(pom.getAppointmentService().getclicfindhcpc(), "1");
		

		Thread.sleep(3000);

		Clickonelement(pom.getAppointmentService().getclicfindhcpc());

		// click appoi

		Thread.sleep(3000);

		Clickonelement(pom.getAppointmentService().getclichcpcs());
		// clear

		Thread.sleep(5000);

		clear(pom.getAppointmentService().getsendfee());

		// click HCPCS Code
		Thread.sleep(4000);
		sendkeys(pom.getAppointmentService().getsendfee(), "500");

		Clickonelement(pom.getAppointmentService().getselo());

		// clci mod1

		selecttwo(pom.getAppointmentService().getclicmod1(), "22");

		// sele mod1

		// Clickonelement(pom.getAppointmentService().getselecmod1());

		// clci mod1

		Thread.sleep(2000);

		selecttwo(pom.getAppointmentService().getclicmod2(), "23");

		// sele mod1

		// Clickonelement(pom.getAppointmentService().getselemod2());

		// clci mod1

		Thread.sleep(2000);

		selecttwo(pom.getAppointmentService().getclicmod3(), "24");

		// sele mod1

		// Clickonelement(pom.getAppointmentService().getselemod3());

		// clci mod1

		Thread.sleep(2000);

		selecttwo(pom.getAppointmentService().getclicmod4(), "25");

		// sele mod1

		// Clickonelement(pom.getAppointmentService().getselemod4());

		// sele quan
		clear(pom.getAppointmentService().getquant());

		sendkeys(pom.getAppointmentService().getquant(), "2");

		// sele poin

		clear(pom.getAppointmentService().getpointe());

		sendkeys(pom.getAppointmentService().getpointe(), "2");

		try {
			// delete hcpc

			Thread.sleep(4000);

			// Clickonelement(pom.getAppointmentService().getdeletehcpc());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// save data

//		Clickonelement(pom.getAppointmentService().getsavehcpc());
		// sele ndc

//		Clickonelement(pom.getAppointmentService().getNDCPL());

		// sele ndcq
		Thread.sleep(5000);

//		sendkeys(pom.getAppointmentService().getNDCPLqua(), "1");
//
//		Clickonelement(pom.getAppointmentService().getselNDCPLqua());

		// sele ndcq

//		sendkeys(pom.getAppointmentService().getNDCPLqua(), "2");
//
//		// sele ndcq
//
//		selectone(pom.getAppointmentService().getNDCPUnits(), "ML (MilliLiter)");

		////////// ICd 9//////////////

		// sele ndcq

		sendkeys(pom.getAppointmentService().geticd9(), "1");

		Thread.sleep(4000);

		Clickonelement(pom.getAppointmentService().geticd9());

		// sele icd9

		Thread.sleep(4000);

		Clickonelement(pom.getAppointmentService().geticd9sele());

		///////////// Custom Code /////

		// clic cus code
		sendkeys(pom.getAppointmentService().getcusco(), "1");

		Thread.sleep(4000);

		Clickonelement(pom.getAppointmentService().getcusco());
		// sele cus cod

		Thread.sleep(8000);
		WebDriverWait cus = new WebDriverWait(driver, 20);
		WebElement selcus = cus.until(ExpectedConditions.elementToBeClickable(
				By.xpath("(//div[@class='ant-select-item-option-content'][normalize-space()='123--das'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selcus);

		// Clickonelement(pom.getAppointmentService().getcuscosele());

		// mod 1

		Thread.sleep(2000);

		selecttwo(pom.getAppointmentService().getcusmod1(), "23");

		// mod 2

		Thread.sleep(2000);

		selecttwo(pom.getAppointmentService().getcusmod2(), "24");

		// mod 3

		selecttwo(pom.getAppointmentService().getcusmod3(), "24");

		// mod 4

		selecttwo(pom.getAppointmentService().getcusmod4(), "25");

		// quan

		clear(pom.getAppointmentService().getquantcus());

		sendkeys(pom.getAppointmentService().getquantcus(), "2");

		// poin
		sendkeys(pom.getAppointmentService().getpoincus(), "2");
		// TODO

/////////// ADD codes//////////

		Thread.sleep(5000);
		Clickonelement(pom.getAppointmentService().getaddcod());

		// sele cod ty
		selecttwo(pom.getAppointmentService().getcoty(), "1");

		// code name
		sendkeys(pom.getAppointmentService().getadcod(), "new custom");

		// code name
		sendkeys(pom.getAppointmentService().getadfee(), "500");

		// des
		sendkeys(pom.getAppointmentService().getaddes(), "xyz");

		// save code
		Clickonelement(pom.getAppointmentService().getsaveco());
	}

//	@Ignore

	@Test(priority = 3)

	public void Billingpage() throws InterruptedException {

//		WebDriverWait pats = new WebDriverWait(driver, 20);
//		WebElement patsele = pats
//				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='sc-hNKHps eIGDZj'])[5]")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", patsele);

		// sele Billing

		Thread.sleep(4000);

		Thread.sleep(6000);
		WebDriverWait bill = new WebDriverWait(driver, 20);
		WebElement selbi = bill
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='appt_tabs-tab-3'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selbi);

		// Clickonelement(pom.getAppointmentService().getBillingsel());

		// crea invo

		Thread.sleep(4000);

		Clickonelement(pom.getAppointmentService().getsupbill());

		// clos in

		Thread.sleep(2000);

		Clickonelement(pom.getAppointmentService().getclosenvo());

		// click Billing status
		selectone(pom.getAppointmentService().getClickBillingStatus(), "Paid In Full");

		// get text

		// Clickonelement(pom.getAppointmentService().getgetbal());

		gettext(pom.getAppointmentService().getgetbal());

		// click paym pro
		selecttwo(pom.getAppointmentService().getpaypro(), "2");

		// appoin tot

		Thread.sleep(5000);

		System.out.println("Appointment Balance");
		// gettext(pom.getAppointmentService().getappbal());
		// ins bal

		try {
			System.out.println("Insurance Balance");
			gettext(pom.getAppointmentService().getinsbal());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Payment Module Tested Successfully");

		//

	}

//	@Ignore
	@Test(priority = 4)

	public void Vitals() throws InterruptedException {

//		WebDriverWait pats = new WebDriverWait(driver, 20);
//		WebElement patsele = pats
//				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='sc-hNKHps eIGDZj'])[5]")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", patsele);

		Thread.sleep(8000);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		// sele Billing
		WebDriverWait vita = new WebDriverWait(driver, 20);

		WebElement selvit = vita
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='appt_tabs-tab-4'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selvit);

		// blood prea
		clear(pom.getAppointmentService().getbloodpre());

		sendkeys(pom.getAppointmentService().getbloodpre(), "100");

		// temp prea
		clear(pom.getAppointmentService().gettemperature());

		sendkeys(pom.getAppointmentService().gettemperature(), "200");

		// pulse prea
		clear(pom.getAppointmentService().getpulse());

		sendkeys(pom.getAppointmentService().getpulse(), "30");

		// pulse prea
		clear(pom.getAppointmentService().getweight());

		sendkeys(pom.getAppointmentService().getweight(), "30");

		// pulse prea
		clear(pom.getAppointmentService().getheight());

		sendkeys(pom.getAppointmentService().getheight(), "40");

		// pulse prea
		clear(pom.getAppointmentService().getrespiration());

		sendkeys(pom.getAppointmentService().getrespiration(), "40");
		//
		// Full vital pdf
		Thread.sleep(5000);

		Clickonelement(pom.getAppointmentService().getvitalshistorypdf());

		// Full vital pdf
		Thread.sleep(3000);

		Clickonelement(pom.getAppointmentService().getvitalscsv());

		Thread.sleep(8000);

//		try {
//			Clickonelement(pom.getAppointmentService().getdoneappde());
//		} catch (Exception e) {

//// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		Thread.sleep(8000);

		Clickonelement(pom.getAppointmentService().getclickdone());

//		driver.close();
	}

}
