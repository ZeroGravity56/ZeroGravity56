    package steps;

    import static org.hamcrest.MatcherAssert.assertThat;

    import java.io.IOException;
    import java.text.ParseException;
    import java.text.SimpleDateFormat;
    import java.util.Date;

    import org.openqa.selenium.By;
    import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import pageobjects.Survaellience;
    import utils.CommonUtilty;


    public class SurvaellianceAutomationSteps extends Survaellience{
    	
    	SimpleDateFormat dt, dt1;
    	long startTime;
        CommonUtilty tu;
        String fromDt, toDt, Cdt;
        int i, itemsSize, textsSize, pieItemsSize, advSize;
		private WebElement FirmId;
        
        public SurvaellianceAutomationSteps(){
    		super(driver);
    		tu = new CommonUtilty();
    	}

        public void navigateToBackOffice2() throws InterruptedException {
    		// TODO Auto-generated method stub
    		 tu.webAppObject(driver, backOfficeLink2 , "click", "", 1, "SA", "navigateToBackOffice", 1);
    			
    	}


	 public void clickOnHomeTab1() throws InterruptedException
	 {
		 tu.webAppObject(driver, HomeTab2, "click", "", 1, "SA", "HomeTab2", 1);

	 }
	
	 
	 public void VerifyViewTab() throws InterruptedException
	 {
		 tu.webAppObject(driver, ViewTab, "click", "", 1, "SA", "ViewTab", 1);

	 }
	 

	public void ReviewNumberDropdown1() throws InterruptedException
	{
		tu.webAppObject(driver, ReviewNumberDropdown1 , "click", "", 1, "SA", "ReviewNumberDropdown1", 1);

    }	

	public void searchReviewNumber() throws InterruptedException {
		// TODO Auto-generated method stub
		 tu.webAppObject(driver, ReviewNumber1 , "click", "", 1, "SA", "searchReviewNumber", 1);
		// String ExpectedTitle = "";
	//	 Assert.assertEquals(ActualTitle, ExpectedTitle);
			
	}

	 public void navigateToSurveillancelink() throws InterruptedException 
	 {
	    	tu.webAppObject(driver, backOfficeLink, "click", "", 1, "SA", "backOfficeLink", 1);
	    	tu.webAppObject(driver, surveillanceLink, "click", "", 1, "SA", "surveillanceLink", 1);
	    	tu.switchToWindowByTitle("Surveillance Automation");
	    	Thread.sleep(200);
	    	System.out.println("Navigated to SA");
	 }

	 
	 public void clickOnHomeTab() throws InterruptedException
	 {
		 tu.webAppObject(driver, HomeTab, "click", "", 1, "SA", "HomeTab", 1);

	 }


	public void verifyDropdownAccountNumber() throws InterruptedException

	{
		 tu.webAppObject(driver, AccountNumberDropdown , "click", "", 1, "SA", "DropdownAccountNumber", 1);
		
	}
	

	public void ReviewNumberDropdown() throws InterruptedException {
		// TODO Auto-generated method stub
		 tu.webAppObject(driver, ReviewNumberDropdown , "click", "", 1, "SA", "ReviewNumberDropdown", 1);
			
	}


	public void ClientNameDropdown() throws InterruptedException {
		// TODO Auto-generated method stub
		 tu.webAppObject(driver, ClientNameDropdown , "click", "", 1, "SA", "ClientNameDropdown", 1);
			
	}


	public void RepCodeDropdown() throws InterruptedException {
		// TODO Auto-generated method stub
		 tu.webAppObject(driver, RepCodeDropdown , "click", "", 1, "SA", "RepCodeDropdown", 1);
			
		
	}

	public void verifyOpenReviewDetailsPage() throws InterruptedException {
		
		tu.webAppObject(driver, OpenReviewsDetailsPage, "click", "", 1, "SA", "OpenReviewsDetailsPage", 1);

	}
	
	public void verifyMyDraftsDetailsPage() throws InterruptedException {
		
		tu.webAppObject(driver, MyDraftsDetailsPage, "click", "", 1, "SA", "MyDraftsDetailsPage", 1);

	}

	public void verifyMyReviewesDetailsPage() throws InterruptedException {
		
		tu.webAppObject(driver, OpenMyReviewsDetailsPage, "click", "", 1, "SA", "MyDraftsDetailsPage", 1);

	}


	public void verifyEscalatedAllDetailsPage() throws InterruptedException  {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, OpenEscalatedDetailsPage, "click", "", 1, "SA", "OpenEscalatedDetailsPage", 1);

		
	}


	public void verifyAllPage() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, OpenAllPage, "click", "", 1, "SA", "HomeTab", 1);

	}


	public void verifyNewTabOnClick() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, NewTabOnClick, "click", "", 1, "SA", "NewTab", 1);

	}


	public void downloadExcelPagination() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, downloadExcelPagination, "click", "", 1, "SA", "downloadExcelPagination", 1);

	}


	public void verifyReviewName() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, downloadExcelPagination, "click", "", 1, "SA", "downloadExcelPagination", 1);

	}
	

	public void verifyOpenReview() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, OpenReviewsDetailsPage, "click", "", 1, "SA", "OpenReviewsDetailsPage", 1);

	}


	public void verifyCommentExport() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, CommentExportButton31, "click", "", 1, "SA", "CommentExportButton31", 1);

	}
	
	public void verifyCustomReview() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, CustomReviewExportButton41, "click", "", 1, "SA", "CustomReviewExportButton41;", 1);

	}


	public void verifyTradeDesk() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, TradeDeskExportButton61, "click", "", 1, "SA", "TradeDeskExportButton61;", 1);

	}


	public void verifyOpenFirmID() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, FirmId1, "click", "", 1, "SA", "FirmId1;", 1);
		if(FirmId.isDisplayed())
			System.out.println("Firm id displayed");
		}

	


	public void verifyReviewType() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, ReviewType, "click", "", 1, "SA", "ReviewType;", 1);
		if(ReviewType.isDisplayed())
			System.out.println("Review Type  displayed");
		}
	

	public void OpenReviewDetailsPage() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, OpenReviewsDetailsPage, "click", "", 1, "SA", "OpenReviewsDetailsPage;", 1);
		
	}

	public void OpenMyDraftDetailsPage() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, MyDraftsDetailsPage, "click", "", 1, "SA", "MyDraftsDetailsPage;", 1);
		
	}


	public void OpenMyReviewDetailsPage() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, OpenMyReviewsDetailsPage, "click", "", 1, "SA", "OpenMyReviewsDetailsPage;", 1);
		
	}
	
	public void OpenEscalatedDetailsPage() throws InterruptedException  {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, OpenEscalatedDetailsPage, "click", "", 1, "SA", "OpenEscalatedDetailsPage;", 1);
		
	}


	public void verifyReviewMonth() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, ReviewMonth, "click", "", 1, "SA", "ReviewMonth", 1);
		if(ReviewMonth.isDisplayed())
			System.out.println("Review Month  displayed");
		
	}


	public void verifyTriggeredDate() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, TriggeredDate, "click", "", 1, "SA", "TriggeredDate", 1);
		if(TriggeredDate.isDisplayed())
			System.out.println("TriggeredDate displayed");
		
	}


	public void verifyReviewYear() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, TriggeredDate, "click", "", 1, "SA", "TriggeredDate", 1);
		if(TriggeredDate.isDisplayed())
			System.out.println("TriggeredDate displayed");
		
	}


	public void verifyMutualFundWaivers() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, MutualFundWaiversTab, "click", "", 1, "SA", "MutualFundWaiversTab", 1);
		if(TriggeredDate.isDisplayed())
			System.out.println("MutualFundWaiversTab");
	
	}


	public void verifyFundFamily()  throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, FundFamily1, "click", "", 1, "SA", "FundFamily1", 1);
		if(FundFamily1.isDisplayed())
			System.out.println("FundFamily1");
	}


	public void verifyFundName() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, FundName, "click", "", 1, "SA", "FundName", 1);
		if(FundName.isDisplayed())
			System.out.println("FundName");
	

	}


	public void verifyShareClass() throws InterruptedException  {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, ShareClass, "click", "", 1, "SA", "ShareClass", 1);
		if(ShareClass.isDisplayed())
			System.out.println("ShareClass");
	
	}


	public void WaiverEligible() throws InterruptedException  {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, WaiverEligible, "click", "", 1, "SA", "WaiverEligible", 1);
		if(WaiverEligible.isDisplayed())
			System.out.println("WaiverEligible");
	
	
	}


	public void verifyASHareEQ() throws InterruptedException  {

		// TODO Auto-generated method stub
		tu.webAppObject(driver, AShareEQ, "click", "", 1, "SA", "AShareEQ", 1);
		if(AShareEQ.isDisplayed())
			System.out.println("AShareEQ");
	
	
	}


	public void verifySymbol() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, Symbol1, "click", "", 1, "SA", "Symbol1", 1);
		if(Symbol1.isDisplayed())
			System.out.println("Symbol1");
	
	}


	public void verifyFirmRestrictedSecuritytab() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, FirmRestrictedSecuritiestab, "click", "", 1, "SA", "FirmRestrictedSecuritiestab", 1);
		if(FirmRestrictedSecuritiestab.isDisplayed())
			System.out.println("FirmRestrictedSecuritiestab");
	
	
	}

	
	
	public void verifyCusipNumber() throws InterruptedException {
		// TODO Auto-generated method stub
		if(FirmRestrictedSecurities1.isDisplayed())
			System.out.println("FirmRestrictedSecurities1");
	
	
	
	}

	public void verifySymbol1() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, Symbol2, "click", "", 1, "SA", "Symbol2", 1);
		if(Symbol1.isDisplayed())
			System.out.println("Symbol2");}
	

	public void ProductType() throws InterruptedException {
		// TODO Auto-generated method stub
		if(Symbol2.isDisplayed())
			System.out.println("ProductType");
	
	
	
	}
	public void ProductCategory() throws InterruptedException {
		// TODO Auto-generated method stub
		if(ProductCategory.isDisplayed())
			System.out.println("ProductCategory");
	
	
	
	}
	

	public void verifyRestrictionStatus() throws InterruptedException{
		// TODO Auto-generated method stub
		if(ProductType.isDisplayed())
			System.out.println("ProductType");
	
	}


	public void verifyNewTab() throws InterruptedException{
		// TODO Auto-generated method stub
		tu.webAppObject(driver, New, "click", "", 1, "SA", "Newtab1", 1);
		
	}


	public void verifyRequestCategory() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, RequestCategory, "click", "", 1, "SA", "RequestCategory", 1);
		
	}


	public void verifyRequestFileName() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, RequestFileName, "click", "", 1, "SA", "RequestFileName", 1);
		
	}


	public void verifyCreatedBy() throws InterruptedException{
		// TODO Auto-generated method stub
		tu.webAppObject(driver, CreatedBy, "click", "", 1, "SA", "CreatedBy", 1);
		
	}


	public void verifyCreatedDate() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, CreatedDate, "click", "", 1, "SA", "CreatedDate", 1);
		
	}


	public void verifyFirm() throws InterruptedException{
		// TODO Auto-generated method stub
		tu.webAppObject(driver, VerifyFirm, "click", "", 1, "SA", "VerifyFirm", 1);
		
	}


	public void verifyReviewCount() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, ReviewCount, "click", "", 1, "SA", "ReviewCount", 1);
		
	}


	public void verifyReviewStatus() throws InterruptedException{
		// TODO Auto-generated method stub
		tu.webAppObject(driver, ReviewStatus, "click", "", 1, "SA", "ReviewStatus", 1);
		
	}


	public void verifyCountAndProfileDisplay() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, CountAndProfileDisplay, "click", "", 1, "SA", "CountAndProfileDisplay", 1);
		
	}


	public void verifyProfileNumberDropdownWithSearchFunction() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, ProfileNumberDropdown, "click", "", 1, "SA", "ProfileNumberDropdown", 1);
		
	}


	
	public void verifyDownloadButtonOnClick() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver,DownloadButtonClick, "click", "", 1, "SA", "DownloadButtonOnClick", 1);
		if(DownloadButtonClick.isDisplayed())
			System.out.println("Firm id displayed");
		}

	


	public void verifyRecordIterations() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, RecordIterations, "click", "", 1, "SA", "RecordIterations", 1);
		
	}


	public void verifyReviewDates() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, ReviewDate , "click", "", 1, "SA", "ReviewDate", 1);
		
	}


	public void verifyReviewPeriod() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, ReviewPeriod , "click", "", 1, "SA", "ReviewPeriod", 1);
		
	}


	public void verifyIndexingforReccordsPerPage() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, IndexingRecordPerPage , "click", "", 1, "SA", "IndexingRecordPerPage", 1);
		
	}


	public void verifyReviewInfoReviewComment() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, ReviewInfoReviewComment , "click", "", 1, "SA", "ReviewInfoReviewComment", 1);
		
	}


	public void verifyTrendsInfo() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, TrendsInfo , "click", "", 1, "SA", "TrendsInfo", 1);
		
	}



	public void verifyEscalatedDetailsPage() throws InterruptedException{
		// TODO Auto-generated method throws InterruptedException
		tu.webAppObject(driver, EscalatedDetailsPage , "click", "", 1, "SA", "EscalatedDetailsPage", 1);
		
	}


	public void verifyExcelDownloadWIthSingleAndMultipleFilter() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver,ExcelDownloadWIthSingleAndMultipleFilter , "click", "", 1, "SA", "ExcelDownloadWIthSingleAndMultipleFilter", 1);
		
	}


	public void verifyDataExport() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver,DataExport , "click", "", 1, "SA", "DataExport", 1);
		
	}


	public void verifyProfileDetails() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver,ProfileDetails , "click", "", 1, "SA", "ProfileDetails", 1);
		
	}


	

	public void verifyMutualFundTransaction() throws InterruptedException{
		// TODO Auto-generated method stub
		tu.webAppObject(driver,MutualFundTransaction1 , "click", "", 1, "SA", "MutualFundTransaction", 1);
		
	}


	public void verifyImportTabOnClick() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, Import, "click", "", 1, "SA", "ImportTabOnCLick", 1);

	}


	public void verifyClearAllTabOnClick() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, ClearAllTabOnClick,"click", "", 1 , "SA" , "ClearAllTabOnClick",  1);

	}


	public void verifyAddNewTab() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, AddNewTab,"click", "", 1 , "SA" , "AddNewTab",  1);

	}


	public void verifyOpenProfile() throws InterruptedException {
		// TODO Auto-generated method stub
		tu.webAppObject(driver, OpenProfile,"click", "", 1 , "SA" , "OpenProfile2",  1);

	}


	public void loginasSupervisorRole() {
		// TODO Auto-generated method stub
		
	}





	

	

    }
