package week4.day1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ProjectOne {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
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
		

		WebElement contact=driver.findElementByLinkText("Contacts");
		contact.click();
		Thread.sleep(3000);
		WebElement createContact = driver.findElementByXPath("//ul[@class='shortcuts']//a[text()='Create Contact']");
		createContact.click();
		Thread.sleep(3000);
		WebElement fName = driver.findElementById("firstNameField");
		fName.sendKeys("Arockia");
		WebElement lName = driver.findElementById("lastNameField");
		lName.sendKeys("Anisha");
		WebElement fNameLocal = driver.findElementById("createContactForm_firstNameLocal");
		fNameLocal.sendKeys("Ananth");
		WebElement lNameLocal = driver.findElementById("createContactForm_lastNameLocal");
		lNameLocal.sendKeys("Mitu");
		WebElement salutation = driver.findElementById("createContactForm_personalTitle");
		salutation.sendKeys("Guys");
		WebElement title = driver.findElementById("createContactForm_generalProfTitle");
		title.sendKeys("Mr");
		WebElement currency = driver.findElementById("createContactForm_preferredCurrencyUomId");
		Select dropcurrency=new Select(currency);
		dropcurrency.selectByVisibleText("INR - Indian Rupee");
		driver.findElementById("createContactForm_description").sendKeys("My Easy Project");
		//Note:
		driver.findElementById("createContactForm_importantNote").sendKeys("My Easy Program done by Pair level");
		//Department Name:
		driver.findElementById("createContactForm_departmentName").sendKeys("CSE");
		//Area Code:
		driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("22");
		//Extn:
		driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("044");
		//Email
		driver.findElementById("createContactForm_primaryEmail").sendKeys("rajselva81@gmail.com");
		//Phone
		driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("9843433856");
		//Persion to ask for
		driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("Joseph");
		//Capture Name Appear
		WebElement getToName = driver.findElementById("generalToNameField");
		String toName=getToName.getText();
		
		//Address Name 1
		driver.findElementById("createContactForm_generalAddress1").sendKeys("No.116");
		//City Name
		driver.findElementById("createContactForm_generalCity").sendKeys("Chennai");
		//Postal COde
		driver.findElementById("createContactForm_generalPostalCode").sendKeys("600119");
		//postal code extn
		driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("119");
		//Attention Name
		driver.findElementById("createContactForm_generalAttnName").sendKeys("village");
		//addressline 2
		driver.findElementById("createContactForm_generalAddress2").sendKeys("park oppsosite");
		//Country
		WebElement country = driver.findElementById("createContactForm_generalCountryGeoId");
		Select dropCountry=new Select(country);
		dropCountry.selectByVisibleText("India");
		Thread.sleep(3000);
		//Select state:
		WebElement state = driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select dropState=new Select(state);
		dropState.selectByVisibleText("TAMILNADU");
		//Create Contact:
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(3000);
		//Verfy Fname
		WebElement displayedName = driver.findElementById("viewContact_fullName_sp");
		String nameValidation=displayedName.getText();
		if(nameValidation.contains("Arockia"))
				{
			System.out.println("Captured firstName displayed after creation");
				}
		else
		{
			System.out.println("Eror in validating name");
		}
		driver.findElementByXPath("//a[@class='subMenuButton' and contains(text(),'Edit')]").click();
		//Marketing Campaing
		WebElement Marketting = driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
		Select dropMarket=new Select(Marketting);
		dropMarket.selectByVisibleText("Automobile");
		//String editmarket = driver.findElementByLinkText("Automobile (CATRQ_AUTOMOBILE)").getText();
		//String editMarket=
		driver.findElementByXPath("//input[@value='Add']").click();
		//update
		driver.findElementByXPath("//input[@value='Update']").click();
		Thread.sleep(3000);
		WebElement displaymarket = driver.findElementById("viewContact_marketingCampaigns_sp");
		String displMar=displaymarket.getText();
		if(displMar.contains("Automobile"))
			{
				System.out.println("Captured Marketing Name displayed after creation");
			}
				else
					{
					System.out.println("Eror in validating name");
}
		
		
		
		
		
		
		

	}

}
