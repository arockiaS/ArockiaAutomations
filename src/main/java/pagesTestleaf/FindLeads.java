package pagesTestleaf;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class FindLeads extends Annotations
{

	public FindLeads() 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[@class='x-form-item x-tab-item'])[2]//*[contains(@name,'firstName')]")
	WebElement findFname;
	
	@FindBy(xpath="//div[@class='x-panel-footer x-panel-footer-noborder']//button[@class='x-btn-text']")
	WebElement clickFindLead;
	
	@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a[text()='Arockia']")
	WebElement selectEditableLead;
	
	public FindLeads enterFirstName(String fname)
	{
		type(findFname, fname);
		return this;
				
	}
	
	public FindLeads clickFindLead()
	{
		click(clickFindLead);
		return this;
				
	}
	
	
	public ViewLead selectLeadEditable()
	{
		click(selectEditableLead);
		return new ViewLead();
				
	}
	
	
	
	

}
