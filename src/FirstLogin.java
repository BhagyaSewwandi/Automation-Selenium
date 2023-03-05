import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstLogin {
	public static void main(String[] args) {

		// WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bhagy\\Downloads\\Selenium\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();

		// Fetch the text "This is sample text." and print it on console

		String titleText = driver.findElement(By.className("heading")).getText();
		System.out.println(titleText);

		// Use the linkText locator method to find the link and perform click using
		// click() method
		driver.findElement(By.linkText("A/B Testing")).click();

		// Locate the radio button/check box by xpath and check it using click()function
		driver.findElement(By.linkText("Checkboxes")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/input[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/input[2]")).click();

		driver.findElement(By.linkText("Dropdown")).click();
		Select dropdown = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/select[1]")));
		dropdown.selectByVisibleText("Option 1");

//********************************************************
// Drag and Drop

//		  driver.findElement(By.linkText("Drag and Drop")).click();
//		  
//		 //WebElement on which drag and drop operation needs to be performed
//		 WebElement from = driver.findElement(By.id("column-b"));
//		  
//		 //WebElement to which the above object is dropped WebElement to =
//		 WebElement to = driver.findElement(By.id("column-a"));
//		
//		 //Creating object of Actions class to build composite actions Actions action
//		  Actions act = new Actions(driver);
//		  
//		 //Performing the drag and drop action action.dragAndDrop(from,
//		 act.dragAndDrop(from, to).build().perform();

		// driver.close();
	}

}
