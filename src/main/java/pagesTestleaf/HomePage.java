package pagesTestleaf;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class HomePage extends Annotations

{

	public HomePage()
	{
		//PageFactory.initElements(Driver, this);
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="CRM/SFA")
	WebElement eleCrmsfa;
	
	@FindBy(linkText="Docs Wiki")
	WebElement eleDocswiki;
	
	@FindBy(linkText="eCommerce")
	WebElement eleeCommerce;
	
	public MyHome clickCRMSFA()
	{
		click(eleCrmsfa);
		return new MyHome();
		
	}
	
	
}
