package Selenium.Auto_IT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pop_Up_Authenication_Handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		General
//		driver.get("https://the-internet.herokuapp.com/"); 
		
//		Handle popup and authenication
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Basic Auth")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p")).getText());
		
		driver.close();

	}

}
