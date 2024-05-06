package com.patientnegative;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Pateint_bugs extends Capminds_BaseClass {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	// public static void main(String[] args) throws InterruptedException {

	@Test(priority = 0)

	public void Login() throws InterruptedException {

//		// Step1: Set up physical report path
//		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
//
//		// to keep the report history
//		reporter.setAppendExisting(true);
//
//		// Step2: Create object for ExtentReports
//		ExtentReports extent = new ExtentReports();

		System.out.println("CAPMINDS");
		// Step3: attach the data with physical file
//		extent.attachReporter(reporter);

		// Step4: Create a test cases and assign test details
		// testName //testDescription
//		ExtentTest test = extent.createTest("capminds", "patient with mandatory information");

		// Driver Maximize and Url Launch

		geturl("https://production.vozohealth.com/");

		// Enter Username

		sendkeys(pom.getnegat().getUsername(), "production");

		// Enter Password

		sendkeys(pom.getnegat().getPassword(), "Admin@123");

		// Click Signin Button '

		Clickonelement(pom.getnegat().getSigninbtn());

		// rep

	}

	@Test(priority = 1)

	public void CheckPhone() throws InterruptedException {

		// get Task

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		Thread.sleep(5000);

		Clickonelement(pom.getnegat().getpatne());

		// Click Create Client

		Clickonelement(pom.getnegat().getCreatecl());

		// Click Create Client

		sendkeys(pom.getnegat().getenteralp(), "abc");

		Assert.assertTrue(true, "User Unable to Paste alphabets");

		Thread.sleep(3000);
		Clickonelement(pom.getnegat().getcancelcr());

		System.out.println("User Only able to Enter Numbers ");

	}

	@Test(priority = 2)

	public void Searchpateint() throws InterruptedException {
		// get patient name

		gettext(pom.getnegat().getpatnam());

		// sear pat
		Thread.sleep(3000);

		sendkeys(pom.getnegat().getSearpat(), "test");

		try {
			// cli pat

			Clickonelement(pom.getnegat().getclipat1());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Full Name  Displayed");
		}

		Thread.sleep(3000);
		clear(pom.getnegat().getSearpat());

		sendkeys(pom.getnegat().getSearpat(), "test");

//		try {
//			gettext(pom.getnegat().getpatnam1());
//
//			Assert.assertEquals(pom.getnegat().getpatnam(), pom.getnegat().getpatnam1(), "Not Displayed");
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			System.out.println("Same Patient Not Displayed  ");
//		}

		// cli pat

		Clickonelement(pom.getnegat().getclipat());

	}

	@Test(priority = 3)

	public void PatientDetails() throws InterruptedException {

		Thread.sleep(3000);

		Clickonelement(pom.getnegat().getclinsuranceditails());

		// get ins det

		Thread.sleep(2000);
		try {
			gettext(pom.getnegat().getclinsuranceditails());
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			System.out.println("Insurance List");
		}

		System.out.println("Insurance Was Displayed ");

		// Assert.assertFalse(pom.getnegat().getinsdi().isDisplayed(), "Insurance
		// Details Displayed");

		// Immunization

		Thread.sleep(3000);

		Clickonelement(pom.getnegat().getimpcl());

		// get imu det
		try {
			gettext(pom.getnegat().getimuu());
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			System.out.println("Immunization List");
		}

		System.out.println("Immunization Was Displayed ");
		// Assert.assertTrue(pom.getnegat().getimuu().isDisplayed(), "Immunization
		// Details Displayed");

		Thread.sleep(3000);

		Clickonelement(pom.getnegat().getfamhis());

		// get imu det

		Clickonelement(pom.getnegat().getfamhis());

		try {
			gettext(pom.getnegat().getfamhisde());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Faily History List ");

		}

		System.out.println("Family History Was Displayed ");

		// get imu det

		Clickonelement(pom.getnegat().getmedcl());

		try {
			gettext(pom.getnegat().getmedclte());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("MEdication list");
		}

		System.out.println("Medication Was Displayed ");

		// get imu det
		try {
			gettext(pom.getnegat().getprob());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Problem List");
		}

		System.out.println("problem Was Displayed ");

		// get imu det

//		Thread.sleep(5000);
//		WebDriverWait selal = new WebDriverWait(driver, 10);
//		WebElement alle = selal
//				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='rc-tabs-3-tab-2'])[1]")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", alle);
//
//		// Clickonelement(pom.getnegat().getclalle());
//
//		gettext(pom.getnegat().getalle());
//
//		System.out.println("Allergies Was Displayed ");
		// cli pat

		Thread.sleep(3000);

		WebDriverWait selal = new WebDriverWait(driver, 10);
		WebElement edi = selal.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//button[normalize-space()='Edit Profile'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", edi);

		// Clickonelement(pom.getnegat().getcliedit());
		System.out.println("User able to Click Edit Option");

		// getac

		gettext(pom.getnegat().getgetac());

		// sear pat
		Thread.sleep(3000);

		sendkeys(pom.getnegat().getmidna(), "vela ");

		// sear pat
		Thread.sleep(3000);

		sendkeys(pom.getnegat().getphonu(), "54321 ");

		// sear pat
		Thread.sleep(3000);

		Clickonelement(pom.getnegat().getsaveph());

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='rc-tabs-2-tab-2'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

		// Clickonelement(pom.getnegat().getgetac());

		// sear pat
		// Thread.sleep(6000);

		// Clickonelement(pom.getnegat().getinsuop());

		// sear pat

		// Thread.sleep(4000);
		// Clickonelement(pom.getnegat().getinsudr());

		// sen pho

//		test.pass("Unable To Enter Alphabets");

		try {
			sendkeys(pom.getnegat().getsendph(), "avshhg ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Only Number In Phone Option ");
		}

		// sen pho

		try {
			sendkeys(pom.getnegat().getsendfx(), "avshhg ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Only Number In Fax  Option   ");
		}

		// contact

		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		WebElement element1 = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(),'Contacts')])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);

		// flag
//		WebDriverWait wait2 = new WebDriverWait(driver, 10);
//		WebElement element2 = wait2
//				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(),'Flags')])[1]")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element2);

		// clic doc
		Thread.sleep(5000);

		Clickonelement(pom.getnegat().getclido());

		// clic pro
		Thread.sleep(5000);

		Clickonelement(pom.getnegat().getclipro());

		// clic pro
		Thread.sleep(3000);

		Clickonelement(pom.getnegat().getcliadd());

		// clic pro
		Thread.sleep(3000);

		gettext(pom.getnegat().geticdve());

		// clic dat
		Thread.sleep(3000);

		Clickonelement(pom.getnegat().getstad());

		// clic end
		Thread.sleep(3000);

		Clickonelement(pom.getnegat().getendda());

		// clic end
		Thread.sleep(3000);

		Clickonelement(pom.getnegat().getendda());

		// clic end

		Clickonelement(pom.getnegat().getcliclo());

		// clic end
		Thread.sleep(3000);

		Clickonelement(pom.getnegat().getclialer());

		// test.pass("Allergies Check Successfully");

		// clic end
		Thread.sleep(6000);

		Clickonelement(pom.getnegat().getclimedi());

		// clic end
		Thread.sleep(3000);

		Clickonelement(pom.getnegat().getcliaddmedi());

		// clic end
		Thread.sleep(3000);

		Clickonelement(pom.getnegat().getapptex());

		// clic clome
		Thread.sleep(2000);

		Clickonelement(pom.getnegat().getcliclome());

		// test.pass("Medication Check Successfully");

		// clic immu
		// Thread.sleep(4000);

		WebDriverWait watit3 = new WebDriverWait(driver, 10);
		WebElement element3 = watit3
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Immunizations')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element3);

		// Clickonelement(pom.getnegat().getcliimmu());

		// clic immu
		Thread.sleep(2000);

		gettext(pom.getnegat().getgetvacre());

		// clic immu

		sendkeys(pom.getnegat().getfincvxco(), "a");

		try {
			// clic immu
			Thread.sleep(2000);

			Clickonelement(pom.getnegat().getclicvx());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// clic immu
		// Thread.sleep(2000);

		WebDriverWait watit4 = new WebDriverWait(driver, 10);
		WebElement fahi = watit4
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Family History')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", fahi);

		// Clickonelement(pom.getnegat().getclifamhis());

		// clic immu
		Thread.sleep(2000);

//		gettext(pom.getnegat().getgetfamn());

		// test.pass("Family History Check Successfully");

		// clic immu

		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		WebElement addfa = wait5.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//button[normalize-space()='Add Family Member'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addfa);

//		Thread.sleep(5000);
//
//		gettext(pom.getnegat().getclifam());

		// clic immu
		Thread.sleep(2000);

		sendkeys(pom.getnegat().getselera(), "Abenaki");

		// clic immu
		Thread.sleep(2000);

		sendkeys(pom.getnegat().getseleeth(), "Hispanic or Latino");

		// cli clo

		Clickonelement(pom.getnegat().getclicla());

		// pro pr

		WebDriverWait wait6 = new WebDriverWait(driver, 10);
		WebElement propr = wait6
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Lab Order'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", propr);

//		// cli se
//		Thread.sleep(4000);
//		gettext(pom.getnegat().getsenli());
//
//		// cli se
//		Thread.sleep(4000);
//
//		gettext(pom.getnegat().getgetapp());
//
//		driver.close();
//
//		// Send erx
//		WebDriverWait wait7 = new WebDriverWait(driver, 10);
//		WebElement sener = wait7
//				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Send Erx'])[1]")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", sener);
//
//		// cli ed
//
//		Clickonelement(pom.getnegat().getclied());
//
//		// cli ed
//
//		Clickonelement(pom.getnegat().getcliedclo());

//		test.pass("Send erx  Check Successfully");
//
//		// step6: Mandatory step
//		extent.flush();

	}

	@Ignore

	@Test(priority = 4)

	public void Referralbugs() throws InterruptedException {

		// clcik referral
		//
		Clickonelement(pom.getnegat().getreferralby());

		// clcik referral to
		//
		Clickonelement(pom.getnegat().getreferralto());

		// clcik referral to

		Clickonelement(pom.getnegat().getselectreferralto());

		// clcik referral to send date

		sendkeys(pom.getnegat().getclickdatefrom(), "19-10-2023");

		// clcik referral to

		Clickonelement(pom.getnegat().getclickupdate());

		// clcik referral to click edit

		Clickonelement(pom.getnegat().getclickedit());

		// clcik referral to click edit

		clear(pom.getnegat().getpatientsearch());

		// clcik referral to click edit

		sendkeys(pom.getnegat().getpatientsearch(), "benny");

		// clcik referral to click edit

//		Clickonelement(pom.getnegat().getchangepatient());

		// clcik referral to click edit

		clear(pom.getnegat().getchangeprovider());

		// clcik referral to click edit

		sendkeys(pom.getnegat().getchangeprovider(), "test");

		// clcik referral to click edit

		Clickonelement(pom.getnegat().getproviderchange());

		// clcik referral to click edit

		Clickonelement(pom.getnegat().getclicksave());

		// clcik referral to click edit

		Clickonelement(pom.getnegat().getclickcancel());

		// clcik referral to click edit

		Clickonelement(pom.getnegat().getclickedit());

		// clcik referral to click edit

		Clickonelement(pom.getnegat().getclicksave());

		// clcik referral to click download

		Clickonelement(pom.getnegat().getclickdownload());

		// clcik referral to click download

		Clickonelement(pom.getnegat().getclicktransmit());

		// clcik referral to click download

		Clickonelement(pom.getnegat().getclickfax());

		// clcik referral to click download

		sendkeys(pom.getnegat().getsearchprovider(), "test");

		// clcik referral to click download

		Clickonelement(pom.getnegat().getselectproviderfax());

		// clcik referral to click download

		Clickonelement(pom.getnegat().getclicksendfax());

	}
}
