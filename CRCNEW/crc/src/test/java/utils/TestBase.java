package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Date;

import org.json.JSONArray;


public class TestBase{
	int scCount, scIndex, scResultSize=0, stepIndex;
	private static int resultColumn=0;
	Map<String, Map<String, String>> excelmap;
	LinkedHashMap<String, String> map;
	String scResStatus, stepStatus, tcName;
	public static int resultColumnCreated=0;
	StringBuilder sbErrMsg;
	FileSystem system;
	Path original, target;
	JSONArray stepsResultList;
	FileOutputStream fileOut;
	FileWriter fw;
	Cell cell;
	Hyperlink href;
	
	public static WebDriver driver= null;
	public static Properties prop=null;
	public static FileInputStream fis = null;
	public static String CurrentDir =System.getProperty("user.dir");
	public static String path = "/BDDFramework.properties";
    public static String uname = null;
	public static String key = null;
	public static File file = null;
	public static String TESTDATA_SHEET_PATH="src/test/resources/Externalfiles/TestData.xlsx";
	public static String TESTRESULT_SHEET_PATH="src/test/resources/Externalfiles/TestResults.xlsx";
	public static String ERROR_FILE_PATH="src/test/resources/ErrorFiles";
	public static String CUCUMBERJSON_PATH="target/cucumber-reports/CucumberTestReport.json";
	public static XSSFWorkbook book=null;
	public static XSSFSheet sheet =null;
	public static String Testcaseid=null;
	public static String Testcasedescription=null;
	public static String scenarioname;
	public TestBase() {
		try {
			
			prop= new Properties();
			fis = new FileInputStream(CurrentDir+path);
			prop.load(fis);
			}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}}
	public WebDriver selectBrowser(String browser) throws MalformedURLException {
			if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
//				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
				//System.setProperty("webdriver.chrome.driver", "W:/MphasisQA/Automation_Selenium/AppAutomationSuites/drivers/ChromeDriver/chromedriver_95.exe");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			} else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if (browser.equalsIgnoreCase(Browsers.EDGE.name())){
					System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"/src/test/resources/drivers/msedgedriver.exe");
					//driver = new FirefoxDriver();
					 driver = new EdgeDriver();
					 driver.manage().window().maximize();
						}				
			else if (browser.equalsIgnoreCase(Browsers.SAUCE.name())) {
				String sauceusername = "Nkanagaraj";
				String saucekey = "96bebbc2-fba4-43e9-855f-e53b6572802c";
				// this.scenario = scenario;
				//String scenarioname = scenario.getName();
				Date d1= new Date();
				SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
				String currentDate=sdf.format(d1);

				Date d= new Date();
				SimpleDateFormat sdf1= new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
				String currentInstance=sdf1.format(d);



				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability("browserName", "chrome");
				capabilities.setCapability("platform", "Windows 10");
				capabilities.setCapability("version", "93");
				capabilities.setCapability("build", "Commission Report Center"+"_"+currentDate);
				capabilities.setCapability("name", scenarioname+"_"+currentInstance);
				// driver= new RemoteWebDriver(new URL(URL),capabilities);
				// break;
				// String URL=null;
				// this.driver = new RemoteWebDriver(new URL("https://AVallepu:30065429-d8a9-4d28-bc0a-29f113924349@ondemand.us-west-1.saucelabs.com:443/wd/hub"),capabilities);
				this.driver = new RemoteWebDriver(new URL("https://"+sauceusername+":"+saucekey+"@ondemand.us-west-1.saucelabs.com:443/wd/hub"),capabilities);
				//driver.set(new RemoteWebDriver(new URL("http://"+sauceusername+":"+saucekey+"@ondemand.us-west-1.saucelabs.com:443/wd/hub"),capabilities));
				}
		return driver;
	}
	public static String getUserName(String username) throws IOException {
 		prop=new Properties();
 		fis=new FileInputStream(CurrentDir+path);
 		prop.load(fis);
 		uname = prop.getProperty(username);
 		return uname;
 	}

 	public static String getPwd(String password) throws IOException {
 		prop=new Properties();
 		fis=new FileInputStream(CurrentDir+path);
 		prop.load(fis);
 		key = prop.getProperty(password);
 		return key;
 	}
 	public String excelRead(String sheetname,String testcaseid, String header) throws IOException {
        String value = null;;
        try {
            fis = new FileInputStream(TESTDATA_SHEET_PATH);
            book = new XSSFWorkbook(fis);
            sheet = book.getSheet(sheetname);
            int lastRowNum = sheet.getLastRowNum();
            int lastCellNum = sheet.getRow(0).getLastCellNum();      
            for (int i = 1; i <= lastRowNum; i++) {
            	if(sheet.getRow(i).getCell(0).toString().equals(testcaseid)) {
            		for (int colIndex = 1; colIndex <= lastCellNum; colIndex++) {
                    	if(sheet.getRow(0).getCell(colIndex).toString().equals(header)) {
                    		value = sheet.getRow(i).getCell(colIndex).toString();
                    		break;
                    	}
                    }
            		break;
            	}
            }
        } catch (NullPointerException E) {
        }
        book.close();
 		book = null;
 		fis.close();
 		fis = null;
        return value;
    }
 	
 	public void copyExcel(){
 		system = FileSystems.getDefault();
        original = system.getPath(TESTDATA_SHEET_PATH);
        target = system.getPath(TESTRESULT_SHEET_PATH);
        try {
            // Throws an exception if the original file is not found.
            Files.copy(original, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            System.out.println("ERROR");
        }
 	}
 	
 	public static void copyFileFromTo(String source, String dest)   {

        InputStream input = null;
        OutputStream output = null;

        try {
            int buf_size=1024;
            input = new FileInputStream(source);
            output = new FileOutputStream(dest);
            System.out.println("Size of the file :"+input.available()+" Byte");
            byte[] buf = new byte[buf_size];
            int bytesRead;
            while ((bytesRead = input.read(buf)) > 0 ) {
            output.write(buf, 0, bytesRead);
            if(input.available()<buf_size){
                System.out.println("Availble byte now is : "+input.available()+" so change the size of the array byte the to the same size");
                //if the available byte are <1024  you will copy  a array of 1024 to the file that cause domage to file
                buf= new byte[input.available()];
            }
            }                               
            input.close();
            output.close();
        }

        catch (IOException e) { 
        	System.out.println("Error");
        }
 	}
 	
 	public void changeSheetName() throws IOException, InterruptedException {
 		try {
            fis = new FileInputStream(TESTRESULT_SHEET_PATH);
            book = new XSSFWorkbook(fis);
            //Change the name of first sheet to 'Results'
            book.setSheetName(book.getSheetIndex("Testdata"), "Results");
        } catch (NullPointerException E) {
        }
 		// Write the output to the file
	    fileOut = new FileOutputStream(TESTRESULT_SHEET_PATH);
	    book.write(fileOut);
	    book.close();
 		fis.close();
	    fileOut.close();
 	}
 		
 	public void configureResultBook() throws IOException, InterruptedException {
// 		copyFileFromTo(TESTDATA_SHEET_PATH, TESTRESULT_SHEET_PATH);
 		copyExcel();
 		try {
            fis = new FileInputStream(TESTRESULT_SHEET_PATH);
            book = new XSSFWorkbook(fis);
            sheet = book.getSheet("Testdata");
            book.setSheetName(book.getSheetIndex("Testdata"), "Results");
            int lastRowNum = sheet.getLastRowNum();
            resultColumn = sheet.getRow(0).getLastCellNum();
            
            for (int i = 0; i <= lastRowNum; i++) {
            	if (sheet.getRow(i).getCell(resultColumn) == null){
                	sheet.getRow(i).createCell(resultColumn, CellType.STRING);
            	}
            	if (sheet.getRow(i).getCell(resultColumn+1) == null){
                	sheet.getRow(i).createCell(resultColumn+1, CellType.STRING);
            	}
            }
            sheet.getRow(0).getCell(resultColumn).setCellValue("Result");
            sheet.getRow(0).getCell(resultColumn+1).setCellValue("Reason");
        } catch (NullPointerException E) {
        }
 	// Write the output to the file
 		fileOut = new FileOutputStream(TESTRESULT_SHEET_PATH);
	    book.write(fileOut);
	    book.close();
 		fis.close();
	    fileOut.close();
 	}
 	
 	public void excelWriteResult(String testcaseid, String result) throws IOException, InterruptedException {
 		if(resultColumnCreated==0) {
 			configureResultBook();
 			resultColumnCreated=1;
 		}
 		try {
            fis = new FileInputStream(TESTRESULT_SHEET_PATH);
            book = new XSSFWorkbook(fis);
            sheet = book.getSheet("Results");
            int lastRowNum = sheet.getLastRowNum();
            for (int i = 1; i <= lastRowNum; i++) {
            	if(sheet.getRow(i).getCell(0).toString().contains(testcaseid)) {
            		sheet.getRow(i).getCell(resultColumn).setCellValue(result);
            		break;
            	}
            }
        } catch (NullPointerException E) {
        }
 	// Write the output to the file
	    fileOut = new FileOutputStream(TESTRESULT_SHEET_PATH);
	    book.write(fileOut);
	    book.close();
 		fis.close();
	    fileOut.close();
 	}
 	
 	void purgeDirectory(File dir) {
	    for (File file: dir.listFiles()) {
	        if (file.isDirectory())
	            purgeDirectory(file);
	        file.delete();
	    }
	}
 	
 	public void generateTestReport() throws IOException, InterruptedException{
 		
 		//Delete all previous Error Files in 'ErrorFiles' folder
 		purgeDirectory(FileSystems.getDefault().getPath(ERROR_FILE_PATH).toFile()); //new File(ERROR_FILE_PATH)
 		
 		
 		//Configure TestResults.xlsx Book
 		copyExcel();
 		try {
            fis = new FileInputStream(TESTRESULT_SHEET_PATH);
            book = new XSSFWorkbook(fis);
            sheet = book.getSheet("Testdata");
            book.setSheetName(book.getSheetIndex("Testdata"), "Results");
            int lastRowNum = sheet.getLastRowNum();
            resultColumn = sheet.getRow(0).getLastCellNum();
            
            for (int i = 0; i <= lastRowNum; i++) {
            	if (sheet.getRow(i).getCell(resultColumn) == null){
                	sheet.getRow(i).createCell(resultColumn, CellType.STRING);
            	}
            	if (sheet.getRow(i).getCell(resultColumn+1) == null){
                	sheet.getRow(i).createCell(resultColumn+1, CellType.STRING);
            	}
            }
            sheet.getRow(0).getCell(resultColumn).setCellValue("Result");
            sheet.getRow(0).getCell(resultColumn+1).setCellValue("Reason");
        } catch (NullPointerException npe) {
        }
 		
 		
 		//Open CucumberTestReport.json file
 		InputStream isObj = new FileInputStream(CUCUMBERJSON_PATH);
    	BufferedReader br = new BufferedReader(new InputStreamReader(isObj, "UTF-8"));
    	String line = "";
    	StringBuilder responseStrBuilder = new StringBuilder();
    	while((line =  br.readLine()) != null){
    	    responseStrBuilder.append(line);
    	}
    	isObj.close();
    	
    	//Parse File Stream into JSON
    	JSONArray ja = new JSONArray(responseStrBuilder.toString());
        JSONArray elements = ja.getJSONObject(0).getJSONArray("elements");
        scCount = elements.length();
        System.out.println("scCount: "+scCount);
        scResStatus="";
        
        //Flush results into TestResults.xlsx Book
        sheet = book.getSheet("Results");
        //Create Cell Style
        CellStyle cs = book.createCellStyle();
        cs.setWrapText(true);
        
        for(scIndex=0;scIndex<scCount;scIndex++) {
        	stepsResultList = elements.getJSONObject(scIndex).getJSONArray("steps");
        	scResultSize = stepsResultList.length();
        	System.out.println("scResultSize: "+scResultSize);
        	for(stepIndex=0;stepIndex<scResultSize;stepIndex++) {
        		stepStatus = stepsResultList.getJSONObject(stepIndex).getJSONObject("result").getString("status");
        		if(stepStatus.equals("failed")) {
        			scResStatus="FAIL";
        			
        			System.out.println("Failed Index: "+scIndex);
        			cell = sheet.getRow(scIndex).getCell(resultColumn+1);
                    sbErrMsg = new StringBuilder(stepsResultList.getJSONObject(stepIndex).getJSONObject("result").getString("error_message"));//.replaceAll("\\r\\n\\t", "\\n")
                    tcName = elements.getJSONObject(scIndex).getString("name").substring(0, 3)+".txt";
                    cell.setCellValue(tcName);
                    href = book.getCreationHelper().createHyperlink(HyperlinkType.FILE);
                    href.setAddress(FileSystems.getDefault().getPath(ERROR_FILE_PATH)+File.pathSeparator+tcName);
                    cell.setHyperlink(href);
                    
                    //Write Error Message to Text File
                    File file = new File (FileSystems.getDefault().getPath(ERROR_FILE_PATH)+File.pathSeparator+tcName);
            		file.createNewFile();
                    fw = new FileWriter(FileSystems.getDefault().getPath(ERROR_FILE_PATH)+File.pathSeparator+tcName, false);
                    fw.write(sbErrMsg.toString());
                    fw.close();
                    break;
        		}else if(stepStatus.equals("skipped")) {
        			scResStatus="SKIPPED";
        			break;
        		}
 	        }
        	if(scResStatus.equals("")) {
        		scResStatus="PASS";
        	}
        	sheet.getRow(scIndex).getCell(resultColumn).setCellValue(scResStatus);
        	System.out.println("scResStatus: "+scResStatus);
        	scResStatus="";
        }
        
     // Write the output to the file
	    fileOut = new FileOutputStream(TESTRESULT_SHEET_PATH);
	    book.write(fileOut);
	    book.close();
 		fis.close();
	    fileOut.close();
 	}
}	
