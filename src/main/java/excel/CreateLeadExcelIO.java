package excel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import wdMethods.SeMethods;

public class CreateLeadExcelIO extends Annotations
{
	
	@BeforeTest
	public void setData()
	{
		excelname="CreateLead";
		authorName="Arockia";
		category="Smoke";
		moduleName="createLord";
		testCaseName="Create Lead";
		testDescription="Create lead executed successfully";
		
	}
	
	@Test(dataProvider ="TestData1")
	public void  createLead(String companyName,String firstName,String lastName,String firstNameLocal,String lastNameLocal, String personalTitle) 
	{
		/*startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);*/
		/*WebElement crmscfa=locateElement("linktext","CRM/SFA");
		click(crmscfa);*/
		WebElement clickCreateLead=locateElement("linktext","Create Lead");
		click(clickCreateLead);
		WebElement leadCompanyName=locateElement("id","createLeadForm_companyName");
		type(leadCompanyName,companyName);
		WebElement leadFname=locateElement("id","createLeadForm_firstName");
		type(leadFname,firstName);
		WebElement leadLname=locateElement("id","createLeadForm_lastName");
		type(leadLname,lastName);
		WebElement localFname=locateElement("id","createLeadForm_firstNameLocal");
		type(localFname,firstNameLocal);
		WebElement localLname=locateElement("id","createLeadForm_lastNameLocal");
		type(localLname,lastNameLocal);
		WebElement leadTitle=locateElement("name","personalTitle");
		type(leadTitle,personalTitle);
		WebElement leadSource=locateElement("id","createLeadForm_dataSourceId");
		//type(leadSource,"Website");
		//selectDropDownUsingText(leadSource,"Website");
		selectDropDownUsingIndex(leadSource, 4);
		WebElement submitLead=locateElement("name","submitButton");
		click(submitLead);

	}

}






