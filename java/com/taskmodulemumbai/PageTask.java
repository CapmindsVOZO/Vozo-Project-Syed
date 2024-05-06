package com.taskmodulemumbai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageTask {
	public WebDriver driver;

	public PageTask(WebDriver driver2) {
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

	@FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root mr-t-5 taskaddcolor'])[1]")
	private WebElement ClickTaskButton;

	public WebElement getClickTaskButton() {
		return ClickTaskButton;
	}

	@FindBy(xpath = "(//div[@class='tk-cd-right-btn tsk_btn_edt'])[1]")
	private WebElement ClickEditButton;

	public WebElement getClickEditButton() {
		return ClickEditButton;
	}

	@FindBy(xpath = "(//input[@id='tsk_edt-inp_cat'])[1]")
	private WebElement EnterNewCategory;

	public WebElement getEnterNewCategory() {
		return EnterNewCategory;
	}

	@FindBy(xpath = "(//button[normalize-space()='New Category'])[1]")
	private WebElement ClickNewCategory;

	public WebElement getClickNewCategory() {
		return ClickNewCategory;
	}

	@FindBy(xpath = "//div[@class='add-task-close']//*[name()='svg']")
	private WebElement clickClose;

	public WebElement getclickClose() {
		return clickClose;
	}

	@FindBy(xpath = "(//div[@class='tk-cd-right-btn tsk_crd-sta_edt'])[1]")
	private WebElement clickStatusEdit;

	public WebElement getclickStatusEdit() {
		return clickStatusEdit;
	}

	@FindBy(xpath = "(//input[@id='tsk_stat-inp_nm'])[1]")
	private WebElement EnterStausName;

	public WebElement getEnterStausName() {
		return EnterStausName;
	}

	@FindBy(xpath = "(//span[@title='Select Status'])[1]")
	private WebElement ClickStatus;

	public WebElement getClickStatus() {
		return ClickStatus;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='Open'])[1]")
	private WebElement SelectInProgress;

	public WebElement getSelectInProgress() {
		return SelectInProgress;
	}

	@FindBy(xpath = "(//span[@title='Select Category'])[1]")
	private WebElement ClickCategory;

	public WebElement getClickCategory() {
		return ClickCategory;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='Hello'])[1]")
	private WebElement SelectFever;

	public WebElement getSelectFever() {
		return SelectFever;
	}

	@FindBy(xpath = "(//button[normalize-space()='New Status'])[1]")
	private WebElement ClickNewsStatses;

	public WebElement getClickNewsStatses() {
		return ClickNewsStatses;
	}

	@FindBy(xpath = "(//*[name()='svg'][@class='ad-tk-iccl-icon'])[1]")
	private WebElement ClickClose;

	public WebElement getClickClose() {
		return ClickClose;
	}

	@FindBy(xpath = "//button[contains(text(),'Task Template')]")
	private WebElement ClickEditTaskTemplate;

	public WebElement getClickEditTaskTemplate() {
		return ClickEditTaskTemplate;
	}

	@FindBy(xpath = "(//button[@name='tsk_cr-btn_tmplt'])[1]")
	private WebElement ClickCreateNewTemplate;

	public WebElement getClickCreateNewTemplate() {
		return ClickCreateNewTemplate;
	}

	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement EnterTitle;

	public WebElement getEnterTitle() {
		return EnterTitle;
	}

	@FindBy(xpath = "(//select)[5]")
	private WebElement CickAssignee;

	public WebElement getCickAssignee() {
		return CickAssignee;
	}

	@FindBy(xpath = "(//span[@title='Select'][normalize-space()='Select'])[1]")
	private WebElement selectTech1Test;

	public WebElement getselectTech1Test() {
		return selectTech1Test;
	}

	@FindBy(xpath = "(//div[contains(text(),'Production Vozo')])[1]")
	private WebElement selectTech1Test1;

	public WebElement getselectTech1Test1() {
		return selectTech1Test1;
	}

	@FindBy(xpath = "(//input[@id='tsk_crtTmp-inp_Nm'])[1]")
	private WebElement EnterTemplateName;

	public WebElement getEnterTemplateName() {
		return EnterTemplateName;
	}

	@FindBy(xpath = "(//input[@id='tsk_cr-inp_day'])[1]")
	private WebElement EnterDay;

	public WebElement getEnterDay() {
		return EnterDay;
	}

	@FindBy(xpath = "(//input[@id='tsk_cr-inp_hrs'])[1]")
	private WebElement EnterHour;

	public WebElement getEnterHour() {
		return EnterHour;
	}

	@FindBy(xpath = "(//input[@id='tsk_cr-inp_min'])[1]")
	private WebElement EnterMin;

	public WebElement getEnterMin() {
		return EnterMin;
	}

	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[6]")
	private WebElement Selectcategory;

	public WebElement getSelectcategory() {
		return Selectcategory;
	}

	@FindBy(xpath = "(//div[contains(text(),'Document')])[2]")
	private WebElement Selectcategory1;

	public WebElement getSelectcategory1() {
		return Selectcategory1;
	}

	@FindBy(xpath = "//option[normalize-space()='capminds']")
	private WebElement SelectCapminds;

	public WebElement getSelectCapminds() {
		return SelectCapminds;
	}

	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[7]")
	private WebElement ClickPriority;

	public WebElement getClickPriority() {
		return ClickPriority;
	}

	@FindBy(xpath = "(//div[contains(text(),'Low')])[1]")
	private WebElement ClickPriority1;

	public WebElement getClickPriority1() {
		return ClickPriority1;
	}

	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[8]")
	private WebElement Selectmedium;

	public WebElement getSelectmedium() {
		return Selectmedium;
	}

	@FindBy(xpath = "(//div[contains(text(),'Open')])[3]")
	private WebElement Selectmedium1;

	public WebElement getSelectmedium1() {
		return Selectmedium1;
	}

	@FindBy(xpath = "//body/div[4]/div[1]/div[1]/div[1]/form[1]/div[2]/div[7]/div[2]/select[1]")
	private WebElement ClickStatus1;

	public WebElement getClickStatus1() {
		return ClickStatus1;
	}

	@FindBy(xpath = "//option[contains(text(),'Arrived')]")
	private WebElement SelectArrived;

	public WebElement getSelectArrived() {
		return SelectArrived;
	}

	@FindBy(xpath = "(//textarea[@class='tk-temp-not form-control'])[1]")
	private WebElement EnterNotes;

	public WebElement getEnterNotes() {
		return EnterNotes;
	}

	@FindBy(xpath = "//button[normalize-space()='Save']")
	private WebElement SelectSave;

	public WebElement getSelectSave() {
		return SelectSave;
	}

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement SelectCancel;

	public WebElement getSelectCancel() {
		return SelectCancel;
	}

	@FindBy(xpath = "(//button[@class='bck-btn btn btn-primary'])[1]")
	private WebElement ClickBack;

	public WebElement getClickBack() {
		return ClickBack;
	}
////////////////TASK  FILTERS  ///////////////

	@FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root mr-t-5 taskaddcolor'])[1]")

	private WebElement Taskcli;

	public WebElement getTaskcli() {
		return Taskcli;
	}

	@FindBy(xpath = "(//span[@title='All'][normalize-space()='All'])[1]")

	private WebElement seleassign;

	public WebElement getseleassign() {

		return seleassign;
	}
	
	@FindBy(xpath = "(//div[contains(text(),'Production Vozo')])[1]")

	private WebElement seleassign1;

	public WebElement getseleassign1() {

		return seleassign1;
	}

	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[2]")

	private WebElement seleprio;

	public WebElement getseleprio() {

		return seleprio;
	}
	
	@FindBy(xpath = "(//div[contains(text(),'Low')])[1]")

	private WebElement seleprio1;

	public WebElement getseleprio1() {

		return seleprio1;
	}

	@FindBy(xpath = "(//span[@title='All Due Dates'])[1]")

	private WebElement duedate;

	public WebElement getduedate() {

		return duedate;
	}

	@FindBy(xpath = "(//button[@id='tsk_mng-btn_arc'])[1]")

	private WebElement archi;

	public WebElement getarchi() {

		return archi;
	}

	@FindBy(xpath = "(//button[normalize-space()='Reset Filters'])[1]")

	private WebElement resfil;

	public WebElement getresfil() {

		return resfil;
	}

	@FindBy(xpath = "(//select[@class='tk-frmc-wid arrow-adj form-control'])[1]")

	private WebElement seletask;

	public WebElement getseletask() {

		return seletask;
	}

////////////////ADD NEW TASK  ///////////////

	@FindBy(xpath = "(//button[@id='tsk_mng-btn_nwTsk'])[1]")

	private WebElement addnewtas;

	public WebElement getaddnewtas() {

		return addnewtas;
	}

	@FindBy(xpath = "(//span[@title='Select one'])[1]")

	private WebElement seletem;

	public WebElement getseletem() {

		return seletem;
	}
	
	@FindBy(xpath = "(//div[contains(text(),'Test12')])[1]")

	private WebElement seletem1;

	public WebElement getseletem1() {

		return seletem1;
	}

	@FindBy(xpath = "(//select[@id='tsk_ad-sel_slCat'])[1]")

	private WebElement catsele;

	public WebElement getcatsele() {

		return catsele;
	}

	@FindBy(xpath = "(//select[@id='tsk_ad-sel_slSts'])[1]")

	private WebElement statse;

	public WebElement getstatse() {

		return statse;
	}

	@FindBy(xpath = "(//select[@class='form-control'])[5]")

	private WebElement cate;

	public WebElement getcate() {

		return cate;
	}

	@FindBy(xpath = "(//select[@class='form-control'])[6]")

	private WebElement stat;

	public WebElement getstat() {

		return stat;
	}

	@FindBy(xpath = "(//span[@title='Add'])[1]")

	private WebElement addass;

	public WebElement getaddass() {

		return addass;
	}
	
	@FindBy(xpath = "(//div[contains(text(),'Patient')])[1]")

	private WebElement addass1;

	public WebElement getaddass1() {

		return addass1;
	}

	@FindBy(xpath = "(//div[contains(text(),'Patient')])[1]")

	private WebElement patna1;

	public WebElement getpatna1() {

		return patna1;
	}

	@FindBy(xpath = "(//span[contains(text(),' Search Patient')])[1]")

	private WebElement patna;

	public WebElement getpatna() {

		return patna;
	}

	@FindBy(xpath = "(//div)[585]")

	private WebElement selepat;

	public WebElement getselepat() {

		return selepat;
	}

	@FindBy(xpath = "(//button[@id='tsk_ad-btn_sve'])[1]")

	private WebElement clisav;

	public WebElement getclisav() {

		return clisav;
	}

	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")

	private WebElement closetask;

	public WebElement getclosetask() {

		return closetask;
	}

	@FindBy(xpath = "(//button[normalize-space()='View All Tasks'])[1]")

	private WebElement selectviewall;

	public WebElement getselectviewall() {

		return selectviewall;
	}

	@FindBy(xpath = "(//div[@class='vw-tk-back'])[1]")

	private WebElement selectback;

	public WebElement getselectback() {

		return selectback;
	}

	@FindBy(xpath = "(//*[name()='svg'][@class='vw-tk-ed-btn'])[1]")

	private WebElement clied;

	public WebElement getclied() {

		return clied;
	}

	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")

	private WebElement cliclo;

	public WebElement getcliclo() {

		return cliclo;
	}

}
