package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.TestBase;


public class AGFOLP extends TestBase {
	
	public AGFOLP(WebDriver driver) {
    	TestBase.driver=driver;
		PageFactory.initElements(driver, this);
    }
	
	
	@FindBy(id="userid")
    public WebElement userID;
	
	@FindBy(xpath="//img[@alt=\"Submit\"]")
    public WebElement submitBtn;
	
	//@FindBy(id="rsapwd")
    //public WebElement pwdTxt; // Uncomment when running in PROD
	
	@FindBy(id="loginpwd")
    public WebElement pwdTxt; // Uncomment when running in PROD
	
	
	//@FindBy(id="header_td_clientmanagement")
	@FindBy(xpath="//div[contains(text(),'Client Management')]")
    public WebElement clientMgmtLink;
	
	@FindBy(id="ext-gen121")
    public WebElement contWithThisSession; 
	
	@FindBy(xpath = "//*[@value='QUESTION' and @type='radio']")
	public WebElement AuthenticateSelection;

	@FindBy(xpath = "//button[@text='Continue']")
	public WebElement ContinueButton;

	@FindBy(xpath = "//span[@id='lblQuestion']")
	public WebElement AuthenticateQuestion;

	@FindBy(xpath = "//input[@id='questionsList1_answer']")
	public WebElement AuthenticateAnswer;
	
	@FindBy(id="log")
    public WebElement logOutBtn;
	
	@FindBy(xpath="//button[text()='Yes']")
    public WebElement signOutYes;
	
	//*****************************************************************************************************
	//QUICK SUBMIT CREATE NEW APPLICATION OBJECTS
	//*****************************************************************************************************
	
	@FindBy(xpath="//span[text()='Application']/preceding-sibling::i/parent::a")
    public WebElement applicationBtn;
	
	//*****************************************************************************************************
	//FEI OBJECTS
	//*****************************************************************************************************
	
	@FindBy(xpath="//span[@id='button-1039-btnInnerEl']")
    public WebElement ticketSearchBtn;
	
}
	
	
	
