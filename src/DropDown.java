import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bhagy\\Downloads\\Selenium\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		// selectByIndex - It is used to select an option based on its index, beginning with 0
		
		// Select dropdown = new Select(driver.findElement(By.className("product_sort_container")));
		// dropdown.selectByIndex(2);

		// selectByValue - It is used to select an option based on its 'value'attribute
		
		// WebElement dropdown2 = driver.findElement(By.className("product_sort_container"));
		// Select testDropdown = new Select(dropdown2);
		// testDropdown.selectByValue("hilo");

		// selectByVisibleText - It is used to select an option based on the text over the option
		
			Select dropdown3 = new Select(driver.findElement(By.className("product_sort_container")));
			dropdown3.selectByVisibleText("Name (Z to A)");

	}

}
