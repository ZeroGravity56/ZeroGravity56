package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import utils.TestBase;

public class ReviewNumber extends TestBase {
	
	public ReviewNumber(WebDriver driver) {
    	TestBase.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
		@FindBy(xpath="//span[text()=' Review Number']")
		public WebElement reviewNumber;
		
		@FindBy(xpath="//span[text()='BackOffice']/parent::a")
	    public WebElement backOfficeLink2;
		
		@FindBy(xpath="//a[text()='Surveillance']") 
	    public WebElement SurvaeillenceLink4;
		
		
		//@FindBy(xpath="//a[@title='Home']")
		@FindBy(xpath="//div[@class='list-group']/a[1]/img")
	    public WebElement HomeTab2;
		
	
		@FindBy(xpath="//span[@class='ng-arrow-wrapper']")
	    public WebElement arrowBtn;
				
//		@FindBy(xpath="//input[@role='combobox']//preceding::div[1]")
		@FindBy(xpath="//span[text()=' Review Number']")
		public WebElement ReviewNumberDropdown1;
	
		@FindBy(id="searchQueryString")
		public WebElement ReviewNumber1;
		
		@FindBy(xpath = "//*[contains(@class,'search-field')][@type='search']")
		public WebElement OpenReviewsExportButton12;
		
		@FindBy(xpath = "(//a[@title='View'])[2]")
		public WebElement ViewTab;

		@FindBy(xpath = "(//a[@title='View'])[2]")
		public WebElement ReviewPage;

	}