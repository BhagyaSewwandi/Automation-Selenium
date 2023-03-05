import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Event_Handling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bhagy\\Downloads\\Selenium\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();

		// Accept alert

		driver.findElement(By.linkText("JavaScript Alerts")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/button[1]")).click();

		// Using Alert class to first switch to or focus to the alert box
		Alert alert = (Alert) driver.switchTo().alert();
		alert.accept();

		// Confirm alert
//				driver.findElement(By.linkText("JavaScript Alerts")).click();
//				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/button[1]")).click();
//				Alert alert2 = (Alert) driver.switchTo().alert();
//				alert2.dismiss();

		// Capture the alert message
//				driver.findElement(By.linkText("JavaScript Alerts")).click();
//				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/button[1]")).click();
//				Alert alert3 = (Alert) driver.switchTo().alert();
//				String alerttext = alert3.getText();
//				System.out.println(alerttext);
//				alert3.dismiss();

		// Send some data to the alert box
//				driver.findElement(By.linkText("JavaScript Alerts")).click();
//				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/button[1]")).click();
//				Alert alert4 = (Alert) driver.switchTo().alert();
//				alert4.sendKeys("yes I know");
//				alert4.accept();
//				
				//driver.quit();
	}

}
