package Testing_19bcs1265;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://nbl.one");
	    driver.manage().window().maximize();
	    List <WebElement> quest = driver.findElements(By.xpath("//*[@id=\"comment-quill-wrapper\"]/div/div[1]/p"));
	    //driver.findElement(By.xpath("//*[@id=\"navigation__mobile__top\"]/div/div/div[1]/div/a[1]")).click();
	    //System.out.println(quest.size());
	    //System.out.println(driver.findElement(By.xpath("/html/body")).getbox());
	    driver.findElement(By.xpath("//*[@id=\"navigation__mobile__top\"]/div/div/div[1]/div/a[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"carousel__container\"]/div/div/div/div[1]/div/div/div/div/section/div[2]/section/section/div[1]/p")).click();
	    driver.findElement(By.id("skylift-im-interested")).click();
	    driver.findElement(By.id("login-modal-continue-with-email\r\n")).click();
	    driver.findElement(By.xpath("//input[@type = \"email\"]")).sendKeys("nehagupz333@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/div[2]/div[2]/div[3]/div/div[2]/button"));
	    
	    driver.quit();
	    
	}
	
}
