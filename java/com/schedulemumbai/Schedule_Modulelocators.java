package com.schedulemumbai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Schedule_Modulelocators {
	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}
	
	@FindBy(xpath = "(//img[@alt='menu-icon'])[1]")
	private WebElement sidenav;

	public WebElement getsidenav() {
		return sidenav;
	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[4]")
	private WebElement calendarclickpage;

	public WebElement getclickcalendarpage() {
		return calendarclickpage;
	}
	
	@FindBy(xpath = "(//a[normalize-space()='Calendar'])[1]")
	private WebElement clickschedule;

	public WebElement getclickschedule() {
		return clickschedule;
	}

	@FindBy(xpath = "(//button[normalize-space()='Day'])[1]")
	private WebElement month;

	public WebElement getMonth() {
		return month;
	}

////////calendar
	public Schedule_Modulelocators(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	@FindBy(xpath = "(//a[normalize-space()='Month'])[1]")
	private WebElement selectmonth;

	public WebElement getselectMonth() {
		return selectmonth;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[6]")
	private WebElement monthcalender;

	public WebElement getMonthcalender() {
		return monthcalender;
	}

	@FindBy(xpath = "//span[contains(text(),'×')]")
	private WebElement Cancel1;

	public WebElement getCancel1() {
		return Cancel1;
	}

	@FindBy(xpath = "(//img[@alt='vozo-logo'])[1]")
	private WebElement visiblepage;

	public WebElement getvisiblepage() {
		return visiblepage;
	}

	@FindBy(xpath = "(//div[@class='tab_title_name'])[1]")
	private WebElement appointmentdashboardpage;

	public WebElement getappointmentdashboardpage() {
		return appointmentdashboardpage;
	}

	@FindBy(xpath = "(//div[@class='tab_title_name app_temp_top_tit_alt'])[1]")
	private WebElement provideravailablity;

	public WebElement getprovideravailablity() {
		return provideravailablity;
	}

	@FindBy(xpath = "//span[@id='cal-spn-dat']")
	private WebElement Visibletext1;

	public WebElement getVisibletext1() {
		return Visibletext1;
	}

	@FindBy(xpath = "(//button[normalize-space()='Week'])[1]")
	private WebElement Workweek;

	public WebElement getWorkweek() {
		return Workweek;
	}

	@FindBy(xpath = "//tbody/tr[5]/td[2]")
	private WebElement Wwcalender;

	public WebElement getWwcalender() {
		return Wwcalender;
	}

	@FindBy(xpath = "//span[contains(text(),'×')]")
	private WebElement Cancel2;

	public WebElement getCancel2() {
		return Cancel2;
	}

	@FindBy(xpath = "(//span[@class='sc-cUEIKg fsBOFX'])[1]")
	private WebElement Visibletext2;

	public WebElement getVisibletext2() {
		return Visibletext2;

	}

	@FindBy(xpath = "(//button[normalize-space()='Month'])[1]")
	private WebElement week;

	public WebElement getweek() {
		return week;
	}

	@FindBy(xpath = "(//a[normalize-space()='Week'])[1]")
	private WebElement selectweekcalendar;

	public WebElement getselectweekcalendar() {
		return selectweekcalendar;
	}

	@FindBy(xpath = "//tbody/tr[6]/td[5]")
	private WebElement wcalender;

	public WebElement getwcalender() {
		return wcalender;
	}

	@FindBy(xpath = "//span[contains(text(),'×')]")
	private WebElement Cancel3;

	public WebElement getCancel3() {
		return Cancel3;
	}

	@FindBy(xpath = "(//span[@id='cal-spn-dat'])[1]")
	private WebElement Visibletext3;

	public WebElement getVisibletext3() {
		return Visibletext3;

	}

	@FindBy(xpath = "(//button[normalize-space()='Week'])[1]")
	private WebElement Day;

	public WebElement getDay() {
		return Day;

	}

	@FindBy(xpath = "(//a[normalize-space()='Day'])[1]")
	private WebElement Daycalender;

	public WebElement getDaycalender() {
		return Daycalender;

	}

	@FindBy(xpath = "//span[contains(text(),'×')]")
	private WebElement Cancel4;

	public WebElement getCancel4() {
		return Cancel4;

	}

	@FindBy(xpath = "(//span[@id='cal-spn-dat'])[1]")
	private WebElement Visibletext4;

	public WebElement getVisibletext4() {
		return Visibletext4;

	}

	@FindBy(xpath = "(//button[contains(text(),'Exam Room')])[1]")
	private WebElement examroo;

	public WebElement getexamroo() {
		return examroo;

	}

	@FindBy(xpath = "(//div[normalize-space()='Exam Room 2'])[1]")
	private WebElement examrooclick;

	public WebElement getexamrooclick() {
		return examrooclick;

	}

	@FindBy(xpath = "//span[@id='cal-spn-dat']")
	private WebElement CenterCalender;

	public WebElement getCenterCalender() {
		return CenterCalender;

	}

	@FindBy(xpath = "//button[contains(text(),'Today')]")
	private WebElement Today;

	public WebElement getToday() {
		return Today;

	}

	@FindBy(xpath = "//*[@id='cal-btn-rte-arw']")
	private WebElement Right;

	public WebElement getRight() {
		return Right;

	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[10]")
	private WebElement Left;

	public WebElement getLeft() {
		return Left;

	}

	@FindBy(xpath = "(//div[@title='ALEENA'])[1]")
	private WebElement Provider;

	public WebElement getProvider() {
		return Provider;

	}

	@FindBy(xpath = "(//div[@title='Test'])[2]")
	private WebElement Providerselect;

	public WebElement getProviderselect() {
		return Providerselect;

	}

	@FindBy(xpath = "(//div[normalize-space()='Exam Room 2'])[1]")
	private WebElement clickexam;

	public WebElement getclickexam() {
		return clickexam;

	}

	@FindBy(xpath = "(//span[normalize-space()='Exam Room 1'])[1]")
	private WebElement selectexam;

	public WebElement getselectexam() {
		return selectexam;

	}

	@FindBy(xpath = "(//div[@title='Binitha'])[1]")
	private WebElement selectProvider;

	public WebElement getselectProvider() {
		return selectProvider;

	}

	@FindBy(xpath = "(//*[name()='svg'])[10]")
	private WebElement Providerselectclo;

	public WebElement getProviderselectclo() {
		return Providerselectclo;

	}

	@FindBy(xpath = "(//div[@title='Thomos '])[1]")
	private WebElement Facility;

	public WebElement getFacility() {
		return Facility;

	}

	@FindBy(xpath = "(//div[@title='suda '])[1]")
	private WebElement FacilitySelect;

	public WebElement getFacilitySelect() {
		return FacilitySelect;

	}

	@FindBy(xpath = "(//div[@title='Production'])[1]")
	private WebElement SelectFacility;

	public WebElement getSelectFacility() {
		return SelectFacility;

	}

	@FindBy(xpath = "(//*[name()='svg'])[9]")
	private WebElement FacilitySelectclo;

	public WebElement getFacilitySelectclo() {
		return FacilitySelectclo;

	}

	@FindBy(xpath = "(//button[normalize-space()='Today'])[1]")
	private WebElement Todayoption;

	public WebElement getTodayoption() {
		return Todayoption;

	}

	@FindBy(xpath = "//*[@id='calender-resource']/div")
	private WebElement providername;

	public WebElement getprovidername() {
		return providername;

	}

	@FindBy(xpath = "//button[@id='dropdown-basic cal-btn-crate']")
	private WebElement Appointmentoption;

	public WebElement getAppointmentoption() {
		return Appointmentoption;

	}

	@FindBy(xpath = "(//div[@class='sc-ihNHHr hHJnMF day-overlay']//*[name()='svg'])[2]")
	private WebElement deleteapp;

	public WebElement getdeleteapp() {
		return deleteapp;
	}
	/////////// Appointment

	@FindBy(xpath = "(//input[@id='new-app-patient_1 appt-inp-patsrch'])[1]")
	private WebElement Clcikpatient;

	public WebElement getClcikpatient() {
		return Clcikpatient;
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

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
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

	@FindBy(xpath = "(//input[@class='fromTime-toTime'])[1]")
	private WebElement Selecttimevid;

	public WebElement getSelecttimevid() {
		return Selecttimevid;

	}

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

//	@FindBy(xpath = "//span[contains(text(),'Ok')]")
//	private WebElement Clickok;
//
//	public WebElement getClickok() {
//		return Clickok;
//
//	}

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

	@FindBy(xpath = "//*[@id='officeId']/div[1]/div/span[2]")
	private WebElement telehealthfacilty;

	public WebElement gettelehealthfacilty() {

		return telehealthfacilty;

	}

	@FindBy(xpath = "//*[@id='officeId']/div[2]/div/div/div/div[2]/div[1]/div/div/div/div")
	private WebElement selecttelefacility;

	public WebElement getselecttelefacility() {
		return selecttelefacility;

	}

	@FindBy(xpath = "(//input[@id='new-app-provider new-app-provider_1'])[1]")
	private WebElement prosel;

	public WebElement getprosel() {
		return prosel;

	}

	@FindBy(xpath = "//*[@id='provId']/div[2]/div/div/div/div[2]/div[1]/div/div/div[1]/div")
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

	@FindBy(xpath = "(//input[@id='new-app-provider new-app-provider_1'])[1]")
	private WebElement SearchProvider;

	public WebElement getSearchProvider() {
		return SearchProvider;

	}
	
	
	@FindBy(xpath = "(//input[@id='rc_select_3'])[1]")
	private WebElement specialityselect;

	public WebElement getspecialityselect() {
		
		return specialityselect;

	}
	
	@FindBy(xpath = "(//input[@class='ant-select-selection-search-input'])[4]")
	private WebElement specialityselectnewappoint;

	public WebElement getspecialityselectnewappoint() {
		
		return specialityselectnewappoint;

	}
	
	@FindBy(xpath = "(//input[@class='ant-select-selection-search-input'])[4]")
	private WebElement specialityselecttele;

	public WebElement getspecialityselecttele() {
		
		return specialityselecttele;

	}
	
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='Plastic Surgery'])[1]")
	private WebElement specialityclick;

	public WebElement getspecialityclick() {
		
		return specialityclick;

	}

	@FindBy(xpath = "(//div[contains(text(),'Thomos')])[1]")
	private WebElement Selectprovider;

	public WebElement getSelectprovider() {
		return Selectprovider;

	}
	
	@FindBy(xpath = "(//div[contains(@class,'ant-select-item-option-content')][normalize-space()='Production Vozo'])[1]")
	private WebElement Selectprovidertele;

	public WebElement getSelectprovidertele() {
		return Selectprovidertele;

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

	@FindBy(xpath = "(//button[@class='close-btn btn btn-light'])[1]")
	private WebElement Clickclose;

	public WebElement getClickclose() {
		return Clickclose;

	}

	@FindBy(xpath = "(//span[normalize-space()='Video Visit'])[1]")
	private WebElement videovis;

	public WebElement getvideovis() {
		return videovis;

	}

	@FindBy(xpath = "(//div[normalize-space()='Search Patient'])[1]")
	private WebElement searvid;

	public WebElement getsearvid() {

		return searvid;

	}

	@FindBy(xpath = "(//input[@id='new-app-patient_1 appt-inp-patsrch'])[1]")
	private WebElement searvidpat;

	public WebElement getsearvidpat() {

		return searvidpat;

	}

	@FindBy(xpath = "(//input[@id='new-app-status_1 appt-inp-stas'])[1]")
	private WebElement statsel;

	public WebElement getstatselect() {

		return statsel;

	}

	@FindBy(xpath = "//*[@id='statId']/div[2]/div/div/div/div[2]/div[1]/div/div/div[2]/div")
	private WebElement statsel1;

	public WebElement getstatse1l() {

		return statsel1;

	}

	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")
	private WebElement closvi;

	public WebElement getclosvi() {

		return closvi;

	}

	@FindBy(xpath = "//button[@id='appt-btn-sve']")
	private WebElement savevi;

	public WebElement getsavevi() {

		return savevi;

	}

	///////////// Practice dashboard //////

	@FindBy(xpath = "//a[contains(text(),'Practice Dashboard')]")
	private WebElement practicedashboard;

	public WebElement getpracticedashboard() {
		return practicedashboard;

	}

	@FindBy(xpath = "(//h1[normalize-space()='Practice Dashboard'])[1]")
	private WebElement titlepractice;

	public WebElement gettitlepractice() {

		return titlepractice;

	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")
	private WebElement searchpatientpractice;

	public WebElement getsearchpatientpractice() {

		return searchpatientpractice;

	}

	@FindBy(xpath = "(//button[@class='sc-cqYYBx bzdZR'][normalize-space()='Add Vitals'])[1]")
	private WebElement addvitals;

	public WebElement getaddvitalss() {

		return addvitals;

	}

	@FindBy(xpath = "(//button[contains(text(),'Edit Note')])[1]")
	private WebElement editnotes;

	public WebElement geteditnotes() {

		return editnotes;

	}

	@FindBy(xpath = "//tbody/tr[1]/td[7]/button[1]")
	private WebElement addservices;

	public WebElement getaddservices() {

		return addservices;

	}

	@FindBy(xpath = "(//div[contains(@class,'m-t-10')])[1]")
	private WebElement backoptions;

	public WebElement getbackoptions() {

		return backoptions;

	}

	@FindBy(xpath = "(//span[@aria-hidden='true'])[1]")
	private WebElement cancelvitals;

	public WebElement getcancelvitals() {

		return cancelvitals;

	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	private WebElement selectpatient;

	public WebElement getselectpatient() {

		return selectpatient;

	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[2]")
	private WebElement searchproviderpractice;

	public WebElement getsearchproviderpractice() {

		return searchproviderpractice;

	}

	@FindBy(xpath = "(//div[contains(text(),'Production Vozo')])[2]")
	private WebElement selectprovider;

	public WebElement getselectprovider() {

		return selectprovider;

	}

	@FindBy(xpath = "(//input[@id='allDrop'])[1]")
	private WebElement selectstaus;

	public WebElement getselectstauspractice() {

		return selectstaus;

	}

	@FindBy(xpath = "(//div[contains(text(),'@ Arrived/Lobby')])[1]")
	private WebElement selectstaus1;

	public WebElement getselectstauspractice1() {

		return selectstaus1;

	}

	@FindBy(xpath = "(//input[@id='allDrop'])[2]")
	private WebElement selectstausBilling;

	public WebElement getselectstauspracticebilling() {

		return selectstausBilling;

	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='Paid'])[1]")
	private WebElement selectstausbill1;

	public WebElement getselectstauspracticebill1() {

		return selectstausbill1;

	}

	@FindBy(xpath = "(//input[@id='date'])[1]")
	private WebElement dateselectpractice;

	public WebElement getdateselectpractice() {

		return dateselectpractice;

	}

	@FindBy(xpath = "(//input[@id='date'])[2]")
	private WebElement dateselectpracticeto;

	public WebElement getdateselectpracticeto() {

		return dateselectpracticeto;

	}

	@FindBy(xpath = "(//button[normalize-space()='Update Filters'])[1]")
	private WebElement clickupdate;

	public WebElement getclickupdate() {

		return clickupdate;

	}

	////////////// new appoin

	@FindBy(xpath = "//span[@class='e-tbar-btn-text'][normalize-space()='Day']")
	private WebElement Clickdayn;

	public WebElement getClickdayn() {
		return Clickdayn;

	}

	@FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
	private WebElement Clickcaln;

	public WebElement getClickcaln() {
		return Clickcaln;

	}

	@FindBy(xpath = "(//a[normalize-space()='Create Appoiment'])[1]")
	private WebElement Clickcreateappn;

	public WebElement getClickcreateappn() {
		return Clickcreateappn;

	}

	@FindBy(xpath = "//div[contains(text(),'Search Patient')]")
	private WebElement serachpatn;

	public WebElement getserachpatn() {
		return serachpatn;

	}

	@FindBy(xpath = "(//span[normalize-space()='DhilipKumar'])[1]")
	private WebElement sendpatn;

	public WebElement getsendpatn() {
		return sendpatn;

	}

	@FindBy(xpath = "(//input[@id='new-set-time'])[1]")
	private WebElement sendtimen;

	public WebElement getsendtimen() {
		return sendtimen;

	}

	@FindBy(xpath = "//div[contains(text(),'Search Provider')]")
	private WebElement searprovin;

	public WebElement getsearprovin() {
		return searprovin;

	}

	@FindBy(xpath = "(//span[@class='text'][normalize-space()='Tech1'])[1]")
	private WebElement sendprovn;

	public WebElement getsendprovn() {
		return sendprovn;

	}

	@FindBy(xpath = "(//div[normalize-space()='Profile'])[1]")
	private WebElement searprofn;

	public WebElement getsearprofn() {
		return searprofn;

	}

	@FindBy(xpath = "//span[contains(text(),'In Office')]")
	private WebElement sendprofn;

	public WebElement getsendprofn() {
		return sendprofn;

	}

	@FindBy(xpath = "(//div[@class='divider default text'])[1]")
	private WebElement searoffn;

	public WebElement getsearoffn() {
		return searoffn;

	}

	@FindBy(xpath = "(//span[contains(text(),'Test Facility Phar')])[2]")
	private WebElement sendoffn;

	public WebElement getsendoffn() {
		return sendoffn;

	}

	@FindBy(xpath = "(//div[normalize-space()='Status'])[1]")
	private WebElement searchstan;

	public WebElement getsearchstan() {
		return searchstan;

	}

	@FindBy(xpath = "(//span[normalize-space()='In Lobby'])[1]")
	private WebElement sendstatn;

	public WebElement getsendstatn() {
		return sendstatn;

	}

	@FindBy(xpath = "(//button[contains(text(),'Save')])[2]")
	private WebElement saven;

	public WebElement getsaven() {
		return saven;

	}

	@FindBy(xpath = "(//td[@role='gridcell'])[3]")
	private WebElement cal1;

	public WebElement getcal1() {
		return cal1;

	}

	@FindBy(xpath = "(//td[@role='gridcell'])[4]")
	private WebElement cal2;

	public WebElement getcal2() {
		return cal2;

	}

	@FindBy(xpath = "(//td[@role='gridcell'])[5]")
	private WebElement cal3;

	public WebElement getcal3() {
		return cal3;

	}

	@FindBy(xpath = "(//button[contains(text(),'Cancel')])[2]")
	private WebElement canceln;

	public WebElement getcanceln() {
		return canceln;

	}

	///// Notification/////
	@FindBy(xpath = "(//*[name()='svg'][@id='appt-inp_bell'])[1]")
	private WebElement notif;

	public WebElement getnotif() {
		return notif;
	}
	
	
	@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-2'])[1]")
	private WebElement notificationclick;

	public WebElement getnotificationclick() {
		return notificationclick;
	}

	@FindBy(css = "#rc-tabs-2-tab-1")
	private WebElement appreq;

	public WebElement getappreq() {
		return appreq;
	}

	@FindBy(css = "#rc-tabs-2-tab-2")
	private WebElement secumsg;

	public WebElement getsecumsg() {
		return secumsg;
	}

	////////////// Appointment Dashboard
	@FindBy(xpath = "//a[contains(text(),'Appointment Dashboard')]")
	private WebElement ClcikAppointmentdashboard;

	public WebElement getClcikAppointmentdashboard() {
		return ClcikAppointmentdashboard;
	}

	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[1]")
	private WebElement Searchoffice;

	public WebElement getSearchoffice() {
		return Searchoffice;
	}

	@FindBy(xpath = "(//div[@class='tab_title_name'])[1]")
	private WebElement appointmenttittle;

	public WebElement getappointmenttittle() {
		return appointmenttittle;
	}

	@FindBy(xpath = "(//label[normalize-space()='Show Status'])[1]")
	private WebElement shst;

	public WebElement getshst() {
		return shst;
	}

	@FindBy(xpath = "(//*[name()='svg'][@class='show_hide_status_app_dash'])[1]")
	private WebElement eyeoption;

	public WebElement geteyeoption() {
		return eyeoption;
	}

	@FindBy(xpath = "(//*[name()='svg'][@class='show_hide_status_app_dash'])[5]")
	private WebElement eyeoption1;

	public WebElement geteyeoption1() {
		return eyeoption1;
	}

	@FindBy(xpath = "(//select[@name='office_1'])[1]")
	private WebElement shstse;

	public WebElement getshstse() {
		return shstse;
	}

	@FindBy(xpath = "(//label[contains(text(),'Show Status')])[2]")
	private WebElement shst1;

	public WebElement getshst1() {
		return shst1;
	}

	@FindBy(xpath = "(//select[@name='office_1'])[2]")
	private WebElement shstse1;

	public WebElement getshstse1() {
		return shstse1;
	}

	@FindBy(xpath = "(//div[contains(text(),'defaults hospital')])[1]")
	private WebElement Selecttestfac2;

	public WebElement getSelecttestfac2() {
		return Selecttestfac2;
	}

	@FindBy(xpath = "(//input[@placeholder='From Date'])[1]")
	private WebElement Clickcalender;

	public WebElement getClickcalender() {
		return Clickcalender;
	}

	@FindBy(xpath = "//input[@id='duration']")
	private WebElement Clicktod;

	public WebElement getClicktod() {
		return Clicktod;
	}

	@FindBy(xpath = "//button[@id='appt_dbrd-btn_filt']")
	private WebElement clitoa;

	public WebElement getclitoa() {
		return clitoa;
	}

	@FindBy(xpath = "//button[@id='appt_dbrd-btn_filt']")
	private WebElement Clickupdate;

	public WebElement getClickupdate() {
		return Clickupdate;
	}

	@FindBy(xpath = "//label[@id='appt_dbrd-lbl_uchk']")
	private WebElement Selectnone;

	public WebElement getSelectnone() {
		return Selectnone;
	}

	@FindBy(xpath = "(//label[normalize-space()='Show Status'])[1]")
	private WebElement statsh;

	public WebElement getstatsh() {
		return statsh;
	}

	@FindBy(xpath = "//div[contains(text(),'Telehealth Appointment')]")
	private WebElement telehe;

	public WebElement gettelehe() {
		return telehe;
	}

	@FindBy(xpath = "(//label[normalize-space()='Check All'])[1]")
	private WebElement Selectall1;

	public WebElement getSelectall1() {
		return Selectall1;
	}

	@FindBy(xpath = "(//tbody[@class='MuiTableBody-root'])[1]")
	private WebElement getpatientname;

	public WebElement getgetpatientname() {
		return getpatientname;
	}

	@FindBy(xpath = "(//select[@name='office_1'])[1]")
	private WebElement getstatustext;

	public WebElement getgetstatustext() {
		return getstatustext;
	}

	@FindBy(xpath = "(//label[@class='for-dash-t-h-8'])[1]")
	private WebElement clickshowstatus;

	public WebElement getclickshowstatus() {

		return clickshowstatus;
	}

	////// tele //////

	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[2]")
	private WebElement Searchoffice2;

	public WebElement getSearchoffice2() {
		return Searchoffice2;
	}

	@FindBy(xpath = "((//div[@label='K G Hospitals'])[1]")
	private WebElement Selecttestfac3;

	public WebElement getSelecttestfac3() {
		return Selecttestfac3;
	}

	@FindBy(xpath = "(//input[@placeholder='From Date'])[2]")
	private WebElement Clickcalender1;

	public WebElement getClickcalender1() {
		return Clickcalender1;
	}

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Update Filter'])[2]")
	private WebElement Clickupdate1;

	public WebElement getClickupdate1() {
		return Clickupdate1;
	}

	@FindBy(xpath = "(//label[@class='for-s-none'][normalize-space()='Uncheck All'])[2]")
	private WebElement Select1;

	public WebElement getSelect1() {
		return Select1;
	}

	@FindBy(xpath = "(//label[@class='for-s-all'][normalize-space()='Check All'])[2]")
	private WebElement Selectalltele;

	public WebElement getSelectalltele() {

		return Selectalltele;
	}

	@FindBy(xpath = "//label[@id='appt_dbrd-lbl_chkl']")
	private WebElement Selectall;

	public WebElement getSelectall() {
		return Selectall;
	}

	////////////// Provider Availability

	@FindBy(xpath = "//a[contains(text(),'Provider Availability')]")
	private WebElement ClickProvideravailability;

	public WebElement getClickProvideravailability() {

		return ClickProvideravailability;
	}

	@FindBy(xpath = "(//i[@class='dropdown icon'])[1]")
	private WebElement ClickProvideravailability1;

	public WebElement getClickProvideravailability1() {

		return ClickProvideravailability1;
	}

	@FindBy(xpath = "(//span[normalize-space()='Martin Edward'])[1]")

	private WebElement editselectprovider;

	public WebElement geteditselectprovider() {

		return editselectprovider;
	}

	@FindBy(xpath = "(//i[@class='dropdown icon'])[3]")
	private WebElement editclcikoffice;

	public WebElement geteditclcikoffice() {

		return editclcikoffice;
	}

	@FindBy(xpath = "//span[contains(text(),'Test Facility2')]")
	private WebElement editselectoffice;

	public WebElement geteditselectoffice2() {

		return editselectoffice;
	}

	@FindBy(xpath = "(//i[@class='dropdown icon'])[4]")
	private WebElement editappointment;

	public WebElement geteditappointment() {

		return editappointment;

	}

	@FindBy(xpath = "//span[contains(text(),'@ Arrived/Lobby')]")
	private WebElement editselectappointment;

	public WebElement geteditselectappointment() {

		return editselectappointment;

	}

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[5]")
	private WebElement editappstatus;

	public WebElement geteditappstatus() {

		return editappstatus;

	}

	@FindBy(xpath = "(//div[@title='? No show'])[1]")
	private WebElement editappselect;

	public WebElement geteditappselect() {

		return editappselect;

	}

	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	private WebElement editappdate;

	public WebElement geteditappdate() {

		return editappdate;

	}

	@FindBy(xpath = "//input[contains(@name,'timeapp')]")
	private WebElement clcicktime;

	public WebElement getclcicktime() {

		return clcicktime;

	}

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	private WebElement editappsave;

	public WebElement geteditappsave() {

		return editappsave;

	}

	@FindBy(xpath = "//div[@class='ant-select-selection-overflow']")
	private WebElement Clickofficesearch;

	public WebElement getClickofficesearch() {
		return Clickofficesearch;
	}

	@FindBy(xpath = "//div[contains(text(),'oemrvozo')]")
	private WebElement Selectprov;

	public WebElement getSelectprov() {
		return Selectprov;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[7]/div[1]/*[1]")
	private WebElement Clickedit;

	public WebElement getClickedit() {
		return Clickedit;

	}

	@FindBy(xpath = "//div[contains(text(),'Search Provider')]")
	private WebElement editprovider;

	public WebElement geteditprovider() {
		return editprovider;

	}

	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")
	private WebElement Closecustomedit;

	public WebElement getClosecustomedit() {
		return Closecustomedit;

	}

	@FindBy(xpath = "//button[normalize-space()='Add Provider Availability']")

	private WebElement clickaddprovider;

	public WebElement getclickaddprovider() {
		return clickaddprovider;

	}

	@FindBy(xpath = "(//div[normalize-space()='Search Provider'])[1]")

	private WebElement Searchprovider;

	public WebElement getSearchprovider() {
		return Searchprovider;

	}

	@FindBy(xpath = "//html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")

	private WebElement Selectprovider1;

	public WebElement getSelectprovider1() {

		return Selectprovider1;

	}

	@FindBy(xpath = "(//div[normalize-space()='Office'])[1]")

	private WebElement SelectOffice;

	public WebElement getSelectOffice() {

		return SelectOffice;

	}

	@FindBy(xpath = "(//span[@class='text'][normalize-space()='Testing'])[1]")

	private WebElement Selectoffice1;

	public WebElement getSelectoffice1() {

		return Selectoffice1;

	}

	@FindBy(xpath = "(//input[@class='ant-select-selection-search-input'])[5]")

	private WebElement Selectappointmentcategory;

	public WebElement getSelectappointmentcategory() {

		return Selectappointmentcategory;

	}

	@FindBy(xpath = "(//div[contains(text(),'Established Patient')])[1]")

	private WebElement Selectcategory;

	public WebElement getSelectcategory() {

		return Selectcategory;

	}

	@FindBy(xpath = "(//input[@class='ant-select-selection-search-input'])[6]")

	private WebElement Appointmentstatus;

	public WebElement getAppointmentstatus() {

		return Appointmentstatus;

	}

	@FindBy(xpath = "(//div[contains(text(),'@ Arrived/Lobby')])[1]")

	private WebElement Appointmentstatusselect;

	public WebElement getAppointmentstatusselect() {

		return Appointmentstatusselect;

	}

	@FindBy(xpath = "(//div[normalize-space()='Select Exam Room'])[1]")

	private WebElement examrroom;

	public WebElement getexamrroom() {

		return examrroom;

	}

	@FindBy(xpath = "(//div[contains(text(),'Exam Room 1')])[1]")

	private WebElement examrroom1;

	public WebElement getexamrroom1() {

		return examrroom1;

	}

	@FindBy(xpath = "(//input[@class='form-control'])[1]")

	private WebElement appcalender;

	public WebElement getappcalender() {

		return appcalender;

	}

	@FindBy(xpath = "//a[contains(text(),'Today')]")

	private WebElement clicktoday1;

	public WebElement getclicktoday1() {

		return clicktoday1;

	}

	@FindBy(xpath = "(//input[contains(@placeholder,'--:-- --')])[1]")

	private WebElement apptimer;

	public WebElement getapptimer() {

		return apptimer;

	}

	@FindBy(xpath = "(//button[contains(@value,'AM')][contains(text(),'10:00')])[1]")

	private WebElement apptimerclick;

	public WebElement getapptimerclick() {

		return apptimerclick;

	}

	@FindBy(id = "duration")

	private WebElement duration;

	public WebElement getduration() {

		return duration;

	}

	@FindBy(id = "new-app-repeats-check1")

	private WebElement apprepeat;

	public WebElement getapprepeat() {

		return apprepeat;

	}

	@FindBy(id = "new-app-select1")

	private WebElement appevery;

	public WebElement getappevery() {

		return appevery;

	}

	@FindBy(id = "new-app-select2")

	private WebElement appday;

	public WebElement getappday() {

		return appday;

	}

	@FindBy(id = "new-app-untildate")

	private WebElement appcal;

	public WebElement getappcal() {

		return appcal;

	}

	@FindBy(xpath = "//span[contains(text(),'Days wise')]")

	private WebElement appdaywise;

	public WebElement getappdaywise() {

		return appdaywise;

	}

	@FindBy(id = "new-app-days-wise")

	private WebElement appdaywisedesele;

	public WebElement getappdaywisedesele() {

		return appdaywisedesele;

	}

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")

	private WebElement Appsave;

	public WebElement getAppsave() {

		return Appsave;

	}

	@FindBy(id = "//button[@class='close-btn btn btn-light']")

	private WebElement Appclose;

	public WebElement getAppclose() {

		return Appclose;

	}

////////////////////////////////Appointment Profiles

	@FindBy(xpath = "//a[normalize-space()='Appointment Profiles']")

	private WebElement Appointmentprofile;

	public WebElement getAppointmentprofile() {
		return Appointmentprofile;
	}

	@FindBy(xpath = "//button[@class='billing_pro_frmt_table_btn2 ins-cl-ex m-r-15 mr btn btn-light']")

	private WebElement clicksort;

	public WebElement getclicksort() {
		return clicksort;
	}

	@FindBy(xpath = "//button[@class='billing_pro_frmt_table_btn1 icon-align-btn ins-cl-ex m-l-15 ml btn btn-light']")

	private WebElement clicksortrelease;

	public WebElement getclicksortrelease() {
		return clicksortrelease;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]")

	private WebElement clickfooter;

	public WebElement getclickfooter() {
		return clickfooter;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/button[1]/span[1]")

	private WebElement clickdelete;

	public WebElement getclickdelete() {
		return clickdelete;
	}

	@FindBy(xpath = "//button[normalize-space()='Add New Profile']")

	private WebElement addnewprofile;

	public WebElement getaddnewprofile() {

		return addnewprofile;
	}

	@FindBy(xpath = "(//input[@id='duration'])[1]")

	private WebElement addname;

	public WebElement getaddname() {

		return addname;
	}

	@FindBy(xpath = "//input[@id='resonforvisit']")

	private WebElement addresonforvisit;

	public WebElement getaddresonforvisit() {

		return addresonforvisit;
	}

	@FindBy(xpath = "//input[@type='color']")

	private WebElement addcolor;

	public WebElement getaddcolor() {

		return addcolor;
	}

	@FindBy(xpath = "(//input[@id='duration'])[2]")

	private WebElement addduration;

	public WebElement getaddduration() {

		return addduration;
	}

	@FindBy(xpath = "(//input[@class='ant-select-selection-search-input'])[2]")

	private WebElement billingprofile;

	public WebElement getbillingprofile() {

		return billingprofile;
	}
	
	@FindBy(xpath = "(//div[contains(text(),'test321')])[1]")

	private WebElement billingprofileselect;

	public WebElement getbillingprofileselect() {

		return billingprofileselect;
	}

	@FindBy(xpath = "(//input[@class='ant-select-selection-search-input'])[3]")

	private WebElement billingprofile1;

	public WebElement getbillingprofile1() {

		return billingprofile1;
	}
	
	@FindBy(xpath = "(//div[contains(text(),'Insurance')])[1]")

	private WebElement billingprofile1select;

	public WebElement getbillingprofile1select() {

		return billingprofile1select;
	}

	@FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/form[1]/div[2]/div[6]/div[1]/div[1]/select[1]")

	private WebElement clickpaymentprofile;

	public WebElement getclickpaymentprofile() {

		return clickpaymentprofile;
	}

	@FindBy(xpath = "//option[normalize-space()='Cash']")

	private WebElement selectpaymentprofile;

	public WebElement getselectpaymentprofile() {

		return selectpaymentprofile;
	}

	@FindBy(xpath = "//button[@id='appt_prof-crt_btn']")

	private WebElement saveap;

	public WebElement getsaveap() {

		return saveap;
	}

	@FindBy(xpath = "(//span[contains(text(),'Edit')])[1]")

	private WebElement editap;

	public WebElement geteditap() {

		return editap;
	}

	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")

	private WebElement caned;

	public WebElement getcaned() {

		return caned;
	}

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")

	private WebElement Close;

	public WebElement getClose() {

		return Close;
	}
/////////////// Click Billing Profile///////////////

	@FindBy(xpath = "//a[contains(text(),'Billing Profiles')]")

	private WebElement clcikbillingprofile;

	public WebElement getclcikbillingprofile() {

		return clcikbillingprofile;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[2]/*[1]")

	private WebElement clicksort1;

	public WebElement getclicksort1() {

		return clicksort1;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/*[1]")

	private WebElement clicksort2;

	public WebElement getclicksort2() {

		return clicksort2;
	}

	@FindBy(xpath = "//div[contains(text(),'Add New Profile')]")

	private WebElement clickaddnewprofile;

	public WebElement getclickaddnewprofile() {

		return clickaddnewprofile;
	}

	@FindBy(xpath = "//input[@id='duration']")

	private WebElement profilename;

	public WebElement getprofilename() {

		return profilename;
	}

	@FindBy(xpath = "(//input[@id='crt_bil-prof-icd9'])[1]")

	private WebElement sendicd9;

	public WebElement getsendicd9() {

		return sendicd9;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='378.03-- Monocular esotropia with V pattern'])[1]")

	private WebElement clcicksendicd9;

	public WebElement getclcicksendicd9() {

		return clcicksendicd9;
	}
//@FindBy(xpath = "//div[contains(text(),'923.20-- Contusion of hand(s)')]")
//
//private WebElement clickicd9;
//
//public WebElement getclickicd9() {
//
//return clickicd9;
//}

	@FindBy(xpath = "(//input[@class='ant-select-selection-search-input'])[3]")

	private WebElement sendicd10;

	public WebElement getsendicd10() {

		return sendicd10;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='H50.07--Alternating esotropia with V pattern'])[1]")

	private WebElement selectsendicd10;

	public WebElement getselectsendicd10() {

		return selectsendicd10;
	}

	@FindBy(xpath = "(//input[@class='ant-select-selection-search-input'])[4]")

	private WebElement clickCpt;

	public WebElement getclickCpt() {

		return clickCpt;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='86891--Autologous blood op salvage'])[1]")

	private WebElement selectCpt;

	public WebElement getselectCpt() {

		return selectCpt;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='86891--Autologous blood op salvage'])[1]")

	private WebElement deletecpt;

	public WebElement getdeletecpt() {

		return deletecpt;
	}

	@FindBy(xpath = "(//input[@id='rc_select_20'])[1]")

	private WebElement clickHCPCS;

	public WebElement getclickHCPCS() {

		return clickHCPCS;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='V2755--Uv lens/es'])[1]")

	private WebElement selectHCPCS;

	public WebElement getselectHCPCS() {

		return selectHCPCS;
	}

	@FindBy(xpath = "(//input[@id='crt_bil-prof-cstom'])[1]")

	private WebElement clickcustom;

	public WebElement getclickcustom() {

		return clickcustom;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='demo--csa'])[1]")

	private WebElement selectcustom;

	public WebElement getselectcustom() {

		return selectcustom;
	}

//@FindBy(xpath = "//div[contains(text(),'A7505--Hmes or trach valve housing')]")
//
//private WebElement clickhcpc;
//
//public WebElement getclickhcpc() {
//
//return clickhcpc;
//}
//
//@FindBy(xpath = "//input[@placeholder='Find Custom Codes']")
//
//private WebElement sendcustomcod;
//
//public WebElement getsendcustomcod() {
//
//return sendcustomcod;
//}
//
//@FindBy(xpath = "//div[contains(text(),'123--Test Invoice')]")
//
//private WebElement clickcustom;
//
//public WebElement getclickcustom() {
//
//return clickcustom;
//}

	@FindBy(xpath = "//button[contains(text(),'Save')]")

	private WebElement clicksave;

	public WebElement getclicksave() {

		return clicksave;
	}

	///////////

	@FindBy(id = "normal_login_username")

	private WebElement username;

//	public AuditLog (WebDriver driver2) {
//		this.driver = driver2;
//
//		PageFactory.initElements(driver2, this);
//
//	}
//
//	public WebDriver getDriver() {
//		return driver;
//	}

	public WebElement getUsername() {
		return username;
	}

	@FindBy(xpath = "//a[contains(text(),'Audit Log')]")
	private WebElement ClickAudit;

	public WebElement getClickAudit() {
		return ClickAudit;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")
	private WebElement EnterPatientName;

	public WebElement getEnterPatientName() {
		return EnterPatientName;
	}

	@FindBy(xpath = "//input[@placeholder='Search Patient']")
	private WebElement EnterPatientName1;

	public WebElement getEnterPatientName1() {
		return EnterPatientName1;
	}

	@FindBy(xpath = "//div[@class='title']")
	private WebElement SelectPatientName;

	public WebElement getSelectPatientName() {
		return SelectPatientName;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[2]")
	private WebElement EnterUsername;

	public WebElement getEnterUsername() {
		return EnterUsername;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='James Marry'])[1]")
	private WebElement SelectUserName;

	public WebElement getSelectUserName() {
		return SelectUserName;
	}

	@FindBy(xpath = "(//input[@class='ant-select-selection-search-input'])[4]")
	private WebElement ClickDropdown;

	public WebElement getClickDropdown() {
		return ClickDropdown;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='Appointment'])[1]")
	private WebElement SelectAppointment;

	public WebElement getSelectAppointment() {
		return SelectAppointment;
	}

	@FindBy(xpath = "//button[contains(text(),'Update Filters')]")
	private WebElement ClickUpdateFilter;

	public WebElement getClickUpdateFilter() {
		return ClickUpdateFilter;
	}

	@FindBy(xpath = "//option[contains(text(),'Account')]")
	private WebElement SelectAccount;

	public WebElement getSelectAccount() {
		return SelectAccount;
	}

	@FindBy(xpath = "//option[contains(text(),'Allergy')]")
	private WebElement SelectAllergy;

	public WebElement getSelectAllergy() {
		return SelectAllergy;
	}

	@FindBy(xpath = "//option[contains(text(),'Appointment Profile')]")
	private WebElement SelectAppProfile;

	public WebElement getSelectAppProfile() {
		return SelectAppProfile;
	}

	@FindBy(xpath = "//option[contains(text(),'Provider Availability')]")
	private WebElement SelectProviderAvailability;

	public WebElement getProviderAvailability() {
		return SelectProviderAvailability;
	}

	@FindBy(xpath = "//option[contains(text(),'Billing Profile')]")
	private WebElement SelectBillingProfile;

	public WebElement getSelectBillingProfile() {
		return SelectBillingProfile;
	}

	@FindBy(xpath = "//option[contains(text(),'Chart')]")
	private WebElement SelectChart;

	public WebElement getSelectChart() {
		return SelectChart;
	}

	@FindBy(xpath = "//button[contains(text(),'Day')]")
	private WebElement SelectDay;

	public WebElement getSelectDay() {
		return SelectDay;
	}

	@FindBy(xpath = "//button[contains(text(),'Week')]")
	private WebElement SelectWK;

	public WebElement getSelectWK() {
		return SelectWK;
	}

	@FindBy(xpath = "//button[contains(text(),'Month')]")
	private WebElement SelectMonth;

	public WebElement getSelectMonth() {
		return SelectMonth;
	}

	@FindBy(xpath = "//button[contains(text(),'Year')]")
	private WebElement SelectYEAR;

	public WebElement getSelectYEAR() {
		return SelectYEAR;
	}

	@FindBy(xpath = "//option[contains(text(),'Clinical Notes')]")
	private WebElement clcickClinicalNotes;

	public WebElement getclcickClinicalNotes() {
		return clcickClinicalNotes;
	}

	@FindBy(xpath = "//option[contains(text(),'Fee Schedule')]")
	private WebElement clcickFee;

	public WebElement getclcickFee() {
		return clcickFee;
	}

	@FindBy(xpath = "//option[contains(text(),'eRx')]")
	private WebElement clcickeRX;

	public WebElement getclcickeRX() {
		return clcickeRX;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/input[1]")
	private WebElement EnterDate;

	public WebElement getEnterDate() {
		return EnterDate;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/input[1]")
	private WebElement EnterToDate;

	public WebElement getEnterToDate() {
		return EnterToDate;
	}

	@FindBy(xpath = "//option[contains(text(),'Immunization')]")
	private WebElement clcickImmunization;

	public WebElement getclcickImmunization() {
		return clcickImmunization;
	}

	@FindBy(xpath = "//option[contains(text(),'Insurance')]")
	private WebElement clcickInsurance;

	public WebElement getclcickInsurance() {
		return clcickInsurance;
	}

	@FindBy(xpath = "//option[contains(text(),'Medication')]")
	private WebElement clcickMedication;

	public WebElement getclcickMedication() {
		return clcickMedication;
	}

	@FindBy(xpath = "//option[contains(text(),'Problem')]")
	private WebElement clcickProblem;

	public WebElement getclcickProblem() {
		return clcickProblem;
	}

	//////////////////////////////// Praactice chat ///////////

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[3]")
	private WebElement practicechatclick;

	public WebElement getpracticechatclick() {

		return practicechatclick;
	}

	@FindBy(xpath = "(//h4[normalize-space()='Practice chat'])[1]")
	private WebElement practicechattitle;

	public WebElement getpracticechattitle() {

		return practicechattitle;
	}
	
	

	@FindBy(xpath = "//*[@id='root']/div/div[1]/div/div[2]/div[1]/div[1]/div/input")
	private WebElement searchpatient;

	public WebElement getsearchpatient() {

		return searchpatient;
	}

	@FindBy(xpath = "//*[@id='root']/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[2]/p[1]")
	private WebElement selectsearachprovider;

	public WebElement getselectsearachprovider() {

		return selectsearachprovider;
	}

	@FindBy(xpath = "//*[@id='root']/div/div[1]/div/div[2]/div[2]/div[1]/div[2]/p")
	private WebElement providernametitle;

	public WebElement getprovidernametitle() {

		return providernametitle;
	}

	@FindBy(xpath = "(//input[@placeholder='Type your message here…'])[1]")
	private WebElement typemessage;

	public WebElement gettypemessage() {

		return typemessage;
	}

	@FindBy(xpath = "//button[@class='sc-hZgfyJ jEQZug']//*[name()='svg']")
	private WebElement sendmessage;

	public WebElement getsendmessage() {

		return sendmessage;
	}

	@FindBy(xpath = "(//*[name()='svg'][@class='sc-edUIhV itlDKX'])[1]")
	private WebElement clickatoption;

	public WebElement getclickatoption() {

		return clickatoption;
	}

	@FindBy(xpath = "//*[@id='root']/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[2]/p[1]")
	private WebElement selectgenralprovider;

	public WebElement getselectgenralprovider() {

		return selectgenralprovider;
	}

	@FindBy(xpath = "(//input[@placeholder='Search '])[1]")
	private WebElement providergenraltitle;

	public WebElement getprovidergenraltitle() {

		return providergenraltitle;
	}

	@FindBy(xpath = "(//input[@placeholder='Type your message here…'])[1]")
	private WebElement typemessagegenral;

	public WebElement gettypemessagegenral() {

		return typemessagegenral;
	}

	@FindBy(xpath = "(//*[name()='svg'][@class='sc-edUIhV itlDKX'])[1]")
	private WebElement sendmessagegenral;

	public WebElement getsendmessagegenral() {

		return sendmessagegenral;
	}

	@FindBy(xpath = "(//h1[normalize-space()='Patient chat'])[1]")
	private WebElement clickatoptiongenral;

	public WebElement getclickatoptiongenral() {

		return clickatoptiongenral;
	}
	
	
	@FindBy(xpath = "//*[@id='root']/div/div[1]/div/div[2]/div[1]/div[1]/div/input")
	private WebElement searchpatientchat;

	public WebElement getsearchpatientchat() {

		return searchpatientchat;
	}

	@FindBy(xpath = "(//*[name()='path'])[14]")
	private WebElement closepracticechat;

	public WebElement getclosepracticechat() {

		return closepracticechat;
	}

	///////////////// efax ///////////////////////////

	@FindBy(xpath = "(//button[@class='sc-cwpsFg leiTfr'])[1]")
	private WebElement clickincomingfax;

	public WebElement getclickincomingfax() {

		return clickincomingfax;
	}

	@FindBy(xpath = "(//h1[normalize-space()='Incoming Fax'])[1]")
	private WebElement incomingfaxtitle;

	public WebElement getincomingfaxtitle() {

		return incomingfaxtitle;
	}

	@FindBy(xpath = "(//h1[normalize-space()='Incoming Fax'])[1]")
	private WebElement searchfax;

	public WebElement getsearchfax() {

		return searchfax;
	}

	@FindBy(xpath = "(//input[@id='date'])[1]")
	private WebElement fromdate;

	public WebElement getfromdate() {

		return fromdate;
	}

	@FindBy(xpath = "(//input[@id='date'])[1]")
	private WebElement fromdateok;

	public WebElement getfromdateok() {

		return fromdateok;
	}

	@FindBy(xpath = "(//input[@id='date'])[2]")
	private WebElement todate;

	public WebElement gettodate() {

		return todate;
	}

	@FindBy(xpath = "(//input[@id='date'])[2]")
	private WebElement todateok;

	public WebElement gettodateokd() {

		return todateok;
	}

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	private WebElement clickupdatefax;

	public WebElement getclickupdatefax() {

		return clickupdatefax;
	}

	@FindBy(xpath = "(//a[normalize-space()='+14703331740'])[1]")
	private WebElement clickfaxoption;

	public WebElement getclickfaxoption() {

		return clickfaxoption;
	}

	@FindBy(xpath = "(//p[@class='sc-hlqNbq ceLYJU'])[1]")
	private WebElement incomingfaxtitlein;

	public WebElement getincomingfaxtitlein() {

		return incomingfaxtitlein;
	}

	@FindBy(xpath = "(//button[normalize-space()='Fax'])[1]")
	private WebElement clickfax;

	public WebElement getclickfax() {

		return clickfax;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")
	private WebElement searchprovider;

	public WebElement getsearchprovider() {

		return searchprovider;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")
	private WebElement selectfaxprovider;

	public WebElement getselectfaxprovider() {

		return selectfaxprovider;
	}

	@FindBy(xpath = "(//span[normalize-space()='Send Fax'])[1]")
	private WebElement sendfax;

	public WebElement getsendfax() {

		return sendfax;
	}

	@FindBy(xpath = "(//span[normalize-space()='Close'])[1]")
	private WebElement cancelfax;

	public WebElement getcancelfax() {

		return cancelfax;
	}

	@FindBy(xpath = "(//button[normalize-space()='Save Attachment to Patient Chart'])[1]")
	private WebElement saveattachmenttochart;

	public WebElement getsaveattachmenttochart() {

		return saveattachmenttochart;
	}

	@FindBy(xpath = "(//input[@placeholder='Patient Search'])[1]")
	private WebElement searchpatientsattachment;

	public WebElement getsearchpatientsattachment() {

		return searchpatientsattachment;
	}

	@FindBy(xpath = "(//textarea[@display='flex'])[1]")
	private WebElement senddescription;

	public WebElement getsenddescription() {

		return senddescription;
	}

	@FindBy(xpath = "(//span[normalize-space()='Save to Patient Chart'])[1]")
	private WebElement savetopatient;

	public WebElement getsavetopatient() {

		return savetopatient;
	}

	@FindBy(xpath = "(//span[normalize-space()='Cancel'])[1]")
	private WebElement cancelattachments;

	public WebElement getcancelattachments() {

		return cancelattachments;
	}

	@FindBy(xpath = "(//select[contains(@name,'suffix')])[1]")
	private WebElement selectprovicder;

	public WebElement getselectprovicder() {

		return selectprovicder;
	}

	@FindBy(xpath = "(//select[contains(@class,'incomingfaxselect1 form-control')])[1]")
	private WebElement selectstatus;

	public WebElement getselectstatus() {

		return selectstatus;
	}

	@FindBy(xpath = "(//select[contains(@class,'incomingfaxselect1 form-control')])[1]")
	private WebElement clickassign;

	public WebElement getclickassign() {

		return clickassign;
	}

	@FindBy(xpath = "(//button[normalize-space()='View Document'])[1]")
	private WebElement viewdocument;

	public WebElement getviewdocument() {

		return viewdocument;
	}

	@FindBy(xpath = "(//button[normalize-space()='View Document'])[1]")
	private WebElement downloaddocument;

	public WebElement getdownloaddocument() {

		return downloaddocument;
	}

	/////////////// outgoing fax /////////////

	@FindBy(xpath = "(//button[normalize-space()='View Document'])[1]")
	private WebElement clickoutgoingfax;

	public WebElement getclickoutgoingfax() {

		return clickoutgoingfax;
	}

	@FindBy(xpath = "(//h1[normalize-space()='Incoming Fax'])[1]")
	private WebElement incomingfaxtitle1;

	public WebElement getincomingfaxtitle1() {

		return incomingfaxtitle1;
	}

	@FindBy(xpath = "(//h1[normalize-space()='Incoming Fax'])[1]")
	private WebElement searchfax1;

	public WebElement getsearchfax1() {

		return searchfax1;
	}

	@FindBy(xpath = "(//input[@id='date'])[1]")
	private WebElement fromdate1;

	public WebElement getfromdate1() {

		return fromdate1;
	}

	@FindBy(xpath = "(//input[@id='date'])[1]")
	private WebElement fromdateok1;

	public WebElement getfromdateok1() {

		return fromdateok1;
	}

	@FindBy(xpath = "(//input[@id='date'])[2]")
	private WebElement todate1;

	public WebElement gettodate1() {

		return todate1;
	}

	@FindBy(xpath = "(//input[@id='date'])[2]")
	private WebElement todateok1;

	public WebElement gettodateok1() {

		return todateok1;
	}

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	private WebElement clickupdatefax1;

	public WebElement getclickupdatefax1() {

		return clickupdatefax1;
	}

	@FindBy(xpath = "(//a[normalize-space()='+14703331740'])[1]")
	private WebElement clickfaxoption1;

	public WebElement getclickfaxoption1() {

		return clickfaxoption1;
	}

	@FindBy(xpath = "(//p[@class='sc-hlqNbq ceLYJU'])[1]")
	private WebElement incomingfaxtitlein1;

	public WebElement getincomingfaxtitlein1() {

		return incomingfaxtitlein1;
	}

	@FindBy(xpath = "(//button[normalize-space()='Fax'])[1]")
	private WebElement clickfax1;

	public WebElement getclickfax1() {

		return clickfax1;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")
	private WebElement searchprovider1;

	public WebElement getsearchprovider1() {

		return searchprovider1;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")
	private WebElement selectfaxprovider1;

	public WebElement getselectfaxprovider1() {

		return selectfaxprovider1;
	}

	@FindBy(xpath = "(//span[normalize-space()='Send Fax'])[1]")
	private WebElement sendfax1;

	public WebElement getsendfax1() {

		return sendfax1;
	}

	@FindBy(xpath = "(//span[normalize-space()='Close'])[1]")
	private WebElement cancelfax1;

	public WebElement getcancelfax1() {

		return cancelfax1;
	}

	@FindBy(xpath = "(//button[normalize-space()='Save Attachment to Patient Chart'])[1]")
	private WebElement saveattachmenttochart1;

	public WebElement getsaveattachmenttochart1() {

		return saveattachmenttochart1;
	}

	@FindBy(xpath = "(//input[@placeholder='Patient Search'])[1]")
	private WebElement searchpatientsattachment1;

	public WebElement getsearchpatientsattachment1() {

		return searchpatientsattachment1;
	}

	@FindBy(xpath = "(//textarea[@display='flex'])[1]")
	private WebElement senddescription1;

	public WebElement getsenddescription1() {

		return senddescription1;
	}

	@FindBy(xpath = "(//span[normalize-space()='Save to Patient Chart'])[1]")
	private WebElement savetopatient1;

	public WebElement getsavetopatient1() {

		return savetopatient1;
	}

	@FindBy(xpath = "(//span[normalize-space()='Cancel'])[1]")
	private WebElement cancelattachments1;

	public WebElement getcancelattachments1() {

		return cancelattachments1;
	}

	@FindBy(xpath = "(//select[contains(@name,'suffix')])[1]")
	private WebElement selectprovicder1;

	public WebElement getselectprovicder1() {

		return selectprovicder1;
	}

	@FindBy(xpath = "(//select[contains(@class,'incomingfaxselect1 form-control')])[1]")
	private WebElement selectstatus1;

	public WebElement getselectstatus1() {

		return selectstatus1;
	}

	@FindBy(xpath = "(//select[contains(@class,'incomingfaxselect1 form-control')])[1]")
	private WebElement clickassign1;

	public WebElement getclickassign1() {

		return clickassign1;
	}

	@FindBy(xpath = "(//button[normalize-space()='View Document'])[1]")
	private WebElement viewdocument1;

	public WebElement getviewdocument1() {

		return viewdocument1;
	}

	@FindBy(xpath = "(//button[normalize-space()='View Document'])[1]")
	private WebElement downloaddocument1;

	public WebElement getdownloaddocument1() {

		return downloaddocument1;

	}

	////////////////////////////////// Referral Management referral in //////////
	////////////////////////////////// TODO

	@FindBy(xpath = "(//a[normalize-space()='Referral ManageMent'])[1]")
	private WebElement referralmanagment;

	public WebElement getreferralmanagment() {

		return referralmanagment;

	}

	@FindBy(xpath = "(//h1[normalize-space()='Referral Management'])[1]")
	private WebElement referralmanagmenttitle1;

	public WebElement getreferralmanagmenttitle1() {

		return referralmanagmenttitle1;

	}

	@FindBy(xpath = "//*[@id='rc-tabs-1-panel-2']/table/tbody/tr[1]/td[7]/div[1]/svg")
	private WebElement clickeditreferralin1;

	public WebElement getclickeditreferralin1() {

		return clickeditreferralin1;

	}

	@FindBy(xpath = "(//h1[normalize-space()='Referral Management'])[1]")
	private WebElement referraloutnote1s;

	public WebElement getreferraloutnotes1() {

		return referraloutnote1s;

	}

	@FindBy(xpath = "(//h1[normalize-space()='Referral Management'])[1]")
	private WebElement referraloutupdate1;

	public WebElement getreferraloutupdate1() {

		return referraloutupdate1;
	}

	@FindBy(xpath = "(//*[name()='svg'][@class='ref_mngment_close'])[1]")
	private WebElement referraloutcancel1;

	public WebElement getreferraloutcancel1() {

		return referraloutcancel1;
	}

	@FindBy(xpath = "(//input[@id='rc_select_15'])[1]")
	private WebElement searchpatientreferral1;

	public WebElement getsearchpatientreferral1() {

		return searchpatientreferral1;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	private WebElement selectpatientreferral1;

	public WebElement getselectpatientreferral1() {

		return selectpatientreferral1;

	}

	@FindBy(xpath = "(//input[@id='rc_select_16'])[1]")
	private WebElement selectreferralbyprovider1;

	public WebElement getselectreferralbyprovider1() {

		return selectreferralbyprovider1;

	}

	@FindBy(xpath = "(//input[@id='rc_select_17'])[1]")
	private WebElement selectreferraltoprovider1;

	public WebElement getselectreferraltoprovider1() {

		return selectreferraltoprovider1;

	}

	@FindBy(xpath = "(//input[@id='rc_select_18'])[1]")
	private WebElement selectreferralstatus1;

	public WebElement getselectreferralstatus1() {

		return selectreferralstatus1;

	}

	@FindBy(xpath = "(//input[@id='rc_select_18'])[1]")
	private WebElement sendfromdate1;

	public WebElement getsendfromdate1() {

		return sendfromdate1;

	}

	@FindBy(xpath = "(//input[@id='billing-card-tran_from_date'])[1]")
	private WebElement sendfromdattoday1;

	public WebElement getsendfromdattoday1() {

		return sendfromdattoday1;

	}

	@FindBy(xpath = "(//input[@id='billing-card-tran_to_date'])[2]")
	private WebElement sendtodate1;

	public WebElement getsendtodate1() {

		return sendtodate1;

	}

	@FindBy(xpath = "(//input[@id='billing-card-tran_from_date'])[1]")
	private WebElement sendtodattoday1;

	public WebElement getsendtodattoday1() {

		return sendtodattoday1;

	}

	@FindBy(xpath = "(//button[@class='sc-eTtvFv fELHuC save_active'][normalize-space()='Update'])[2]s")
	private WebElement clickupdatereferral1;

	public WebElement getclickupdatereferral1() {

		return clickupdatereferral1;

	}

	@FindBy(xpath = "(//button[normalize-space()='Referral In'])[1]")
	private WebElement clickreferralin1;

	public WebElement getclickreferralin1() {

		return clickreferralin1;

	}

	@FindBy(xpath = "(//input[@id='rc_select_41'])[1]")
	private WebElement searchpatientaddreferral1;

	public WebElement getsearchpatientaddreferral1() {

		return searchpatientaddreferral1;

	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	private WebElement selectpatientaddreferral1;

	public WebElement getselectpatientaddreferral1() {

		return selectpatientaddreferral1;

	}

	@FindBy(xpath = "(//input[@id='rc_select_71'])[1]")
	private WebElement searchproviderfromaddreferral1;

	public WebElement getsearchproviderfromaddreferral1() {

		return searchproviderfromaddreferral1;

	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	private WebElement selectproviderfromaddreferral1;

	public WebElement getselectproviderfromaddreferral1() {

		return selectproviderfromaddreferral1;

	}

	@FindBy(xpath = "(//input[@id='rc_select_7'])[1]")
	private WebElement searchprovidertoaddreferral1;

	public WebElement getsearchprovidertoaddreferral1() {

		return searchprovidertoaddreferral1;

	}

	@FindBy(xpath = "(//div[contains(text(),'Raghul Jain')])[1]")
	private WebElement selectprovidertoaddreferral1;

	public WebElement getselectprovidertoaddreferral1() {

		return selectprovidertoaddreferral1;

	}

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement referralto1;

	public WebElement getreferralto1() {

		return referralto1;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	private WebElement referralreasonradio1;

	public WebElement getrreferralreasonradio1() {

		return referralreason1;
	}

	@FindBy(xpath = "(//input[@placeholder='Enter the reason'])[1]")
	private WebElement referralreason1;

	public WebElement getreferralreason1() {

		return referralreasonradio1;
	}

	@FindBy(xpath = "//*[@id='rc-tabs-1-panel-2']/div[3]/div/div/div[2]/div[3]/div[3]/div/div/div/div")
	private WebElement sendrequestdiagnosis1;

	public WebElement getsendrequestdiagnosis1() {

		return sendrequestdiagnosis1;
	}

	@FindBy(xpath = "(//div[contains(@class,'ant-select-item-option-content')][contains(text(),'278.2 -')])[1]")
	private WebElement selectrequestdiagnosis1;

	public WebElement getselectrequestdiagnosis1() {

		return selectrequestdiagnosis1;
	}

	@FindBy(xpath = "(//input[contains(@class,'sc-iJRSss UHwXj')])[1]")
	private WebElement referraldate1;

	public WebElement getreferraldate1() {

		return referraldate1;
	}

	@FindBy(xpath = "(//span[contains(@class,'ant-select-selection-item')])[2]")
	private WebElement priorityselect1;

	public WebElement getpriorityselect1() {

		return priorityselect1;
	}

	@FindBy(xpath = "(//textarea[contains(@name,'ReferalTo')])[1]")
	private WebElement referralnotes1;

	public WebElement getreferralnotes1() {

		return referralnotes1;
	}

	@FindBy(xpath = "(//textarea[contains(@name,'ReferalTo')])[2]")
	private WebElement responsenotes11;

	public WebElement getresponsenotes11() {

		return responsenotes11;
	}

	@FindBy(xpath = "(//div[contains(@class,'ant-select-selection-overflow')])[3]")
	private WebElement searchreferraldiagnosis1;

	public WebElement getsearchreferraldiagnosis1() {

		return searchreferraldiagnosis1;
	}

	@FindBy(xpath = "//*[@id='rc-tabs-1-panel-2']/div[3]/div/div/div[2]/div[6]/div[2]/div/div/div/div")
	private WebElement selectreferraldiagnosis1;

	public WebElement getselectreferraldiagnosis1() {

		return selectreferraldiagnosis1;
	}

	@FindBy(xpath = "//*[@id='rc-tabs-1-panel-2']/div[3]/div/div/div[2]/div[7]/div[1]/div/div/div/div")
	private WebElement clickattachment;

	public WebElement getclickattachment() {

		return clickattachment;
	}

	@FindBy(xpath = "(//p[contains(@class,'sc-GVOUr krorDs')][normalize-space()='payer2'])[1]")
	private WebElement selectattachments;

	public WebElement getselectattachments() {

		return selectattachments;
	}

	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[4]")
	private WebElement responseattachment1;

	public WebElement getresponseattachment1() {

		return responseattachment1;
	}

	@FindBy(xpath = "/html/body/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div")
	private WebElement selectresponseattachment1;

	public WebElement getselectresponseattachment1() {

		return selectresponseattachment1;
	}

	@FindBy(xpath = "(//div[contains(@class,'ant-select-selection-overflow')])[9]")
	private WebElement responsediagnosis;

	public WebElement getresponsediagnosis() {

		return responsediagnosis;
	}

	@FindBy(xpath = "(//div[contains(text(),'outgoing_prescription_report_Invalid_date_To_Inval')])[4]")
	private WebElement responsediagnosisselect;

	public WebElement getresponsediagnosisselect() {

		return responsediagnosisselect;
	}

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	private WebElement savereferralout1;

	public WebElement getsavereferralout1() {

		return savereferralout1;
	}

	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")
	private WebElement cancelreferralout1;

	public WebElement getcancelreferralout1() {

		return cancelreferralout1;
	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[36]")
	private WebElement clickdownload1;

	public WebElement getclickdownload1() {

		return clickdownload1;
	}

	@FindBy(xpath = "(//h1[normalize-space()='Response'])[1]")
	private WebElement clickresponse1;

	public WebElement getclickresponse1() {

		return clickresponse1;
	}

	@FindBy(xpath = "(//span[@title='Transmit'])[1]")
	private WebElement clicktransmit1;

	public WebElement getclicktransmit1() {

		return clicktransmit1;
	}

	@FindBy(xpath = "(//span[@title='Transmit'])[1]")
	private WebElement selectmail1;

	public WebElement getselectmail1() {

		return selectmail;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")
	private WebElement searchtomail1;

	public WebElement getsearchtomail1() {

		return searchtomail1;
	}

	@FindBy(xpath = "(//div[contains(@class,'ant-select-item-option-content')][normalize-space()='mumbai vozo'])[1]")
	private WebElement selecttomail1;

	public WebElement getselecttomail1() {

		return selecttomail1;
	}

	@FindBy(xpath = "(//button[normalize-space()='Send Mail'])[1]")
	private WebElement sendemail1;

	public WebElement getsendemail1() {

		return sendemail1;
	}

	@FindBy(xpath = "(//div[contains(@class,'ant-select-item-option-content')][normalize-space()='Fax'])[1]")
	private WebElement selectfax1;

	public WebElement getselectfax1() {

		return selectfax;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")
	private WebElement searchproviderfax1;

	public WebElement getsearchproviderfax1() {

		return searchproviderfax1;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")
	private WebElement selectproviderfax1;

	public WebElement getselectproviderfax1() {

		return selectproviderfax1;
	}

	@FindBy(xpath = "(//button[normalize-space()='Send Fax'])[1]")
	private WebElement clicksendfax1;

	public WebElement getclicksendfax1() {

		return clicksendfax1;
	}

	@FindBy(xpath = "(//h1[normalize-space()='Response'])[1]")
	private WebElement clickcancelreferral1;

	public WebElement getclickcancelreferral1() {

		return clickcancelreferral1;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-2'])[1]")
	private WebElement clickreferralin;

	public WebElement getclickreferralin() {

		return clickreferralin;
	}

	/////////////// Referral Out //////////////////

	@FindBy(xpath = "(//h1[normalize-space()='Referral Management'])[1]")
	private WebElement referralmanagmenttitle;

	public WebElement getreferralmanagmenttitle() {

		return referralmanagmenttitle;

	}

	@FindBy(xpath = "(//h1[normalize-space()='Referral Management'])[1]")
	private WebElement clickeditreferralout;

	public WebElement getclickeditreferralout() {

		return clickeditreferralout;

	}

	@FindBy(xpath = "(//h1[normalize-space()='Referral Management'])[1]")
	private WebElement referraloutnotes;

	public WebElement getreferraloutnotes() {

		return referraloutnotes;

	}

	@FindBy(xpath = "(//h1[normalize-space()='Referral Management'])[1]")
	private WebElement referraloutupdate;

	public WebElement getreferraloutupdate() {

		return referraloutupdate;
	}

	@FindBy(xpath = "(//*[name()='svg'][@class='ref_mngment_close'])[1]")
	private WebElement referraloutcancel;

	public WebElement getreferraloutcancel() {

		return referraloutcancel;
	}

	@FindBy(xpath = "(//h1[normalize-space()='Referral Management'])[1]")
	private WebElement searchpatientreferral;

	public WebElement getsearchpatientreferral() {

		return searchpatientreferral;
	}

	@FindBy(xpath = "(//h1[normalize-space()='Referral Management'])[1]")
	private WebElement selectpatientreferral;

	public WebElement getselectpatientreferral() {

		return selectpatientreferral;

	}

	@FindBy(xpath = "(//h1[normalize-space()='Referral Management'])[1]")
	private WebElement selectreferralbyprovider;

	public WebElement getselectreferralbyprovider() {

		return selectreferralbyprovider;

	}

	@FindBy(xpath = "(//input[@id='rc_select_35'])[1]")
	private WebElement selectreferraltoprovider;

	public WebElement getselectreferraltoprovider() {

		return selectreferraltoprovider;

	}

	@FindBy(xpath = "(//input[@id='rc_select_35'])[1]")
	private WebElement selectreferralstatus;

	public WebElement getselectreferralstatus() {

		return selectreferralstatus;

	}

	@FindBy(xpath = "(//input[@id='billing-card-tran_from_date'])[1]")
	private WebElement sendfromdate;

	public WebElement getsendfromdate() {

		return sendfromdate;

	}

	@FindBy(xpath = "(//input[@id='billing-card-tran_from_date'])[1]")
	private WebElement sendfromdattoday;

	public WebElement getsendfromdattoday() {

		return sendfromdattoday;

	}

	@FindBy(xpath = "(//input[@id='billing-card-tran_to_date'])[1]")
	private WebElement sendtodate;

	public WebElement getsendtodate() {

		return sendtodate;

	}

	@FindBy(xpath = "(//input[@id='billing-card-tran_from_date'])[1]")
	private WebElement sendtodattoday;

	public WebElement getsendtodattoday() {

		return sendtodattoday;

	}

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	private WebElement clickupdatereferral;

	public WebElement getclickupdatereferral() {

		return clickupdatereferral;

	}

	@FindBy(xpath = "(//button[normalize-space()='Referral Out'])[1]")
	private WebElement clickreferralout;

	public WebElement getclickreferralout() {

		return clickreferralout;

	}

	@FindBy(xpath = "(//input[@id='rc_select_32'])[1]")
	private WebElement searchpatientaddreferral;

	public WebElement getsearchpatientaddreferral() {

		return searchpatientaddreferral;

	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	private WebElement selectpatientaddreferral;

	public WebElement getselectpatientaddreferral() {

		return selectpatientaddreferral;

	}

	@FindBy(xpath = "(//input[@id='rc_select_71'])[1]")
	private WebElement searchproviderfromaddreferral;

	public WebElement getsearchproviderfromaddreferral() {

		return searchproviderfromaddreferral;

	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	private WebElement selectproviderfromaddreferral;

	public WebElement getselectproviderfromaddreferral() {

		return selectproviderfromaddreferral;

	}

	@FindBy(xpath = "(//input[@id='rc_select_7'])[1]")
	private WebElement searchprovidertoaddreferral;

	public WebElement getsearchprovidertoaddreferral() {

		return searchprovidertoaddreferral;

	}

	@FindBy(xpath = "(//div[contains(text(),'Raghul Jain')])[1]")
	private WebElement selectprovidertoaddreferral;

	public WebElement getselectprovidertoaddreferral() {

		return selectprovidertoaddreferral;

	}

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement referralto;

	public WebElement getreferralto() {

		return referralto;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	private WebElement referralreasonradio;

	public WebElement getrreferralreasonradio() {

		return referralreason;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	private WebElement referralreason;

	public WebElement getreferralreason() {

		return referralreasonradio;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	private WebElement sendrequestdiagnosis;

	public WebElement getsendrequestdiagnosis() {

		return sendrequestdiagnosis;
	}

	@FindBy(xpath = "(//div[contains(@class,'ant-select-item-option-content')][contains(text(),'278.2 -')])[1]")
	private WebElement selectrequestdiagnosis;

	public WebElement getselectrequestdiagnosis() {

		return selectrequestdiagnosis;
	}

	@FindBy(xpath = "(//input[contains(@class,'sc-iJRSss UHwXj')])[1]")
	private WebElement referraldate;

	public WebElement getreferraldate() {

		return referraldate;
	}

	@FindBy(xpath = "(//span[contains(@class,'ant-select-selection-item')])[2]")
	private WebElement priorityselect;

	public WebElement getpriorityselect() {

		return priorityselect;
	}

	@FindBy(xpath = "(//textarea[contains(@name,'ReferalTo')])[1]")
	private WebElement referralnotes;

	public WebElement getreferralnotes() {

		return referralnotes;
	}

	@FindBy(xpath = "(//textarea[contains(@name,'ReferalTo')])[2]")
	private WebElement responsenotes1;

	public WebElement getresponsenotes1() {

		return responsenotes1;
	}

	@FindBy(xpath = "(//div[contains(@class,'ant-select-selection-overflow')])[3]")
	private WebElement searchreferraldiagnosis;

	public WebElement getsearchreferraldiagnosis() {

		return searchreferraldiagnosis;
	}

	@FindBy(xpath = "(//div[contains(@class,'ant-select-item-option-content')][contains(text(),'002.1 -')])[2]")
	private WebElement selectreferraldiagnosis;

	public WebElement getselectreferraldiagnosis() {

		return selectreferraldiagnosis;
	}

	@FindBy(xpath = "(//div[@class='sc-hKMtZM ZIYJR'])[1]")
	private WebElement clickinsurance;

	public WebElement getclickinsurance() {

		return clickinsurance;
	}

	@FindBy(xpath = "(//p[contains(@class,'sc-GVOUr krorDs')][normalize-space()='payer2'])[1]")
	private WebElement selectinsurance;

	public WebElement getselectinsurance() {

		return selectinsurance;
	}

	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[4]")
	private WebElement responseattachment;

	public WebElement getresponseattachment() {

		return responseattachment;
	}

	@FindBy(xpath = "/html/body/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div")
	private WebElement selectresponseattachment;

	public WebElement getselectresponseattachment() {

		return selectresponseattachment;
	}

	@FindBy(xpath = "(//div[contains(@class,'ant-select-selection-overflow')])[9]")
	private WebElement attachmentclick;

	public WebElement getattachmentclick() {

		return attachmentclick;
	}

	@FindBy(xpath = "(//div[contains(text(),'outgoing_prescription_report_Invalid_date_To_Inval')])[4]")
	private WebElement attachmentselect;

	public WebElement getattachmentselect() {

		return attachmentselect;
	}

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	private WebElement savereferralout;

	public WebElement getsavereferralout() {

		return savereferralout;
	}

	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")
	private WebElement cancelreferralout;

	public WebElement getcancelreferralout() {

		return cancelreferralout;
	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[36]")
	private WebElement clickdownload;

	public WebElement getclickdownload() {

		return clickdownload;
	}

	@FindBy(xpath = "(//span[@title='Transmit'])[1]")
	private WebElement clicktransmit;

	public WebElement getclicktransmit() {

		return clicktransmit;
	}

	@FindBy(xpath = "(//span[@title='Transmit'])[1]")
	private WebElement selectmail;

	public WebElement getselectmail() {

		return selectmail;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")
	private WebElement searchtomail;

	public WebElement getsearchtomail() {

		return searchtomail;
	}

	@FindBy(xpath = "(//div[contains(@class,'ant-select-item-option-content')][normalize-space()='mumbai vozo'])[1]")
	private WebElement selecttomail;

	public WebElement getselecttomail() {

		return selecttomail;
	}

	@FindBy(xpath = "(//button[normalize-space()='Send Mail'])[1]")
	private WebElement sendemail;

	public WebElement getsendemail() {

		return sendemail;
	}

	@FindBy(xpath = "(//div[contains(@class,'ant-select-item-option-content')][normalize-space()='Fax'])[1]")
	private WebElement selectfax;

	public WebElement getselectfax() {

		return selectfax;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")
	private WebElement searchproviderfax;

	public WebElement getsearchproviderfax() {

		return searchproviderfax;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")
	private WebElement selectproviderfax;

	public WebElement getselectproviderfax() {

		return selectproviderfax;
	}

	@FindBy(xpath = "(//button[normalize-space()='Send Fax'])[1]")
	private WebElement clicksendfax;

	public WebElement getclicksendfax() {

		return clicksendfax;
	}

	@FindBy(xpath = "(//h1[normalize-space()='Response'])[1]")
	private WebElement clickresponse;

	public WebElement getclickresponse() {

		return clickresponse;
	}

	@FindBy(xpath = "(//h1[normalize-space()='Response'])[1]")
	private WebElement clickcancelreferral;

	public WebElement getclickcancelreferral() {

		return clickcancelreferral;
	}

}
