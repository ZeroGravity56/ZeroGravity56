package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.TestBase;

public class AGFOHP extends TestBase {
	
	public AGFOHP(WebDriver driver) {
    	TestBase.driver=driver;
		PageFactory.initElements(driver, this);
    }
	
	@FindBy(id="header_td_clientmanagement")
    public WebElement clientMgmtLink;
	
	@FindBy(id="expand_dashboard")
    public WebElement showDashboard;
	
	@FindBy(xpath="//div[contains(text(),'LAUNCH APPS')]")
	public WebElement launchAppsHeader;
	
	@FindBy(id="LaunchAppviewAll")
    public WebElement viewAllLink;
	
	@FindBy(xpath="//div[text()='Manage Launch Apps']")
    public WebElement manageLaunchAppsHeader;
	
	@FindBy(id="jqManageLaunchApps")
    public WebElement manageLaunchAppsTable;
	
	@FindBy(xpath="//table[@id='jqManageLaunchApps']//tr[@class[not(contains(., 'jqgfirstrow'))]]") //[@role='row']
    public List<WebElement> viewAllTableRows;
	
	@FindBy(xpath="//table[@id='jqManageLaunchApps']//tr[@class[not(contains(., 'jqgfirstrow'))]]//td") //[@role='row']
    public List<WebElement> viewAllTableColumns;
	
	@FindBy(xpath="//div[contains(text(),'EXTERNAL LINKS')]")
	public WebElement extLinksHeader;
	
	@FindBy(xpath="//div[@id='dvExternalLinks']/ul/li/a")
    public List<WebElement> extLinks;
	
	@FindBy(id="externalLinksDataviewAll")
    public WebElement manageExtLink;
	
	@FindBy(id="jqExternalLinks")
    public WebElement manageExtLinksTable;
	
	@FindBy(xpath="//table[@id='jqExternalLinks']//tr[@class[not(contains(., 'jqgfirstrow'))]]")
    public List<WebElement> manageExtLinksTableRows;
	
	@FindBy(id="btnClose")
    public WebElement closeBtn;
	
	@FindBy(id="ext-gen162")
    public WebElement contWithThisSession;
	
	@FindBy(linkText="Client Central")
    public WebElement clientCentralLink;
	
	@FindBy(linkText="Salesforce")
    public WebElement salesforceLink;
	
	@FindBy(linkText="FINRA")
    public WebElement finraLink;
	
	@FindBy(linkText="MSRB")
    public WebElement msrbLink;
	
	@FindBy(linkText="Manage External Links")
    public WebElement melLink;
	
	@FindBy(id="AddLink")
    public WebElement addLink;
	
	@FindBy(id="LinkName")
    public WebElement linkName;
	
	@FindBy(id="LinkURL")
    public WebElement linkURL;
	
	@FindBy(id="Save")
    public WebElement saveBtn;
	
//	@FindBy(xpath="//div[@id='dvExternalLinks']/ul")
//    public List<WebElement> extLinks;
	
	@FindBy(linkText="Client Central")
    public WebElement ccLink;
	
	@FindBy(linkText="Document Management")
    public WebElement docMgmt;
	
	@FindBy(linkText="Morningstar")
    public WebElement msLink;
	
	@FindBy(linkText="back Button")
    public WebElement backBtn;
	
	@FindBy(linkText="NetX360")
    public WebElement netx360Link;
	
	@FindBy(linkText="ServiceNet")
    public WebElement servNetLink;
	
	@FindBy(linkText="Salesforce")
    public WebElement sfLink;
	
	@FindBy(linkText="Wealth Management")
    public WebElement wmLink;
	
	@FindBy(linkText="Office Management")
    public WebElement omLink;
	
	@FindBy(linkText="Forefield Marketing Library")
    public WebElement fmlLink;
	
	@FindBy(linkText="Advisor Affiliation")
    public WebElement aaLink;
	
	@FindBy(linkText="RegEd")
    public WebElement regedLink;
	
	@FindBy(id="REGEDacceptTerms")
    public WebElement regedCheckBox;
	
	@FindBy(id="txtREGEDSSN")
    public WebElement ssnTxt;
	
	@FindBy(id="ext-gen31")
    public WebElement continueBtn;
	
	@FindBy(id="ext-gen27")
    public WebElement cancelBtn;
	
	@FindBy(id="ext-gen18")
    public WebElement overlayCloseBtn;
	
	@FindBy(linkText="Generate eForms – Quik!")
    public WebElement genEformQuik;
	
	@FindBy(linkText="Log a Check")
    public WebElement logACheck;
	
//	@FindBy(id="accountSnapshotsearchClient")
//    public WebElement searchClient;
	
	@FindBy(id="accountSnapshotsearchAccount")
    public WebElement searchAccount;
	
	@FindBy(id="ext-gen136")
    public WebElement goBtn;//*[@id="ext-gen136"]/span/b
	
	@FindBy(xpath="//div[contains(@class, 'x-combo-list-inner')]/div[contains(@class, 'x-combo-list-item')]") // and (@id='ext-gen141' or @id='ext-gen143' or @id='ext-gen85')
    public List<WebElement> clientListDD;
	
	@FindBy(xpath="//div[contains(@class, 'x-combo-list-inner') and (@id='ext-gen154' or @id='ext-gen155' or @id='ext-gen146')]/div[contains(@class, 'x-combo-list-item')]")
    public List<WebElement> accListDD;
	
	@FindBy(xpath="//input[@id='accountSnapshotsearchAccount']/following::img") //contains(@id, 'ext-gen101') or contains(@id, 'ext-gen133'), //img[@id='ext-gen101' or @id='ext-gen143']
    public WebElement ddArrowBtn;
	
//	@FindBy((className="ext-mb-text") and (id="ext-gen189"))
	@FindBy(xpath="//span[contains(@class, 'ext-mb-text')]")
	public WebElement closedAccountAlert;
	
	@FindBy(xpath="//button[contains(@class, 'x-btn-text') and text()='OK']")
	public WebElement okAlertBtn;
	
	//*[@id="ext-gen33"]/div/table
	@FindBy(xpath="//table[@class='x-grid3-row-table']")
    public WebElement resTable;
	
	@FindBy(xpath="//input[contains(@id, 'searchClient')]")
	public WebElement searchClient;
	
	@FindBy(id="btnSearch")
	public WebElement searchBtn;
	
	@FindBy(xpath="//div[contains(@class, 'x-grid3-row')]")
	public List<WebElement> clientDetails;
	
	@FindBy(xpath="//div[contains(@class, 'x-grid3-row')][1]")
	public WebElement firstAcc;
	
	@FindBy(xpath="//div[contains(@class, 'x-grid3-row-table')]//tr")
	public List<WebElement> clientDetailsRows;
	
	@FindBy(xpath="//*[@id='ext-comp-1044' and contains(@name,'letterType') and contains(@type,'radio')]")
	public WebElement byClientRadioBtn;
	
	@FindBy(id="profile_header_title")
	public WebElement profileHeaderTitle;
	
	@FindBy(id="RepCombo")
	public WebElement advisorTextField;
	
	@FindBy(id="ext-gen46")
	public WebElement ddBtn;
	
	@FindBy(xpath="//div[contains(@class, 'x-combo-list-inner') and (@id='ext-gen48')]/div[contains(@class, 'x-combo-list-item')]")
	//*[@id="ext-gen48"]/div[1]
    public List<WebElement> advisorListDD;
	
	@FindBy(id="ext-gen38") ////*[@id="ext-gen38"]
	public WebElement selectBtn;
	
	@FindBy(xpath="//*[@id='dvHeader']/h2")
	public WebElement pageHeader;
	
	@FindBy(id="ddlBrokers")
	public WebElement ddlBrokers;
	
	
	
	
	
	
	@FindBy(linkText = "My Notifications")
	public WebElement mynotifications;

	@FindBy(linkText = "Manage MySubscription")
	public WebElement managesubscription;

	// @FindBy(id = "ext-gen46")
	@FindBy(xpath = "//button[text()='Expand All']")
//	@FindBy(xpath = "//button[contains(text(), 'Expand All')]")
	public WebElement expandAll;
	
	@FindBy(xpath = "//button[text()='Collapse All']")
	public WebElement collapseAll;
	
	@FindBy(xpath = "//button[text()='Save']")
	public WebElement saveservice;

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement submitservice;

	@FindBy(xpath = "//*[@id='ext-gen46']/div[1]/table/tbody/tr/td[1]/div")
	public WebElement mailsubject;

	@FindBy(xpath = "//*[@id='ext-gen46']/div[1]/table/tbody/tr/td[2]/div")
	public WebElement submitdate;

	@FindBy(xpath = "//*[@id='ext-gen77']")
	public WebElement notificationmail;
	
	@FindBy(xpath="//*[contains(text(),'[Free]')]/following::td[2]/div[@unselectable='on']"
			+ "/div[@class='x-grid3-check-col x-grid3-cc-chkEnroll']")
	public List<WebElement> svclist;
	
	@FindBy(xpath = "//div[contains(@class,'x-list-body-inner')]//dl")
	public List<WebElement> listofclients;
	
	@FindBy(xpath = "//input[@id='ext-comp-1040']")
	public WebElement lastcompletedweek;
	
	@FindBy(xpath = "//button[text()='View']")
	public WebElement viewBtn;
	
//	@FindBy(xpath = "//div[@id='ext-gen28' or @id='ext-gen41']")
//	@FindBy(xpath = "//div[contains(@class, 'x-tab-panel-body')]")
	@FindBy(id="actActReport-panel")
	public WebElement accActReport;
	
	@FindBy(id="report-panel")
	public WebElement clReport;
	
//	@FindBy(id = "ext-gen36")
	@FindBy(xpath = "//img[contains(@class, 'x-form-arrow-trigger')]")
	public WebElement repdropdown;
	
	@FindBy(xpath = "//div[@class='x-combo-list-item']")
	public List<WebElement> rlist;
	
	@FindBy(xpath = "//button[contains(text(),'Search')]")
	public WebElement reportSearchBtn;
	
	@FindBy(xpath = "//*[@class='x-tree-root-ct x-tree-no-lines']"
			+ "//img[contains(@class,'x-tree-ec-icon x-tree-elbow')]")
	public WebElement repcdchkbox;
	
	@FindBy(xpath = "//*[@class='x-tree-node-ct']//img[contains(@class,'x-tree-ec-icon x-tree-elbow')]")
	public WebElement clientnmchkbox;
	
	@FindBy(xpath = "//*[@class='x-tree-node-ct']//img[contains(@class,'x-tree-ec-icon x-tree-elbow-end-plus')]")
	public WebElement shortnmchkbox;
	
	@FindBy(xpath = "//div[contains(@class,'x-combo-list-item')]")
	public List<WebElement> rlist2;
	
	
	//*************************************************************************************************
	//Training and Events
	//*************************************************************************************************
	
	
	@FindBy(id = "header_td_training&events")
	public WebElement trainingEventsLink;

	@FindBy(xpath = "//div[text()=' Upcoming Events ']")
	public WebElement upcomgEventHeader;

	@FindBy(linkText = "Administrative")
	public WebElement administrativeLnk;

	@FindBy(linkText = "Advisory Services")
	public WebElement adServicesLnk;

	@FindBy(linkText = "Business Development")
	public WebElement bizDevelopmentLnk;

	@FindBy(linkText = "Marketing")
	public WebElement marketingLnk;

	@FindBy(linkText = "Products")
	public WebElement productsLnk;

	@FindBy(linkText = "Technology")
	public WebElement technologyLnk;

	@FindBy(linkText = "View All")
	public WebElement viewAllLnk;
	
	@FindBy(className="loadmask-msg")
	public WebElement loadingText;
}
	
	
	
