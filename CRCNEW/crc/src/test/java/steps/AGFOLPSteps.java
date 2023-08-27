package steps;

import java.util.Set;

import org.openqa.selenium.Cookie;

import pageobjects.AGFOLP;
import utils.CommonUtilty;

public class AGFOLPSteps extends AGFOLP{
	
	Set<Cookie> cookiesSet;
    AGFOLP agfoLoginPage;
    CommonUtilty tu;
    
    public AGFOLPSteps(){
    	super(driver);
    	tu = new CommonUtilty();
    }
    
	public void set_authenticate_anwsers() throws Throwable {
    	if ((driver.getTitle()).equals("RSA_V3_Authentication")) {
			System.out.println("In getTitle equals ... ");
			AuthenticateSelection.click();
			ContinueButton.click();
			AuthenticateAnswer.sendKeys(get_Authenticate_Answers());
			ContinueButton.click();
			Thread.sleep(1000);
		}

	}
    
	public String get_Authenticate_Answers() {

		String question = AuthenticateQuestion.getText();
		String lastWord = question.substring(question.lastIndexOf(" ") + 1);
		String answer = lastWord.substring(0, lastWord.length() - 1);
		return answer;

	}
	
    public void login(String uname, String pwd) throws Throwable {
    	
    	driver.manage().window().maximize();
    	tu.webAppObject(driver, userID, "clear", "", 2, "AGFO Login Page", "userID", 1);
    	tu.webAppObject(driver, userID, "sendKeys", uname, 2, "AGFO Login Page", "userID", 1);
		//tu.webAppObject(driver, submitBtn, "click", "", 2, "AGFO Login Page", "submitBtn", 1);//PROD uncomment when running in PROD
		//tu.webAppObject(driver, pwdTxt, "clear", "", 2, "AGFO Login Page", "pwdTxt", 1); // PROD uncomment when running in PROD
          tu.webAppObject(driver, pwdTxt, "clear", "", 2, "AGFO Login Page", "pwdTxt", 1); // uncomment when running in QA
        tu.webAppObject(driver, pwdTxt, "sendKeys", pwd, 2, "AGFO Login Page", "pwdTxt", 1);
		tu.webAppObject(driver, submitBtn, "click", "", 2, "AGFO Login Page", "submitBtn", 1);
		//tu.webAppObject(driver, contWithThisSession, "click", "", 2, "AGFO Login Page", "contWithThisSession", 0);
		
		Thread.sleep(1000);
		
		try{
			if(contWithThisSession.isDisplayed()){
				contWithThisSession.click();
			}
		}catch(Exception e){
			System.out.println("Continue with new session Button was not displayed. ");
		}
		tu.waitForPageLoad();
		set_authenticate_anwsers();
    }
    
    public void logout() throws InterruptedException  {
    	tu.webAppObject(driver, logOutBtn, "click", "", 2, "AGFO Home Page", "logOutBtn", 1);
    	tu.webAppObject(driver, signOutYes, "click", "", 2, "AGFO Home Page", "signOutYes", 1);
    	tu.waitForPageLoad();
    }
    
}