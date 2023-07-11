package AlertHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dpDowns_google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("selenium");
		
		List<WebElement> l1=driver.findElements(By.xpath("//div[@role=\"presentation\"]"));
		
		Thread.sleep(2000);
		//System.out.println(l1.size());
		for(int i=0;i<l1.size();i++) 
		{
			WebElement ele=l1.get(i);
			String text=ele.getText();
			System.out.println(text);
			
		}	

	}

}
