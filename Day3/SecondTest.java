package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ajithkumar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Amaravathy");
		driver.findElement(By.name("generalProfTitle")).sendKeys("QA");
		Thread.sleep(3000);
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
		
		
	}
	
   }
