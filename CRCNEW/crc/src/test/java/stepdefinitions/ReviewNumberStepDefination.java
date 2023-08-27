package stepdefinitions;

import java.io.IOException;
import java.text.ParseException;
import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.*;
import utils.CommonUtilty;
import utils.TestBase;

public class ReviewNumberStepDefination extends TestBase{

	CommonUtilty tu;
	CRCHPSteps crcHP = new CRCHPSteps();
	
	AGFOLPSteps foLP = new AGFOLPSteps();
	//SurvaellianceAutomationSteps surv = new SurvaellianceAutomationSteps();
	ReviewNumberSteps review = new ReviewNumberSteps();
	
	public void SAStepDefination() {
		tu = new CommonUtilty();
	}
		
	@When("^User navigates to Backoffice$")
	public void navigateToBackOffice2() throws InterruptedException
	{
		review.navigateToBackOffice2();
	}
	 
	@When("^User navigates to Surveillance$")
	public void navigateToSurveillance() throws InterruptedException
	{
		review.navigateToSurveillancelink();
	}
	
		@And("^User is on Home Page$")
		public void clickOnHomeTab() throws InterruptedException
		{
			review.clickOnHomeTab();
		}
	  	
		@And("^User Select the Review Number dropdown$")
		public void selectReviewNumberDropDown() throws InterruptedException
		{
			review.ReviewNumberDropdown();
		}
		
	  	@And("^User search the Review Number$")
	  	public void searchReviewNumber() throws InterruptedException
	  	{
	  		review.searchReviewNumber();
	  	}
	  	
	  	@And("^User clicks on view tab.$")
		public void VerifyViewTab() throws InterruptedException
		{
			review.VerifyViewTab();
			
		}
	  	
	  	@Then("^User navigates to Review Number Page$")
		public void NavigateToReviewNumberPage() throws InterruptedException
		{
			review.NavigateToReviewNumberPage();
			
		}
	

		
	/*	@And("^ User is on Look up Page.$" )
		public void clickOnLookUpPage() throws InterruptedException
		{
			review.clickOnLookUpPage();
		}
		
		@When("^User navigates to Category.$")
		public void seletCategorySubscription() throws InterruptedException
		{
			review.seletCategory();
		}
		@And("^User Select the Category Subscription.$")
		public void selectCategorySubscription() throws InterruptedException
		{
			review.selectCategorySubscription();
		}
		@And("^User select the created by.$")
		public void selectCreatedBy() throws InterruptedException
		{
			review.selectCreatedBy();
		}
		@And("^User clicks on updated by.$")
		public void clickOnUpdated() throws InterruptedException
		{
			review.clickOnUpdated();
		}
		@Then ("^User clicks on Is Active.$")
		public void clickOnACtive() throws InterruptedException
		{
			review.clickOnACtive();
		}	
		*/
	}
	