package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.TestBase;

public class Survaellience extends TestBase {
	
	public Survaellience(WebDriver driver) {
    	TestBase.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[text()='BackOffice']/parent::a")
    public WebElement backOfficeLink2;
	
	@FindBy(xpath="//a[text()='Surveillance']")
    public WebElement SurvaeillenceLink4;
	
	
	@FindBy(xpath="//a[@title='Home']")
    public WebElement HomeTab2;
			
	@FindBy(xpath="//input[@type='search']//preceding::div[@class='ng-input']")
	public WebElement ReviewNumberDropdown1;
	
	
	/*public void select_ReviewNumber(int ReviewNumbeID) {
		WebElement Dropdown_ReviewNumber;
		Dropdown_ReviewNumberArrow.click();
		try { Thread.sleep(2000);}
		catch (InterruptedException e) {}

		Object ReviewNumberList;
		for(WebElement ReviewNumber : ReviewNumberList){
			Object ReviewNumberID;
			if(ReviewNumber.getText().equals(ReviewNumberID)) {
				ReviewNumber.click();	
				try { Thread.sleep(3000);}
				catch (InterruptedException e) {}
				break;
			}
		}
	}
	
*/

	@FindBy(xpath="//input[@type='search']//preceding::div[@placeholder='Search by ReviewNumber']")
	public WebElement ReviewNumber1;
	
	@FindBy(xpath = "//*[contains(@class,'search-field')][@type='search']")
	public WebElement OpenReviewsExportButton13;
	
	@FindBy(xpath = "(//*[(@title='View')])[2]")
	public WebElement ViewTab;

	
		@FindBy(xpath="//a[text()='Surveillance']")
	    public WebElement surveillanceLink;
		
		@FindBy(xpath="//span[text()='BackOffice']/parent::a")
	    public WebElement backOfficeLink;
		
		@FindBy(xpath="//a[@title='Home']")
	    public WebElement HomeTab;
				
		@FindBy(xpath="//input[@type='search']//preceding::div[@class='ng-input']")
		public WebElement AccountNumberDropdown;
		
		@FindBy(xpath="//input[@type='search']//preceding::div[@class='ng-input']")
		public WebElement ReviewNumberDropdown;
		
		@FindBy(xpath="//input[@type='search']//preceding::div[@class='ng-input']")
		public WebElement ClientNameDropdown;
		
		@FindBy(xpath="//input[@type='search']//preceding::div[@class='ng-input']")
		public WebElement RepCodeDropdown;
		
		@FindBy(xpath="//*[@id='openReviews']")
		public WebElement OpenReviewsDetailsPage;
		
		@FindBy(xpath="//*[@id='my-drafts']")
		public WebElement MyDraftsDetailsPage;
		
		@FindBy(xpath="//*[@id='myreviews']")
		public WebElement OpenMyReviewsDetailsPage;
		
		@FindBy(xpath="//*[@id='escalated']")
		public WebElement OpenEscalatedDetailsPage;
		
		@FindBy(xpath="//*[@id='All']")
		public WebElement OpenAllPage;
	
		@FindBy(id="New")
	    public WebElement NewTabOnClick;
		
		@FindBy(id="Import")
	    public WebElement Import;
		
		@FindBy(id="Clear All")
	    public WebElement ClearAll;
		
		@FindBy(xpath="//*[@class='page-item disabled']")
		public WebElement downloadExcelPagination;
		
		@FindBy(xpath="//a[@title='Data Export']")
	    public WebElement DataExportTab;
		
		@FindBy(xpath = "//*[contains(@class,'desktop-table__table-th-sort-button table_design')]/following::div/input[contains(@src,'Review Name')]")
		public WebElement ReviewNameButton44;
		
		@FindBy(xpath = "//*[contains(@class,'desktop-table__table-th-sort-button table_design')]/following::div/input[contains(@src,'Open Reviews Export')]")
		public WebElement OpenReviewsExportButton12;
		
		@FindBy(xpath = "//*[contains(@class,'class='desktop-table__table-th-sort-button table_design')]/following::div/input[contains(@src,'Comment Export')]")
		public WebElement CommentExportButton31;
	
		@FindBy(xpath = "//*[contains(@class,'desktop-table__table-th-sort-button table_design')]/following::div/input[contains(@src,'Custom Review Export')]")
		public WebElement CustomReviewExportButton41;
		
		@FindBy(xpath = "//*[contains(@class,'desktop-table__table-th-sort-button table_design')]/following::div/input[contains(@src,'Email Export')]")
		public WebElement EmailExportExportButton51;
		
		@FindBy(xpath = "//*[contains(@class,'desktop-table__table-th-sort-button table_design')]/following::div/input[contains(@src,'Trade Desk Export')]")
		public WebElement TradeDeskExportButton61;
		
		@FindBy(xpath="//a[@title='Profile']")
	    public WebElement ProfileTab;
		
		@FindBy(xpath="//a[@title='Open Profile']")
	    public WebElement OpenProfileTab;
		
		@FindBy(xpath="//a[@title='My Profile']")
	    public WebElement MyProfileTab;
		
		@FindBy(xpath="//a[@title='All']")
	    public WebElement AllTab;
		
		@FindBy(id="New")
	    public WebElement New;
	
		@FindBy(id="Clear All")
	    public WebElement ClearAll1;
	
		@FindBy(xpath="//a[@title='Notification History']")
	    public WebElement NotificationHistoryTab;
		
		@FindBy(xpath="//a[@title='DownloadButtonClick']")
	    public WebElement DownloadButtonClick;
		
		@FindBy(xpath="//a[@title='RequestCategory']")
	    public WebElement RequestCategory;
		
		@FindBy(xpath="//a[@title='RequestFileName']")
	    public WebElement RequestFileName;
		
		@FindBy(xpath="//a[@title='CreatedBy']")
	    public WebElement CreatedBy;
		
		@FindBy(xpath="//a[@title='CreatedDate']")
	    public WebElement CreatedDate;
		
		@FindBy(xpath="//a[@title='VerifyFirm']")
	    public WebElement VerifyFirm;
		
		@FindBy(xpath="//a[@title='ReviewCount']")
	    public WebElement ReviewCount;
		
		@FindBy(xpath="//a[@title='MutualFundTransaction']")
	    public WebElement MutualFundTransaction1;
	
		@FindBy(xpath="//a[@title='OpenProfile2']")
	    public WebElement OpenProfile2;
	
		
		@FindBy(xpath="//a[@title='ReviewCount']")
	    public WebElement EscalatedDetailsPage;
		
		@FindBy(xpath="//a[@title='ProfileDetails']")
	    public WebElement ProfileDetails;
		
		@FindBy(xpath="//a[@title='ReviewCount']")
	    public WebElement ExcelDownloadWIthSingleAndMultipleFilter;
		
		@FindBy(xpath="//a[@title='DataExport']")
	    public WebElement DataExport;
		
		@FindBy(xpath="//a[@title='ReviewStatus']")
	    public WebElement ReviewStatus;
		
		@FindBy(xpath="//a[@title='ReviewPeriod']")
	    public WebElement ReviewPeriod;
		
		@FindBy(xpath="//a[@title='ReviewPeriod']")
	    public WebElement IndexingRecordPerPage;
		
		@FindBy(xpath="//a[@title='ReviewInfoReviewComment']")
	    public WebElement ReviewInfoReviewComment;
		
		@FindBy(xpath="//a[@title='TrendsInfo']")
	    public WebElement TrendsInfo;
		
		@FindBy(xpath="//a[@title='ReviewDate']")
	    public WebElement ReviewDate;
		
		@FindBy(xpath="//a[@title='CountAndProfileDisplay']")
	    public WebElement CountAndProfileDisplay;
		
		@FindBy(xpath="//a[@title='ProfileNumberDropdownWithSearchFunction']")
	    public WebElement ProfileNumberDropdown;
		
		@FindBy(xpath="//a[@title='ProfileNumberDropdownWithSearchFunction']")
	    public WebElement OpenProfile;
		
		@FindBy(xpath="//a[@title='ProfileNumberDropdownWithSearchFunction']")
	    public WebElement RecordIterations;
		
		@FindBy(xpath = "//*[contains(@class,'desktop-table__table-th-sort-button table_design')]/following::div/input[contains(@src,'Firm Id')]")
		public WebElement FirmId1;
		
		@FindBy(xpath = "//*[contains(@class,'desktop-table__table-th-sort-button table_design')]/following::div/input[contains(@src,'Review Type')]")
		public WebElement ReviewType;
		
		@FindBy(xpath = "//*[contains(@class,'desktop-table__table-th-sort-button table_design')]/following::div/input[contains(@src,'Review Year')]")
		public WebElement ReviewYear1;
		
		@FindBy(xpath = "//*[contains(@class,'desktop-table__table-th-sort-button table_design')]/following::div/input[contains(@src,'Review Month')]")
		public WebElement ReviewMonth;
		
		@FindBy(xpath = "//*[contains(@class,'desktop-table__table-th-sort-button table_design')]/following::div/input[contains(@src,'Triggered Date')]")
		public WebElement TriggeredDate;
		
		@FindBy(xpath = "//*[contains(@class,'desktop-table__table-th-sort-button table_design')]/following::div/input[contains(@src,'Triggered By')]")
		public WebElement TriggeredBy;
		
		@FindBy(xpath="//a[@title='MutualFundWaivers']")
	    public WebElement MutualFundWaiversTab;
		
		@FindBy(xpath =  "//div[@id='ngcontent-ng-cli-universal-c224']")
		public WebElement MutualFundWaivers;
		
		@FindBy(xpath="//*[contains(text(),'Fund Family ')]")
		public WebElement FundFamily1;
		
		@FindBy(xpath="//*[contains(text(),'Fund Name ')]")
		public WebElement FundName;
		
		@FindBy(xpath="//*[contains(text(),'Share Class ')]")
		public WebElement ShareClass;
		
		@FindBy(xpath="//*[contains(text(),'Waiver Eligible  ')]")
		public WebElement WaiverEligible;
		
		@FindBy(xpath="//*[contains(text(),'AshareEQ Family ')]")
		public WebElement AShareEQ;
		
		@FindBy(xpath="//*[contains(text(),'Symbol1 Family ')]")
		public WebElement Symbol1;
		
		@FindBy(xpath = "(//img[contains(@src,'export to excel')])[2]")
		public WebElement ExportToExcel1;
		
		@FindBy(xpath = "(//img[contains(@src,'Firm Restricted Securities')])[2]")
		public WebElement FirmRestrictedSecuritiestab;
		
		@FindBy(xpath = "(//img[contains(@src,'Firm Restricted Securities')])[2]")
		public WebElement FirmRestrictedSecurities1;
		
		@FindBy(xpath="//*[contains(text(),'Cusip Number ')]")
		public WebElement CusipNumber;
		
		@FindBy(xpath="//*[contains(text(),'Symbol2 ')]")
		public WebElement Symbol2 ;
		
		@FindBy(xpath="//*[contains(text(),'ProductType ')]")
		public WebElement ProductType;
		
		@FindBy(xpath="//*[contains(text(),'ProductCategory')]")
		public WebElement ProductCategory;
		
		@FindBy(xpath="//*[contains(text(),'RestrictionStatus')]")
		public WebElement RestrictionStatus;
	
		
		@FindBy(id="New")
	    public WebElement AddNewTab;
	
		@FindBy(xpath="//a[@title='Bulk Import Details']")
	    public WebElement BulkImportDetailstab;
		
		@FindBy(xpath="//a[@title='Bulk Workflow Action']")
	    public WebElement BulkWorkflowActionTab;
		
		@FindBy(id="ImportTabOnCLick")
	    public WebElement ImportTabOnCLick;
		
		@FindBy(id="ClearAllTabOnClick")
	    public WebElement ClearAllTabOnClick;
		
		
		
		
    }
