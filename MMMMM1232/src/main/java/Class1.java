import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1 {

	public static void main(String[] args) throws InterruptedException, Exception  {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver test = new ChromeDriver();
		test.get("https://demo.automationtesting.in/Register.html");

		Thread.sleep(1000);
		test.manage().window().maximize();

		test.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 //Thread.sleep(1000);
		test.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("AAA");
		// Thread.sleep(1000);
		test.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("BBB");
		// Thread.sleep(1000);
		test.findElement(By.xpath("//textarea[@rows=\"3\"]")).sendKeys("aaaa", "bbbb", "cccc");
		// Thread.sleep(1000);
		test.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys("abc@gmail.com");
		// Thread.sleep(1000);
		test.findElement(By.xpath("//*[@type=\"tel\"]")).sendKeys("9876543211");
		// Thread.sleep(1000);
		//test.findElement(By.xpath("//input[@value='Male']")).click();
		//test.findElement(By.xpath("//input[@type=\"radio\"][@ng-model=\"radiovalue\"][@value=\"Male\"]")).click();
		
		boolean radio=test.findElement(By.xpath("//input[@value='Male']")).isDisplayed();
		System.out.println(radio);
		
		if(radio=true) {
			test.findElement(By.xpath("//input[@value='Male']")).click();
			}
		else {
			test.findElement(By.xpath("//input[@value='FeMale']")).click();
		}

		List<WebElement> checkbox_bt = test.findElements(By.xpath("//*[@type=\"checkbox\"]"));

		for (int i = 0; i < checkbox_bt.size(); i++) {
			WebElement checkbox = checkbox_bt.get(i);
			String value = checkbox.getAttribute("value");
			//System.out.println("values for" + value);

			if (value.equalsIgnoreCase("Cricket")) {
				checkbox.click();
				
			}
			if (value.equals("Movies")) {
				checkbox.click();
				break;
			}

		}
		JavascriptExecutor js = (JavascriptExecutor) test;
		js.executeScript("window.scrollBy(0,350)", "");
		test.findElement(By.xpath("//div[@id=\"msdd\"]")).click();

		List<WebElement> lang = test.findElements(By.xpath("//a[@class=\"ui-corner-all\"]"));
		for (int i = 0; i < lang.size(); i++) {
			WebElement list = lang.get(i);
			String value1 = list.getText();
			// System.out.println("values for " + value1);

			if (value1.equalsIgnoreCase("Hindi")) {
				list.click();
				break;
			}
		}

		List<WebElement> lan1 = test.findElements(By.xpath("//a[@class=\"ui-corner-all\"]"));
		for (int j = 0; j < lan1.size(); j++) {
			WebElement list2 = lan1.get(j);
			String value2 = list2.getText(); // System.out.println("values for" + value);

			if (value2.equalsIgnoreCase("Arabic")) {
				list2.click();
				break;
			}
		}
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) test;
		 * js.executeScript("window.scrollBy(0,350)", "");
		 * //test.findElement(By.xpath("//div[@id=\"msdd\"]")).click();
		 * test.findElements(By.xpath("//b[@role=\"presentation\"]"));
		 * 
		 * List<WebElement> country =
		 * test.findElements(By.xpath("//b[@role=\"presentation\"]")); for (int k = 0; k
		 * < country.size(); k++) { WebElement set1 = country.get(k); String mark =
		 * set1.getAttribute("title"); //System.out.println("values for" + mark);
		 * 
		 * if (mark.equalsIgnoreCase("India")) { set1.click(); break; }
		 * 
		 * }
		 */
		//test.findElements(By.xpath("//span[@class=\"select2-selection__rendered\"]"));
		//test.findElement("//ul[@id=\"select2-country-results\"]"),
		//test.findElement(By.xpath("//span[@id=\"select2-country-container\"]")).click();
		

		test.findElement(By.xpath("//input[@id=\"imagesrc\"]"))
				.sendKeys("C:\\Users\\User\\Downloads\\courseera documents\\test case for email-1_files");
		test.findElement(By.xpath("//*[@value=\"Java\"]")).click();
		// test.findElements(By.xpath("//*[@type=\"checkbox\"]"));
		// WebElement
		// lan_dropdown=test.findElements(By.xpath("//*[@type=\"checkbox\"]"));
		// test.findElement(By.xpath("//*[@id=\"msdd\"]")).sendKeys("English");
		// test.findElement(By.xpath("//*[@value=\"Java\"]")).click();
		// test.findElement(By.xpath("//span[@id=\"select2-country-container\"]")).click();
		test.findElement(By.xpath("//span[@role=\"combobox\"]")).click();
		test.findElement(By.xpath("//input[@class=\"select2-search__field\"]")).sendKeys("India");
		test.findElement(By.xpath("//li[@class=\"select2-results__option select2-results__option--highlighted\"]")).click();

		//WebElement month_dropdown = test.findElement(By.id("title"));

		//Select month_dd = new Select(month_dropdown);
		
		//month_dd.selectByVisibleText("India");
		test.findElement(By.xpath("//select[@id=\"yearbox\"]//option[@value=\"2000\"]")).click();
		test.findElement(By.xpath("//select[@placeholder=\"Month\"]//option[@value=\"April\"]")).click();
		test.findElement(By.xpath("//select[@placeholder=\"Day\"]//option[@value=\"21\"]")).click();

		test.findElement(By.xpath("//input[@id=\"firstpassword\"]")).sendKeys("12345678");
		test.findElement(By.xpath("//input[@id=\"secondpassword\"]")).sendKeys("12345678");
		
		test.findElement(By.xpath("//button[@id=\"submitbtn\"]")).click();
		
		test.findElement(By.xpath("//div[@class=\"container center\"]")).click();
		JavascriptExecutor js1 = (JavascriptExecutor) test;
		js1.executeScript("window.scrollBy(0,-300)", "");
		
		TakesScreenshot ts=((TakesScreenshot)test);
		File screenshot=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("./Screenshots/demo.png"));
		System.out.println("Screenshot Taken");
		
		test.findElement(By.xpath("//div[@class=\"container center\"]")).click();
		JavascriptExecutor js2 = (JavascriptExecutor) test;
		js2.executeScript("window.scrollBy(0,300)", "");
		
		TakesScreenshot ts2=((TakesScreenshot)test);
		File screenshot2=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot2, new File("./Screenshots/demo1.png"));
		System.out.println("Screenshot2 Taken");
		
		//test.quit();

	}

}
