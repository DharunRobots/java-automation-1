package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifypagrtitle {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.navigate().to("https://www.google.co.in/");
	
		String my_title=driver.getTitle();
		String expected_titlt="Google";
		
	}

}
