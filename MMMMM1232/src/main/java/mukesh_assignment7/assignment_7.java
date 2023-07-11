package mukesh_assignment7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		boolean isUsernamePresent = driver.findElement(By.xpath("//input[@placeholder='Username']")).isDisplayed();
		boolean isPasswordPresent = driver.findElement(By.xpath("//input[@placeholder='Username']")).isDisplayed();

		System.out.println("Username field present: " + isUsernamePresent);
		System.out.println("Password field present: " + isPasswordPresent);

		String usernameBorder = driver.findElement(By.xpath("//input[@placeholder='Username']")).getCssValue("border");
		String passwordBorder = driver.findElement(By.xpath("//input[@placeholder='Username']")).getCssValue("border");

		System.out.println("Username field border: " + usernameBorder);
		System.out.println("Password field border: " + passwordBorder);

		System.out.println(
				"===============================================================================================================================");

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		String message = driver.findElement(By.xpath(
				"//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']"))
				.getText();

		System.out.println("Message displayed: " + message);

		System.out.println(
				"===============================================================================================================================");

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("mukesh");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("mukesh");

		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		String errorMessage = driver.findElement(By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']"))
				.getText();

		System.out.println("Error message: " + errorMessage);

		boolean invalidCredentials = errorMessage.contains("Invalid credentials");

		System.out.println("Invalid credentials: " + invalidCredentials);

		System.out.println(
				"===============================================================================================================================");

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		String url = driver.getCurrentUrl();

		if (url.contains("dashboard")) {
			System.out.println("URL contains dashboard");
		} else {
			System.out.println("URL does not contain dashboard");
		}

		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();

		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();

		if (driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
			System.out.println("User is able to navigate to the login page");
		} else {
			System.out.println("User is not able to navigate to the login page");
		}
		
		driver.quit();

		System.out.println(
				"===============================================================================================================================");
		

		WebDriverManager.edgedriver().setup();
		WebDriver driver1 = new EdgeDriver();
		
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver1.manage().window().maximize();

		driver1.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		boolean isUsernamePresent1 = driver1.findElement(By.xpath("//input[@placeholder='Username']")).isDisplayed();
		boolean isPasswordPresent1 = driver1.findElement(By.xpath("//input[@placeholder='Username']")).isDisplayed();

		System.out.println("Username field present: " + isUsernamePresent1);
		System.out.println("Password field present: " + isPasswordPresent1);

		String usernameBorder1 = driver1.findElement(By.xpath("//input[@placeholder='Username']")).getCssValue("border");
		String passwordBorder1 = driver1.findElement(By.xpath("//input[@placeholder='Username']")).getCssValue("border");

		System.out.println("Username field border: " + usernameBorder1);
		System.out.println("Password field border: " + passwordBorder1);

		System.out.println(
				"===============================================================================================================================");

		driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver1.manage().window().maximize();

		driver1.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

		driver1.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		String message1 = driver1.findElement(By.xpath(
				"//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']"))
				.getText();

		System.out.println("Message displayed: " + message1);

		System.out.println(
				"===============================================================================================================================");

		driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver1.manage().window().maximize();
		driver1.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("mukesh");
		driver1.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("mukesh");

		driver1.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		String errorMessage1 = driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]"))
				.getText();

		System.out.println("Error message: " + errorMessage1);

		boolean invalidCredentials1 = errorMessage1.contains("Invalid credentials");

		System.out.println("Invalid credentials: " + invalidCredentials1);

		System.out.println(
				"===============================================================================================================================");

		driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver1.manage().window().maximize();

		driver1.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver1.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

		driver1.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		String url1 = driver1.getCurrentUrl();

		if (url1.contains("dashboard")) {
			System.out.println("URL contains dashboard");
		} else {
			System.out.println("URL does not contain dashboard");
		}

		driver1.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();

		driver1.findElement(By.xpath("//a[normalize-space()='Logout']")).click();

		if (driver1.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
			System.out.println("User is able to navigate to the login page");
		} else {
			System.out.println("User is not able to navigate to the login page");
		}
		
		driver1.quit();

		System.out.println(
				"===============================================================================================================================");

		
	}

}
