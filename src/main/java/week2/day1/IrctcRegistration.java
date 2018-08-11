package week2.day1;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class IrctcRegistration {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//Background Execution:
		
		//ChromeOptions option=new ChromeOptions();
		//option.setHeadless(true);
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Browse Execution window size modification
		//driver.manage().window().setSize(new Dimension(1300, 578));
		
		driver.get("https://www.google.com/");
		WebElement googleSearch=driver.findElementById("lst-ib");
		googleSearch.sendKeys("irctc registration");
		googleSearch.sendKeys(Keys.TAB.ENTER);
		Thread.sleep(3000);
		driver.findElementByLinkText("Registration Form - IRCTC Next Generation eTicketing System").click();
		
		//IRCTC Login Page:
		//User Name:
		WebElement userName=driver.findElementById("userRegistrationForm:userName");
		userName.sendKeys("arinthuuu");
		userName.sendKeys(Keys.TAB);
		driver.findElementById("userRegistrationForm:checkavail").click();
		Thread.sleep(3000);
		WebElement availCheck=driver.findElementById("userRegistrationForm:useravail");
		availCheck.isDisplayed();
		driver.findElementById("userRegistrationForm:password").sendKeys("Rajselva81@");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Rajselva81@");
		
		WebElement securityQuestion=driver.findElementById("userRegistrationForm:securityQ");
		Select secretQues=new Select(securityQuestion);
		List<WebElement> allSecretQuestions=secretQues.getOptions();
		secretQues.selectByVisibleText("What was the name of your first school?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("srani");
		
		WebElement preferLanguage=driver.findElementById("userRegistrationForm:prelan");
		Select preLan=new Select(preferLanguage);
		List<WebElement> allLanguages=secretQues.getOptions();
		preLan.selectByVisibleText("English");
		
		//User Details:
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Arockia");
		WebElement selectGender=driver.findElementById("userRegistrationForm:gender:0");
		selectGender.click();
		selectGender.isSelected();
		if(selectGender.isSelected())
		{
			System.out.println("Male GenderSelected");
		}
		WebElement selectMarital=driver.findElementById("userRegistrationForm:maritalStatus:1");
		selectMarital.click();
		selectMarital.isSelected();
		if(selectMarital.isSelected())
		{
			System.out.println("Marital Stauts Selected as Unmarried");
		}
			
		//DOB Selection:
		//Date:
		WebElement dateOfBirth=driver.findElementById("userRegistrationForm:dobDay");
		Select selectDate=new Select(dateOfBirth);
		List<WebElement> allDates=selectDate.getOptions();
		selectDate.selectByVisibleText("10");
		dateOfBirth.sendKeys(Keys.TAB);
		
		//Month:
		WebElement monthOfBirth=driver.findElementById("userRegistrationForm:dobMonth");
		Select selectMonth=new Select(monthOfBirth);
		List<WebElement> allMonths=selectMonth.getOptions();
		selectMonth.selectByVisibleText("SEP");
		monthOfBirth.sendKeys(Keys.TAB);
		
		//Year:
		WebElement yearOfBirth=driver.findElementById("userRegistrationForm:dateOfBirth");
		Select selectYear=new Select(yearOfBirth);
		List<WebElement> allYears=selectMonth.getOptions();
		selectYear.selectByVisibleText("1989");
		yearOfBirth.sendKeys(Keys.TAB);
		System.out.println("DOB Selected");
		
		//Select Occupatioins:
		WebElement occupations=driver.findElementById("userRegistrationForm:occupation");
		Select occupation=new Select(occupations);
		List<WebElement> allOccupations=occupation.getOptions();
		occupation.selectByVisibleText("Private");
		occupations.sendKeys(Keys.TAB);
		System.out.println("Occupations Details selected");
		
		WebElement country=driver.findElementById("userRegistrationForm:countries");
		Select selectCountry=new Select(country);
		selectCountry.selectByVisibleText("India");
		country.sendKeys(Keys.TAB);
		System.out.println("Country of User Details selected");
		
		//Email & Mobile Capture:
		driver.findElementById("userRegistrationForm:email").sendKeys("rajselva81@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9843433856");
		
		//Nationality Selection:
		WebElement nationality=driver.findElementById("userRegistrationForm:nationalityId");
		Select selectNation=new Select(nationality);
		selectNation.selectByVisibleText("India");
		nationality.sendKeys(Keys.TAB);
		System.out.println("nationality of User Details selected");
		
		driver.findElementById("userRegistrationForm:address").sendKeys("No.116");
		WebElement pincode=driver.findElementById("userRegistrationForm:pincode");
		pincode.sendKeys("624002");
		pincode.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		
		//State Validation:
		WebElement stateOfIndian=driver.findElementById("userRegistrationForm:statesName");
		String stateName=stateOfIndian.getText();
		System.out.println(stateName);
		if(stateName=="TAMIL NADU")
		{
			System.out.println("Entered PINCODE Available in"+stateName+"State");
		}
			
		
		WebElement citySelect=driver.findElementById("userRegistrationForm:cityName");
		Select selectCity=new Select(citySelect);
		selectCity.selectByVisibleText("Dindigul");
		citySelect.sendKeys(Keys.TAB);
		System.out.println("City Selected from the state which selected:");
		Thread.sleep(8000);
		
		WebElement postOfficeName=driver.findElementById("userRegistrationForm:postofficeName");
		Select selectPostOffice=new Select(postOfficeName);
		selectPostOffice.selectByVisibleText("Ponnimandurai B.O");
		postOfficeName.sendKeys(Keys.TAB);
		System.out.println("Selected PostOffice from this city ");
		
		//Capture Landline
		driver.findElementById("userRegistrationForm:landline").sendKeys("9843433856");
		WebElement copyAddress=driver.findElementById("userRegistrationForm:resAndOff:0");
		copyAddress.click();
		if(copyAddress.isSelected())
		{
			System.out.println("Residence Address are Mapped to Office Address");
		}
		
		driver.close();
		
		/*if(availCheck.isDisplayed())
		{
			WebElement userName1=driver.findElementById("userRegistrationForm:userName");
			userName1.sendKeys("arinthuuu");
			userName1.sendKeys(Keys.TAB);
			driver.findElementById("userRegistrationForm:checkavail").click();
			Thread.sleep(3000);
			WebElement availCheck1=driver.findElementById("userRegistrationForm:useravail");
		}*/
		}
		
		
	}
