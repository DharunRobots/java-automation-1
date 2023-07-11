import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class formnxt1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver abc = new ChromeDriver();

		abc.get("https://forumqc.forumnxt.com/iforumsp_qc/index.php");
		abc.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		abc.manage().window().maximize();

		abc.findElement(By.xpath("//input[@id=\"AuthUserName\"]")).sendKeys("HULL");
		abc.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
		abc.findElement(By.xpath("//input[@class=\"green-button\"][@onclick=\"submitForm()\"]")).click();
		
	
		
		abc.findElement(By.id("Salesforce")).click();
		abc.findElement(By.xpath("//a[@href=\"index.php?module=xSalesman&action=EditView&return_action=index&parenttab=Salesforce\"]")).click();
		
		abc.findElement(By.xpath("//input[@id='salesman']")).sendKeys("Dharun");
		abc.findElement(By.xpath("//input[@id='sman_mobile']")).sendKeys("9876543214");
	
		
		abc.findElement(By.className("combo-arrow")).click();
		
		abc.findElement(By.xpath("//div[contains(text(),\"SCG67\")]")).click();
		
		WebElement dropdown=abc.findElement(By.xpath("//select[@name=\"classification\"]"));
		dropdown.click();
		Select dd=new Select(dropdown);
		dd.selectByVisibleText("USR");
		
		
		
		abc.findElement(By.xpath("//body[1]/table[5]/tbody[1]/tr[1]/td[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/input[5]")).click();
		Thread.sleep(10000);
		TakesScreenshot ts2=((TakesScreenshot)abc);
		File screenshot2=ts2.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot2, new File("./Screenshots/demo3.png"));
		
		abc.quit();
		
	}

}
