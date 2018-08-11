package week4.day1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/");
		WebElement elementDroppable = driver.findElementByXPath("//a[text()='Droppable']");
		elementDroppable.click();
		
		Actions builder=new Actions(driver);
		WebElement frameFind = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frameFind);
		WebElement frameDraggableSource = driver.findElementById("draggable");
		WebElement frameDropTarget = driver.findElementById("droppable");
		
		builder.dragAndDrop(frameDraggableSource, frameDropTarget).perform();
		System.out.println("Selected draggable has been mooved to another droppable");
		driver.switchTo().defaultContent();
		//Droppable
		WebElement elementDraggable = driver.findElementByXPath("//a[text()='Draggable']");
		elementDraggable.click();
		WebElement frameFind1 = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frameFind1);
		WebElement dragToFreeHand = driver.findElementById("draggable");
		builder.dragAndDropBy(dragToFreeHand, 100, 100).perform();
		System.out.println("Selected draggable has been mooved to Free Location");
		driver.switchTo().defaultContent();
		//Selectable
		//driver.findElementById("Sortable");
		WebElement elementSelectable = driver.findElementByXPath("//a[text()='Selectable']");
		elementSelectable.click();
		WebElement frameFind2 = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frameFind2);
		WebElement sourceOne = driver.findElementByXPath("//ol[@id='selectable']/li[1]");
		WebElement sourceTwo = driver.findElementByXPath("//ol[@id='selectable']/li[5]");
		
		//builder.clickAndHold(sourceOne).release(sourceTwo);
		builder.dragAndDrop(sourceOne, sourceTwo).perform();
		System.out.println("Selectable completed");
		driver.switchTo().defaultContent();
		///Sortabe:
		
		WebElement elementSortable = driver.findElementByXPath("//a[text()='Sortable']");
		elementSortable.click();
		WebElement frameFind3 = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frameFind3);
		WebElement sourceSortOne = driver.findElementByXPath("//ul[@id='selectable']/li[1]");
		WebElement sourceSortTwo = driver.findElementByXPath("//ul[@id='selectable']/li[5]");
		int y=sourceSortTwo.getLocation().getY();
		//builder.clickAndHold(sourceOne).release(sourceTwo);
		//builder.dragAndDrop(sourceOne, sourceTwo).perform();
		builder.dragAndDropBy(sourceSortOne, 0, y).perform();
		System.out.println("Selectable completed");
		driver.switchTo().defaultContent();
		
		
		
		
		
		
	}

}
