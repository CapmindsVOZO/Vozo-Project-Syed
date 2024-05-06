package com.schedulemumbai;

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

public class Schedule_Module extends Capminds_BaseClass {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	// public static void main(String[] args) throws InterruptedException {

	// User want to Check The Login Page

	// User want to Check The forgot password Page

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

		geturl("https://production.vozohealth.com/");

//		test.pass("Browser Launched Successfully ");

		System.out.println("Browser Launched Successfully ");

		// Click Signin Button '

		Thread.sleep(5000);

//		Clickonelement(pom.getinstance().getforgotpassword());
//
//		// Enter email
//
//		Thread.sleep(4000);
//		sendkeys(pom.getinstance().getforgotemail(), "test123@gmail.com");
//
//		/// Reset Button
//
//		Thread.sleep(4000);
//
////		Clickonelement(pom.getinstance().getresetbutton());
//
//		/// back to login
//
//		Thread.sleep(4000);
//
//		Clickonelement(pom.getinstance().getbactologin());

		// Enter Username

		sendkeys(pom.getinstance().getUsername(), "production");

		// Enter Password

		sendkeys(pom.getinstance().getPassword(), "Admin@123");

		// Click Signin Button '

		Clickonelement(pom.getinstance().getSigninbtn());

		// test.pass("Login Successfully ");

		System.out.println("Login Successfully ");

	}

	// User want to Check Schedule Caledar Page

	// User want to Check calendar each dropdowns

	@Ignore
	@Test(priority = 1)

	public void ScheduleCalender() throws InterruptedException {

		///////////////// Schedule Calender ///////////////

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// move side nav

		WebElement ele = driver.findElement(By.xpath("(//img[@alt='menu-icon'])[1]"));

		Actions action = new Actions(driver);
		Thread.sleep(6000);

		action.moveToElement(ele).click().perform();

		//
//		Clickonelement(pom.getschedloc().getsidenav());

		Thread.sleep(6000);

		// select Calendar Page
		Clickonelement(pom.getschedloc().getclickcalendarpage());

		// get the page Title

		Thread.sleep(3000);

		gettext(pom.getschedloc().getvisiblepage());

		Thread.sleep(3000);
		WebElement tex1 = driver.findElement(By.xpath("(//img[@alt='vozo-logo'])[1]"));

		String text1 = tex1.getText();
		System.out.println(text1);

		if (text1.equals("Schedule")) {
			System.out.println("Correct " + text1);

		} else {

			System.out.println("Not Correct");
		}

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

		// Visible Today

		gettext(pom.getschedloc().getprovidername());

		// Click Facility
		Thread.sleep(5000);

		Clickonelement(pom.getschedloc().getFacility());

		// select facility
		Thread.sleep(3000);

		Clickonelement(pom.getschedloc().getSelectFacility());

		// Close Facility

		// Clickonelement(pom.getschedloc().getFacilitySelectclo());
//
//		Clickonelement(pom.getschedloc().getFacilitySelect());
//
//		// Click Provider Select
//
//		Thread.sleep(3000);
//
		Clickonelement(pom.getschedloc().getProvider());

		// Select Provider

		Thread.sleep(3000);
		Clickonelement(pom.getschedloc().getselectProvider());

		// close Select

		// Clickonelement(pom.getschedloc().getProviderselectclo());

//		Clickonelement(pom.getschedloc().getProviderselect());

		Thread.sleep(5000);

		WebDriverWait waitexam = new WebDriverWait(driver, 10);
		WebElement examwait = waitexam.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//button[normalize-space()='Exam Room'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", examwait);

		// select exam room

//		Clickonelement(pom.getschedloc().getexamroo());

		// select exam room

		Thread.sleep(6000);

		WebDriverWait seleexam = new WebDriverWait(driver, 10);
		WebElement examwait1 = seleexam.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//div[normalize-space()='Exam Room 2'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", examwait1);

//		Clickonelement(pom.getschedloc().getexamrooclick());

		Thread.sleep(6000);
		// click exam

		Clickonelement(pom.getschedloc().getclickexam());

		// Click Provider Select
		//
//				Thread.sleep(3000);
		//
//		Clickonelement(pom.getschedloc().getProvider());
//
//		// Select Provider
//
//		Thread.sleep(3000);
//		Clickonelement(pom.getschedloc().getselectProvider());

		// close exam

//		Clickonelement(pom.getschedloc().getclickexam());

		// Visible Today

//		gettext(pom.getschedloc().getprovidername());

		// delete appointment

//		delete(pom.getschedloc().getdeleteapp(), Keys.DELETE);

		// test.pass("Calendar Page Tested Successfully ");

		System.out.println("Calendar Page Tested Successfully ");

//		driver.close();

	}

	// User want to check The appointments

	// User want to check The Teleheatlth appointments check zoo

	// User want to check The Repeats appointments

	@Ignore

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

		sendkeys(pom.getschedloc().getClcikpatient(), "james");

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

		// click The speciality

		Thread.sleep(3000);
		Clickonelement(pom.getschedloc().getspecialityselect());

		// click The speciality

		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getspecialityclick());

		// Provider Select
		Thread.sleep(5000);
		Clickonelement(pom.getschedloc().getSearchProvider());

		// Select Provider

		Thread.sleep(5000);

		Clickonelement(pom.getschedloc().getSelectprovidertele());

		// Select Time

		// Clickonelement(na.getClickok());

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

//
//		

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
		Thread.sleep(5000);
		Clickonelement(pom.getschedloc().getvideovis());

		// search pat
		Thread.sleep(5000);

		// Clickonelement(pom.getschedloc().getsearvid());

		sendkeys(pom.getschedloc().getsearvidpat(), "james");

		// Select Patient
		Thread.sleep(6000);
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

//		Thread.sleep(5000);
//		WebDriverWait facilitytele = new WebDriverWait(driver, 10);
//		WebElement telefacility = facilitytele.until(ExpectedConditions.elementToBeClickable(
//				By.xpath("//html/body/div[3]/div/div/div[3]/div/div/div[4]/div/div[2]/div[1]/div/span[1]/input")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", telefacility);

//		sendkeys(pom.getschedloc().getClcikpatient(), "naveen");

		// select Facility

//		Clickonelement(pom.getschedloc().gettelehealthfacilty());

//		try {
//			Thread.sleep(5000);
//
//			Clickonelement(pom.getschedloc().getselecttelefacility());
//
//			// select Office
//
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}

		// click The speciality

		Thread.sleep(6000);
		Clickonelement(pom.getschedloc().getspecialityselecttele());

		// click The speciality

		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getspecialityclick());

		// Provider Select
		Thread.sleep(5000);
		Clickonelement(pom.getschedloc().getSearchProvider());

		// Select Provider

		Thread.sleep(5000);

		Clickonelement(pom.getschedloc().getSelectprovidertele());

//		// provider
//		Thread.sleep(6000);
//		Clickonelement(pom.getschedloc().getprosel());
//
//		Thread.sleep(3000);
//
//		Clickonelement(pom.getschedloc().getproselected());

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

////////////////New Appointment Second repeats ////////////
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

		sendkeys(pom.getschedloc().getClcikpatient(), "james");

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

//		Clickonelement(pom.getschedloc().getSearchProvider());
//
//		// Select Provider
//		Thread.sleep(5000);
//
//		Clickonelement(pom.getschedloc().getSelectprovider());

		// click The speciality

		Thread.sleep(3000);
		Clickonelement(pom.getschedloc().getspecialityselectnewappoint());

		// click The speciality

		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getspecialityclick());

		// Provider Select
		Thread.sleep(5000);
		Clickonelement(pom.getschedloc().getSearchProvider());

		// Select Provider

		Thread.sleep(5000);

		Clickonelement(pom.getschedloc().getSelectprovidertele());

		// Click Profile

		Thread.sleep(3000);

		Clickonelement(pom.getschedloc().getClickprofile());

		// Select Profile
		Thread.sleep(3000);

		Clickonelement(pom.getschedloc().getSelectprofile());

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

	/// User want to Get The Practicedashboard Filters Work properly

	/// User want to Get The Practicedashboard List and Details Work properly
	@Ignore

	@Test(priority = 3)

	public void Practicedashboard() throws InterruptedException {

		// move side nav

		Thread.sleep(8000);

		WebElement ele = driver.findElement(By.xpath("(//img[@alt='menu-icon'])[1]"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).clickAndHold().perform();

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

		sendkeys(pom.getschedloc().getsearchpatientpractice(), "james");

		// select patient

		Thread.sleep(4000);

		Clickonelement(pom.getschedloc().getselectpatient());

		// search provider

		sendkeys(pom.getschedloc().getsearchproviderpractice(), "production");

		// select provider

		Thread.sleep(8000);

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

	/// User want to Get The Appointment dashboard Walkin and teleheath filters Work
	/// Properly

	// User want to Get The walkin and telehealth list work properly

	@Ignore

	@Test(priority = 4)

	public void AppointmentDashboard() throws InterruptedException {

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

		// get the page Title

		Thread.sleep(3000);

		gettext(pom.getschedloc().getappointmentdashboardpage());

		Thread.sleep(3000);
		WebElement appointmentdash = driver.findElement(By.xpath("(//div[@class='tab_title_name'])[1]"));

		String text3 = appointmentdash.getText();
		System.out.println(text3);

		if (text3.equals("Appointment Dashboard")) {
			System.out.println("Correct " + text3);

		} else {

			System.out.println("Not Correct");
		}

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

		sendkeys(pom.getschedloc().getClickcalender(), "08-11-2023");

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

		Thread.sleep(3000);

		sendkeys(pom.getschedloc().getClickcalender1(), "08-11-2023");

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

	// User want to Get The Provider availability list work properly and filters

	// User wan to get The add provider availability work properly

	@Ignore

	@Test(priority = 4)

	public void ProviderAvailability() throws InterruptedException {

		// move side nav

		Thread.sleep(8000);

		WebElement ele = driver.findElement(By.xpath("(//img[@alt='menu-icon'])[1]"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).clickAndHold().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		WebElement proa = wait4.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Provider Availability')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", proa);

//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Clickonelement(pom.getschedloc().getClickProvideravailability());

		// get the page Title

		Thread.sleep(3000);

		gettext(pom.getschedloc().getprovideravailablity());

		Thread.sleep(3000);
		WebElement provideravailabi = driver
				.findElement(By.xpath("(//div[@class='tab_title_name app_temp_top_tit_alt'])[1]"));

		String text4 = provideravailabi.getText();
		System.out.println(text4);

		if (text4.equals("Provider Availablity")) {
			System.out.println("Correct " + text4);

		} else {

			System.out.println("Not Correct");
		}

		// Click On office Search

		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getClickofficesearch());

		// Select provider
		Thread.sleep(4000);
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

//Create Provider

		Thread.sleep(6000);
		Clickonelement(pom.getschedloc().getclickaddprovider());

		// Search Provider

		Clickonelement(pom.getschedloc().getSearchprovider());

		// Select Provider

		Thread.sleep(5000);

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

		Clickonelement(pom.getschedloc().getapptimer());

		// send time
		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getapptimerclick());
//	
		// Click repeat
//		Clickonelement(pom.getschedloc().getapprepeat());
//
//		// click every
//		Clickonelement(pom.getschedloc().getappevery());

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
//		
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

		// Clickonelement(pom.getschedloc().getAppclose());
	}

	// User want to Get The add Appointment profile work properly \

	// User want to Get The Appointment profile List work properly

///////////////// Click Appointment profile///////

//	@Ignore
	@Test(priority = 5)

	public void AppointmentProfile() throws InterruptedException {

		// move side nav

		Thread.sleep(8000);

		WebElement ele = driver.findElement(By.xpath("(//img[@alt='menu-icon'])[1]"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).clickAndHold().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(4000);

		Clickonelement(pom.getschedloc().getAppointmentprofile());

		// Get Page Title

		Thread.sleep(3000);
		WebElement Appoitmentprofile = driver
				.findElement(By.xpath("(//div[@class='app-profiles-title app-prof-title_alt'])[1]"));

		String text5 = Appoitmentprofile.getText();
		System.out.println(text5);

		if (text5.equals("Appointment Profile")) {
			System.out.println("Correct " + text5);

		} else {

			System.out.println("Not Correct");
		}

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

//		WebDriverWait wait1 = new WebDriverWait(driver, 30);
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")));

		Thread.sleep(5000);

		// send billing profile TODO
		Clickonelement(pom.getschedloc().getbillingprofile());

		// send billing profile TODO
		Clickonelement(pom.getschedloc().getbillingprofileselect());
//payment profile
		Clickonelement(pom.getschedloc().getbillingprofile1());

		Thread.sleep(4000);

		// payment profile
		Clickonelement(pom.getschedloc().getbillingprofile1select());

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

	// User want to Get The Billing profile list work properly

	// User want to get the add billing profile work properly

//	@Ignore
	@Test(priority = 6)

	public void BillingProfile() throws InterruptedException {

		// move side nav

		Thread.sleep(8000);

		WebElement ele = driver.findElement(By.xpath("(//img[@alt='menu-icon'])[1]"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).clickAndHold().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/////////////// Click Billing Profile///////////////
		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getclcikbillingprofile());

		// Get Page Title

		Thread.sleep(3000);
		WebElement Billingprofile = driver
				.findElement(By.xpath("(//div[@class='app-profiles-title Bill-pro-sty'])[1]"));

		String text6 = Billingprofile.getText();
		System.out.println(text6);

		if (text6.equals("Billing Profiles")) {
			System.out.println("Correct " + text6);

		} else {

			System.out.println("Not Correct");
		}

		// click sort
//		Clickonelement(pom.getschedloc().getclicksort1());
//
//		// Click Sort
//		Clickonelement(pom.getschedloc().getclicksort2());

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

		Clickonelement(pom.getschedloc().getsendicd9());
		// click icd
		Thread.sleep(4000);

		Clickonelement(pom.getschedloc().getclcicksendicd9());

		// sendicd10
		sendkeys(pom.getschedloc().getsendicd10(), "v");

		// click icd
		Thread.sleep(5000);

		Clickonelement(pom.getschedloc().getsendicd10());

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

		sendkeys(pom.getschedloc().getclickCpt(), "v");

		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getclickCpt());

		// click icd
		Thread.sleep(2000);

		Clickonelement(pom.getschedloc().getselectCpt());

//		// scroll
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//
//		WebElement element = driver.findElement(By.id("(//input[@id='rc_select_20'])[1]"));
//
//		js.executeScript("arguments[0].scrollIntoView(true);", element);

//		WebDriverWait billpr = new WebDriverWait(driver, 30);
//		billpr.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='rc_select_20'])[1]")));
////

//		// senddia
//
//		Thread.sleep(4000);
//		sendkeys(pom.getschedloc().getclickHCPCS(), "v");
//
//		Thread.sleep(3000);
//
//		Clickonelement(pom.getschedloc().getclickHCPCS());
//
//		// click icd
//		Thread.sleep(3000);
//
//		Clickonelement(pom.getschedloc().getselectHCPCS());
//
//		// senddia
//		sendkeys(pom.getschedloc().getclickcustom(), "d");
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getschedloc().getclickcustom());
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

	// User want to get the Auditlog filters and list work properly

//	@Ignore

	@Test(priority = 7)

	public void Auditlog() throws InterruptedException {

		// move side nav

		Thread.sleep(8000);

		WebElement ele = driver.findElement(By.xpath("(//img[@alt='menu-icon'])[1]"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).clickAndHold().perform();

		Thread.sleep(4000);
		// Audit Log
		Clickonelement(pom.getschedloc().getClickAudit());

		Thread.sleep(6000);

		// Enter Patient Name
		sendkeys(pom.getschedloc().getEnterPatientName(), "james");

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

		Thread.sleep(5000);

		Clickonelement(pom.getschedloc().getnotificationclick());

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

	//// User want to get The Practice chat Option Work Properly

	// User want to get The message update everywhere

	@Ignore

	@Test(priority = 9)

	public void Practicechat() throws InterruptedException {

		Thread.sleep(5000);

		WebDriverWait not = new WebDriverWait(driver, 10);

		// User click practice chat

		Clickonelement(pom.getschedloc().getpracticechatclick());

		// User click practice chat title

//		titleverify(pom.getschedloc().getpracticechattitle(), "Practice chat");

		// User search practice chat

		Thread.sleep(5000);

		sendkeys(pom.getschedloc().getsearchpatient(), "bala");

		// User click practice chat provider

		Clickonelement(pom.getschedloc().getselectsearachprovider());

		// User click practice chat provider

		titleverify(pom.getschedloc().getprovidernametitle(), "balaa gopal");

		// User search practice chat

		sendkeys(pom.getschedloc().gettypemessage(), "hello");

		// User click practice chat send message

		Thread.sleep(5000);

		Clickonelement(pom.getschedloc().getsendmessage());

		// User click practice chat send message

//		Clickonelement(pom.getschedloc().getclickatoption());

		// User click practice chat select genral

		Thread.sleep(3000);
		Clickonelement(pom.getschedloc().getselectgenralprovider());

		// User click practice chat provider

//		titleverify(pom.getschedloc().getprovidergenraltitle(), "gopalaa s");

		// User search practice chat

		sendkeys(pom.getschedloc().gettypemessagegenral(), "hello");

		// User click practice chat send message

		Clickonelement(pom.getschedloc().getclickatoptiongenral());

		// User click practice chat Patient chat

		Clickonelement(pom.getschedloc().getsearchpatientchat());

		// User click practice chat send message

		Thread.sleep(4000);

		Clickonelement(pom.getschedloc().getclosepracticechat());

	}

	@Ignore

	@Test(priority = 9)

	public void Efax() throws InterruptedException {

		// click The patient Option

		Thread.sleep(5000);

		Clickonelement(pom.getschedloc().getclickincomingfax());

		// User click incoming fax

		Clickonelement(pom.getschedloc().getclickincomingfax());

		/// User incoming fax title

		titleverify(pom.getschedloc().getincomingfaxtitle(), "gopalaa s");

		// User search fax

		sendkeys(pom.getschedloc().getsearchfax(), "14703331740");

		// User send froimd date

		sendkeys(pom.getschedloc().getfromdate(), "2023-09-01");

		// User click Calendar Ok

		Clickonelement(pom.getschedloc().getfromdateok());

		// User send to date

		sendkeys(pom.getschedloc().gettodate(), "2023-09-01");

		// User click Calendar Ok

		Clickonelement(pom.getschedloc().gettodateokd());

		// User click update

		Clickonelement(pom.getschedloc().getclickupdatefax());

		// User click update

		Clickonelement(pom.getschedloc().getclickfaxoption());

		/// User incoming fax title

		titleverify(pom.getschedloc().getincomingfaxtitlein(), "gopalaa s");

		// User click fax

		Clickonelement(pom.getschedloc().getclickfax());

		// User send froimd date

		sendkeys(pom.getschedloc().getsearchprovider(), "mumbai");

		// User click provider In fax

		Clickonelement(pom.getschedloc().getselectfaxprovider());

		// User click provider In fax send

		Clickonelement(pom.getschedloc().getsendfax());

		// User click provider In fax cancel

		Clickonelement(pom.getschedloc().getcancelfax());

		// User click save attachment patient

		Clickonelement(pom.getschedloc().getsaveattachmenttochart());

		// User click search patient

		sendkeys(pom.getschedloc().getsearchpatientsattachment(), "naveen");

		// User click send description

		sendkeys(pom.getschedloc().getsenddescription(), "hello");

		// User click save option

		Clickonelement(pom.getschedloc().getsavetopatient());

		// User click cancel option

		Clickonelement(pom.getschedloc().getcancelattachments());

		// User select provider mumbai

		selectone(pom.getschedloc().getselectprovicder(), "mumbai vozo");

		// User select provider mumbai

		selectone(pom.getschedloc().getselectstatus(), "open");

		// User click assign Option

		Clickonelement(pom.getschedloc().getclickassign());

		// User click view document

		Clickonelement(pom.getschedloc().getviewdocument());

		// User click download option

		Clickonelement(pom.getschedloc().getdownloaddocument());

		/// User Click outgoing fax

		Clickonelement(pom.getschedloc().getclickoutgoingfax());

		/// User incoming fax title

		titleverify(pom.getschedloc().getincomingfaxtitle1(), "gopalaa s");

		// User search fax

		sendkeys(pom.getschedloc().getsearchfax1(), "14703331740");

		// User send froimd date

		sendkeys(pom.getschedloc().getfromdate1(), "2023-09-01");

		// User click Calendar Ok

		Clickonelement(pom.getschedloc().getfromdateok1());

		// User send to date

		sendkeys(pom.getschedloc().gettodate1(), "2023-09-01");

		// User click Calendar Ok

		Clickonelement(pom.getschedloc().gettodateok1());

		// User click update

		Clickonelement(pom.getschedloc().getclickupdatefax1());

		// User click update

		Clickonelement(pom.getschedloc().getclickfaxoption1());

		/// User incoming fax title

		titleverify(pom.getschedloc().getincomingfaxtitlein1(), "gopalaa s");

		// User click fax

		Clickonelement(pom.getschedloc().getclickfax1());

		// User send froimd date

		sendkeys(pom.getschedloc().getsearchprovider1(), "mumbai");

		// User click provider In fax

		Clickonelement(pom.getschedloc().getselectfaxprovider1());

		// User click provider In fax send

		Clickonelement(pom.getschedloc().getsendfax1());

		// User click provider In fax cancel

		Clickonelement(pom.getschedloc().getcancelfax1());

		// User click save attachment patient

		Clickonelement(pom.getschedloc().getsaveattachmenttochart1());

		// User click search patient

		sendkeys(pom.getschedloc().getsearchpatientsattachment1(), "naveen");

		// User click send description

		sendkeys(pom.getschedloc().getsenddescription1(), "hello");

		// User click save option

		Clickonelement(pom.getschedloc().getsavetopatient1());

		// User click cancel option

		Clickonelement(pom.getschedloc().getcancelattachments1());

		// User select provider mumbai

		selectone(pom.getschedloc().getselectprovicder1(), "mumbai vozo");

		// User select provider mumbai

		selectone(pom.getschedloc().getselectstatus1(), "open");

		// User click assign Option

		Clickonelement(pom.getschedloc().getclickassign1());

		// User click view document

		Clickonelement(pom.getschedloc().getviewdocument1());

		// User click download option

		Clickonelement(pom.getschedloc().getdownloaddocument1());

	}

	@Ignore

	@Test(priority = 10)

	public void ReferralManagment() throws InterruptedException {

		// User click referral Managment

		Clickonelement(pom.getschedloc().getreferralmanagment());

		// User click referral Managment title

		titleverify(pom.getschedloc().getreferralmanagmenttitle(), "Referral Managment");

		// User click referral Managment edit

		Clickonelement(pom.getschedloc().getclickeditreferralout());

		// User click referral Managment notes edit

		sendkeys(pom.getschedloc().getreferraloutnotes(), "Hello");

		// User click referral Managment edit update

		Clickonelement(pom.getschedloc().getreferraloutupdate());

		// User click referral Managment edit cancel

		Clickonelement(pom.getschedloc().getreferraloutcancel());

		// User click referral Managment search PAtient

		sendkeys(pom.getschedloc().getsearchpatientreferral(), "benny");

		// User click referral Managment select Patient

		Clickonelement(pom.getschedloc().getselectpatientreferral());

		// User click referral Managment select Patient

		selectone(pom.getschedloc().getselectreferralbyprovider(), "mumbai vozo");

		// User click referral Managment select Patient

		selectone(pom.getschedloc().getselectreferraltoprovider(), "Test w");

		// User click referral Managment select referral status

		selectone(pom.getschedloc().getselectreferralstatus(), "Test w");

		// User click referral Managment send from date

		sendkeys(pom.getschedloc().getsendfromdate(), "17-10-2023");

		// User click referral Managment ok cancel

		Clickonelement(pom.getschedloc().getsendfromdattoday());

		// User click referral Managment send to date

		sendkeys(pom.getschedloc().getsendtodate(), "17-10-2023");

		// User click referral Managment ok cancel

		Clickonelement(pom.getschedloc().getsendtodattoday());

		// User click referral Managment clcick update

		Clickonelement(pom.getschedloc().getclickupdatereferral());

		// User click referral Managment add referral Out

		Clickonelement(pom.getschedloc().getclickreferralout());

		// User click referral Managment add referral Out

		sendkeys(pom.getschedloc().getsearchpatientaddreferral(), "benny");

		// User click referral Managment add referral Out

		Clickonelement(pom.getschedloc().getselectpatientaddreferral());

		// User click referral Managment search provider from

		sendkeys(pom.getschedloc().getsearchproviderfromaddreferral(), "mumbai");

		// User click referral Managment select Mumbai provider

		Clickonelement(pom.getschedloc().getselectpatientaddreferral());

		// User click referral Managment search provider

		sendkeys(pom.getschedloc().getsearchprovidertoaddreferral(), "mumbai");

		// User click referral Managment select Mumbai provider to

		Clickonelement(pom.getschedloc().getselectprovidertoaddreferral());

		// User click referral Managment click referra lradio Button

		Clickonelement(pom.getschedloc().getreferralto());

		// User click referral Managment referral

		sendkeys(pom.getschedloc().getreferralreason(), "Hello ");

		// User click referral Managment select request diagnosis

		sendkeys(pom.getschedloc().getsendrequestdiagnosis(), "a");

		// User click referral Managment select request dia

		Clickonelement(pom.getschedloc().getselectrequestdiagnosis());

		// User click referral send refferal Managment date

		sendkeys(pom.getschedloc().getreferraldate(), "17-10-2023");

		// User click referral Managment select proority

		selectone(pom.getschedloc().getpriorityselect(), "Low");

		// User click referral Managment send referral Notes

		sendkeys(pom.getschedloc().getreferralnotes(), "hello ");

		// User click referral Managment send response Notes

		sendkeys(pom.getschedloc().getresponsenotes1(), "hello 123");

		// User click referral Managment send response Notes

		sendkeys(pom.getschedloc().getsearchreferraldiagnosis(), "a");

		// User click referral Managment select diagnosis

		Clickonelement(pom.getschedloc().getselectreferraldiagnosis());

		// User click referral Managment click Insurance

		Clickonelement(pom.getschedloc().getclickinsurance());

		// User click referral Managment select Insurance

		Clickonelement(pom.getschedloc().getselectinsurance());

		// User click referral Managment click response

		Clickonelement(pom.getschedloc().getresponseattachment());

		// User click referral Managment select response attachments

		Clickonelement(pom.getschedloc().getselectresponseattachment());

		// User click referral Managment select attachment click

		Clickonelement(pom.getschedloc().getattachmentclick());

		// User click referral Managment select attachment

		Clickonelement(pom.getschedloc().getattachmentselect());

		// User click referral Managment save referral

		Clickonelement(pom.getschedloc().getsavereferralout());

		// User click referral Managment cancel referral

		Clickonelement(pom.getschedloc().getcancelreferralout());

		// User click referral Managment Download

		Clickonelement(pom.getschedloc().getclickdownload());

		// User click referral Managment transmit

		Clickonelement(pom.getschedloc().getclicktransmit());

		// User click referral Managment transmit

		Clickonelement(pom.getschedloc().getselectmail());

		// User click referral Managment search mail

		sendkeys(pom.getschedloc().getsearchtomail(), "a");

		// User click referral Managment select mail

		Clickonelement(pom.getschedloc().getselecttomail());

		// User click referral Managment semd mail

		Clickonelement(pom.getschedloc().getsendemail());

		// User click referral Managment transmit

		Clickonelement(pom.getschedloc().getclicktransmit());

		// User click referral Managment semd mail

		Clickonelement(pom.getschedloc().getselectfax());

		// User click referral Managment send provider

		sendkeys(pom.getschedloc().getsearchproviderfax(), "mumbai");

		// User click referral Managment select provider fax

		Clickonelement(pom.getschedloc().getselectproviderfax());

		// User click referral Managment select provider send fax

		Clickonelement(pom.getschedloc().getclicksendfax());

		// User click referral Managment select response option

		Clickonelement(pom.getschedloc().getclickresponse());

		// User click referral Managment select cancel The referral Out

		Clickonelement(pom.getschedloc().getclickresponse());

		/////////////////// referral In /////////////////

		// User click referral Managment

		Clickonelement(pom.getschedloc().getclickreferralin());

		// User click referral Managment title

		titleverify(pom.getschedloc().getreferralmanagmenttitle1(), "Referral Managment");

		// User click referral Managment edit

		Clickonelement(pom.getschedloc().getclickeditreferralin1());

		// User click referral Managment notes edit

		sendkeys(pom.getschedloc().getreferraloutnotes1(), "Hello");

		// User click referral Managment edit update

		Clickonelement(pom.getschedloc().getreferraloutupdate1());

		// User click referral Managment edit cancel

		Clickonelement(pom.getschedloc().getreferraloutcancel1());

		// User click referral Managment search PAtient

		sendkeys(pom.getschedloc().getsearchpatientreferral1(), "benny");

		// User click referral Managment select Patient

		Clickonelement(pom.getschedloc().getselectpatientreferral1());

		// User click referral Managment select Patient search

		selectone(pom.getschedloc().getselectreferralbyprovider1(), "mumbai vozo");

		// User click referral Managment select Patient

		selectone(pom.getschedloc().getselectreferraltoprovider1(), "Test w");

		// User click referral Managment select referral status

		selectone(pom.getschedloc().getselectreferralstatus1(), "Test w");

		// User click referral Managment send from date

		sendkeys(pom.getschedloc().getsendfromdate1(), "17-10-2023");

		// User click referral Managment ok cancel

		Clickonelement(pom.getschedloc().getsendfromdattoday1());

		// User click referral Managment send to date

		sendkeys(pom.getschedloc().getsendtodate1(), "17-10-2023");

		// User click referral Managment ok cancel

		Clickonelement(pom.getschedloc().getsendtodattoday1());

		// User click referral Managment clcick update

		Clickonelement(pom.getschedloc().getclickupdatereferral1());

		// User click referral Managment add referral Out

		Clickonelement(pom.getschedloc().getclickreferralin1());

		// User click referral Managment add referral Out

		sendkeys(pom.getschedloc().getsearchpatientaddreferral1(), "benny");

		// User click referral Managment add referral Out

		Clickonelement(pom.getschedloc().getselectpatientaddreferral1());

		// User click referral Managment search provider from

		sendkeys(pom.getschedloc().getsearchproviderfromaddreferral1(), "mumbai");

		// User click referral Managment select Mumbai provider

		Clickonelement(pom.getschedloc().getselectproviderfromaddreferral1());

		// User click referral Managment search provider

		sendkeys(pom.getschedloc().getsearchprovidertoaddreferral1(), "mumbai");

		// User click referral Managment select Mumbai provider to

		Clickonelement(pom.getschedloc().getselectprovidertoaddreferral1());

		// User click referral Managment click referra lradio Button

		Clickonelement(pom.getschedloc().getreferralto1());

		// User click referral Managment referral

		sendkeys(pom.getschedloc().getreferralreason1(), "Hello ");

		// User click referral Managment select request diagnosis

		sendkeys(pom.getschedloc().getsendrequestdiagnosis1(), "a");

		// User click referral Managment select request dia

		Clickonelement(pom.getschedloc().getselectrequestdiagnosis1());

		// User click referral send refferal Managment date

		sendkeys(pom.getschedloc().getreferraldate1(), "17-10-2023");

		// User click referral Managment select proority

		selectone(pom.getschedloc().getpriorityselect1(), "Low");

		// User click referral Managment send referral Notes

		sendkeys(pom.getschedloc().getreferralnotes1(), "hello ");

		// User click referral Managment send response Notes

		sendkeys(pom.getschedloc().getresponsenotes11(), "hello 123");

		// User click referral Managment send response Notes

		sendkeys(pom.getschedloc().getsearchreferraldiagnosis1(), "a");

		// User click referral Managment select diagnosis

		Clickonelement(pom.getschedloc().getselectreferraldiagnosis1());

		// User click referral Managment click Insurance

		Clickonelement(pom.getschedloc().getclickattachment());

		// User click referral Managment select Insurance

		Clickonelement(pom.getschedloc().getselectattachments());

		// User click referral Managment click response

		Clickonelement(pom.getschedloc().getresponseattachment1());

		// User click referral Managment select response attachments

		Clickonelement(pom.getschedloc().getselectresponseattachment1());

		// User click referral Managment select attachment click

		Clickonelement(pom.getschedloc().getresponsediagnosis());

		// User click referral Managment select attachment

		Clickonelement(pom.getschedloc().getresponsediagnosisselect());

		// User click referral Managment save referral

		Clickonelement(pom.getschedloc().getsavereferralout1());

		// User click referral Managment cancel referral

		Clickonelement(pom.getschedloc().getcancelreferralout1());

		// User click referral Managment Download

		Clickonelement(pom.getschedloc().getclickdownload1());

		// User click referral Managment select response option

		Clickonelement(pom.getschedloc().getclickresponse1());

		// User click referral Managment transmit

		Clickonelement(pom.getschedloc().getclicktransmit1());

		// User click referral Managment transmit

		Clickonelement(pom.getschedloc().getselectmail1());

		// User click referral Managment search mail

		sendkeys(pom.getschedloc().getsearchtomail1(), "a");

		// User click referral Managment select mail

		Clickonelement(pom.getschedloc().getselecttomail1());

		// User click referral Managment semd mail

		Clickonelement(pom.getschedloc().getsendemail1());

		// User click referral Managment transmit

		Clickonelement(pom.getschedloc().getclicktransmit1());

		// User click referral Managment semd mail

		Clickonelement(pom.getschedloc().getselectfax1());

		// User click referral Managment send provider

		sendkeys(pom.getschedloc().getsearchproviderfax1(), "mumbai");

		// User click referral Managment select provider fax

		Clickonelement(pom.getschedloc().getselectproviderfax1());

		// User click referral Managment select provider send fax

		Clickonelement(pom.getschedloc().getclicksendfax1());

		// User click referral Managment select cancel The referral Out

//		Clickonelement(pom.getschedloc().getclickresponse());

	}

}
