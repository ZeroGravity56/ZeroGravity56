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

public class AccountNumberStepDefination extends TestBase{

	CommonUtilty tu;
	CRCHPSteps crcHP = new CRCHPSteps();
	
	AGFOLPSteps foLP = new AGFOLPSteps();
	//SurvaellianceAutomationSteps surv = new SurvaellianceAutomationSteps();
	ReviewNumberSteps review = new ReviewNumberSteps();
	AccountNumberSteps account = new AccountNumberSteps();
	
	public void SAStepDefination() {
		tu = new CommonUtilty();
	}
		
	@When("^User navigates to Backoffice$")
	public void navigateToBackOffice2() throws InterruptedException
	{
		account.navigateToBackOffice2();
	}
	 
	@When("^User navigates to Surveillance$")
	public void navigateToSurveillance() throws InterruptedException
	{
		account.navigateToSurveillancelink();
	}
	
		@And("^User is on Home Page$")
		public void clickOnHomeTab() throws InterruptedException
		{
			account.clickOnHomeTab();
		}
	  	
		@And("^User Select the Account Number dropdown$")
		public void AccountNumberDropDown() throws InterruptedException
		{
			account.AccountNumberDropdown();
		}
		
	  	@And("^User search the Account Number$")
	  	public void searchAccountNumber() throws InterruptedException
	  	{
	  		account.searchAccountNumber();
	  	}
	  	
	  	@And("^User clicks on view tab.$")
		public void VerifyViewTab() throws InterruptedException
		{
			account.VerifyViewTab();
			
		}
	  	
	  	@Then("^User navigates to Account Number Page$")
		public void NavigateToAccountNumberPage() throws InterruptedException
		{
			account.NavigateToAccountNumberPage();
			
		}
	

		
		}
	


