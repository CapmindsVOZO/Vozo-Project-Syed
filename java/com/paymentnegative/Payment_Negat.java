package com.paymentnegative;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Payment_Negat extends Capminds_BaseClass {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

//	public static void main(String[] args) throws InterruptedException {

	@Test(priority = 0)

	public void PaymentNegative() throws InterruptedException {

		// Driver Maximize and Url Launch

		geturl("https://production.vozohealth.com/");

		// Enter Username
		
		Thread.sleep(5000);

		sendkeys(pom.getpaymentnega().getUsername(), "production");

		// Enter Password
		
		Thread.sleep(5000);

		sendkeys(pom.getpaymentnega().getPassword(), "Admin@123");

		// Click Signin Button '

		Clickonelement(pom.getpaymentnega().getSigninbtn());

		// get set

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// click schedule
		Thread.sleep(6000);

//		Clickonelement(pom.getpaymentnega().getclickschedule());

		Thread.sleep(6000);
		try {
			// click day
			Clickonelement(pom.getpaymentnega().getclickday());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		Thread.sleep(6000);

//		Clickonelement(pom.getpaymentnega().getcliapp());

//		WebDriverWait wait3 = new WebDriverWait(driver, 10);
//		WebElement Bill = wait3
//				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='ant-tabs-tab'])[2]")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Bill);

		// Select service
		Thread.sleep(6000);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement element2 = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(@class,'rbc-event-content')])[2]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element2);

		// click Edit Option

		Thread.sleep(4000);

		Clickonelement(pom.getpaymentnega().getclickeditappointment());

		// Click service
		// Clickonelement(pom.getpaymentnega().getcliser());

		Thread.sleep(4000);
		Clickonelement(pom.getpaymentnega().getcliser());

		// a cp
		sendkeys(pom.getpaymentnega().getsendcp(), "a");

		Thread.sleep(4000);

		Clickonelement(pom.getpaymentnega().getsendcp());

		// send cp
		Clickonelement(pom.getpaymentnega().getselecp());

		// sen al

		// sendkeys(pom.getpaymentnega().getquanal(), "abc");

		try {
			// add ndc

			Clickonelement(pom.getpaymentnega().getaddndc());

			// send ndc
			sendkeys(pom.getpaymentnega().getndcqu(), "a");

			Thread.sleep(4000);

			Clickonelement(pom.getpaymentnega().getndcqu());

			// sele ndc

			Clickonelement(pom.getpaymentnega().getselectndc());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// sea ndc
		// sendkeys(pom.getpaymentnega().getsearnd(), "a");

		// sele ndc

		// Clickonelement(pom.getpaymentnega().getselend());

		// icd9

		sendkeys(pom.getpaymentnega().getsenicd10(), "a");

		Clickonelement(pom.getpaymentnega().getsenicd10());

		WebDriverWait icd10 = new WebDriverWait(driver, 30);
		icd10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"(//div[@class='ant-select-item-option-content'][normalize-space()='E67.0--Hypervitaminosis A'])[1]")));

		// se icd10

		Clickonelement(pom.getpaymentnega().getselic10());
		// hcdc

		sendkeys(pom.getpaymentnega().gethcpc(), "a");

		Thread.sleep(3000);

		Clickonelement(pom.getpaymentnega().gethcpc());

		// se hcp

		Thread.sleep(3000);

		Clickonelement(pom.getpaymentnega().gethcpcsele());

		// icd9

		sendkeys(pom.getpaymentnega().geticd9(), "a");

		Thread.sleep(3000);

		Clickonelement(pom.getpaymentnega().geticd9());

		// se icd10

		Clickonelement(pom.getpaymentnega().getseleic9());

		// icd9

		sendkeys(pom.getpaymentnega().getcusco(), "a");

		// se icd10
		try {
			Thread.sleep(6000);
			Clickonelement(pom.getpaymentnega().getcuscose());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//
		Thread.sleep(6000);
		WebDriverWait billing = new WebDriverWait(driver, 10);
		WebElement selectbill = billing
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='appt_tabs-tab-3'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectbill);

		// patient superbi;
		Thread.sleep(6000);

		Clickonelement(pom.getpaymentnega().getpatientsuper());

		// close super
		Thread.sleep(6000);
		Clickonelement(pom.getpaymentnega().getclosesuper());

		try {
			// sel do
			Thread.sleep(5000);

			Clickonelement(pom.getpaymentnega().getseldo());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
