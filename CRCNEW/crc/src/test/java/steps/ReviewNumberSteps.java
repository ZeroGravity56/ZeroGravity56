    package steps;

    import static org.hamcrest.MatcherAssert.assertThat;

    import java.io.IOException;
    import java.text.ParseException;
    import java.text.SimpleDateFormat;
    import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
    import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import pageobjects.Survaellience;
import pageobjects.ReviewNumber;

    import utils.CommonUtilty;


    public class ReviewNumberSteps extends ReviewNumber{
    	
    	SimpleDateFormat dt, dt1;
    	long startTime;
        CommonUtilty utils;
        String fromDt, toDt, Cdt;
        int i, itemsSize, textsSize, pieItemsSize, advSize;
		private WebElement FirmId;
		
        
        public ReviewNumberSteps(){
    		super(driver);
    		utils = new CommonUtilty();
    	}

        


        public void navigateToBackOffice2() throws InterruptedException {
    		// TODO Auto-generated method stub
    		 utils.webAppObject(driver, backOfficeLink2 , "click", "", 1, "SA", "navigateToBackOffice", 1);
    			
    	}


        public void navigateToSurveillancelink() throws InterruptedException {
    		// TODO Auto-generated method stub
        	 utils.webAppObject(driver, SurvaeillenceLink4 , "click", "", 1, "SA", "navigateToSurvaeillanceLink", 1);
        	 Thread.sleep(4000);
        	 utils.switchToWindowByTitle("Surveillance Automation");
        	 
    	}
        
        
	 public void clickOnHomeTab() throws InterruptedException
	 {
		 System.out.println("entered");
		 Thread.sleep(1000);
		 System.out.println(HomeTab2.isDisplayed());
		 utils.webAppObject(driver, HomeTab2, "click", "", 1, "SA", "HomeTab2", 1);
		 Thread.sleep(1000);

	 }
	
	 public void ReviewNumberDropdown() throws InterruptedException
		{
		 
		//	tu.webAppObject(driver, ReviewNumberDropdown1 , "selectByVisibleText", " Review Number", 1, "SA", "ReviewNumberDropdown1", 1);
		 Thread.sleep(1000);
		 arrowBtn.click();
			utils.webAppObject(driver, ReviewNumberDropdown1 , "click", "", 1, "SA", "ReviewNumberDropdown1", 1);
			 Thread.sleep(1000);
			//Thread.sleep(1);
	    }
	 
	 public void searchReviewNumber() throws InterruptedException {
			// TODO Auto-generated method stub
			 utils.webAppObject(driver, ReviewNumber1 , "click", "", 1, "SA", "searchReviewNumber", 1);
			 
			 utils.webAppObject(driver, ReviewNumber1 , "sendKeys", "RAA23285604", 1, "SA", "searchReviewNumber", 1);
			 
			 utils.webAppObject(driver, ReviewNumber1 , "sendKeys", " "+Keys.ENTER, 1, "SA", "searchReviewNumber", 1);
			 
		}
		
	 
	 public void VerifyViewTab() throws InterruptedException
	 {
		 utils.webAppObject(driver, ViewTab, "click", "", 1, "SA", "ViewTab", 1);

	}




	public void NavigateToReviewNumberPage() throws InterruptedException {
		// TODO Auto-generated method stub
		 utils.webAppObject(driver, ReviewPage, "click", "", 1, "SA", "ViewTab", 1);

	}




	public void AccountNumberDropdown() {
		// TODO Auto-generated method stub
		
	}




	public void searchAccountNumber() {
		// TODO Auto-generated method stub
		
	}




	public void NavigateToAccountNumberPage() {
		// TODO Auto-generated method stub
		
	}









		// String ExpectedTitle = "";
	//	 Assert.assertEquals(ActualTitle, ExpectedTitle);
			
	}




	/*public void clickOnLookUpPage() {
		// TODO Auto-generated method stub
		 tu.webAppObject(driver, LookUpPage , "click", "", 1, "SA", "LookUpPage", 1);

	}




	public void seletCategory() {
		// TODO Auto-generated method stub
		 tu.webAppObject(driver, Category , "click", "", 1, "SA", "Category", 1);

	}




	public void selectCategorySubscription() {
		// TODO Auto-generated method stub
		 tu.webAppObject(driver, Subscription , "click", "", 1, "SA", "Subscription", 1);

	}




	public void selectCreatedBy() {
		// TODO Auto-generated method stub
		 tu.webAppObject(driver, CreatedBy , "click", "", 1, "SA", "CreatedBy", 1);

	}




	public void clickOnUpdated() {
		// TODO Auto-generated method stub
		 tu.webAppObject(driver, Updated , "click", "", 1, "SA", "Updated", 1);

	}




	public void clickOnACtive() {
		// TODO Auto-generated method stub
		
	}


*/

	 
    