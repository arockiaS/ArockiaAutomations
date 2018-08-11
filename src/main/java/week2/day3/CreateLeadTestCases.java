package week2.day3;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadTestCases {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//ChromeOptions option=new ChromeOptions();
		//option.setHeadless(true);
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1300, 578));
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		WebElement password=driver.findElementById("password");
		password.sendKeys("crmsfa");
		WebElement submit=driver.findElementByClassName("decorativeSubmit");
		submit.click();
		
		WebElement crmfa=driver.findElementByLinkText("CRM/SFA");
		crmfa.click();
		
		WebElement createlead=driver.findElementByLinkText("Create Lead");
		createlead.click();
		Thread.sleep(3000);
		
		//Enter Company Name:
		WebElement companyName=driver.findElementById("createLeadForm_companyName");
		companyName.sendKeys("TataConsultancyServices");
		//Enter First Name:
		WebElement firstName=driver.findElementById("createLeadForm_firstName");
		firstName.sendKeys("Arockia");
		firstName.sendKeys(Keys.TAB);
		String capturedFname=firstName.getText();
		System.out.println("Captured First Name Is: "+capturedFname);
		
		//Enter Last Name:
		WebElement lastName=driver.findElementById("createLeadForm_lastName");
		lastName.sendKeys("Ananthraj");
		
		//Enter Local First name
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Ananthuu");
		//Enter Local Last Name:
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Raja");
		//Enter Salutations:
		driver.findElementByName("personalTitle").sendKeys("Mr");
		//Choose Source:
		WebElement selectSource=driver.findElementById("createLeadForm_dataSourceId");
		Select dropSource=new Select(selectSource);
		List<WebElement> allSource=dropSource.getOptions();
		dropSource.selectByVisibleText("Website");
		selectSource.sendKeys(Keys.TAB);
		
		//Enter Title:
		driver.findElementByName("generalProfTitle").sendKeys("TCS");
		//Enter Anual Revenue:
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("34004");
		
		//Select Industry:
		WebElement industry=driver.findElementById("createLeadForm_industryEnumId");
		Select dropIndustry=new Select(industry);
		List<WebElement> allIndustry=dropIndustry.getOptions();
		dropIndustry.selectByVisibleText("Insurance");
		
		
		//Choose Ownership
		WebElement ownership=driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropOwnership=new Select(ownership);
		List<WebElement> allOwnership=dropOwnership.getOptions();
		dropOwnership.selectByVisibleText("Corporation");
	
		
		//EnterSIc Code
		driver.findElementById("createLeadForm_sicCode").sendKeys("TATACHN");
		//Enter Description
		driver.findElementById("createLeadForm_description").sendKeys("Arockia is working in Tata Consultancy Services Chennai");
		//Enter Imp note:
		driver.findElementById("createLeadForm_importantNote").sendKeys("Important Key note to be added into the queue");
		//Enter County Code:
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("98434333856");
		//Enter Area Code:
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("624002");
		//Enter Ext Number
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("2323");
		//Enter Department
		driver.findElementById("createLeadForm_departmentName").sendKeys("CSE");
		//Select Currency
		WebElement currency=driver.findElementById("createLeadForm_currencyUomId");
		Select preferCurrency=new Select(currency);
		List<WebElement> allCurrency=preferCurrency.getOptions();
		preferCurrency.selectByVisibleText("INR - Indian Rupee");
		//Enter No Of Employee
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("32445");
		//Find Ticket Symbol
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("GOS");
		//Enter Person to Ask For
		driver.findElementByName("primaryPhoneAskForName").sendKeys("Aroc");
		//Enter Web URL
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.tcs.com");
		//Enter To Name
		driver.findElementById("createLeadForm_generalToName").sendKeys("ToName");
		//Enter Address Line 1 and 2
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("No.116");
		//Enter Address Line 2 and 2
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Park Opp,Shollinganallur");
		//Enter City
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		
		
		//Choose Country
		WebElement country=driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dropCountry=new Select(country);
		List<WebElement> allCountry=dropCountry.getOptions();
		dropCountry.selectByVisibleText("India");
				
		//Choose State/Province
		WebElement state=driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select dropState=new Select(state);
		List<WebElement> allStates=dropState.getOptions();
		dropState.selectByVisibleText("TAMILNADU");
		

		//Enter Zip/Postal Code
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600119");
		//Enter Zip/Postal Code Extension
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("CHN");
		//Choose Marketing Campaign
		WebElement marketing=driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropMarketing=new Select(marketing);
		List<WebElement> allMarketing=dropMarketing.getOptions();
		dropMarketing.selectByVisibleText("Car and Driver");
		//Enter phone number
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9843433856");
		//Enter Email
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("rajselva81@gmail.com");
		//create lead
		WebElement leadSubmit=driver.findElementByName("submitButton");
		leadSubmit.click();
		//Verify First name
		Thread.sleep(9000);
		WebElement fName=driver.findElementById("viewLead_firstName_sp");
		String displayName=fName.getText();
		System.out.println("Created Lead First name is:"+displayName);
		
		System.out.println("Verify the FirstName");
		if(displayName==capturedFname)
		{
			System.out.println("Captured first Name same as displayd Name");
		}
		
		}

}
