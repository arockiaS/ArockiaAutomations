package week2.day2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindLead {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

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
		WebElement findLead=driver.findElementByLinkText("Find Leads");
		findLead.click();
		//findLead.sendKeys(Keys.TAB);
		WebElement clickFindDetails=driver.findElementByXPath("//button[@type='button' and contains(text(),'Find Leads')]");
		clickFindDetails.click();
		
		
		
	}

}
