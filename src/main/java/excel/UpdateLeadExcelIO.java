package excel;




import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class UpdateLeadExcelIO  extends Annotations 
{
	@BeforeTest
	public void setData()
	{
		excelname="EditLead";
		authorName="Arockia";
		category="Smoke";
		moduleName="Edit Leads";
		testCaseName="Edit Lead";
		testDescription="Search and selected lead updated successfully";
		
	}
	
	@Test(dataProvider ="TestData2")
	public void EditLeads(String fName,String updateCMPName) 
	{
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
	type(firstname,fName);
	WebElement FindLeadsbutton = locateElement("xpath","//span[contains(text(),'Name and ID')]//following::button[1]");
	click(FindLeadsbutton);
	WebElement firstlead = locateElement("xpath","//a[contains(text(),'10175')]");
	click(firstlead);
	
	
	verifyTitle("View Lead");
	 WebElement EditLeadslink = locateElement("linktext","Edit");
		click(EditLeadslink);
		WebElement updatecompanyname = locateElement("id", "updateLeadForm_companyName");
		type(updatecompanyname, updateCMPName);
		WebElement update = locateElement("xpath","//input[@value='Update']");
		click(update);
		WebElement companycheck = locateElement("xpath", "//span[@id='viewLead_companyName_sp']");
		verifyExactText(companycheck,"Modern India Pvt Ltd");
		
		//closeBrowser();
	}


	
}