package mukesh_assignment10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class assignmrnt_10 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://ineuron-courses.vercel.app/login");

				driver.findElement(By.name("email1")).sendKeys("ineuron@ineuron.ai");

				driver.findElement(By.name("password1")).sendKeys("Ineuron");

				driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();

	}

}
