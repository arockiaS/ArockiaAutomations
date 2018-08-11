package testcase;


import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import wdMethods.SeMethods;

public class CreateLead extends Annotations{
	@Test(dataProvider ="TestData")

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
	@DataProvider(name ="TestData")

	public Object [][] getdata()
	{
		Object[][] data = new Object [2][6];
		data [0][0] = "Tata Consultancy Services Pvt";
		data [0][1] = "Anisha";
		data [0][2] = "Arockia";
		data [0][3] = "Sebastiyan";
		data [0][4] = "Mitu898";
		data [0][5] = "Mrs";

		data [1][0] = "Consultancy Services Pvt";
		data [1][1] = "isha";
		data [1][2] = "Akia";
		data [1][3] = "stiyan";
		data [1][4] = "Mit";
		data [1][5] = "Mr";

		return  data;
	}
}






