package com.schedule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.capminds.Capminds_BaseClass;
import com.pageobjectmanager.Pageobjectmanager;

public class Schedule_Neg extends Capminds_BaseClass {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	public static void main(String[] args) throws InterruptedException {

		// Driver Maximize and Url Launch

		geturl("https://ehr.vozo.xyz:444/");

		// Enter Username

		sendkeys(pom.getinstance().getUsername(), "tech1");

		// Enter Password

		sendkeys(pom.getinstance().getPassword(), "capminds@03");

		// Click Signin Button '

		Clickonelement(pom.getinstance().getSigninbtn());

		// get set

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		Clickonelement(pom.getscheduleneg().getappdas());

		// cli sho

		Clickonelement(pom.getscheduleneg().getshowsta());

		// cli sho

		selectone(pom.getscheduleneg().getclista(), "Not Confirmed");

		// cli tele

		Clickonelement(pom.getscheduleneg().getclipro());

		// cli add

		Thread.sleep(2000);

		Clickonelement(pom.getscheduleneg().getcliaddpr());

		// ser pro

		Clickonelement(pom.getscheduleneg().getserpro());

		// ser pro

		Clickonelement(pom.getscheduleneg().getselepro());

		// ser off

		Clickonelement(pom.getscheduleneg().getoffi());

		// ser pro

		Clickonelement(pom.getscheduleneg().getSeleof());

		// ser pro

		Clickonelement(pom.getscheduleneg().getpro());

		// ser pro

		Clickonelement(pom.getscheduleneg().getselpro());

		// ser dat

		sendkeys(pom.getscheduleneg().getdatsel(), "05/02/2022");

		// ser dat

		sendkeys(pom.getscheduleneg().gettim(), "13:54");

		// ser dat

		sendkeys(pom.getscheduleneg().getdur(), "20");

		// ser dat

		Clickonelement(pom.getscheduleneg().getrepe());

		// cal

		sendkeys(pom.getscheduleneg().getselered(), "05/12/2022");

		// sav
		Clickonelement(pom.getscheduleneg().getsapro());

	}

}
