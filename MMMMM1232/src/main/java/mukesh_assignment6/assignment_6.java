package mukesh_assignment6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// for Username
		driver.findElement(By.xpath("//input[@name='username']"));
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("abc");
		driver.findElement(By.xpath("//input[contains(@placeholder,\"Username\")]")).clear();

		driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).click();
		driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("abc");
		driver.findElement(By.cssSelector("input[name^=\"username\"]")).clear();

		// for password
		driver.findElement(By.xpath("//input[@name='password']")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("123");
		driver.findElement(By.xpath("//input[contains(@placeholder,\"Password\")]")).clear();

		driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).click();
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("123");
		driver.findElement(By.cssSelector("input[name^=\"password\"]")).clear();

		// for login
		driver.findElement(
				By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]"));
		driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		driver.findElement(By.xpath(
				"//button[contains(@class,\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\")]"));

		driver.findElement(By.cssSelector("button[type^=\"submit\"]"));
		driver.findElement(By.cssSelector(
				"button[class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]"));
		driver.findElement(By.cssSelector("button[type=\"submit\"]"));

		System.out.println(
				"=======================================================================================================================================");

		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.quit();

		System.out.println(
				"========================================================================================================================================");

		/*
		 * Select dd=new Select(driver.findElement(By.
		 * xpath("//li[@class=\"oxd-main-menu-item-wrapper\"]//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"]"
		 * ))); dd.selectByVisibleText("Admin");
		 */
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//li[1]//a[1]//span[1]")).click();

	}

}
