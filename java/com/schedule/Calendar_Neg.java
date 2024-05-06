package com.schedule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Calendar_Neg extends Capminds_BaseClass {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	// public static void main(String[] args) throws InterruptedException {

	@Test(priority = 0)

	public void Signin() throws InterruptedException {

		// Driver Maximize and Url Launch

		geturl("https://production.vozohealth.com/");

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		// Enter Username
		Thread.sleep(3000);

		sendkeys(pom.getcalendarneg().getUsername(), "production");

		// Enter Password

		Thread.sleep(3000);

		sendkeys(pom.getcalendarneg().getPassword(), "Admin@123");

		// Click Signin Button '

		Clickonelement(pom.getcalendarneg().getSigninbtn());

	}

	@Ignore

	@Test(priority = 1)

	public void Calendar() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		// create appoi

		Clickonelement(pom.getcalendarneg().getcreapp());

		// create appoi

		Clickonelement(pom.getcalendarneg().getcreappcl());

		Thread.sleep(5000);

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement sera = wait2.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//input[@id='new-app-patient_1 appt-inp-patsrch'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", sera);

		sendkeys(pom.getcalendarneg().getClcikpatient(), "naveen");

		// Select Patient

		Thread.sleep(7000);
		Clickonelement(pom.getcalendarneg().getSelectpatient());

		// Select Date
		sendkeys1(pom.getcalendarneg().getClcikpatient(), Keys.TAB);
		// clear(pom.getcalendarneg().getSelectdate());

		sendkeys(pom.getcalendarneg().getSelectdate(), "2023-06-25");

		// Click Today
		Thread.sleep(3000);
//		Clickonelement(pom.getcalendarneg().getclcitoda());

		// Click Time

		sendkeys1(pom.getcalendarneg().getSelectdate(), Keys.TAB);

		sendkeys(pom.getcalendarneg().getSelecttime(), "11:19 AM");

//		Clickonelement(pom.getcalendarneg().getSelecttime2());
//
//		Clickonelement(pom.getcalendarneg().getSelecttime1());
		Thread.sleep(4000);
//		Clickonelement(pom.getcalendarneg().getSelecttimeok());

		// Clickonelement(pom.getcalendarneg().getSelecttimeok());

		// sele prof
		Clickonelement(pom.getcalendarneg().getselprof());

		// sele prof
		Clickonelement(pom.getcalendarneg().getselprof1());

		// save
		// Clickonelement(pom.getcalendarneg().getsavebtn());

		// can
		Clickonelement(pom.getcalendarneg().getcnbtn());

		// create appoi

		Clickonelement(pom.getcalendarneg().getcreapp());

		// create appoi

		Clickonelement(pom.getcalendarneg().getcreappcl());

		// cl vi
		Thread.sleep(2000);
		Clickonelement(pom.getcalendarneg().getvdvs());

		// tel
		Thread.sleep(2000);
		gettext(pom.getcalendarneg().gettelv());

		// can
		Clickonelement(pom.getcalendarneg().getcnbtn());

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		try {
			// click schedule
			Thread.sleep(6000);

			Clickonelement(pom.getcalendarneg().getclickschedule());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Thread.sleep(6000);
		try {
			// click day
			Clickonelement(pom.getcalendarneg().getclickday());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// selap
		Thread.sleep(2000);
		Clickonelement(pom.getcalendarneg().getselapp());

		// dele app

		Thread.sleep(6000);
		WebDriverWait seleservice = new WebDriverWait(driver, 10);
		WebElement serviceselect = seleservice.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(@class,'rbc-event-content')])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", serviceselect);

		Thread.sleep(5000);
		Clickonelement(pom.getcalendarneg().getselser1());

		Thread.sleep(5000);
		Clickonelement(pom.getcalendarneg().getselser());

		// add Ser

		sendkeys(pom.getcalendarneg().getfico(), "a");

		// sel co
		Thread.sleep(4000);
		Clickonelement(pom.getcalendarneg().getfico());

		// sel co

		Clickonelement(pom.getcalendarneg().getselco());

		// ser di

		displayed(pom.getcalendarneg().getserco());

		// add am

//		sendkeys(pom.getcalendarneg().getaddam(), "500");
//
//		// sel am
//
//		Clickonelement(pom.getcalendarneg().getseleok());

		// GET

//		gettext(pom.getcalendarneg().getamte());

		// add nd

		Clickonelement(pom.getcalendarneg().getclinnd());

		// nd qu

//		sendkeys(pom.getcalendarneg().getfindc(), "a");

		// sele

		try {
			Thread.sleep(5000);

			sendkeys(pom.getcalendarneg().getsearchndc(), "a");

			Clickonelement(pom.getcalendarneg().getseco());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// nd qu
//		Thread.sleep(5000);
//		sendkeys(pom.getcalendarneg().getndqu(), "23");

		// del ndc

		try {
			Clickonelement(pom.getcalendarneg().getdeln());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// sel bill
//		Thread.sleep(5000);
//		Clickonelement(pom.getcalendarneg().getbillse());

		Thread.sleep(6000);
		WebDriverWait billing = new WebDriverWait(driver, 10);
		WebElement selectbill = billing
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='appt_tabs-tab-3'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectbill);

		// inv bal
//		Thread.sleep(5000);
//		gettext(pom.getcalendarneg().getbillse());

		// clos
		Thread.sleep(3000);
		Clickonelement(pom.getcalendarneg().getcloap());
	}
//	@Ignore

	@Test(priority = 2)

	public void Appointmentdashboard() throws InterruptedException {

		/////////// Appointment Dashboard ///////
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// move side nav

		Thread.sleep(8000);

		WebElement ele = driver.findElement(By.xpath("(//img[@alt='menu-icon'])[1]"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).clickAndHold().perform();

		Thread.sleep(5000);

		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		WebElement apds = wait3.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//a[normalize-space()='Appointment Dashboard'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", apds);

		try {
			// sh sta
			Thread.sleep(5000);
			Clickonelement(pom.getcalendarneg().getshst());

			selectone(pom.getcalendarneg().getshstse(), "Arrived");

			gettext(pom.getcalendarneg().getarrived());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Status Select Walkin");
		}

		// Click Search Office
		Thread.sleep(4000);
		Clickonelement(pom.getcalendarneg().getSearchoffice());

		// Select Test Facility TODO
		Thread.sleep(3000);

		// Clickonelement(pom.getcalendarneg().getSelecttestfac2());

		// Close Search Office

		Clickonelement(pom.getcalendarneg().getSearchoffice());

		// Click Calender

		sendkeys(pom.getcalendarneg().getClickcalender(), "06-02-2023");

		sendkeys1(pom.getcalendarneg().getClickcalender(), Keys.ENTER);

//			 Clickonelement(pom.getcalendarneg().getClickupdate());
		//
//			 Clickonelement(pom.getcalendarneg().getClickcalender());

		// Click on Update Filter

		Clickonelement(pom.getcalendarneg().getClickupdate());

		// Click Select none
		Thread.sleep(2000);

		Clickonelement(pom.getcalendarneg().getSelectnone());

		// Click Select all

//			Clickonelement(pom.getcalendarneg().getSelectall());

		// Click Select none

		Thread.sleep(2000);

		Clickonelement(pom.getcalendarneg().getSelectnone());

		try {
			// get provider n
			Thread.sleep(2000);

			gettext(pom.getcalendarneg().getprovidername());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

//	@Ignore

	@Test(priority = 3)

	public void ProviderAvailability() throws InterruptedException {

		// move side nav

		Thread.sleep(8000);

		WebElement ele = driver.findElement(By.xpath("(//img[@alt='menu-icon'])[1]"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).clickAndHold().perform();

		// cli pro

		Thread.sleep(8000);
		Clickonelement(pom.getcalendarneg().getselpr());

		// get stat date

		try {
			// get provider n
			Thread.sleep(2000);

			gettext(pom.getcalendarneg().getstartda());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// add pro

		Clickonelement(pom.getcalendarneg().getadpr());

		// app ca

//		gettext(pom.getcalendarneg().getappca());

		// sele date

		Clickonelement(pom.getcalendarneg().getdateselect());

		// cl; t

//		Clickonelement(pom.getcalendarneg().gettodaydate());

		WebDriverWait today = new WebDriverWait(driver, 10);
		WebElement todaysele = today
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[normalize-space()='Ok'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", todaysele);

		// cancl

//		Clickonelement(pom.getcalendarneg().gettodaydate());

		// cancl

		Thread.sleep(5000);
		Clickonelement(pom.getcalendarneg().getcancelproa());

	}

//	@Ignore

	@Test(priority = 4)

	public void Billingprofile() throws InterruptedException {

		// move side nav

		Thread.sleep(8000);

		WebElement ele = driver.findElement(By.xpath("(//img[@alt='menu-icon'])[1]"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).clickAndHold().perform();

		Thread.sleep(6000);
		WebDriverWait billingprofi = new WebDriverWait(driver, 10);
		WebElement billingprofisele = billingprofi.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Billing Profiles'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", billingprofisele);
//		Clickonelement(pom.getcalendarneg().getbillingprofile());

		//
		sendkeys(pom.getcalendarneg().getbillingprofilesearch(), "test");

		System.out.println("Serach working");

	}

	//

}
