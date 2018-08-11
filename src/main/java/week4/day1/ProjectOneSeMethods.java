package week4.day1;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class ProjectOneSeMethods extends SeMethods 
{
@Test
	public void createContact() throws InterruptedException
	{
	startApp("chrome", "http://leaftaps.com/opentaps");
	WebElement eleUserName = locateElement("id", "username");
	type(eleUserName, "DemoSalesManager");
	WebElement elePwd = locateElement("id","password");
	type(elePwd, "crmsfa");
	WebElement submit = locateElement("class","decorativeSubmit");
	click(submit);
	WebElement crmsfa = locateElement("linktext","CRM/SFA");
	click(crmsfa);
	WebElement contacts = locateElement("id","Contacts");
	click(contacts);
	Thread.sleep(3000);
	WebElement createContact = locateElement("xpath","//ul[@class='shortcuts']//a[text()='Create Contact']");
	click(createContact);
	WebElement fName = locateElement("id","firstNameField");
	type(fName,"Arockia");
	WebElement lName = locateElement("id","lastNameField");
	type(lName,"Anisha");
	WebElement localFname = locateElement("id","createContactForm_firstNameLocal");
	type(localFname,"anath");
	WebElement localLname = locateElement("id","createContactForm_lastNameLocal");
	type(localLname,"Mity");
	WebElement salutation = locateElement("id","createContactForm_personalTitle");
	type(salutation,"Guys");
	WebElement title = locateElement("id","createContactForm_generalProfTitle");
	type(title,"Mrs");
	WebElement Currency = locateElement("id","createContactForm_preferredCurrencyUomId");
	selectDropDownUsingText(Currency, "INR - Indian Rupee");
	WebElement Description = locateElement("id","createContactForm_description");
	type(Description,"God saved US");
	WebElement dept = locateElement("id","createContactForm_departmentName");
	type(dept,"CSE");
	WebElement areaCode = locateElement("id","createContactForm_primaryPhoneAreaCode");
	type(areaCode,"112");
	WebElement primeExtn = locateElement("id","createContactForm_primaryPhoneExtension");
	type(primeExtn,"044");
	WebElement email = locateElement("id","createContactForm_primaryEmail");
	type(email,"rajselva81@gmail.com");
	WebElement phoneNumber = locateElement("id","createContactForm_primaryPhoneNumber");
	type(phoneNumber,"9843343856");
	WebElement persAsk = locateElement("id","createContactForm_primaryPhoneAskForName");
	type(persAsk,"Joseph");
	WebElement toName = locateElement("id","generalToNameField");
	String toame=toName.getText();
	
	WebElement address1 = locateElement("id","createContactForm_generalAddress1");
	type(address1,"No.116");
	
	WebElement gCity = locateElement("id","createContactForm_generalCity");
	type(gCity,"Chennai");
	WebElement pCode = locateElement("id","createContactForm_generalPostalCode");
	type(pCode,"600119");
	WebElement gPcode = locateElement("id","createContactForm_generalPostalCodeExt");
	type(gPcode,"116");
	WebElement gattnName = locateElement("id","createContactForm_generalAttnName");
	type(gattnName,"Village");
	WebElement address2 = locateElement("id","createContactForm_generalAddress2");
	type(address2,"park Opp");
	WebElement country = locateElement("id","createContactForm_generalCountryGeoId");
	selectDropDownUsingText(country, "India");
	Thread.sleep(3000);
	WebElement state = locateElement("id","createContactForm_generalStateProvinceGeoId");
	selectDropDownUsingText(state, "TAMILNADU");
	Thread.sleep(3000);
	WebElement submit1 = locateElement("class","smallSubmit");
	click(submit1);
	Thread.sleep(3000);
	WebElement displayedName = locateElement("id","viewContact_fullName_sp");
	String nameValidation=displayedName.getText();
	verifyPartialText1(nameValidation, toame);
	WebElement submitmenu = locateElement("xpath","//a[@class='subMenuButton' and contains(text(),'Edit')]");
	click(submitmenu);
	WebElement Marketting = locateElement("id","addMarketingCampaignForm_marketingCampaignId");
	selectDropDownUsingText(Marketting, "Automobile");
	WebElement add = locateElement("xpath","//input[@value='Add']");
	click(add);
	WebElement update = locateElement("xpath","//input[@value='Update']");
	click(update);
	Thread.sleep(3000);
	WebElement displaymarket = locateElement("id","viewContact_marketingCampaigns_sp");
	String displMar=displaymarket.getText();
	verifyPartialText1(displMar, "Automobile");
		
	
	//input[@value='Update']
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
