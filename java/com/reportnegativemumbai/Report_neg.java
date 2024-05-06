package com.reportnegativemumbai;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//import com.capminds.Capminds_BaseClass;
//import com.pageobjectmanager.Pageobjectmanager;

public class Report_neg extends Capminds_BaseClass {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

//	public static void main(String[] args) throws InterruptedException {

	@Test(priority = 0)

	public void Login() throws InterruptedException {

		// Driver Maximize and Url Launch

		geturl("https://production.vozohealth.com/");

		// Enter Username

		Thread.sleep(3000);
		sendkeys(pom.getreportnega().getUsername(), "production");

		// Enter Password
		Thread.sleep(3000);

		sendkeys(pom.getreportnega().getPassword(), "Admin@123");

		// Click Signin Button '

		Clickonelement(pom.getreportnega().getSigninbtn());

		// get report
		Thread.sleep(5000);

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		Clickonelement(pom.getreportnega().getrepneg());

	}

//	@Ignore

	@Test(priority = 1)

	public void Paymentanalysis() throws InterruptedException {

		// move side nav

		Thread.sleep(8000);

		WebElement ele = driver.findElement(By.xpath("(//img[@alt='menu-icon'])[1]"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).clickAndHold().perform();

		// PAyment

		Thread.sleep(6000);

		Clickonelement(pom.getreportnega().getclicpay());

		// PAyment

		sendkeys(pom.getreportnega().getpatsea(), "test");

		// cli pat
		Thread.sleep(3000);
		Clickonelement(pom.getreportnega().getclipat());

		// cli pat
//		selectone(pom.getreportnega().getseleoff(), "apollo");

		// sta dat

		sendkeys(pom.getreportnega().getstada(), "05/09/2022");

		// end dat

		sendkeys(pom.getreportnega().getendda(), "05/24/2022");

		// cli upda

		Clickonelement(pom.getreportnega().getcliupda());
	}

//	@Ignore

	@Test(priority = 2)

	public void Productandprocedure() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		// move side nav

		Thread.sleep(8000);

		WebElement ele = driver.findElement(By.xpath("(//img[@alt='menu-icon'])[1]"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).clickAndHold().perform();

		// cli propr
		Thread.sleep(4000);

		Clickonelement(pom.getreportnega().getpropr());

		// cli propr

		Thread.sleep(5000);

		sendkeys(pom.getreportnega().getcodese(), "q");

		// sele pr
		Thread.sleep(3000);

		Clickonelement(pom.getreportnega().getclico());

		// sele pr

		Clickonelement(pom.getreportnega().getcliup());
	}

//	@Ignore

	@Test(priority = 3)

	public void AppointmentReport() throws InterruptedException {

		// move side nav

		Thread.sleep(8000);

		WebElement ele = driver.findElement(By.xpath("(//img[@alt='menu-icon'])[1]"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).clickAndHold().perform();

		// app pr

		Thread.sleep(3000);
		Clickonelement(pom.getreportnega().getcliappr());

		// sear pat

		Thread.sleep(3000);

		sendkeys(pom.getreportnega().getsearpa(), "test");

		// sele pat
		Thread.sleep(5000);
		Clickonelement(pom.getreportnega().getselpa());

		// sele pat

		Clickonelement(pom.getreportnega().getcliupdap());
	}

	@Ignore

	@Test(priority = 4)

	public void PatientReport() throws InterruptedException {

		// move side nav

		Thread.sleep(8000);

		WebElement ele = driver.findElement(By.xpath("(//img[@alt='menu-icon'])[1]"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).clickAndHold().perform();

		// pat re
		Thread.sleep(3000);

		Clickonelement(pom.getreportnega().getpatr());

		// sele rac

//		Clickonelement(pom.getreportnega().getselerac());
//
//		// sele rac
//
//		Clickonelement(pom.getreportnega().getselerac());

		// sele rac

		sendkeys(pom.getreportnega().getmedse(), "a");

		// sele rac

		Thread.sleep(3000);

		Clickonelement(pom.getreportnega().getSelectmedication());

		// sele racmed

//		Clickonelement(pom.getreportnega().getmedsesel());

		// sele sear

		Clickonelement(pom.getreportnega().getclisear());
	}

//	@Ignore

	@Test(priority = 5)

	public void TelehealthReport() throws InterruptedException {

		// move side nav

		Thread.sleep(8000);

		WebElement ele = driver.findElement(By.xpath("(//img[@alt='menu-icon'])[1]"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).clickAndHold().perform();

		// sele tele

		Clickonelement(pom.getreportnega().gettelehealr());

		// sele patse

		sendkeys(pom.getreportnega().getpatsear(), "Tester");

		// sele pat
		Clickonelement(pom.getreportnega().getsearte());

		// sele pat

		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		WebElement element1 = wait1.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Productivity Report'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);

		// Clickonelement(pom.getreportnega().getselepro());

		// sele pat\

		Thread.sleep(4000);
		sendkeys(pom.getreportnega().getstarda(), "02/01/2023");

		// sele pat
		sendkeys(pom.getreportnega().getendda(), "06/01/2023");

		// sele pat
		Clickonelement(pom.getreportnega().getclisele());

		// sele pat
		Clickonelement(pom.getreportnega().getselof());

		// sele pat
		Clickonelement(pom.getreportnega().getcliupp());

	}

	@Ignore

	@Test(priority = 6)

	public void UserReport() throws InterruptedException {
		// use pat

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement userre = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='User Report'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", userre);

		Thread.sleep(5000);
//		Clickonelement(pom.getreportnega().getuserre());

		// use pat
		sendkeys(pom.getreportnega().getserus(), "james");

		// sel do

		Clickonelement(pom.getreportnega().getserusse());

		// ser do

//		Clickonelement(pom.getreportnega().getserrep());

//		driver.close();

	}

}
