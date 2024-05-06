package com.paymentmumbai;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class AppointmentService {

		public WebDriver driver;

		public AppointmentService(WebDriver driver2) {

			this.driver = driver2;
			PageFactory.initElements(driver2, this);

		}

		public WebDriver getDriver() {
			return driver;

		}

		@FindBy(id = "normal_login_username")
		private WebElement username;

		public WebElement getUsername() {
			return username;
		}

		@FindBy(id = "normal_login_password")

		private WebElement password;

		public WebElement getPassword() {
			return password;
		}

		@FindBy(xpath = "//button[@type='submit']")

		private WebElement signinbtn;

		public WebElement getSigninbtn() {
			return signinbtn;
		}

//		@FindBy(xpath = "(//button[@id='dropdown-basic cal-btn-crate'])[1]")
//		private WebElement Appointmentoption;
//
//		public WebElement getAppointmentoption() {
//			return Appointmentoption;
//
//		}
//
//		@FindBy(xpath = "(//a[@id='appt_crt-ico-nav'])[1]")
//		private WebElement Appointmentclick;
//
//		public WebElement getAppoinatmentclick() {
//			return Appointmentclick;
//
//		}
//		@FindBy(xpath = "//input[@id='new-app-patient_1 appt-inp-patsrch']")
//		private WebElement Clcikpatient;
//
//		public WebElement getClcikpatient() {
//			return Clcikpatient;
//		}
//
//		@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='saheer ah']")
//		private WebElement Selectpatient;
//
//		public WebElement getSelectpatient() {
//			return Selectpatient;
//
//		}
//
//		@FindBy(xpath = "(//span[normalize-space()='Ajay KumarV A'])[1]")
//		private WebElement Selectpatient1;
//
//		public WebElement getSelectpatient1() {
//			return Selectpatient1;
//
//		}
//
//		@FindBy(xpath = "//input[@id='date']")
//		private WebElement Selectdate;
//
//		public WebElement getSelectdate() {
//			return Selectdate;
//
//		}
//
//		@FindBy(xpath = "(//a[normalize-space()='Today'])[1]")
//		private WebElement clcitoda;
//
//		public WebElement getclcitoda() {
//			return clcitoda;
//
//		}
//
//		@FindBy(xpath = "(//input[@placeholder='Select date'])[1]")
//		private WebElement Selectdate1;
//
//		public WebElement getSelectdate1() {
//			return Selectdate1;
//
//		}
//
//		@FindBy(xpath = "(//div[@class='ant-picker-time-panel-cell-inner'][normalize-space()='12'])[1]")
//		private WebElement Selecttime2;
//
//		public WebElement getSelecttime2() {
//			return Selecttime2;
//
//		}
//
//		@FindBy(xpath = "(//div[normalize-space()='PM'])[1]")
//		private WebElement Selecttime1;
//
//		public WebElement getSelecttime1() {
//			return Selecttime1;
//
//		}
//
//		@FindBy(xpath = "(//input[@id='new-set-time'])[1]")
//		private WebElement Selecttime;
//
//		public WebElement getSelecttime() {
//			return Selecttime;
//
//		}
//		
//		@FindBy(xpath = "(//span[normalize-space()='Ok'])[1]")
//		private WebElement Selecttimeok;
//
//		public WebElement getSelecttimeok() {
//			return Selecttimeok;
//
//		}
//
//		@FindBy(xpath = "(//a[normalize-space()='Now'])[1]")
//		private WebElement Selecttimenow;
//
//		public WebElement getSelecttimenow() {
//			return Selecttimenow;
//
//		}
//
////		@FindBy(xpath = "//span[contains(text(),'Ok')]")
////		private WebElement Clickok;
//	//
////		public WebElement getClickok() {
////			return Clickok;
//	//
////		}
//
//		@FindBy(xpath = "(//input[@id='new-app-duration'])[1]")
//		private WebElement Sendmin;
//
//		public WebElement getSendmin() {
//			return Sendmin;
//
//		}
//
//		@FindBy(xpath = "(//input[@id='new-app-repeats-check1'])[1]")
//		private WebElement Repeat;
//
//		public WebElement getRepeat() {
//			return Repeat;
//
//		}
//
//		@FindBy(xpath = "(//div[normalize-space()='Search Provider'])[1]")
//		private WebElement prosel;
//
//		public WebElement getprosel() {
//			return prosel;
//
//		}
//
//		@FindBy(xpath = "(//span[contains(text(),'Martin Edward')])[1]")
//		private WebElement proselected;
//
//		public WebElement getproselected() {
//			return proselected;
//
//		}
//		
//		@FindBy(xpath = "//input[@id='new-app-profile_1 appt-inp-profsrch']")
//		private WebElement Clickprofile;
//
//		public WebElement getClickprofile() {
//			return Clickprofile;
//
//		}
//
//		@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Walk-in']")
//		private WebElement Selectprofile;
//
//		public WebElement getSelectprofile() {
//			return Selectprofile;
//
//		}
//		
//		@FindBy(xpath = "(//div[normalize-space()='Office'])[1]")
//		private WebElement Location;
//
//		public WebElement getLocation() {
//			return Location;
//
//		}
//
//		@FindBy(xpath = "(//span[contains(text(),'John Hospital')])[1]")
//		private WebElement SelectLocation;
//
//		public WebElement getSelectLocation() {
//			return SelectLocation;
//
//		}
//		
//		@FindBy(xpath = "//input[@id='new-app-status_1 appt-inp-stas']")
//		private WebElement Clickstatus;
//
//		public WebElement getClickstatus() {
//			return Clickstatus;
//
//		}
//
//		@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='@ Arrived/Lobby']")
//		private WebElement Selectstatus;
//
//		public WebElement getSelectstatus() {
//			return Selectstatus;
//
//		}
//
//		@FindBy(xpath = "(//button[@id='appt-btn-sve'])[1]")
//		private WebElement Clicksave;
//
//		public WebElement getClicksave() {
//			return Clicksave;
//
//		}
/////////// Appointment

@FindBy(xpath = "(//input[@id='new-app-patient_1 appt-inp-patsrch'])[1]")

private WebElement Clcikpatient;

public WebElement getClcikpatient() {

return Clcikpatient;

}
@FindBy(xpath = "//button[@id='dropdown-basic cal-btn-crate']")

private WebElement Appointmentoption;

public WebElement getAppointmentoption() {

return Appointmentoption;

}
@FindBy(xpath = "//a[@id='appt_crt-ico-nav']")

private WebElement Appointmentclick;

public WebElement getAppointmentclick() {

return Appointmentclick;

}

@FindBy(xpath = "(//input[@value='1'])[5]")

private WebElement Appointtyp;

public WebElement getAppointtyp() {

return Appointtyp;

}

@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='Naveen s'])[1]")

private WebElement Selectpatient;

public WebElement getSelectpatient() {

return Selectpatient;

}

@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")

private WebElement Selectpatient1;

public WebElement getSelectpatient1() {

return Selectpatient1;

}

@FindBy(xpath = "(//input[@id='date'])[1]")

private WebElement Selectdate;

public WebElement getSelectdate() {

return Selectdate;

}

@FindBy(xpath = "(//button[normalize-space()='Ok'])[1]")

private WebElement clcitoda;

public WebElement getclcitoda() {

return clcitoda;

}

@FindBy(xpath = "(//input[@id='date'])[1]")

private WebElement Selectdate1;

public WebElement getSelectdate1() {

return Selectdate1;

}

@FindBy(xpath = "(//div[@class='ant-picker-time-panel-cell-inner'][normalize-space()='12'])[1]")

private WebElement Selecttime2;

public WebElement getSelecttime2() {

return Selecttime2;

}

@FindBy(xpath = "(//div[normalize-space()='PM'])[1]")

private WebElement Selecttime1;

public WebElement getSelecttime1() {

return Selecttime1;

}

@FindBy(xpath = "(//input[@class='fromTime-toTime'])[1]")

private WebElement Selecttime;

public WebElement getSelecttime() {

return Selecttime;

}

//@FindBy(xpath = "(//input[@class='fromTime-toTime'])[1]")
//
//private WebElement Selecttimevid;
//
//public WebElement getSelecttimevid() {
//
//return Selecttimevid;
//
//}

@FindBy(xpath = "(//a[normalize-space()='Today'])[1]")

private WebElement clicktoday2;

public WebElement getclicktoday2() {

return clicktoday2;

}

@FindBy(xpath = "(//span[normalize-space()='Ok'])[1]")

private WebElement Selecttimeok;

public WebElement getSelecttimeok() {

return Selecttimeok;

}

@FindBy(xpath = "(//a[normalize-space()='Now'])[1]")

private WebElement Selecttimenow;

public WebElement getSelecttimenow() {

return Selecttimenow;

}

//@FindBy(xpath = "//span[contains(text(),'Ok')]")

//private WebElement Clickok;

//

//public WebElement getClickok() {

//return Clickok;

//

//}

@FindBy(xpath = "(//input[@id='new-app-duration'])[1]")

private WebElement Sendmin;

public WebElement getSendmin() {

return Sendmin;

}

@FindBy(xpath = "(//input[@id='new-app-repeats-check1'])[1]")

private WebElement Repeat;

public WebElement getRepeat() {

return Repeat;

}

@FindBy(xpath = "(//div[@role='alert'][normalize-space()='mumbai'])[1]")

private WebElement facilityselect;

public WebElement getfacilityselect() {

return facilityselect;

}

@FindBy(xpath = "//span[contains(text(),'mumbai')]")

private WebElement facilityselect1;

public WebElement getfacilityselect1() {

return facilityselect1;

}

@FindBy(xpath = "(//input[@id='new-app-provider new-app-provider_1'])[1]")

private WebElement prosel;

public WebElement getprosel() {

return prosel;

}

@FindBy(xpath = "(//div[contains(@class,'ant-select-item-option-content')][contains(text(),'James')])[1]")

private WebElement proselected;

public WebElement getproselected() {

return proselected;

}

@FindBy(xpath = "(//div[normalize-space()='Search Provider'])[1]")

private WebElement prosel1;

public WebElement getprosel1() {

return prosel1;

}

@FindBy(xpath = "//span[contains(text(),'Test TestOne')]")

private WebElement proselected1;

public WebElement getproselected1() {

return proselected1;

}

//@FindBy(xpath = "(//select[@id='new-app-select1'])[1]")
//
//private WebElement selec;
//
//public WebElement getselec() {
//
//return selec;
//
//}
//
//@FindBy(xpath = "(//select[@id='new-app-select2'])[1]")
//
//private WebElement selecda;
//
//public WebElement getselecda() {
//
//return selecda;
//
//}
//
//@FindBy(xpath = "(//div[@class='ant-switch-handle'])[1]")
//
//private WebElement dayw;
//
//public WebElement getdayw() {
//
//return dayw;
//
//}

@FindBy(xpath = "(//label[normalize-space()='M'])[1]")

private WebElement selectmonday;

public WebElement getselectmonday() {

return selectmonday;

}

@FindBy(xpath = "(//label[@id='tbg-btn-3'])[1]")

private WebElement selecttuesday;

public WebElement getselecttuesday() {

return selecttuesday;

}

@FindBy(xpath = "(//button[@id='new-app-days-wise'])[1]")

private WebElement dayws;

public WebElement getdayws() {

return dayws;

}

@FindBy(xpath = "(//input[@id='new-app-untildate'])[1]")

private WebElement cals;

public WebElement getcals() {

return cals;

}

@FindBy(xpath = "(//a[normalize-space()='Today'])[1]")

private WebElement calto;

public WebElement getcalto() {

return calto;

}

@FindBy(id = "new-app-select1")

private WebElement Selectevery;

public WebElement getSelectevery() {

return Selectevery;

}

@FindBy(id = "new-app-select2")

private WebElement Selectday;

public WebElement getSelectday() {

return Selectday;

}

@FindBy(xpath = "//span[contains(text(),'Days wise')]")

private WebElement Daywise;

public WebElement getDaywise() {

return Daywise;

}

@FindBy(id = "new-app-days-wise")

private WebElement Daywise2;

public WebElement getSelectDaywise2() {

return Daywise2;

}

@FindBy(xpath = "(//div[@class='ant-picker-cell-inner'][normalize-space()='6'])[1]")

private WebElement Selectcalender1;

public WebElement getSelectcalender1() {

return Selectcalender1;

}

@FindBy(id = "tbg-btn-1")

private WebElement Selectweek;

public WebElement getSelectweek() {

return Selectweek;

}

@FindBy(xpath = "(//span[@title='mumbai vozo'])[1]")

private WebElement SearchProvider;

public WebElement getSearchProvider() {

return SearchProvider;

}

@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")

private WebElement Selectprovider;

public WebElement getSelectprovider() {

return Selectprovider;

}

@FindBy(xpath = "(//button[normalize-space()='Does not repeat'])[1]")

private WebElement repeatapp;

public WebElement getrepeatapp() {

return repeatapp;

}

@FindBy(xpath = "(//a[normalize-space()='Custom...'])[1]")

private WebElement customrepeat;

public WebElement getcustomrepeat() {

return customrepeat;

}

@FindBy(xpath = "(//label[@id='tbg-btn-2'])[1]")

private WebElement repeatonm;

public WebElement getrepeatonm() {

return repeatonm;

}

@FindBy(xpath = "(//input[@value='3'])[2]")

private WebElement endsafter;

public WebElement getendsafter() {

return endsafter;

}

@FindBy(xpath = "(//button[@type='submit'][normalize-space()='Save'])[2]")

private WebElement saverepeat;

public WebElement getsaverepeat() {

return saverepeat;

}

@FindBy(xpath = "(//label[@id='tbg-btn-3'])[1]")

private WebElement repeatont;

public WebElement getrepeatont() {

return repeatont;

}

@FindBy(xpath = "(//input[@id='new-app-profile_1 appt-inp-profsrch'])[1]")

private WebElement Clickprofile;

public WebElement getClickprofile() {

return Clickprofile;

}

@FindBy(xpath = "(//div[contains(text(),'Exam Room 1')])[1]")

private WebElement clcikexam;

public WebElement getclcikexam() {

return clcikexam;

}

@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='New Patient'])[1]")

private WebElement Selectprofile;

public WebElement getSelectprofile() {

return Selectprofile;

}

@FindBy(xpath = "(//div[normalize-space()='Office'])[1]")

private WebElement Location;

public WebElement getLocation() {

return Location;

}

@FindBy(xpath = "(//span[@class='text'][normalize-space()='Demo'])[2]")

private WebElement SelectLocation;

public WebElement getSelectLocation() {

return SelectLocation;

}

@FindBy(xpath = "(//input[@id='new-app-status_1 appt-inp-stas'])[1]")

private WebElement Clickstatus;

public WebElement getClickstatus() {

return Clickstatus;

}

@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='@ Arrived/Lobby'])[1]")

private WebElement Selectstatus;

public WebElement getSelectstatus() {

return Selectstatus;

}

@FindBy(xpath = "//*[@id='new-app-profile_1']/div[1]")

private WebElement seleexamroom;

public WebElement getseleexamroom() {

return seleexamroom;

}

@FindBy(xpath = "//*[@id='new-app-profile_1']/div[1]")

private WebElement seleexamroom1;

public WebElement getseleexamroom1() {

return seleexamroom1;

}

@FindBy(xpath = "//button[@id='appt-btn-sve']")

private WebElement Clicksave;

public WebElement getClicksave() {

return Clicksave;

}
		@FindBy(xpath = "(//select[@id='new-app-select1'])[1]")
		private WebElement selec;

		public WebElement getselec() {
			return selec;

		}

		@FindBy(xpath = "(//select[@id='new-app-select2'])[1]")
		private WebElement selecda;

		public WebElement getselecda() {
			return selecda;

		}

		@FindBy(xpath = "(//div[@class='ant-switch-handle'])[1]")
		private WebElement dayw;

		public WebElement getdayw() {
			return dayw;

		}

		@FindBy(xpath = "(//input[@id='new-set-time'])[1]")
		private WebElement Selecttimevid;

		public WebElement getSelecttimevid() {
			return Selecttimevid;

		}

		@FindBy(xpath = "(//a[normalize-space()='Schedule'])[1]")
		private WebElement clickpre;

		public WebElement getclickpre() {
			return clickpre;

		}

		@FindBy(xpath = "(//button[@id='cal-btn-day'])[1]")
		private WebElement cliccalDay;

		public WebElement getcliccalDay() {
			return cliccalDay;

		}

		@FindBy(xpath = "(//span[@title='Monday, March 21, 2022'])[1]")
		private WebElement clidate;

		public WebElement getclidate() {
			return clidate;

		}

		@FindBy(xpath = "//*[@id=\"e-appointment-wrapper-0\"]/div[4]/div[2]")
		private WebElement clicapp;

		public WebElement getclicapp() {
			return clicapp;

		}

		////////////// ICD //////

		@FindBy(xpath = "(//button[@class='e-tbar-btn e-tbtn-txt e-control e-btn e-lib'])[5]")
		private WebElement ClickPreviousDate;

		public WebElement getClickPreviousDate() {
			return ClickPreviousDate;
		}

		@FindBy(xpath = "//span[text()='23']")
		private WebElement ClickSelectDate;

		public WebElement getSelectDate() {
			return ClickSelectDate;
		}

		@FindBy(xpath = "//tbody/tr/td/div[contains(@class,'e-content-wrap')]/table[contains(@class,'e-schedule-table e-content-table')]/thead/tr/td[contains(@class,'e-day-wrapper')]/div[@id='e-appointment-wrapper-0']/div[1]")
		private WebElement ClickAppointment;

		public WebElement getClickAppointment() {
			return ClickAppointment;
		}

		@FindBy(xpath = "//div[@id='new-app-status_1']//input[@type='text']")
		private WebElement ClickArrivedLobby;

		public WebElement getClickArrivedLobby() {
			return ClickArrivedLobby;
		}

		@FindBy(xpath = "(//span[normalize-space()='@ Arrived/Lobby'])[1]")
		private WebElement SelectArrivedLobby;

		public WebElement getSelectArrivedLobby() {
			return SelectArrivedLobby;
		}

		@FindBy(xpath = "(//div[@class='ant-tabs-tab'])[1]")
		private WebElement ClickServices;

		public WebElement getClickServices() {
			return ClickServices;
		}
		
		@FindBy(xpath = "//button[@class='appt-det-full-screen-btn false btn btn-primary']")
		private WebElement clickEdit;

		public WebElement getclickEdit() {
			return clickEdit;
		}

		@FindBy(xpath = "//input[@id='appt_service_findcpt']")
		private WebElement ClickCPTCodes;

		public WebElement getClickCPTCodes() {
			return ClickCPTCodes;
		}

		@FindBy(xpath = "//input[@id='appt_service_findcpt for_search_scroll_issue']")
		private WebElement EnterCPTCodes;

		public WebElement getEnterCPTCodes() {
			return EnterCPTCodes;
		}

		@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='86891--Autologous blood op salvage']")
		private WebElement SelectCPTCodes;

		public WebElement getSelectCPTCodes() {
			return SelectCPTCodes;
		}

		@FindBy(xpath = "(//input[@id='cptfee0'])[1]")
		private WebElement ClearFees;

		public WebElement getClearFees() {
			return ClearFees;
		}

		@FindBy(xpath = "//input[@id='cptfee1']")
		private WebElement EnterFees;

		public WebElement getEnterFees() {
			return EnterFees;
		}
		
		@FindBy(xpath = "(//button[@type='button'][normalize-space()='Save'])[2]")   //(//*[name()='svg'][@stroke='currentColor'])[12]
		private WebElement prok;

		public WebElement getprok() {
			return prok;
		}

		@FindBy(xpath = "//select[@id='MA_CPT_40']")
		private WebElement clickModifiersA1;

		public WebElement getclickModifiersA1() {
			return clickModifiersA1;
		}

		@FindBy(xpath = "//select[@id='MA_CPT_40']//option[@value='22'][contains(text(),'22')]")
		private WebElement selectkModifiersA1;

		public WebElement getselectkModifiersA1() {
			return selectkModifiersA1;
		}

		@FindBy(xpath = "//select[@id='MB_CPT_40']")
		private WebElement clickModifiersA2;

		public WebElement getclickModifiersA2() {
			return clickModifiersA2;
		}

		@FindBy(xpath = "//select[@id='MB_CPT_40']//option[@value='24'][contains(text(),'24')]")
		private WebElement selectkModifiersA2;

		public WebElement getselectkModifiersA2() {
			return selectkModifiersA2;
		}

		@FindBy(xpath = "//select[@id='MC_CPT_40']")
		private WebElement clickModifiersA3;

		public WebElement getclickModifiersA3() {
			return clickModifiersA2;
		}

		@FindBy(xpath = "//select[@id='MC_CPT_40']//option[@value='25'][contains(text(),'25')]")
		private WebElement selectkModifiersA3;

		public WebElement getselectkModifiersA3() {
			return selectkModifiersA2;
		}

		@FindBy(xpath = "//select[@id='MD_CPT_40']")
		private WebElement clickModifiersA4;

		public WebElement getclickModifiersA4() {
			return clickModifiersA4;
		}

		@FindBy(xpath = "//select[@id='MD_CPT_40']//option[contains(@value,'33')][contains(text(),'33')]")
		private WebElement selectkModifiersA4;

		public WebElement getselectkModifiersA4() {
			return selectkModifiersA4;
		}

		@FindBy(xpath = "//input[@id='cpt_4_units1']")
		private WebElement clearquantity;

		public WebElement getclearquantity() {
			return clearquantity;
		}

		@FindBy(xpath = "//*[name()='path' and contains(@d,'M504 256c0')]")
		private WebElement savecpt;

		public WebElement getsavecpt() {

			return savecpt;
		}
		@FindBy(xpath = "//input[@id='cpt_4_units1']")
		private WebElement Enterquantity;

		public WebElement getEnterquantity() {
			return Enterquantity;
		}

		@FindBy(xpath = "//input[@id='cpt_4_pointer1']")
		private WebElement EnterPointer;

		public WebElement getEnterPointer() {
			return EnterPointer;
		}

		@FindBy(xpath = "//div[text()='Billing']")
		private WebElement ClickBilling;

		public WebElement getClickBilling() {
			return ClickBilling;
		}

		@FindBy(xpath = "//select[@id='getbillingstatus']")
		private WebElement ClickBillingStatus;

		public WebElement getClickBillingStatus() {
			return ClickBillingStatus;
		}

		@FindBy(xpath = "//option[@value='Settled']")
		private WebElement selectBillingStatus;

		public WebElement getselectBillingStatus() {
			return selectBillingStatus;
		}

		@FindBy(xpath = "//span[normalize-space()='Create Invoice']")
		private WebElement ClickCreateInvoice;

		public WebElement getClickCreateInvoice() {
			return ClickCreateInvoice;
		}

		@FindBy(xpath = "//div[normalize-space()='Add Payment']")
		private WebElement ClickAddPayment;

		public WebElement getClickAddPayment() {
			return ClickAddPayment;
		}

		@FindBy(xpath = "/html[1]/body[1]/div[10]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/input[1]")
		private WebElement ClickInvoiceBalance;

		public WebElement getClickInvoiceBalance() {
			return ClickInvoiceBalance;
		}

		@FindBy(xpath = "//select[@id='paymethod']")
		private WebElement SelectPaymentMethod;

		public WebElement getSelectPaymentMethod() {
			return SelectPaymentMethod;
		}

		@FindBy(xpath = "//button[normalize-space()='Add Payment']")
		private WebElement Clickaddpayment;

		public WebElement getClickaddpayment() {
			return Clickaddpayment;
		}

//		ICD10 Codes
		@FindBy(xpath = "//div[text()='Services']")
		private WebElement clcikservice;

		public WebElement getclcikservice() {
			return clcikservice;
		}

		@FindBy(xpath = "(//input[@id='appt_icd10_code'])[1]")
		private WebElement searchcodes;

		public WebElement getsearchcodes() {
			return searchcodes;
		}

		@FindBy(xpath = "//div[contains(text(),'H50.07--Alternating esotropia with V pattern')]")
		private WebElement selectcode;

		public WebElement getselectcode() {
			return selectcode;
		}
		
		
		@FindBy(xpath = "(//button[@class='m-l-11 btn btn-light'])[2]")
		private WebElement deletecpt;

		public WebElement getdeletecpt() {
			return deletecpt;
		}

		@FindBy(xpath = "//td[contains(@class,'MuiTableCell-root MuiTableCell-body MuiTableCell-sizeSmall')]//button[contains(@type,'button')]//*[name()='svg']//*[name()='g']//*[name()='path' and contains(@d,'M4 8h16v13')]")
		private WebElement clickdelete;

		public WebElement getclickdelete() {
			return clickdelete;
		}

		@FindBy(xpath = "(//button[@type='button'][normalize-space()='Cancel'])[3]")
		private WebElement clickcancel;

		public WebElement getclickcancel() {
			return clickcancel;
		}

		@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-2'])[1]")
		private WebElement clicserv;

		public WebElement getclicserv() {
			return clicserv;

		}

		@FindBy(xpath = "(//input[@id='appt_hcpcs_code'])[1]")
		private WebElement clicfindhcpc;

		public WebElement getclicfindhcpc() {
			return clicfindhcpc;

		}

		@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='V2782--Lens, 1.54-1.65 p/1.60-1.79g'])[1]")
		private WebElement clichcpcs;

		public WebElement getclichcpcs() {
			return clichcpcs;

		}
		
		@FindBy(xpath = "(//button[@class='pat-mob-dd app-add-note m-l-12'][normalize-space()='Save'])[1]")
		private WebElement selo;

		public WebElement getselo() {
			return selo;

		}

		@FindBy(xpath = "(//input[@id='hcpcs0'])[1]")
		private WebElement sendfee;

		public WebElement getsendfee() {
			return sendfee;

		}

		@FindBy(xpath = "(//select[@id='MA_HCPCS0'])[1]")
		private WebElement clicmod1;

		public WebElement getclicmod1() {
			return clicmod1;

		}

		@FindBy(xpath = "(//option[@value='26'][contains(text(),'26')])[33]")
		private WebElement selecmod1;

		public WebElement getselecmod1() {
			return selecmod1;

		}

		@FindBy(xpath = "(//select[@id='MB_HCPCS0'])[1]")
		private WebElement clicmod2;

		public WebElement getclicmod2() {
			return clicmod2;

		}

		@FindBy(xpath = "(//option[@value='25'][contains(text(),'25')])[34]")
		private WebElement selemod2;

		public WebElement getselemod2() {
			return selemod2;

		}

		@FindBy(xpath = "(//select[@id='MC_HCPCS0'])[1]")
		private WebElement clicmod3;

		public WebElement getclicmod3() {
			return clicmod3;

		}

		@FindBy(xpath = "(//option[@value='23'][contains(text(),'23')])[35]")
		private WebElement selemod3;

		public WebElement getselemod3() {
			return selemod3;

		}

		@FindBy(xpath = "(//select[@id='MD_HCPCS0'])[1]")
		private WebElement clicmod4;

		public WebElement getclicmod4() {
			return clicmod4;

		}

		@FindBy(xpath = "(//option[@value='24'][contains(text(),'24')])[36]")
		private WebElement selemod4;

		public WebElement getselemod4() {
			return selemod3;

		}

		@FindBy(xpath = "(//input[@id='HCPCS_units0'])[1]")
		private WebElement quant;

		public WebElement getquant() {
			return quant;

		}

		@FindBy(xpath = "(//input[@id='HCPCS_pointer0'])[1]")
		private WebElement pointe;

		public WebElement getpointe() {
			return pointe;

		}
		@FindBy(xpath = "//button[@class='pat-mob-dd m-l-12 servicedetails_tick_btn servicedetails_tick_btnalt']//*[name()='svg']//*[name()='path' and contains(@d,'M504 256c0')]")
		private WebElement savehcpc;

		public WebElement getsavehcpc() {

			return savehcpc;

		}

		@FindBy(xpath = "(//button[@id='HCNDAdd0'])[1]")
		private WebElement NDCPL;

		public WebElement getNDCPL() {
			return NDCPL;

		}

		@FindBy(xpath = "(//input[@id='HSPSC_NDC_Code0'])[1]")
		private WebElement finNDCP;

		public WebElement getfinNDCP() {
			return finNDCP;

		}

		@FindBy(xpath = "(//input[@id='HSPSC_NDCQty0'])[1]")
		private WebElement NDCPLqua;

		public WebElement getNDCPLqua() {
			return NDCPLqua;

		}

		@FindBy(xpath = "(//div[contains(text(),'123--hydrocloride')])[1]")
		private WebElement selNDCPLqua;

		public WebElement getselNDCPLqua() {
			return selNDCPLqua;

		}

		@FindBy(xpath = "(//select[@id='HSPSC_NDCUnit0'])[1]")
		private WebElement NDCPUnits;

		public WebElement getNDCPUnits() {
			return NDCPUnits;

		}

		@FindBy(xpath = "(//input[@id='appt_service_icd9'])[1]")
		private WebElement icd9;

		public WebElement geticd9() {
			return icd9;

		}

		@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='765.04-- Extreme immaturity, 1,000-1,249 grams'])[1]")
		private WebElement icd9sele;

		public WebElement geticd9sele() {
			return icd9sele;

		}
		
		@FindBy(xpath = "(//button[@class='m-l-11 btn btn-light'])[5]")
		private WebElement deletehcpc;

		public WebElement getdeletehcpc() {
			return deletehcpc;

		}

		@FindBy(xpath = "(//div[contains(text(),'123--Viral Fever 2')])[1]")
		private WebElement cuscosele;

		public WebElement getcuscosele() {
			return cuscosele;

		}

		@FindBy(xpath = "(//input[@id='appt_service_custom'])[1]")
		private WebElement cusco;

		public WebElement getcusco() {
			return cusco;

		}
		
		@FindBy(xpath = "(//select[@id='MA_Cust0'])[1]")
		private WebElement cusmod1;

		public WebElement getcusmod1() {

			return cusmod1;

		}

		@FindBy(xpath = "(//select[@id='MB_Cust0'])[1]")
		private WebElement cusmod2;

		public WebElement getcusmod2() {

			return cusmod2;

		}

		@FindBy(xpath = "(//select[@id='MC_Cust0'])[1]")
		private WebElement cusmod3;

		public WebElement getcusmod3() {

			return cusmod3;

		}

		@FindBy(xpath = "(//select[@id='MD_Cust0'])[1]")
		private WebElement cusmod4;

		public WebElement getcusmod4() {

			return cusmod4;

		}

		@FindBy(xpath = "(//input[@id='units0'])[1]")
		private WebElement quantcus;

		public WebElement getquantcus() {

			return quantcus;

		}

		@FindBy(xpath = "(//input[@id='pointer0'])[1]")
		private WebElement poincus;

		public WebElement getpoincus() {

			return poincus;

		}

		@FindBy(xpath = "(//button[normalize-space()='Add Codes'])[1]")
		private WebElement addcod;

		public WebElement getaddcod() {

			return addcod;

		}

		@FindBy(xpath = "(//select[@class='form-control'])[1]")
		private WebElement coty;

		public WebElement getcoty() {

			return coty;

		}
		
		@FindBy(xpath = "(//input[@class='form-control'])[1]")
		private WebElement adcod;

		public WebElement getadcod() {

			return adcod;

		}

		@FindBy(xpath = "(//input[@id='feesval'])[1]")
		private WebElement adfee;

		public WebElement getadfee() {

			return adfee;

		}

		@FindBy(xpath = "(//textarea[@id='descriptionval'])[1]")
		private WebElement addes;

		public WebElement getaddes() {

			return addes;

		}
		
		@FindBy(xpath = "(//button[@type='submit'])[1]")
		private WebElement saveco;

		public WebElement getsaveco() {
			return saveco;

		}

		@FindBy(xpath = "(//div[@class='Un-invoiced mgtb-app-mod'])[1]")
		private WebElement getbal;

		public WebElement getgetbal() {
			return getbal;

		}
		
		@FindBy(xpath = "(//select[@id='defaultselect'])[1]")
		private WebElement paypro;

		public WebElement getpaypro() {
			return paypro;
		}

		@FindBy(xpath = "(//div[@class='dollor-value'])[1]")
		private WebElement appbal;

		public WebElement getappbal() {
			return appbal;

		}

		@FindBy(xpath = "//div[@class='pat-balance']")
		private WebElement insbal;

		public WebElement getinsbal() {
			return insbal;

		}

		@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-3'])[1]")
		private WebElement Billingsel;

		public WebElement getBillingsel() {
			return Billingsel;

		}

		@FindBy(xpath = "//button[@id='appt_superbill_btn']")
		private WebElement supbill;

		public WebElement getsupbill() {
			return supbill;

		}

		@FindBy(xpath = "//div[@id='appt_superbill_close']//span[contains(@aria-hidden,'true')][normalize-space()='×']")
		private WebElement closenvo;

		public WebElement getclosenvo() {
			return closenvo;

		}
		
		@FindBy(xpath = "//input[@id='vitalbpressure2']")
		private WebElement bloodpre;

		public WebElement getbloodpre() {
			return bloodpre;

		}
		
		@FindBy(xpath = "//input[@id='vitaltemprature']")
		private WebElement temperature;

		public WebElement gettemperature() {
			return temperature;

		}
		
		@FindBy(xpath = "(//input[@id='vitalpulse'])[1]")
		private WebElement pulse;

		public WebElement getpulse() {
			return pulse;

		}
		
		@FindBy(xpath = "(//input[@id='vitalweight'])[1]")
		private WebElement weight;

		public WebElement getweight() {
			return weight;

		}
		
		@FindBy(xpath = "(//input[@id='vitalheight'])[1]")
		private WebElement height;

		public WebElement getheight() {
			return height;

		}
		
		@FindBy(xpath = "(//input[@id='vitalrespiration'])[1]")
		private WebElement respiration;

		public WebElement getrespiration() {
			return respiration;

		}
		
		@FindBy(xpath = "(//button[contains(text(),'Done')])[2]")
		private WebElement doneappde;

		public WebElement getdoneappde() {
			return doneappde;

		}
		
		@FindBy(xpath = "//button[contains(text(),'Download as PDF')]")
		private WebElement vitalshistorypdf;

		public WebElement getvitalshistorypdf() {
			return vitalshistorypdf;

		}
		
		@FindBy(xpath = "//button[contains(text(),'Download as CSV')]")
		private WebElement vitalscsv;

		public WebElement getvitalscsv() {
			return vitalscsv;

		}
		
		@FindBy(xpath = "//div[@id='appt_tabs-panel-4']//div[contains(@class,'client-app new_appt_detail_footer modal-footer')]//div//button[contains(@type,'button')][normalize-space()='Done']")
		private WebElement clickdone;

		public WebElement getclickdone() {
			return clickdone;

		}
}
