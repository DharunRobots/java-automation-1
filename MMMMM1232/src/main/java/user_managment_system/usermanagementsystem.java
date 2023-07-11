package user_managment_system;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class usermanagementsystem {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8080/UserManagment/home.html");
		driver.manage().window().maximize();
		// username
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Admin");
		// email
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Admin@gmail.com");
		// mobile
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("1234567890");
		// dob
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("12/04/2022");
		// city
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[5]/td[2]/select[1]/option[2]"))
				.click();
		// gender
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='female']")).click();
		// Register
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();

		// cancel
		// driver.findElement(By.xpath("//button[normalize-space()='cancel']")).click();

		// home
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Home']")).click();

		// show user
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Show Users']")).click();

		// home
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Home']")).click();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
