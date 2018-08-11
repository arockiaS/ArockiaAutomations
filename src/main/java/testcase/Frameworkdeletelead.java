package testcase;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class Frameworkdeletelead extends Annotations {
@Test
	public  void deletelead() {
		// TODO Auto-generated method stub
		
		/*startApp("chrome","http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement crmsfa = locateElement("link","CRM/SFA");
	    click(crmsfa);*/
	    WebElement Leadlink=locateElement("link","Leads");
	    click(Leadlink);
	    WebElement FindLeadlink=locateElement("link","Find Leads");
	    click(FindLeadlink);
	    WebElement firstname = locateElement("xpath","//span[contains(text(),'Find by')]/following::input[2]");
		type(firstname,"guga");
		WebElement FindLeadsbutton = locateElement("xpath","//span[contains(text(),'Name and ID')]//following::button[1]");
		click(FindLeadsbutton);
		WebElement firstlead = locateElement("xpath","//a[contains(text(),'11420')]");
		click(firstlead);
		WebElement deletebutton=locateElement("xpath","//a[@class='subMenuButtonDangerous']");
		click(deletebutton);
		WebElement FindLeadlink2=locateElement("link","Find Leads");
	    click(FindLeadlink2);
	    WebElement leadidenter=locateElement("xpath","//input[@name='id']");
	    type(leadidenter,"11420");
	    WebElement findleadsclick=locateElement("xpath","//span[contains(text(),'Name and ID')]//following::button[1]");
		click(findleadsclick);
		WebElement errormessage = locateElement("xpath","//div[contains(text(),'No records to display')]");
		verifyPartialText(errormessage,"No records" );
		//closeBrowser();
	    
	    

	}

}