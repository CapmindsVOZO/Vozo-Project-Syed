package com.schedulemodule1;

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

public class Schedule_Module extends Capminds_BaseClass {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	// public static void main(String[] args) throws InterruptedException {

	@Test(priority = 0)

	public void Login() throws InterruptedException {

		// Step1: Set up physical report path
//		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./report4/Schedule.html");

		// to keep the report history
//		reporter.setAppendExisting(true);

		// Step2: Create object for ExtentReports
//		ExtentReports extent = new ExtentReports();

		System.out.println("CAPMINDS");
		// Step3: attach the data with physical file
//		extent.attachReporter(reporter);
//
//		// Step4: Create a test cases and assign test details
//		// testName //testDescription
//		ExtentTest test = extent.createTest("capminds", "patient with mandatory information");

//		test.assignCategory("VOZO");
//		test.assignAuthor("Capminds");

		// Step5: Step level status

		// test.fail("Click Login button");

		// Driver Maximise and Url Launch

		// Driver Maximize and Url Launch

		geturl("https://test.vozo.xyz/");

//		test.pass("Browser Launched Successfully ");

		System.out.println("Browser Launched Successfully ");

		System.out.println(driver.getTitle());
		// Enter Username

		sendkeys(pom.getinstance().getUsername(), "Admin3");

		// Enter Password

		sendkeys(pom.getinstance().getPassword(), "Admin@123");

		// Click Signin Button '

		Clickonelement(pom.getinstance().getSigninbtn());

//		test.pass("Login Successfully ");

		System.out.println("Login Successfully ");

	}

//	@Ignore
	@Test(priority = 1)

	public void ScheduleCalender() throws InterruptedException {

		///////////////// Schedule Calender ///////////////

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(6000);

		// select Calendar Page
		Clickonelement(pom.getschedloc().getclickcalendarpage());

		// get the page Title

		Thread.sleep(3000);

		gettext(pom.getschedloc().getvisiblepage());

		// Selct Month
		Thread.sleep(5000);

		Clickonelement(pom.getschedloc().getMonth());

		// select Month Option
		Thread.sleep(5000);

		Clickonelement(pom.getschedloc().getselectMonth());

		// Click On Month Calender option

		// Center Text Will Visible

		Thread.sleep(3000);

		gettext(pom.getschedloc().getVisibletext1());

		Thread.sleep(3000);

		// get week Option

		Thread.sleep(3000);

		Clickonelement(pom.getschedloc().getweek());

		// select Week Option

		Thread.sleep(3000);

		Clickonelement(pom.getschedloc().getselectweekcalendar());

		// get week text
		Thread.sleep(2000);
		gettext(pom.getschedloc().getVisibletext3());

//		
		// click on Day option
		Thread.sleep(5000);

		Clickonelement(pom.getschedloc().getDay());

		// Clcik On Day Calender

		Clickonelement(pom.getschedloc().getDaycalender());
//
//		// Clcik On Cancel
//
//		Clickonelement(pom.getschedloc().getCancel4());

		// Visible Text Day

		gettext(pom.getschedloc().getVisibletext4());

		// Clcik On Center Calender

		Clickonelement(pom.getschedloc().getCenterCalender());

		// Clcik On Center Calender
		Thread.sleep(2000);

//		Clickonelement(pom.getschedloc().getCenterCalender());

		// Click On Right

		Clickonelement(pom.getschedloc().getRight());

		// Clcik on Left
		Thread.sleep(5000);

		Clickonelement(pom.getschedloc().getLeft());

		// Clcik on Left

		Clickonelement(pom.getschedloc().getLeft());

		// select Today TODO
		Clickonelement(pom.getschedloc().getTodayoption());

		// Click Facility
		Thread.sleep(5000);

		Clickonelement(pom.getschedloc().getFacility());

		// select facility
		Thread.sleep(3000);

		// Clickonelement(pom.getschedloc().getSelectFacility());

		// Close Facility

		// Clickonelement(pom.getschedloc().getFacilitySelectclo());

		Clickonelement(pom.getschedloc().getFacilitySelect());

		// Click Provider Select

		Thread.sleep(3000);

		Clickonelement(pom.getschedloc().getProvider());

		// Select Provider

//		Thread.sleep(3000);
//		Clickonelement(pom.getschedloc().getselectProvider());

		// close Select

		// Clickonelement(pom.getschedloc().getProviderselectclo());

		Clickonelement(pom.getschedloc().getProviderselect());

		WebDriverWait waitexam = new WebDriverWait(driver, 10);
		WebElement examwait = waitexam.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//button[normalize-space()='Exam Room'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", examwait);

		// select exam room

//		Clickonelement(pom.getschedloc().getexamroo());

		// select exam room

		Thread.sleep(5000);

		Clickonelement(pom.getschedloc().getexamrooclick());

		Thread.sleep(5000);
		// click exam

//		Clickonelement(pom.getschedloc().getclickexam());

		// close exam

//		Clickonelement(pom.getschedloc().getclickexam());

		// Visible Today

		gettext(pom.getschedloc().getprovidername());

		// delete appointment

//		delete(pom.getschedloc().getdeleteapp(), Keys.DELETE);

		// test.pass("Calendar Page Tested Successfully ");

		System.out.println("Calendar Page Tested Successfully ");

//		driver.close();

	}

//	@Ignore

	@Test(priority = 2)

	public void CreateAppointment() throws InterruptedException {

		//////////////// New Appointment ////////////
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Get Appointment Option

		Clickonelement(pom.getschedloc().getAppointmentoption());

		// Click Create app
		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getAppointmentclick());

		// sele Type

		// Clickonelement(pom.getschedloc().getAppointtyp());

		// Clcik Patient

		Thread.sleep(5000);

		// driver.manage().timeouts().implicitlyWait(12000, TimeUnit.MILLISECONDS);

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement sera = wait2.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//input[@id='new-app-patient_1 appt-inp-patsrch'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", sera);

		Thread.sleep(5000);

		sendkeys(pom.getschedloc().getClcikpatient(), "veda");

		// Select Patient

		Thread.sleep(5000);
		Clickonelement(pom.getschedloc().getSelectpatient());

		// Select Date
		sendkeys1(pom.getschedloc().getClcikpatient(), Keys.TAB);
		// clear(pom.getschedloc().getSelectdate());

		sendkeys(pom.getschedloc().getSelectdate(), "2023-06-06");

		// Click Today
		Thread.sleep(3000);
//		Clickonelement(pom.getschedloc().getclcitoda());

		// Click Time

		sendkeys1(pom.getschedloc().getSelectdate(), Keys.TAB);

		sendkeys(pom.getschedloc().getSelecttime(), "11:19 AM");

		// Provider Select

		Clickonelement(pom.getschedloc().getSearchProvider());

		// Select Provider

		Clickonelement(pom.getschedloc().getSelectprovider());

		// Select Time

		// Clickonelement(na.getClickok());

		// Send Min

//		clear(pom.getschedloc().getSendmin());
//
//		sendkeys(pom.getschedloc().getSendmin(), "40");

		// Repeats Button

		// provider
//

//		Clickonelement(pom.getschedloc().getprosel());
//
//		Clickonelement(pom.getschedloc().getproselected());
		// close repeats

		// Click Search Provider

//
//		Thread.sleep(3000);
//
//		// select exam room
//		Clickonelement(pom.getschedloc().getclickexam());
//
//		// select exam room
//		Clickonelement(pom.getschedloc().getselectexam());

		// Click Profile

		Thread.sleep(3000);

		Clickonelement(pom.getschedloc().getClickprofile());

		// Select Profile
		Thread.sleep(3000);

		Clickonelement(pom.getschedloc().getSelectprofile());

		// Clcik Status

		Clickonelement(pom.getschedloc().getClickstatus());

		// select status

		Thread.sleep(5000);

		Clickonelement(pom.getschedloc().getSelectstatus());

//		// Click Location
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getschedloc().getLocation());
//
//		// Select Loction
//
//		Thread.sleep(5000);
//		Clickonelement(pom.getschedloc().getSelectLocation());
//
//		// select exam room
//		Thread.sleep(5000);
//		Clickonelement(pom.getschedloc().getseleexamroom());
//
//		Thread.sleep(5000);
//		Clickonelement(pom.getschedloc().getseleexamroom1());

//		// select exam room
//		Thread.sleep(5000);
//		Clickonelement(pom.getschedloc().getseleexamroom());
//
//		Clickonelement(pom.getschedloc().getseleexamroom1());

//		/		Clickonelement(pom.getschedloc().getSelecttime2());
		//
//				Clickonelement(pom.getschedloc().getSelecttime1());
//				Thread.sleep(4000);
//				Clickonelement(pom.getschedloc().getSelecttimeok());

		// Clickonelement(pom.getschedloc().getSelecttimeok());

		// Click Save
		Thread.sleep(4000);

		Clickonelement(pom.getschedloc().getClicksave());

		///////// Telehealth///////////

		// Get Appointment Option
		Thread.sleep(8000);
		Clickonelement(pom.getschedloc().getAppointmentoption());

		// Click Create app
		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getAppointmentclick());

		// select video

		Clickonelement(pom.getschedloc().getvideovis());

		// search pat
		Thread.sleep(5000);

		// Clickonelement(pom.getschedloc().getsearvid());

		sendkeys(pom.getschedloc().getsearvidpat(), "veda");

		// Select Patient
		Thread.sleep(5000);
		Clickonelement(pom.getschedloc().getSelectpatient1());

		// Select Date
		sendkeys1(pom.getschedloc().getsearvidpat(), Keys.TAB);
		// clear(pom.getschedloc().getSelectdate());

		sendkeys(pom.getschedloc().getSelectdate1(), "2023-06-07");

		Thread.sleep(5000);
//		Clickonelement(pom.getschedloc().getclicktoday2());

		// Select Time
		sendkeys1(pom.getschedloc().getSelectdate1(), Keys.TAB);

		sendkeys(pom.getschedloc().getSelecttimevid(), "11:19 AM");
		Thread.sleep(5000);

//		Clickonelement(pom.getschedloc().getSelecttimeok());

		// provider
		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getprosel());

		Thread.sleep(5000);

		Clickonelement(pom.getschedloc().getproselected());

		// status select

		Clickonelement(pom.getschedloc().getstatselect());

		Clickonelement(pom.getschedloc().getstatse1l());

		try {
			Thread.sleep(2000);

			Clickonelement(pom.getschedloc().getsavevi());

			// Save Or Close
			Clickonelement(pom.getschedloc().getclosvi());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Telehealth");
		}

		// test.pass("Appointment Created Successfully");

		System.out.println("Appointment Created Successfully");

////////////////New Appointment Second ////////////
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

// Get Appointment Option

		Thread.sleep(5000);

		Clickonelement(pom.getschedloc().getAppointmentoption());

// Click Create app
		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getAppointmentclick());

// sele Type

// Clickonelement(pom.getschedloc().getAppointtyp());

// Clcik Patient

		Thread.sleep(7000);

// driver.manage().timeouts().implicitlyWait(12000, TimeUnit.MILLISECONDS);

		WebDriverWait patse = new WebDriverWait(driver, 10);
		WebElement serapa = patse.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//input[@id='new-app-patient_1 appt-inp-patsrch'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", serapa);

		sendkeys(pom.getschedloc().getClcikpatient(), "veda");

// Select Patient

		Thread.sleep(5000);
		Clickonelement(pom.getschedloc().getSelectpatient());

// Select Date
		sendkeys1(pom.getschedloc().getClcikpatient(), Keys.TAB);
// clear(pom.getschedloc().getSelectdate());

		sendkeys(pom.getschedloc().getSelectdate(), "09/09/2022");

// Click Today
		Thread.sleep(3000);
//		Clickonelement(pom.getschedloc().getclcitoda());

// Click Time

		sendkeys1(pom.getschedloc().getSelectdate(), Keys.TAB);

		sendkeys(pom.getschedloc().getSelecttime(), "11:19 AM");

//Clickonelement(pom.getschedloc().getSelecttime2());
//
//Clickonelement(pom.getschedloc().getSelecttime1());
		Thread.sleep(4000);
//		Clickonelement(pom.getschedloc().getSelecttimeok());

// Clickonelement(pom.getschedloc().getSelecttimeok());

		// Provider Select

		Clickonelement(pom.getschedloc().getSearchProvider());

		// Select Provider

		Clickonelement(pom.getschedloc().getSelectprovider());

		// Repeat Appointment

		Clickonelement(pom.getschedloc().getrepeatapp());

		// Custom Repeat

		Clickonelement(pom.getschedloc().getcustomrepeat());

		// Repeat On

		Thread.sleep(4000);

		Clickonelement(pom.getschedloc().getrepeatonm());

		// Repeat On

		Thread.sleep(4000);

		Clickonelement(pom.getschedloc().getrepeatont());

		// Ends

		Clickonelement(pom.getschedloc().getendsafter());

		// save

		Clickonelement(pom.getschedloc().getsaverepeat());

// Click Profile

		Thread.sleep(3000);

		Clickonelement(pom.getschedloc().getClickprofile());

// Select Profile
		Thread.sleep(3000);

		Clickonelement(pom.getschedloc().getSelectprofile());

// Clcik Status

//		Clickonelement(pom.getschedloc().getClickstatus());
//
//// select status
//
//		Thread.sleep(5000);
//		Clickonelement(pom.getschedloc().getSelectstatus());

//// Click Location
//
//Thread.sleep(2000);
//
//Clickonelement(pom.getschedloc().getLocation());
//
//// Select Loction
//
//Thread.sleep(5000);
//Clickonelement(pom.getschedloc().getSelectLocation());
//
//// select exam room
//Thread.sleep(5000);
//Clickonelement(pom.getschedloc().getseleexamroom());
//
//Thread.sleep(5000);
//Clickonelement(pom.getschedloc().getseleexamroom1());

//// select exam room
//Thread.sleep(5000);
//Clickonelement(pom.getschedloc().getseleexamroom());
//
//Clickonelement(pom.getschedloc().getseleexamroom1());

// Click Save
		Thread.sleep(4000);

		Clickonelement(pom.getschedloc().getClicksave());

		try {
			// delete

			Thread.sleep(5000);

//			Clickonelement(pom.getschedloc().getdeleteapp());

			WebDriverWait delewa = new WebDriverWait(driver, 10);
			WebElement deleap = delewa.until(ExpectedConditions
					.elementToBeClickable(By.xpath("(//*[name()='svg'][@class='sc-gBztCq cQVVxn'])[1]")));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", deleap);

			driver.switchTo().alert().accept();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Appointment Created Successfully");

		// Clickonelement(pom.getschedloc().getClickclose());

		// driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

//	@Ignore

	@Test(priority = 3)

	public void Practicedashboard() throws InterruptedException {

		Thread.sleep(4000);

		Clickonelement(pom.getschedloc().getpracticedashboard());

		// get the title

		Thread.sleep(4000);

		gettext(pom.getschedloc().gettitlepractice());

		try {
			// Add Vitals

			Thread.sleep(4000);

			Clickonelement(pom.getschedloc().getaddvitalss());

			// cancel Vitals

			Thread.sleep(4000);

			Clickonelement(pom.getschedloc().getcancelvitals());

			// practice dashboard

			Thread.sleep(4000);

			Clickonelement(pom.getschedloc().getpracticedashboard());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Add Vitals");
		}

		try {
			// Edit Notes

			Thread.sleep(4000);

			Clickonelement(pom.getschedloc().geteditnotes());

			// back Notes

			Thread.sleep(4000);

			Clickonelement(pom.getschedloc().getbackoptions());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Edit Notes ");
		}

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		try {
			// add Service
			Thread.sleep(6000);

			Clickonelement(pom.getschedloc().getaddservices());

			// cancel services

			Thread.sleep(4000);

			Clickonelement(pom.getschedloc().getcancelvitals());

			// practice dashboard

			Thread.sleep(4000);

			Clickonelement(pom.getschedloc().getpracticedashboard());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// search patient

		Thread.sleep(4000);

		sendkeys(pom.getschedloc().getsearchpatientpractice(), "veda");

		// select patient

		Thread.sleep(4000);

		Clickonelement(pom.getschedloc().getselectpatient());

		// search provider

		sendkeys(pom.getschedloc().getsearchproviderpractice(), "james");

		// select provider

		Thread.sleep(6000);

		Clickonelement(pom.getschedloc().getselectprovider());

		// select status

		Clickonelement(pom.getschedloc().getselectstauspractice());

		// select status

		Clickonelement(pom.getschedloc().getselectstauspractice1());

		// select Billing status

		Clickonelement(pom.getschedloc().getselectstauspracticebilling());

		// select Billing status

		Clickonelement(pom.getschedloc().getselectstauspracticebill1());

		// select From Date

		sendkeys(pom.getschedloc().getdateselectpractice(), "2023-06-06");

		// select to Date

		sendkeys(pom.getschedloc().getdateselectpracticeto(), "2023-06-08");

		// select update

		Clickonelement(pom.getschedloc().getclickupdate());

		//

	}

//	@Ignore

	@Test(priority = 4)

	public void AppointmentDashboard() throws InterruptedException {

/////////// Appointment Dashboard ///////
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);

		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		WebElement apds = wait3.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//a[normalize-space()='Appointment Dashboard'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", apds);

		try {
			// click The Eye
			Thread.sleep(5000);
			Clickonelement(pom.getschedloc().geteyeoption());

			// sh sta
			Thread.sleep(5000);
			// Clickonelement(pom.getschedloc().getshst());

			// Staus Reshedule

			selectone(pom.getschedloc().getshstse(), "Rescheduled");

			// Staus conformed

			selectone(pom.getschedloc().getshstse(), "Confirmed");

		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Status Select Walkin");
		}

		// Appointment dashborad Title
		Thread.sleep(5000);
		gettext(pom.getschedloc().getappointmenttittle());

		// Click Search Office
		WebDriverWait officesearch = new WebDriverWait(driver, 10);
		WebElement searchoff = officesearch.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//div[@class='ant-select-selection-overflow'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", searchoff);

		// Click Search Office
		Thread.sleep(4000);
//		Clickonelement(pom.getschedloc().getSearchoffice());

		// Select Test Facility TODO
		Thread.sleep(3000);

		// Clickonelement(pom.getschedloc().getSelecttestfac2());

		// Close Search Office

		Clickonelement(pom.getschedloc().getSearchoffice());

		// Click Calender

		sendkeys(pom.getschedloc().getClickcalender(), "09-06-2023");

		sendkeys1(pom.getschedloc().getClickcalender(), Keys.ENTER);

//		 Clickonelement(pom.getschedloc().getClickupdate());
//
//		 Clickonelement(pom.getschedloc().getClickcalender());

		// Click on Update Filter

		Clickonelement(pom.getschedloc().getClickupdate());

		// Click Select none
		Thread.sleep(2000);

		Clickonelement(pom.getschedloc().getSelectnone());

		// Click Select all

		Clickonelement(pom.getschedloc().getSelectall());

		// Click Select none

		Thread.sleep(2000);

		Clickonelement(pom.getschedloc().getSelectnone());

		// Click Search Office

		// Clickonelement(pom.getschedloc().getstatsh());

		// Click Search Office
		Thread.sleep(5000);
		Clickonelement(pom.getschedloc().gettelehe());

		try {
			// click The Eye
			Thread.sleep(5000);
			Clickonelement(pom.getschedloc().geteyeoption1());

			// sh sta
			Thread.sleep(5000);
//			Clickonelement(pom.getschedloc().getshst());

			// Status Completed
			selectone(pom.getschedloc().getshstse(), "Completed");

			// Status cancelled
			selectone(pom.getschedloc().getshstse(), "Cancelled");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Status select Telehealth");
		}

		// Click Search Office
		Thread.sleep(5000);

		Clickonelement(pom.getschedloc().getSearchoffice2());

		// Select Test Facility TODO
		Thread.sleep(3000);

		// Clickonelement(pom.getschedloc().getSelecttestfac3());

		// Close Search Office

		Clickonelement(pom.getschedloc().getSearchoffice2());

		// Click Calender

		sendkeys(pom.getschedloc().getClickcalender1(), "09-06-2023");

		sendkeys1(pom.getschedloc().getClickcalender1(), Keys.ENTER);

		// Clickonelement(pom.getschedloc().getClickcalender());

		// Click on Update Filter

		Clickonelement(pom.getschedloc().getClickupdate1());

		// Click Select none
		Thread.sleep(2000);

		Clickonelement(pom.getschedloc().getSelect1());

		// Click Select all

		Clickonelement(pom.getschedloc().getSelectalltele());

		// Click Select none

		Thread.sleep(2000);

		Clickonelement(pom.getschedloc().getSelect1());

		// test.pass("Appointment Dashboard Tested Successfully ");

		System.out.println("Appointment Dashboard Tested Successfully ");
		// Select Test Facility

//		Clickonelement(pom.getschedloc().getSelecttestfac2());
//
//		// Click on Update Filter
//
//		Clickonelement(pom.getschedloc().getClickupdate());

	}

////////////////////Provider Availability //////////
	@Ignore

	@Test(priority = 4)

	public void ProviderAvailability() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		WebElement proa = wait4.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Provider Availability')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", proa);

//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Clickonelement(pom.getschedloc().getClickProvideravailability());

		// Click On office Search

		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getClickofficesearch());

		// Select provider
		Thread.sleep(2000);
		Clickonelement(pom.getschedloc().getSelectprovider());

		try {
			// Click Edit Optiom
			Clickonelement(pom.getschedloc().getClickedit());
			Thread.sleep(4000);

			// Close edit Custom Template
			Clickonelement(pom.getschedloc().getClosecustomedit());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Edit Option ");
		}

//		// Search Provider
//		Clickonelement(pom.getschedloc().getClickProvideravailability1());
//
//		// Select provider
//		Clickonelement(pom.getschedloc().geteditselectprovider());
//
//		// Appointment category
//		Clickonelement(pom.getschedloc().geteditappointment());
//
////select appointment
//		Clickonelement(pom.getschedloc().geteditselectappointment());
//
////appointment status
//		Clickonelement(pom.getschedloc().geteditappstatus());
//
////appintment selects
//		Clickonelement(pom.getschedloc().geteditappselect());
//
////date select
//		sendkeys(pom.getschedloc().geteditappdate(), "2022-06-01");
//
//////save
//		sendkeys(pom.getschedloc().getclcicktime(), "09:00");
//
//		// Save
//
//		// Clickonelement(pom.getschedloc().geteditappsave());
//

//Create Provider

		Thread.sleep(6000);
		Clickonelement(pom.getschedloc().getclickaddprovider());

		// Search Provider
		Clickonelement(pom.getschedloc().getSearchprovider());

		// Select Provider
		Clickonelement(pom.getschedloc().getSelectprovider1());

//		// Click Office
//
//		Thread.sleep(3000);
//		Clickonelement(pom.getschedloc().getSelectOffice());
//
//		// Select provider
//
//		Thread.sleep(3000);
//		Clickonelement(pom.getschedloc().getSelectoffice1());

		// click appointment

		Thread.sleep(5000);

//		WebDriverWait appoinmetcategory = new WebDriverWait(driver, 10);
//		WebElement seappoinmetcategory = appoinmetcategory
//				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='rc_select_9'])[1]")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", seappoinmetcategory);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//input[@class='ant-select-selection-search-input'])[5]")));

		Clickonelement(pom.getschedloc().getSelectappointmentcategory());

		// select category
		Clickonelement(pom.getschedloc().getSelectcategory());

		// click appointment status
		Clickonelement(pom.getschedloc().getAppointmentstatus());

		// select appointment status
		Thread.sleep(3000);
		Clickonelement(pom.getschedloc().getAppointmentstatusselect());

		// Select Date
//		sendkeys1(pom.getschedloc().getAppointmentstatusselect(), Keys.TAB);

//		Clickonelement(pom.getschedloc().getappcalender());

//		sendkeys(pom.getschedloc().getappcalender(), "28-03-2023");

//		// click today
		Thread.sleep(5000);

//		Clickonelement(pom.getschedloc().getclicktoday1());

		// Click Time

//		sendkeys1(pom.getschedloc().getappcalender(), Keys.TAB);

		// Click Time

//		sendkeys1(pom.getschedloc().getappcalender(), Keys.TAB);

//		sendkeys1(pom.getschedloc().getappcalender(), Keys.TAB);

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//
//		js.executeScript(“document.getElementByID("(//input[@name='timeapp'])[1]").value = "1056";");

		Clickonelement(pom.getschedloc().getapptimer());

		// send time
		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getapptimerclick());

//		// send time
//		Thread.sleep(4000);
//		sendkeys(pom.getschedloc().getapptimer(), "56");

		// click Today
		// Clickonelement(pom.getschedloc().getapprepeat());



		// exam room

		Clickonelement(pom.getschedloc().getexamrroom());
		// select exam

		Thread.sleep(3000);
		Clickonelement(pom.getschedloc().getexamrroom1());

		// duration
//		sendkeys(pom.getschedloc().getduration(), "40");

		Thread.sleep(3000);
		WebDriverWait savp = new WebDriverWait(driver, 10);
		WebElement psa = savp
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[normalize-space()='Save'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", psa);

		try {
			// /Close

			Thread.sleep(4000);
			Clickonelement(pom.getschedloc().getClosecustomedit());
		} catch (Exception e) {
			// Auto-generated catch block

		}

		System.out.println("Provider Availability");
//		// Click repeat
//		Clickonelement(pom.getschedloc().getapprepeat());
//
//		// click every
//		Clickonelement(pom.getschedloc().getappevery());
//
//		// clcik day
//		Clickonelement(pom.getschedloc().getappday());
//
////click calender
//		Clickonelement(pom.getschedloc().getappcal());
//
////click daywise
//		Clickonelement(pom.getschedloc().getappdaywise());
//
////click on calender
//		Clickonelement(pom.getschedloc().getappcal());
//
////click deselect
//		Clickonelement(pom.getschedloc().getappdaywisedesele());
//
////click on calender
//		Clickonelement(pom.getschedloc().getappcal());
//
////repeat deselect
//		Clickonelement(pom.getschedloc().getapprepeat());

//Select Date

// sendkeys(pom.getschedloc().getappcal(), "2022-02-25");

//Save or Close

		// Clickonelement(pom.getschedloc().getAppsave());

//Close

		// Clickonelement(pom.getschedloc().getClosecustomedit());
		// test.pass("Provider Availability Tested Successfully");

		System.out.println("Provider Availability Tested Successfully");

	}

	// Clickonelement(pom.getschedloc().getAppclose());

///////////////// Click Appointment profile///////

	@Ignore
	@Test(priority = 5)

	public void AppointmentProfile() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(4000);

		Clickonelement(pom.getschedloc().getAppointmentprofile());

		// click sort button

		Thread.sleep(2000);

		Clickonelement(pom.getschedloc().getclicksort());

		// click sort release
		Clickonelement(pom.getschedloc().getclicksortrelease());

		// click footer
		Thread.sleep(3000);

		// Clickonelement(pom.getschedloc().getclickfooter());

		// Click delete
		// Thread.sleep(3000);

		// Clickonelement(pom.getschedloc().getclickdelete());

		// click dismiss

		// alertdismiss(driver);

		// Click new add new profile
		Thread.sleep(2000);

		Clickonelement(pom.getschedloc().getaddnewprofile());

		// Send names
		Thread.sleep(2000);

		sendkeys(pom.getschedloc().getaddname(), "xyz");

		// send resean for visit
		sendkeys(pom.getschedloc().getaddresonforvisit(), "coldfever");

		// send color
		sendkeys(pom.getschedloc().getaddcolor(), "#A51718");

		// send duration
		sendkeys(pom.getschedloc().getaddduration(), "40");

		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@name='appoint_office'])[1]")));

		// send billing profile TODO
		selectone(pom.getschedloc().getbillingprofile(), "siva");

//payment profile
		selectone(pom.getschedloc().getbillingprofile1(), "Insurance");

		// clickpaymentprofile
		// Clickonelement(pom.getschedloc().getclickpaymentprofile());
//
////selectpaymentprofile
//		Clickonelement(pom.getschedloc().getselectpaymentprofile());

		// click save
		Clickonelement(pom.getschedloc().getsaveap());

		try {
			// edit Option
			Clickonelement(pom.getschedloc().geteditap());

			Clickonelement(pom.getschedloc().getcaned());
		} catch (Exception e) {
			// Auto-generated catch block
			System.out.println("");
		}

		// click close
		// Clickonelement(pom.getschedloc().getClose());
		System.out.println("Appointment Profile Tested Successfully");

		// test.pass("Appointment Profile Tested Successfully");

	}

	@Ignore
	@Test(priority = 6)

	public void BillingProfile() throws InterruptedException {

//		geturl("https://test.vozo.xyz/");
//
////		test.pass("Browser Launched Successfully ");
//
//		System.out.println("Browser Launched Successfully ");
//
//		System.out.println(driver.getTitle());
//		// Enter Username
//
//		sendkeys(pom.getinstance().getUsername(), "Admin3");
//
//		// Enter Password
//
//		sendkeys(pom.getinstance().getPassword(), "Admin@123");
//
//		// Click Signin Button '
//
//		Clickonelement(pom.getinstance().getSigninbtn());

//		test.pass("Login Successfully ");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/////////////// Click Billing Profile///////////////
		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getclcikbillingprofile());

		// click sort
		Clickonelement(pom.getschedloc().getclicksort1());

		// Click Sort
		Clickonelement(pom.getschedloc().getclicksort2());

		// click add new profile
		Clickonelement(pom.getschedloc().getclickaddnewprofile());

		// send profile name
		sendkeys(pom.getschedloc().getprofilename(), "xyz");

		// sendicd9
		sendkeys(pom.getschedloc().getsendicd9(), "v");

//		WebDriverWait wait2 = new WebDriverWait(driver, 30);
//		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'378.03-- Monocular esotropia with V pattern')]")));

		// click icd
		Thread.sleep(4000);

		Clickonelement(pom.getschedloc().getclcicksendicd9());

		// sendicd10
		sendkeys(pom.getschedloc().getsendicd10(), "v");

		// click icd
		Thread.sleep(5000);

		Clickonelement(pom.getschedloc().getselectsendicd10());
		// Find Cpt

//		WebElement l = driver.findElement(By.cssSelector("input#rc_select_8"));
//
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);

		sendkeys1(pom.getschedloc().getsendicd10(), Keys.TAB);

//		WebDriverWait wait2 = new WebDriverWait(driver, 30);
//		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div/div/div/form/div[2]/div[4]/div/div/div/div/div/span[1]/input")));

//		// senddia
		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getclickCpt());

		sendkeys(pom.getschedloc().getclickCpt(), "v");

		// click icd
		Thread.sleep(2000);

		Clickonelement(pom.getschedloc().getselectCpt());
//
//		// senddia
//		sendkeys(pom.getschedloc().getclickHCPCS(), "v");
//
//		// click icd
//		Thread.sleep(3000);
//
//		Clickonelement(pom.getschedloc().getselectHCPCS());
//
//		// senddia
//		sendkeys(pom.getschedloc().getclickcustom(), "d");
//
//		// click icd
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getschedloc().getselectcustom());

		// click save
		Thread.sleep(2000);

		Clickonelement(pom.getschedloc().getclicksave());
		Thread.sleep(2000);
		try {
			// edit Option
			Clickonelement(pom.getschedloc().geteditap());

			Clickonelement(pom.getschedloc().getcaned());
		} catch (Exception e) {
			// Auto-generated catch block
			System.out.println("");
		}

		System.out.println("Billing Profile Tested Successfully");

//		test.pass("Billing Profile Tested Successfully");
//
//		// step6: Mandatory step
//		extent.flush();
	}

	@Ignore
	@Test(priority = 7)

	public void Auditlog() throws InterruptedException {

		Thread.sleep(4000);
		// Audit Log
		Clickonelement(pom.getschedloc().getClickAudit());

		Thread.sleep(6000);

		// Enter Patient Name
		sendkeys(pom.getschedloc().getEnterPatientName(), "saheer");

		try {
			Thread.sleep(4000);
			Clickonelement(pom.getschedloc().getSelectPatientName());
		} catch (Exception e) {
			// TODO Auto-generated catch block

		}

		Thread.sleep(4000);
		// Enter User Nmae
		sendkeys(pom.getschedloc().getEnterUsername(), "a");

		try {
			Thread.sleep(4000);
			Clickonelement(pom.getschedloc().getSelectUserName());
		} catch (Exception e) {
			// TODO Auto-generated catch block

		}

		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getClickDropdown());

		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getSelectAppointment());

		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getClickUpdateFilter());

		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getSelectDay());

		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getSelectWK());

		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getSelectMonth());

		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getSelectYEAR());

	}

	@Ignore

	@Test(priority = 8)

	public void Notification() throws InterruptedException {

		// Click Appointmentdashboard
		//////// Click Notification //////
		Thread.sleep(8000);
//		WebDriverWait not = new WebDriverWait(driver, 10);
//		WebElement clino = not
//				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/nav/div[5]/button/a/svg")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", clino);

		Clickonelement(pom.getschedloc().getnotif());
		// select Appointment req

//		Thread.sleep(5000);
//
//		Clickonelement(pom.getschedloc().getappreq());
//
//		// select Secure messages
//
//		Clickonelement(pom.getschedloc().getsecumsg());

//		driver.close();

	}

}
