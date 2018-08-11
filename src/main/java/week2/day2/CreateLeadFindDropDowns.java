package week2.day2;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadFindDropDowns {

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
		
		WebElement createlead=driver.findElementByLinkText("Create Lead");
		createlead.click();
		Thread.sleep(3000);
		
		List<WebElement> allOptions=driver.findElementsByTagName("select");
		int totalDropsDowns=allOptions.size();
		System.out.println(totalDropsDowns);
		for(WebElement printAllDropsDowns:allOptions)
		{
			System.out.println(printAllDropsDowns.getText());
		}
		
		}

}
