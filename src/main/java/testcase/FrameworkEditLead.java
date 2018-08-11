package testcase;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class FrameworkEditLead extends Annotations {
	@Test(groups= {"sanity"})
	public void EditLeads() {
	/*startApp("chrome","http://leaftaps.com/opentaps");
	WebElement eleUserName = locateElement("id", "username");
	type(eleUserName, "DemoSalesManager");
	WebElement elePassword = locateElement("id","password");
	type(elePassword, "crmsfa");
	WebElement eleLogin = locateElement("class","decorativeSubmit");
	click(eleLogin);
	WebElement crmsfa = locateElement("link","CRM/SFA");
    click(crmsfa);*/
    WebElement Leadslink = locateElement("linktext","Leads");
	click(Leadslink);
	WebElement FindLeads = locateElement("linktext","Find Leads");
	click(FindLeads);
	WebElement firstname = locateElement("xpath","//span[contains(text(),'Find by')]/following::input[2]");
	type(firstname,"Simion");
	WebElement FindLeadsbutton = locateElement("xpath","//span[contains(text(),'Name and ID')]//following::button[1]");
	click(FindLeadsbutton);
	WebElement firstlead = locateElement("xpath","//a[contains(text(),'10425')]");
	click(firstlead);
	WebElement phonenumber = locateElement("xpath","//input[@name='phoneNumber']");
	click(phonenumber);
	//span[contains(text(),"Phone")]/following::button[1]
	WebElement findleads = locateElement("xpath","//span[contains(text(),'Phone')]/following::button[1]");
	click(findleads);
	WebElement resultingfirstlead = locateElement("xpath","//span[contains(text(),'Phone')]/following::button[1]");
	click(resultingfirstlead);
	verifyTitle("View Lead");
	 WebElement EditLeadslink = locateElement("linktext","Edit");
		click(EditLeadslink);
		WebElement updatecompanyname = locateElement("id", "updateLeadForm_companyName");
		type(updatecompanyname, "CINDAN");
		WebElement update = locateElement("xpath","//input[@value='Update']");
		click(update);
		WebElement companycheck = locateElement("xpath", "//span[@id='viewLead_companyName_sp']");
		verifyExactText(companycheck,"CINDAN");
		
		//closeBrowser();
	}


	
}