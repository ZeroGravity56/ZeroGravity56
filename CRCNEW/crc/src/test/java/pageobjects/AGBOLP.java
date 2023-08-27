package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.TestBase;

//"http://Username:Password@qaportaluseradmin/NTLMAuthenticate/NTLMAuthenticateAdvisorPortal.aspx?referrer=/SelectDelegateUserId.aspx"

public class AGBOLP extends TestBase {
	
	public AGBOLP(WebDriver driver) {
    	TestBase.driver=driver;
		PageFactory.initElements(driver, this);
    }
	
	@FindBy(id="userid")
    public WebElement userID;
	
	@FindBy(xpath="//img[@alt=\"Submit\"]")
    public WebElement submitBtn;
	
	@FindBy(id="rsapwd")
    public WebElement pwdTxt;
	
	//@FindBy(id="header_td_clientmanagement")
	@FindBy(xpath="//div[contains(text(),'Client Management')]")
    public WebElement clientMgmtLink;
	
	@FindBy(id="ext-gen162")
    public WebElement contWithThisSession;
	
}
	
	
	
