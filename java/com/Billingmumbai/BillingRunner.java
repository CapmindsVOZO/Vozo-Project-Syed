package com.Billingmumbai;

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

//import com.pom.Pom_Class;

public class BillingRunner extends Base_class {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	// public static void main(String[] args) throws InterruptedException {

	// User want to Get The login work properly

	@Test(priority = 0)

	public void LoginPage() throws InterruptedException {

//		// Step1: Set up physical report path
//		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./report2/Billing.html");
//
//		// to keep the report history
//		reporter.setAppendExisting(true);
//
//		// Step2: Create object for ExtentReports
//		ExtentReports extent = new ExtentReports();
//
//		System.out.println("CAPMINDS");
//		// Step3: attach the data with physical file
//		extent.attachReporter(reporter);
//
//		// Step4: Create a test cases and assign test details
//		// testName //testDescription
//		ExtentTest test = extent.createTest("capminds", "patient with mandatory information");

//		test.assignCategory("VOZO");
//		test.assignAuthor("Capminds");
//
//		// Url Launch
//

//
//		System.out.println("Browser Launched Successfully");
//
//		test.pass("Browser Launched Successfully ");

		// Launch Url

		geturl("https://production.vozohealth.com/");

		// Enter Username
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		sendkeys(pom.getBilling().getUsername(), "production");

		// Enter Password
		sendkeys(pom.getBilling().getPassword(), "Admin@123");

		// Click Signin Button '
		Clickonelement(pom.getBilling().getSigninbtn());

		System.out.println("Login Successfully");

		// Click On Month Option
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// click Billing Module
		Clickonelement(pom.getBilling().getClickBillingModule());

	}

	// User want to Get The Insurance claim Work Properly Filters

	// User want to Get the insurance claim List Work proeprly
	@Ignore

	@Test(priority = 1)

	public void Insuranceclaim() throws InterruptedException {

		////////// Insurance claim //////////////////

		// get the page Title

		Thread.sleep(3000);

		gettext(pom.getBilling().getvisiblepage());

		Thread.sleep(3000);
		WebElement tex1 = driver.findElement(By.xpath("(//div[@class='tab_title_name'])[1]"));

		String text1 = tex1.getText();
		System.out.println(text1);

		if (text1.equals("Insurance Claims")) {
			System.out.println("Correct " + text1);

		} else {

			System.out.println("Not Correct");
		}

		// Enter client name
		sendkeys(pom.getBilling().getEnterclientname(), "james");

		// patient name

		try {
			Thread.sleep(5000);

			Clickonelement(pom.getBilling().getselecli());
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		// Enter Payer name
		sendkeys(pom.getBilling().getEnterPayername(), "united");

		try {
			// select UNITED HEALTHCARE
			Thread.sleep(5000);
			Clickonelement(pom.getBilling().getSelectUNITEDHEALTHCARE());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// select UNITED HEALTHCARE1

		// Clickonelement(pom.getBilling().getSelectUNITEDHEALTHCARE1());

		// click Office drop down
		// Clickonelement(pom.getBilling().getClickOfficeDropdown());

		// select Test facility phar
		Thread.sleep(3000);
		Clickonelement(pom.getBilling().getSelectTestFacilityPhar());

		// select Test facility phar
		Thread.sleep(3000);
		Clickonelement(pom.getBilling().getSelectTestFacilityPharclick());

		// click Billing status
		Clickonelement(pom.getBilling().getClickByBillingStatus());

		// click Billing status
		Clickonelement(pom.getBilling().getClickByBillingStatusclick());

		// select Paid In full
		// Clickonelement(pom.getBilling().getSelectPaidInFull());

		// click By claim status
		Thread.sleep(3000);

		Clickonelement(pom.getBilling().getClickByClaimStatus());

		// click By claim status
		Thread.sleep(3000);

		Clickonelement(pom.getBilling().getClickByClaimStatusclick());

		// select claimed option
		// Clickonelement(pom.getBilling().getselectClaimed());

		// click date
		Clickonelement(pom.getBilling().getclickdate());

		// select Start date
		Clickonelement(pom.getBilling().getselectStartDate());

		// select End date
		Clickonelement(pom.getBilling().getselectEndDate());

		// Click the Search button
		Clickonelement(pom.getBilling().getClickSearchButton());

		try {
			// Click Generate form button
			Clickonelement(pom.getBilling().getClickGenerateFormButton());

			// Click HCFA(PDF)
			Clickonelement(pom.getBilling().getClickHCPAPDF());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Insurance Form");
		}

		// Close validate and Clear
		Thread.sleep(5000);
//		Clickonelement(pom.getBilling().getclickclose());

//		try {
//			// Click Validate Only
//			Clickonelement(pom.getBilling().getClickValidateOnly());
//
//			//
//
//			// Click Close button
//			Clickonelement(pom.getBilling().getClickClose());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		System.out.println("Insurance Claims Tested Successfully");

		// test.pass("Insurance Claims Tested Successfully");

	}

	// User want to Get The Patient with balance and Patient Payments Filters
	// Payments
	// work Properly

	// User want to Get The Patient with balance and Patient Payments List Payments
	// work Properly

	@Ignore

	@Test(priority = 2)

	public void PatientPayment() throws InterruptedException {

		// move side nav

		Thread.sleep(8000);

		WebElement ele = driver.findElement(By.xpath("(//img[@alt='menu-icon'])[1]"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).clickAndHold().perform();

////////////////Patient Payment /////////////////

		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// Thread.sleep(4000);
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		WebElement patpay = wait3.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Patient Payments'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", patpay);

// patient payment
		// get the page Title

		Thread.sleep(3000);

		gettext(pom.getBilling().getpatientppayment());

		Thread.sleep(3000);
		WebElement tex2 = driver.findElement(By.xpath("(//div[@class='tab_title_main tab_title_name'])[1]"));

		String text2 = tex2.getText();
		System.out.println(text2);

		if (text2.equals("Patient Payments")) {
			System.out.println("Correct " + text2);

		} else {

			System.out.println("Not Correct");
		}

		// Clickonelement(pom.getBilling().getpatientpayment());

		// patient search

		sendkeys(pom.getBilling().getpateintsear1(), "james");

		// click patientpayment1

		Thread.sleep(3000);

		Clickonelement(pom.getBilling().getpayaction());

		// select cash
		Thread.sleep(3000);
		Clickonelement(pom.getBilling().getselectcash());

		// select cash

		Clickonelement(pom.getBilling().getselectcash1());

//		sendkeys1(pom.getBilling().getselectcash(), Keys.TAB);

//		// select date
//				Thread.sleep(3000);
//
//				Clickonelement(pom.getBilling().getdatepay());

		// dat
		Thread.sleep(3000);

		sendkeys(pom.getBilling().getdatepay(), "2024-01-31");
		// click patientpayment1

		Thread.sleep(3000);

		sendkeys(pom.getBilling().getpatientbala(), "5");

		try {

			// today

//			Clickonelement(pom.getBilling().getdatepay());
			// today
			Thread.sleep(3000);

			Clickonelement(pom.getBilling().getaddpayment());

			// close
			Thread.sleep(3000);

//			Clickonelement(pom.getBilling().getcancelp());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Click On Month Option
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// clci pay

		Thread.sleep(5000);

		Clickonelement(pom.getBilling().getpateintpayment1());

		// search pat

		sendkeys(pom.getBilling().getpateintsear2(), "james");

		Thread.sleep(5000);

		Clickonelement(pom.getBilling().getselepatpay());

		// click patientpayment1

		Thread.sleep(6000);

		Clickonelement(pom.getBilling().getpayaction1());

		// select cash

		Clickonelement(pom.getBilling().getselectcash());

		// select cash

		Clickonelement(pom.getBilling().getselectcash1());

//		sendkeys1(pom.getBilling().getselectcash(), Keys.TAB);

//				// select date
//						Thread.sleep(3000);
		//
//						Clickonelement(pom.getBilling().getdatepay());

		// dat
		Thread.sleep(3000);

		sendkeys(pom.getBilling().getdatepay(), "2024-01-31");
		// click patientpayment1

		Thread.sleep(3000);

		sendkeys(pom.getBilling().getpatientbala(), "5");

		try {

			// today

//					Clickonelement(pom.getBilling().getdatepay());
			// today
			Thread.sleep(3000);

			Clickonelement(pom.getBilling().getaddpayment());

			// close
			Thread.sleep(3000);

//			Clickonelement(pom.getBilling().getcancelp());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// gettext(pom.getBilling().getselepatpay());

// click patientpayment1 

//Clickonelement(pom.getBilling().getclipateintsear2());

		System.out.println("Patient Payments Tested Successfully");

		// test.pass("Patient Payments Tested Successfully");

	}

	// User want to get The Patient statement actice Patient and all Patient Filters
	// work properly

	// User want to get The Patient statement actice Patient and all Patient List
	// work properly

	@Ignore
	@Test(priority = 3)

	public void PatientStatements() throws InterruptedException {

		// move side nav

		Thread.sleep(8000);

		WebElement ele = driver.findElement(By.xpath("(//img[@alt='menu-icon'])[1]"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).clickAndHold().perform();

///////// patient statement//////////////////

		// Thread.sleep(4000);
		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		WebElement patsta = wait4.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Patient Statements'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", patsta);

		try {
			// get the page Title

			Thread.sleep(3000);

			gettext(pom.getBilling().getpatientstatment());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Thread.sleep(3000);
		WebElement tex3 = driver.findElement(By.xpath("(//div[@class='tab_title_name'])[1]"));

		String text4 = tex3.getText();
		System.out.println(text4);

		if (text4.equals("Patient Statements")) {
			System.out.println("Correct " + text4);

		} else {

			System.out.println("Not Correct");
		}

//		// get the page Title
//
//		Thread.sleep(3000);
//
//		gettext(pom.getBilling().getpatientppayment());
//
//		Thread.sleep(3000);
//		WebElement tex2 = driver.findElement(By.xpath("(//div[@class='tab_title_name'])[1]"));
//
//		String text2 = tex2.getText();
//		System.out.println(text2);
//
//		if (text2.equals("Patient Payments")) {
//			System.out.println("Correct " + text2);
//
//		} else {
//
//			System.out.println("Not Correct");
//		}

		// Clickonelement(pom.getBilling().getpatientstate());
		// click radi

		Clickonelement(pom.getBilling().getcliradio());

		// patient state se

		sendkeys(pom.getBilling().getpateintsear3(), "james");

		// click patientpayment1

		Thread.sleep(5000);

		Clickonelement(pom.getBilling().getclipateintsear3());

		// stat bal

		sendkeys(pom.getBilling().getstbal(), "10");

		// end bal

		sendkeys(pom.getBilling().getenbal(), "50000");

		try {
			// clic sear

			Clickonelement(pom.getBilling().getclickdownload());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// clic sear

		Clickonelement(pom.getBilling().getclisear1());

		// cli all pat

		Thread.sleep(3000);

		Clickonelement(pom.getBilling().getallpatcl());

// patient state se

		sendkeys(pom.getBilling().getsearchpat4(), "james");

// click patientpayment1 TODO
		Thread.sleep(5000);

//		Clickonelement(pom.getBilling().getselepat2());

// click radi
		Thread.sleep(5000);

		Clickonelement(pom.getBilling().getclirad2());

// stat bal

		sendkeys(pom.getBilling().getstabal2(), "10");

// end bal

		sendkeys(pom.getBilling().getenbal2(), "50000");

		try {
			// clic sear

			Clickonelement(pom.getBilling().getclickdownload());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

// click sera

		Clickonelement(pom.getBilling().getclisear5());
		System.out.println("Patient Statements Tested Successfully");

		// test.pass("Patient Statements Tested Successfully");
	}

	// User want to get The Patient Ledger Work Properly lists

	@Ignore

	@Test(priority = 4)

	public void PatientLedger() throws InterruptedException {

//////////////////////   Patient balance /ledger        //////////////	

		// move side nav

		Thread.sleep(8000);

		WebElement ele = driver.findElement(By.xpath("(//img[@alt='menu-icon'])[1]"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).clickAndHold().perform();

		// Thread.sleep(3000);

		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		WebElement patled = wait5.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Patient Ledger'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", patled);

		// get the page Title

		Thread.sleep(3000);

		Clickonelement(pom.getBilling().getpatientpledgertitt());

		gettext(pom.getBilling().getpatientpledgertitt());

		Thread.sleep(3000);
		WebElement tex5 = driver.findElement(By.xpath("(//div[@class='tab_title_name'])[1]"));

		String text5 = tex5.getText();
		System.out.println(text5);

		if (text5.equals("Patient Ledger")) {
			System.out.println("Correct " + text5);

		} else {

			System.out.println("Not Correct");
		}

		// click Patient balance Ledger
		// Clickonelement(pom.getBilling().getClickPatientBalanceLedger());

		// Enter client name
		sendkeys(pom.getBilling().getEnterClientName(), "james");

		// click select john peter

		Thread.sleep(4000);

		Clickonelement(pom.getBilling().getSelectJonPeter());

		// click top on Patient balance Ledger details

		Thread.sleep(8000);
		WebDriverWait clipa = new WebDriverWait(driver, 10);
		WebElement selepa = clipa.until(ExpectedConditions.elementToBeClickable(By.xpath("//table/tbody/tr/td[2]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selepa);

		// Clickonelement(pom.getBilling().getclickledger());

		System.out.println("Patient Ledger Tested Successfully");

		// test.pass("Patient Ledger Tested Successfully");

	}

	// User want to get The fees Schedule Work Properly lists

	// User want to get The fees Schedule Work Properly Filters

	@Ignore
	@Test(priority = 5)

	public void FeeSchedule() throws InterruptedException {

		// move side nav

		Thread.sleep(8000);

		WebElement ele = driver.findElement(By.xpath("(//img[@alt='menu-icon'])[1]"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).clickAndHold().perform();

		/////////////////// FEES SCHEDULE ////////////////////////////
		Thread.sleep(2000);

		WebDriverWait wait6 = new WebDriverWait(driver, 10);
		WebElement feesch = wait6
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Fee Schedule'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", feesch);

		// get the page Title

		Thread.sleep(3000);

		Clickonelement(pom.getBilling().getFeesscheduletittl());

		// Clickonelement(pom.getBilling().getfees());

		// get the page Title

		Thread.sleep(3000);

		gettext(pom.getBilling().getFeesscheduletittl());

		Thread.sleep(3000);
		WebElement tex6 = driver.findElement(By.xpath("(//div[@class='tab_title_main tab_title_name'])[1]"));

		String text6 = tex6.getText();
		System.out.println(text6);

		if (text6.equals("Insurance Payer Fee Schedule")) {
			System.out.println("Correct " + text6);

		} else {

			System.out.println("Not Correct");
		}

		// cpt sear
		Thread.sleep(2000);

		sendkeys(pom.getBilling().getcpthcpcssear(), "A7505");

		// clic cpt TODO

		// Clickonelement(pom.getBilling().getclicpt());

		// insu name

		sendkeys(pom.getBilling().getinsuranam(), "james");

		// sele insu

		// Clickonelement(pom.getBilling().getinsuranamsele());

		// pay name

		sendkeys(pom.getBilling().getpaynam(), "welcome");

		// sele payer

		// Clickonelement(pom.getBilling().getpaynamsele());

		// pick name

		sendkeys(pom.getBilling().getpicklis(), "hello");

		// sele pick

		Thread.sleep(2000);

		// Clickonelement(pom.getBilling().getpicklissele());

		// updat cl

		Clickonelement(pom.getBilling().getupdacli());

		try {
			// cl

			Clickonelement(pom.getBilling().getclied());

			// cl

			Clickonelement(pom.getBilling().getcliedcancel());
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			System.out.println("Edit Option ");
		}

		// cli ad
		Thread.sleep(4000);

		Clickonelement(pom.getBilling().getcliaddne());

		// sele cpt
		Thread.sleep(4000);

		Clickonelement(pom.getBilling().getselecpt());

		// sele cpt

		Clickonelement(pom.getBilling().getselecptclick());

		// sele cpt

		sendkeys(pom.getBilling().getsearco(), "a");

		// cli cod
		Thread.sleep(4000);
		Clickonelement(pom.getBilling().getsearco());
		Thread.sleep(4000);

		Clickonelement(pom.getBilling().getselecptco());

		// base pri

		sendkeys(pom.getBilling().getbasepri(), "5000");

		// base pri

		sendkeys(pom.getBilling().getexpectrei(), "200");

		// cpt pri

// sendkeys(pom.getBilling().getcptmod(), "cpt code");

		// office sel

		Clickonelement(pom.getBilling().getseleoff());

		// office sel

		Clickonelement(pom.getBilling().getseleoffclick());

		// sele ndc

		sendkeys(pom.getBilling().getNdcco(), "10");

		// send ndc qu

		sendkeys(pom.getBilling().getNdcquan(), "10");

		// send ndc un

		sendkeys(pom.getBilling().getNdcun(), "10");

		// payer id

		Clickonelement(pom.getBilling().getpayerid());

		// payer id

		Clickonelement(pom.getBilling().getpayeridclick());

		// pay name

		sendkeys(pom.getBilling().getpaynam2(), "Test plan");

// cus des

		sendkeys(pom.getBilling().getcusdes(), "new cpt code ");

// cus des

		sendkeys(pom.getBilling().getpickca(), "Yellow");

// clic save

		Clickonelement(pom.getBilling().getclisave());

// cli ad

		Thread.sleep(4000);

		Clickonelement(pom.getBilling().getcliaddne());

// sele hcpcs

		Clickonelement(pom.getBilling().getselecpt());

		// sele hcpcs

		Clickonelement(pom.getBilling().getselecptclick2());
// search code

		sendkeys(pom.getBilling().getcodese2(), "a");

		// click hcpc
		Thread.sleep(4000);
		Clickonelement(pom.getBilling().getcodese2());

// sele cod

		Clickonelement(pom.getBilling().getselecodese2());

// base pri hcpcs

		sendkeys(pom.getBilling().getbasepri(), "5000");

// base pri hcpcs

		sendkeys(pom.getBilling().getexpectrei(), "200");

// hcpcs mod

//sendkeys(pom.getBilling().getcptmod(), "HCPCS CODE");

// office sel

		Clickonelement(pom.getBilling().getseleoff());

		// office sel

		Clickonelement(pom.getBilling().getseleoffclick());

// sele ndc

		sendkeys(pom.getBilling().getNdcco(), "10");

// send ndc qu

		sendkeys(pom.getBilling().getNdcquan(), "10");

// send ndc un

		sendkeys(pom.getBilling().getNdcun(), "10");

// payer id

		Clickonelement(pom.getBilling().getpayerid());

		// payer id

		Clickonelement(pom.getBilling().getpayeridclick());

// pay name

		sendkeys(pom.getBilling().getpaynam2(), "Shanker");

		// cus des

		sendkeys(pom.getBilling().getcusdes(), "new hcpcs code ");

		// pickca des

		sendkeys(pom.getBilling().getpickca(), "Yellow");

		// clic save hcpcs

		Clickonelement(pom.getBilling().getclisave());

		// cli ad

		Thread.sleep(4000);

		Clickonelement(pom.getBilling().getcliaddne());

		// sele hcpcs

		Clickonelement(pom.getBilling().getselecpt());

		// sele hcpcs

		Clickonelement(pom.getBilling().getselecptclick3());

		// search code
		Thread.sleep(5000);
		sendkeys(pom.getBilling().getcodese2(), "a");

		// click

		Thread.sleep(4000);

		Clickonelement(pom.getBilling().getcodese2());

		// sele cus cod

		Thread.sleep(5000);

		WebDriverWait cuco = new WebDriverWait(driver, 10);
		WebElement sera = cuco.until(ExpectedConditions.elementToBeClickable(
				By.xpath("(//div[@class='ant-select-item-option-content'][normalize-space()='321--asd'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", sera);
		// Clickonelement(pom.getBilling().getselecusco());

		// base pri hcpcs

		sendkeys(pom.getBilling().getbasepri(), "2000");

		// base pri hcpcs

		sendkeys(pom.getBilling().getexpectrei(), "100");

// office sel

		Clickonelement(pom.getBilling().getseleoff());

		// office sel

		Clickonelement(pom.getBilling().getseleoffclick());

// cus des

		sendkeys(pom.getBilling().getcusdes(), "new customs code ");

// pickca des

		sendkeys(pom.getBilling().getpickca(), "Blue");

// clic save cusom

		Clickonelement(pom.getBilling().getclisave());

		////////////// ICD9///////////
		Thread.sleep(6000);

		// Click Fees Schedule
		// Clickonelement(pom.getBilling().getclickFeesSchedule());

		Thread.sleep(2000);

		// Click ICD 9
		Clickonelement(pom.getBilling().getclickICD9());

		// enter ICD code

		Thread.sleep(4000);
		sendkeys(pom.getBilling().getEnterICDCode(), "058.21");

		Thread.sleep(5000);

		try {
			// Select ICD code
			Thread.sleep(6000);
			Clickonelement(pom.getBilling().getSelectICDCode());
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		// enter Pick list
		sendkeys(pom.getBilling().getEnterPickList(), "Yellow");

		// Select Orange pick list
		// Clickonelement(pom.getBilling().getSelectYellow());

		// Click Update
		Clickonelement(pom.getBilling().getClickUpdate());

//		//select ICD 9
//	    Selectone(pom.getBilling().getselectCodeType1(),"ICD-9" );
//	   
//	    //Clear Codes
//	    ClearText(pom.getBilling().getclearcode()); 
//    
//	  //enter Pick list
//	  	sendkeys(pom.getBilling().getEntercode(), "670.0");

		try {
			// Click Edit option
			Clickonelement(pom.getBilling().getClickEDit());

			Thread.sleep(4000);

			// Click Edit option
			Clickonelement(pom.getBilling().getClickCancel());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Edit Option");
		}

		Thread.sleep(2000);

		// Click Add New Option
		Clickonelement(pom.getBilling().getClickAddNew());

		// Click in code type
		Clickonelement(pom.getBilling().getClickCodeType());

		Thread.sleep(2000);

		// select Code Type
		Clickonelement(pom.getBilling().getSelectCodeType());

		// enter Pick list
		sendkeys(pom.getBilling().getEnterCode(), "a");

		Thread.sleep(3000);
		Clickonelement(pom.getBilling().getEnterCode());

		// select Enter Code
		Thread.sleep(5000);
		Clickonelement(pom.getBilling().getSelectEnterCode());

		// click in office
		Clickonelement(pom.getBilling().getClickOffice());

		// click in office
		Clickonelement(pom.getBilling().getClickOfficeselect());

		// Select Test Facility Phar
		// Selectone(pom.getBilling().getSelectTestFacilityPhar1(), "defaults
		// hospital");

		// enter Custom description
		sendkeys(pom.getBilling().getEnterDescription(), "Fever");

		// enter Pick list category
		sendkeys(pom.getBilling().getEnterPicklistCategory(), "Normal check up");

		// Select Cancel
//		Clickonelement(pom.getBilling().getClickCancel1());

		// Select Save
		Clickonelement(pom.getBilling().getClicksave());

		///////////////// ICD 10 ///////////////////

		Thread.sleep(6000);

		// Click ICD 10
		Clickonelement(pom.getBilling().getClickICD10());

		// enter TCD 10 CODE
		sendkeys(pom.getBilling().getEnterICD10(), "E71.111");

		try {
			// Select ICD code
			Thread.sleep(6000);
			Clickonelement(pom.getBilling().getSelectICD10());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// Enter PickList
		sendkeys(pom.getBilling().getEnterPickList1(), "red");

		// Select ICD code
		// Clickonelement(pom.getBilling().getSelectwhite());

		Thread.sleep(2000);
		// Select Update Button
		Clickonelement(pom.getBilling().getSelectUpdate());

		try {
			// Click Edit
			Clickonelement(pom.getBilling().getClickEdit());

			// Click Cancel
			Clickonelement(pom.getBilling().getClickCancel2());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Edit Option ");
		}
		Thread.sleep(3000);

		// Click Add new Button
		Clickonelement(pom.getBilling().getClickaddNew());

		// Click Cod type

		Thread.sleep(7000);

		WebDriverWait icd10 = new WebDriverWait(driver, 10);
		WebElement ic10 = icd10
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='ant-select-selector'])[8]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ic10);

		Thread.sleep(7000);
//		Clickonelement(pom.getBilling().getClickcodeType());

		// Click select code type
		Clickonelement(pom.getBilling().getSelectcodeType());

		Thread.sleep(2000);

		// Enter Code
		sendkeys(pom.getBilling().getClickCode(), "3");

		Thread.sleep(4000);

		Clickonelement(pom.getBilling().getClickCode());

		Thread.sleep(2000);
		// select code type
		Clickonelement(pom.getBilling().getSelectCode());

		// Click Office
		Clickonelement(pom.getBilling().getClickoffice());

		// Click Office
		Clickonelement(pom.getBilling().getClickofficeselect());

		// select code type
		// Clickonelement(pom.getBilling().getselectTestfacilityphar());

		// Enter Code description
		sendkeys(pom.getBilling().getEnterCodeDescription(), "Normal");

		// Enter Code description
		sendkeys(pom.getBilling().getEnterPicklistcategory(), "Normality ");

		// select code type
		Clickonelement(pom.getBilling().getClickSave());

		// select code type
		// Clickonelement(pom.getBilling().getClickCance());

		System.out.println("Fee Schedule Tested Successfully ");

		// test.pass("Fee Schedule Tested Successfully ");

	}

	// User want to Get The eob List work properly

	// User want to Get The eob Filters work properly
//	@Ignore

	@Test(priority = 6)

	public void EOB() throws InterruptedException {

		// move side nav

		Thread.sleep(8000);

		WebElement ele = driver.findElement(By.xpath("(//img[@alt='menu-icon'])[1]"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).clickAndHold().perform();
		///////////////// EOB Add Payment ///////////////////

		WebDriverWait wait10 = new WebDriverWait(driver, 10);
		WebElement eobsel = wait10
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='EOB'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", eobsel);

		// get the page Title

		Thread.sleep(3000);

		Clickonelement(pom.getBilling().getseareo());

//		Clickonelement(pom.getBilling().getEOBtittle());

		// get the page Title

		Thread.sleep(3000);

		gettext(pom.getBilling().getEOBtittle());

		Thread.sleep(3000);
		WebElement tex7 = driver.findElement(By.xpath("(//div[@class='tab_title_name '])[1]"));

		String text7 = tex7.getText();
		System.out.println(text7);

		if (text7.equals("Explain of Benefits")) {

			System.out.println("Correct " + text7);

		} else {

			System.out.println("Not Correct");
		}

		Thread.sleep(5000);

		// Clickonelement(pom.getBilling().getclieob());

		// sel insu

		Clickonelement(pom.getBilling().getselein());

		// sel insu

		Clickonelement(pom.getBilling().getseleinclick());

		// star date

		sendkeys(pom.getBilling().getstardat(), "2024-02-01");

		// end date

		sendkeys(pom.getBilling().getendat(), "2024-03-31");

		// sear eo

		Clickonelement(pom.getBilling().getseareo());

		////////// Add Eob /////////

		// Click Add Payment
		Clickonelement(pom.getBilling().getClickAddPyment());

		// Click date

//		ClearText(pom.getBilling().getClickDate());
//
//		sendkeys(pom.getBilling().getClickDate(), "02/01/2024");

		// Click Select Date
		// Clickonelement(pom.getBilling().getSelectDate());

		// Click Payer

		Thread.sleep(5000);
		Clickonelement(pom.getBilling().getClickPayer());

		// Click Payer
		Clickonelement(pom.getBilling().getClickPayerselect());

		// Click United Health care
		// Clickonelement(pom.getBilling().getSelectUnitedHealth());

		// Click SelectPaymentMethod
		Clickonelement(pom.getBilling().getSelectPaymentMethod());

		// Click Authorize.net
		Clickonelement(pom.getBilling().getSelectAutorize());

		// Enter Payment Number
		sendkeys(pom.getBilling().getEnterPaymentNumber(), "45767888 ");

		// Enter Amount
		sendkeys(pom.getBilling().getEnterAmount(), "1000");

		// Click Save button
		Clickonelement(pom.getBilling().getSelectSave());

		// Click Cancel button
//				Clickonelement(pom.getBilling().getSelectCancel());

		try {

			// sele eob

			Clickonelement(pom.getBilling().getseleeob());

			// sele edit eob

			Clickonelement(pom.getBilling().getseleed());
			// insu paid

			sendkeys(pom.getBilling().getinspaid(), "20");

			// save

			Clickonelement(pom.getBilling().getsaveeob());

			// sele edit eob

			Thread.sleep(2000);

			Clickonelement(pom.getBilling().getclican());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Edit Eob");
		}

		// Click EOB
		// Clickonelement(pom.getBilling().getClickEOB());

		// sele eob

//		Clickonelement(pom.getBilling().getseleeob());
//
//		// sele edit eob
//
//		Clickonelement(pom.getBilling().getseleed());
//
//		// insu paid
//
//		sendkeys(pom.getBilling().getinspaid(), "200");
//
//		// save
//
//		Clickonelement(pom.getBilling().getsaveeob());

		System.out.println("EOB Tested Successfully ");

		// test.pass("EOB Tested Successfully ");

	}

	/// User want to Get The Card transaction work Properly Filters

	/// User want to Get The Card transaction work Properly Lists

//	@Ignore
	@Test(priority = 7)

	public void CardTransaction() throws InterruptedException {

		// move side nav

		Thread.sleep(8000);

		WebElement ele = driver.findElement(By.xpath("(//img[@alt='menu-icon'])[1]"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).clickAndHold().perform();

////////////////Card Transaction ///////////////////

		Thread.sleep(4000);

		WebDriverWait wait8 = new WebDriverWait(driver, 10);
		WebElement element8 = wait8
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Card Transactions']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element8);

		// Click card transaction
		// Clickonelement(pom.getBilling().getclickCardTrans());

		// get the page Title

		Thread.sleep(3000);

		gettext(pom.getBilling().getcardtransaction());

		Thread.sleep(3000);
		WebElement tex8 = driver.findElement(By.xpath("//*[@id='demographics']/div/div/div[1]"));

		String text8 = tex8.getText();
		System.out.println(text8);

		if (text8.equals("Card Transactions")) {

			System.out.println("Correct " + text8);

		} else {

			System.out.println("Not Correct");
		}

		// click search
		Clickonelement(pom.getBilling().getclicksearch1());
		// sear pat

		sendkeys(pom.getBilling().getsearpatient(), "james");

		// Enter from date

		Thread.sleep(4000);

		sendkeys(pom.getBilling().getclickFromdate1(), "01-11-2023");

		// Enter to date
		sendkeys(pom.getBilling().getclicktodate1(), "30-11-2023");

		// click search
		Clickonelement(pom.getBilling().getclicksearch1());

		// click details

		Clickonelement(pom.getBilling().getclickdetails());

		// click clocse
		Thread.sleep(3000);
		Clickonelement(pom.getBilling().getclcikclose());

		System.out.println("Card Transactions Tested Successfully ");

		// test.pass("Card Transactions Tested Successfully ");
	}

	// User want to Get The Era Work Properly

//	@Ignore

	@Test(priority = 8)

	public void ERA() throws InterruptedException {

		// move side nav

		Thread.sleep(8000);

		WebElement ele = driver.findElement(By.xpath("(//img[@alt='menu-icon'])[1]"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).clickAndHold().perform();

		WebDriverWait wait9 = new WebDriverWait(driver, 10);
		WebElement element9 = wait9
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='ERA']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element9);

		// get the page Title

		Thread.sleep(5000);

//		gettext(pom.getBilling().geterapage());

		Thread.sleep(3000);
		WebElement tex8 = driver.findElement(By.xpath("(//div[@class='tab_title_name'])[1]"));

		String text8 = tex8.getText();
		System.out.println(text8);

		if (text8.equals("Electronic Remittance Advice")) {

			System.out.println("Correct " + text8);

		} else {

			System.out.println("Not Correct");
		}

		System.out.println("Era Tested Successfully");

//		driver.close();

//		test.pass("Era Tested Successfully");
//
//		// step6: Mandatory step
//
//		extent.flush();

		// click search
		// Clickonelement(pom.getBilling().getClickERA());

	}
}
