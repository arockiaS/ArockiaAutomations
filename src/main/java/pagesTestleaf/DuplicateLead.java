package pagesTestleaf;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class DuplicateLead extends Annotations 
{

	public DuplicateLead() 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@value='Create Lead']")
	WebElement eleClickCreateLead;
	
	public ViewLead clickDuplication()
	{
		click(eleClickCreateLead);
		return new ViewLead();
	}

}
