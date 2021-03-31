package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/NobleProg/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

		Actions act = new Actions(driver);

		WebElement signIn=driver.findElement(By.id("nav-link-accountList"));
		
		
		act.moveToElement(signIn)
				.contextClick(driver.findElement(By.xpath("//*[text()='Account']"))).build().perform();
		
		

	}

}
