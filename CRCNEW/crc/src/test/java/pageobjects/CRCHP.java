package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.TestBase;

public class CRCHP extends TestBase {
	
	public CRCHP(WebDriver driver) {
    	TestBase.driver=driver;
		PageFactory.initElements(driver, this);
    }
	
	
	@FindBy(xpath="//div[text()='Client Management']")
    public WebElement cmLink;
	
	@FindBy(xpath="//div[text()='Office Management']")
    public WebElement omLink;
	
	@FindBy(xpath="//span[text()='BackOffice']/parent::a")
    public WebElement backOfficeLink;
	
	@FindBy(xpath="//a[text()='Commission Report Center ']")
    public WebElement crcLink;
	
	//***************************************************************************************************
	//CRC
	
	@FindBy(xpath="//input[@id='RepCombo']/following-sibling::img")
    public WebElement advDD;
	
	@FindBy(xpath="//div[@class='x-combo-list-item']")
    public List<WebElement> advisor;
	
	@FindBy(xpath="//button[text()='Select']")
    public WebElement selectBtn;
	
	@FindBy(id="cmbCommissionRepList")
    public WebElement cmbCommissionRepList;
	
	@FindBy(xpath="//button[text()='Search']")
    public WebElement searchBtn;
	
	@FindBy(xpath="//button[text()='OK']")
    public WebElement okBtn;
	
	@FindBy(xpath="//div[@class='x-tool x-tool-toggle']")
    public WebElement dateSelectionDD;
	
	@FindBy(xpath="//font[text()='Current Date']/parent::label/preceding-sibling::input")
    public WebElement currentDate;
	
	@FindBy(xpath="//font[text()='YTD']/parent::label/preceding-sibling::input")
    public WebElement ytd;
	
	@FindBy(xpath="//font[text()='Prior Year']/parent::label/preceding-sibling::input")
    public WebElement priorYear;
	
	@FindBy(xpath="//font[text()='Custom']/parent::label/preceding-sibling::input")
    public WebElement custom;
	
	@FindBy(xpath="//font[text()='1099 year']/parent::label/preceding-sibling::input")
    public WebElement one109Year;
	
	@FindBy(id="fromDate")
    public WebElement fromDate;
	
	@FindBy(id="toDate")
    public WebElement toDate;
	
	@FindBy(xpath="//button[text()='Refresh']")
    public WebElement refreshBtn;
	
	//**************************************************************************************
	//Line Of Business Summary
	
	@FindBy(xpath="//*[local-name()='text' and text()='Line Of Business Summary']")
    public WebElement lobSumm;
	
	@FindBy(xpath="//*[local-name()='text' and text()='Line Of Business Summary']//following-sibling::*[local-name()='text']")
    public WebElement lobSummDate;
	
	@FindBy(xpath="//div[@id='Current-panel']//*[name()='g']/*[name()='g']/*[name()='rect']")
    public List<WebElement> lobItems;
	
	@FindBy(xpath="//div[@id='Current-panel']//*[name()='g']/*[name()='g']/*[name()='text' and text()[contains(., '$')]]")
    public List<WebElement> lobTexts;
	
	@FindBy(xpath="//div[@id='Current-panel']//*[name()='g']/*[name()='path']")
    public List<WebElement> pieItems;
	
	//**************************************************************************************
	//Prior Year Line Of Business Summary
	
	@FindBy(xpath="//*[local-name()='text' and text()='Prior Year Line Of Business Summary']")
    public WebElement pylobSumm;
	
	@FindBy(xpath="//*[local-name()='text' and text()='Prior Year Line Of Business Summary']//following-sibling::*[local-name()='text']")
    public WebElement pylobSummDate;
	
	@FindBy(xpath="//div[@id='Prior-panel']//*[name()='g']/*[name()='g']/*[name()='rect']")
    public List<WebElement> pylobItems;
	
	@FindBy(xpath="//div[@id='Prior-panel']//*[name()='g']/*[name()='g']/*[name()='text' and text()[contains(., '$')]]")
    public List<WebElement> pylobTexts;
	
	@FindBy(xpath="//div[@id='Prior-panel']//*[name()='g']/*[name()='path']")
    public List<WebElement> pyPieItems;
	
	//***************************************************************************************
	//Pre-Defined Commission Reports
	
	@FindBy(xpath="//u[text()='Pre-Defined Commission Reports']/parent::a")
    public WebElement pdCommReports;
	
	@FindBy(xpath="//a[text()='Asset/Transaction Based Report']")
	public WebElement atbReport;
	
	@FindBy(xpath="//a[text()='Adjustment Report']")
    public WebElement adjReport;
	
	@FindBy(xpath="//a[text()='Completed Revenue Report']")
    public WebElement crReport;
	
	@FindBy(xpath="//a[text()='Commission Comparison Report']")
    public WebElement ccReport;
	
	@FindBy(xpath="//a[text()='Direct Deposit Report']")
    public WebElement ddReport;
	
	@FindBy(xpath="//a[text()='Pershing Advisory Account']")
    public WebElement paAcc;
	
	@FindBy(xpath="//a[text()='Line of Business Report']")
    public WebElement lobReport;
	
	@FindBy(xpath="//a[text()='Line of Business / 1099']")
    public WebElement lob1099;
	
	@FindBy(xpath="//a[text()='Override Revenue Report']")
    public WebElement orReport;
	
	@FindBy(xpath="//a[text()='Payout Report']")
    public WebElement pReport;
	
	@FindBy(xpath="//a[text()='Practice Analysis Report']")
    public WebElement paReport;
	
	@FindBy(xpath="//a[text()='Production Summary Report']")
    public WebElement psReport;
	
	@FindBy(xpath="//a[text()='Revenue Detail Report']")
    public WebElement rdReport;
	
	@FindBy(xpath="//a[text()='Revenue Payment Summary Report']")
    public WebElement rpsReport;
	
	@FindBy(xpath="//a[text()='Trail Report']")
    public WebElement tReport;
	
	@FindBy(xpath="//a[text()=' Estimated Unearned Fees ']")
    public WebElement eufReport;
	
	@FindBy(id="ext-gen41")
    public WebElement repNamedropdown;
	
	@FindBy(xpath="//[@id='ext-gen45']/div[2]")
    public WebElement repNamesel;
	
	@FindBy(xpath="//*[@id='rdlnk']/font/a")
    public WebElement user;
	
	
	
	
	//****************************
	//BO
	
	@FindBy(xpath="//a[text()='Cyclical Bonus Payment']")
    public WebElement cbReport;
	
	@FindBy(xpath="//a[text()='Back Office Payout Report']")
    public WebElement boReport;
	
	@FindBy(xpath="//a[text()='Front Office Payout Report']")
    public WebElement foReport;
	
	
	//***************************************************************************************
	
	@FindBy(xpath="//u[text()=' Commission Statements']/parent::a")
    public WebElement commStmts;
	
	@FindBy(id="Cdate")
    public WebElement Cdate;
	
	@FindBy(xpath="//div[text()='1PY - BINA, JOHN']/preceding::div[1]")
    public WebElement chkBox1PY;
	
	@FindBy(xpath="//button[text()='Generate Statement(s)']")
    public WebElement genStmtBtn;
	
	@FindBy(xpath="//*[text()='In Progress - Pending Earnings']")
    public WebElement inprogress;
	
	@FindBy(xpath="//*[@id=\"ext-gen110\"]/div/table/thead/tr/td[1]/div")
    public WebElement balanceforward;
	
	@FindBy(xpath="//*[@id=\"ext-gen110\"]/div/table/thead/tr/td[2]/div")
    public WebElement grouppendingearnings;
	
	@FindBy(xpath="//*[@id=\"ext-gen110\"]/div/table/thead/tr/td[3]/div")
    public WebElement groupoffcycle;
	
	@FindBy(xpath="//*[@id=\"ext-gen110\"]/div/table/thead/tr/td[4]/div")
    public WebElement mypendingearnings;
	
	@FindBy(xpath="//*[@id=\"ext-gen110\"]/div/table/thead/tr/td[5]/div")
    public WebElement groupestimated;
	
	@FindBy(xpath="//table/tbody/tr/td[1]/div/a[@title='Balance Forward']")
    public WebElement balancevalue;
	
	@FindBy(xpath="//*[text()='Rep ID']")
    public WebElement RepId;
	
	@FindBy(xpath="//*[text()='Branch ID']")
    public WebElement BranchId;
	
	@FindBy(xpath="//*[text()='Rep Name']")
    public WebElement RepName;
	
	@FindBy(xpath="//*[text()='Export To CSV']")
    public WebElement ExportToCSV;
	
	@FindBy(xpath="//a[@title='Group Pending Earnings']")
    public WebElement ValueforGroupPendingEarning;
	
	@FindBy(xpath="//*[text()='Dealer Concession']")
    public WebElement DealerConcession;
	
	@FindBy(xpath="//a[@title='My Pending Earnings']")
    public WebElement ValueForMyPendingEarning;
	
	@FindBy(xpath="//a[@title='Group Estimated Payment Amount']")
    public WebElement ValueForGroupEstimatedPayment;
	
	@FindBy(xpath="//*[@id=\"ext-gen139\"]/div/table/thead/tr/td[1]/div/center")
    public WebElement StatementDate;
	
	@FindBy(xpath="//*[@id=\"ext-gen139\"]/div/table/thead/tr/td[3]/div/center")
    public WebElement CommissionsOverrides;
	
	@FindBy(xpath="//*[@id=\"ext-gen139\"]/div/table/thead/tr/td[4]/div/center")
    public WebElement AdjTaxable;
	
	@FindBy(xpath="//*[@id=\"ext-gen139\"]/div/table/thead/tr/td[5]/div/center")
    public WebElement NonAdjTaxable;
	
	@FindBy(xpath="//*[@id=\"ext-gen139\"]/div/table/thead/tr/td[6]/div/center")
    public WebElement ClosingBalance;
	
	@FindBy(xpath="//*[@id=\"ext-gen139\"]/div/table/thead/tr/td[7]/div/center")
    public WebElement Payableamount;
	
	@FindBy(xpath="//*[text()='-$360.42']")
    public WebElement ValueofBalanceForward;
	
	@FindBy(xpath="//*[text()='$13,825.91']")
    public WebElement FirstValueofCommissionsOverrides;
	
	@FindBy(xpath="//*[text()='$52,222.45']")
    public WebElement SecondValueofCommissionsOverrides;
	
	@FindBy(xpath="//*[text()='$37,446.58']")
    public WebElement ThirdValueofCommissionsOverrides;
	
	@FindBy(xpath="//*[text()='-$26.00']")
    public WebElement FirstValueofAdjTaxable;
	
	@FindBy(xpath="//*[text()='-$39.00']")
    public WebElement SecondValueofAdjTaxable;
	
	
	
	// Affirm Application
	
//	@FindBy(xpath="//*[text()='-$39.00']")
//    public WebElement SecondValueofAdjTaxable;
	
	@FindBy(xpath="//*[text()='Office Management']")
    public WebElement officeManagement;
	
	
	@FindBy(xpath="//*[text()='Affirm System']")
    public WebElement affirmSystem;
	
	
	@FindBy(xpath="//*[@id=\"ext-gen71\"]")
    public WebElement dropdown;
	
	
	@FindBy(xpath="//*[text()='BAPILOT']")
    public WebElement baPilot;
	
	@FindBy(xpath="//*[text()='BA']")
    public WebElement ba;
	
	@FindBy(xpath="//*[text()='APPROVER']")
    public WebElement approver;
	
	
	//switchToTab(1)
	//Page Title: CommissionStatementsCS
	//https://agqa.v2020.com/Vision2020_Temp/Reports2/CommissionStatements/CommissionStatementsCS_01-24-2019_10942564_45f16ab4a0.pdf
	
	@FindBy(xpath="//div[@class='breadcrumbs']/div")
    public WebElement txtCRC;
	
	@FindBy(xpath="//*[@id='gridPnlCommissionHistoryGrid']/div[2]//div[2]//div[2]//table//td[7]//a")
    public List<WebElement> comHisPaymentAmt;
	
	@FindBy(xpath="//span[text()='Payment Amount']/preceding-sibling::div")
    public WebElement clsPayAmt;
	
	@FindBy(xpath="//*[@id='ext-comp-1006']/div[2]//div[2]/div//table//td[1]//a")
    public WebElement BalanceFwdIP;
	
	@FindBy(xpath="//*[@id='winCommProgressBalForwardDetailsWindow']/div[2]//div[2]//table/thead/tr[1]/td")
    public List<WebElement> balFwdClmDetails;
	
	@FindBy(xpath="//*[@id='winCommProgressBalForwardDetailsWindow']//button[text()='Export To CSV']")
    public WebElement balFwdExporttoCSV;
	
	@FindBy(xpath="//span[text()='Balance Forward Details']/preceding-sibling::div")
    public WebElement clsBalFwd;
	
	@FindBy(xpath="//*[@id='ext-gen527']/div[2]/table/tbody/tr[1]/td[7]/div/img")
    public WebElement pdfDoc;

	
	
	
}