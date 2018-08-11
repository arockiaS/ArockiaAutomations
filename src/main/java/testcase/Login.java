package testcase;


import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class Login extends SeMethods{

	@Parameters({"url"})
	@BeforeMethod
	public void login() {
		startApp("chrome", "url");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
	}
	
	
}






