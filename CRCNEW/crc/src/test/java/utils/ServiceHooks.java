package utils;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.TestBase;

public class ServiceHooks extends TestBase {

	TestBase testBase;
	public Scenario scenario;
	@Before
	public void initializeTest(Scenario scenario) throws MalformedURLException {
		testBase = new TestBase();
		
		this.scenario = scenario;
		 scenarioname = scenario.getName();
		String[] arrayScenarioName = scenarioname.split("-");
		Testcaseid = arrayScenarioName[0];
		System.out.println("testcaseid" + Testcaseid);
		Testcasedescription = arrayScenarioName[1];
		testBase.selectBrowser(Browsers.CHROME.name());      // ChangeBrowser name for execution in different platform
	}

	@After
	public void endTest(Scenario scenario) throws IOException, InterruptedException {
		if (scenario.isFailed()) {
			excelWriteResult(Testcaseid, "FAIL");
			try {
				//log.info(scenario.getName() + " is Failed");
				final byte[] screenshot = ((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png"); // ... and embed it in
			} catch (WebDriverException e) {
				e.printStackTrace();
			}

		} else {
			excelWriteResult(Testcaseid, "PASS");
			try {
			//	log.info(scenario.getName() + " is pass");
				scenario.embed(((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.BYTES), "image/png");
				TestBase.driver.quit();
			} catch (Exception e) {
				TestBase.driver.quit();
				e.printStackTrace();
			}
		}

//		TestBase.driver.quit();
	}
}
