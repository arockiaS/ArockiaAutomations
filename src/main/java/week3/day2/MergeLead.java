package week3.day2;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class MergeLead extends SeMethods{
	
	public void MergeLead()
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
	}

}