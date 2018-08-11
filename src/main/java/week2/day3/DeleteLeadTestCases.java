package week2.day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DeleteLeadTestCases {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//ChromeOptions option=new ChromeOptions();
		//option.setHeadless(true);
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1300, 578));
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		WebElement password=driver.findElementById("password");
		password.sendKeys("crmsfa");
		WebElement submit=driver.findElementByClassName("decorativeSubmit");
		submit.click();
		
		WebElement crmfa=driver.findElementByLinkText("CRM/SFA");
		crmfa.click();
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//div[@class='x-form-item x-tab-item'])[2]//*[contains(@name,'firstName')]").sendKeys("Arockia");
		driver.findElementByXPath("//div[@class='x-panel-footer x-panel-footer-noborder']//button[@class='x-btn-text']").click();
		Thread.sleep(3000);
		WebElement leadID=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a[text()='Arockia']//preceding::a[2]");
		String leadNameID=leadID.getText();
		System.out.println("Selected Lead ID for Deletions is -"+leadNameID);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a[text()='Arockia']").click();
		Thread.sleep(3000);
					
		driver.findElementByXPath("//div[@class='frameSectionExtra']//a[text()='Delete']").click();
		System.out.println("Selected Lead "+leadNameID+" is Deleted Successfully");
		//Search Lead ID:
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-form-item x-tab-item'])[1]//*[contains(@name,'id')]").sendKeys(leadNameID);
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='x-panel-footer x-panel-footer-noborder']//button[@class='x-btn-text']").click();
		Thread.sleep(3000);
		WebElement errorMsg=driver.findElementByXPath("//div[@class='x-paging-info']");
		String errorMessage=errorMsg.getText();
		System.out.println("Displayed Error message is:"+errorMessage);
		driver.close();
		
		
	}

}
