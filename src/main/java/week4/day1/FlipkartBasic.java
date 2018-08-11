package week4.day1;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class FlipkartBasic extends SeMethods 
{

	@Test
	public void flipkartlogin() throws InterruptedException
	{
	startApp("chrome", "https://www.flipkart.com/");
	WebElement closebutton=locateElement("xpath","//button[text()='✕']");
	click(closebutton);
	WebElement tvApplianceHeader=locateElement("xpath","//span[text()='TVs & Appliances']");
	WebElement samsung=locateElement("xpath","//ul[@class='QPOmNK']//span[text()='Samsung']//following::ul[@class='QPOmNK']//span[text()='Samsung']");
	actionsClick(tvApplianceHeader, samsung);
	//WebElement minPrice=locateElement("xpath","//option[@value='25000' and contains(text(),'₹25000')]");
	WebElement minPrice=locateElement("xpath","//select[@class='fPjUPw']");
	click(minPrice);
	selectDropDownUsingText(minPrice, "₹25000");	
	Thread.sleep(2000);
	WebElement maxPrice=locateElement("xpath","//select[@class='fPjUPw']//following::select[@class='fPjUPw']");
	click(maxPrice);
	selectDropDownUsingText(maxPrice, "₹60000");
	WebElement selectScreenSize=locateElement("xpath","//div[text()='Screen Size']");
	click(selectScreenSize);
	WebElement selectSize=locateElement("xpath","//div[text()='Screen Size']//following::div[@class='_1p7h2j'][4]");
	click(selectSize);
	WebElement firstproduct=locateElement("xpath","//img[@class='_1Nyybr _30XEf0']");
	click(firstproduct);
	switchToWindow(1);
	WebElement clickCompare=locateElement("xpath","//input[@type='checkbox']//following::div[@class='_1p7h2j']");
	click(clickCompare);
	closeBrowser();
	switchToWindow(0);
	WebElement secondProduct=locateElement("xpath","//img[@class='_1Nyybr _30XEf0']//following::img[@class='_1Nyybr _30XEf0']//following::img[@class='_1Nyybr _30XEf0']");
	click(secondProduct);
	switchToWindow(1);
	WebElement clicksecondCompare=locateElement("xpath","//input[@type='checkbox']//following::div[@class='_1p7h2j']");
	click(clicksecondCompare);
	closeBrowser();
	switchToWindow(0);
	WebElement commonCompare=locateElement("xpath","//span[text()='COMPARE']");
	click(commonCompare);
	WebElement amtTwo=locateElement("xpath","//div[@class='_1vC4OE']//following::div[@class='_1vC4OE']");
	String amounttwo=getText(amtTwo);
	String amTwo=amounttwo.replaceFirst("₹", "").replaceFirst(",", "");
	int secondAmount=Integer.parseInt(amTwo);
	WebElement amtOne=locateElement("xpath","//div[@class='_1vC4OE']");
	String amountOne=getText(amtOne);
	String amone=amountOne.replaceFirst("₹", "").replaceFirst(",", "");
	int firstAmount=Integer.parseInt(amone);
	WebElement buynowone=locateElement("xpath","//button[@class='_2AkmmA _2Npkh4 _2kuvG8 e1kKGU _7UHT_c']");
	WebElement buynowTwo=locateElement("xpath","//button[@class='_2AkmmA _2Npkh4 _2kuvG8 e1kKGU _7UHT_c']//following::button[@class='_2AkmmA _2Npkh4 _2kuvG8 e1kKGU _7UHT_c']");
	
	if(firstAmount>secondAmount)
	{
		click(buynowone);
	}
	else
	{
		click(buynowTwo);
	}
	
	
	}
}
