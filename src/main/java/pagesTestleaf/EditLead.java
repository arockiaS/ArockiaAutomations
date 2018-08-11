package pagesTestleaf;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class EditLead extends Annotations
{

	public EditLead() 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="updateLeadForm_companyName")
	WebElement companyName;
	
	@FindBy(xpath="//input[@value='Update']")
	WebElement eleclickUpdate;
	
	String updatingCname;
	
	public EditLead clearCompanyName()
	{
		companyName.clear();
		return this;
		
	}
	
	public EditLead updateCompanyName(String upCompanyName)
	{
		type(companyName,upCompanyName);
		companyName.sendKeys(Keys.TAB);
		return this;
		
	}
	
	public EditLead getUpdatedCompanyName()
	{
		updatingCname=companyName.getText();
		System.out.println("Updating Company Name"+updatingCname);
		companyName.sendKeys(Keys.TAB);
		return this;
		
	}
	
	public ViewLead clickUpdate()
	{
		click(eleclickUpdate);
		return new ViewLead();
	}
	
	
}
