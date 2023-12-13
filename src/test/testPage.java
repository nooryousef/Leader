package test;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.bouncycastle.asn1.cmp.Challenge.Rand;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class testPage  extends Parameter {

	
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void setup() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(3));


	}
	
	
	@Test(priority= 1)
	public void  creatAcount() throws InterruptedException  {
		driver.get(signInUrl);
		WebElement Theemail = driver.findElement(By.id ("reg_email"));
		WebElement Thepasword = driver.findElement(By.id("reg_password"));
		
		Theemail.sendKeys(email_address);
		Thepasword.sendKeys(paswordnum); 
		
		WebElement thebouttun = driver.findElement(By.className("woocommerce-Button"));
		thebouttun.click();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(3));
		
Thread.sleep(10);

WebElement email = driver.findElement(By.id ("username"));
WebElement pasword = driver.findElement(By.id("password"));
	
	email.sendKeys(email_address);
	pasword.sendKeys(paswordnum); 
	

	WebElement donebouttun = driver.findElement(By.xpath(doneXpath));

	donebouttun.click();
	
		
		
		}
	
	
//	@Test(priority = 2)
//	public void  login() throws InterruptedException  {
//
//		WebElement email = driver.findElement(By.id ("username"));
//	WebElement pasword = driver.findElement(By.id("password"));
//		
//		email.sendKeys(email_address);
//		pasword.sendKeys(paswordnum); 
//		
//
//		WebElement donebouttun = driver.findElement(By.xpath(doneXpath));
//
//		donebouttun.click();
//		
//		
//	}
  @Test(priority = 3)
  public void  changePassword()  {
//  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
  	driver.get(passwordUrl);
	WebElement firstName = driver.findElement(By.id (Namef));
	WebElement lastName = driver.findElement(By.id(Namel));
	WebElement disName = driver.findElement(By.id(Namenick));
	WebElement Gmail = driver.findElement(By.id(Emailid));
	WebElement pass = driver.findElement(By.id(passwordId));
	WebElement password = driver.findElement(By.id(passwordchangeId));
	WebElement password1 = driver.findElement(By.id(passwordconfId));
	firstName.sendKeys(FirstName);
	lastName.sendKeys(LastName);
	disName .sendKeys(FirstName+LastName);
	Gmail.sendKeys(email_address);
	pass .sendKeys(paswordnum);
	password .sendKeys(newPass);
	 password1.sendKeys(newPass);
  	
	 
	 WebElement endbouttun = driver.findElement(By.xpath(Done));
		endbouttun.click();
	 
  }
	
	@Test(priority = 4)
	public void  randomItem() throws InterruptedException  {
		driver.get("https://leaders.jo/en/lg/");
		WebElement ItemsContainer = driver.findElement(By.className("row-cols-2"));
		List<WebElement> allItems = ItemsContainer.findElements(By.className("ajax_add_to_cart"));
		int randomItem = rand.nextInt(allItems.size());


	
		String Abc =allItems.get(randomItem).getAttribute("href");
		Thread.sleep(5);
		driver.get(Abc);
		
	}
	
	
		
	@AfterTest
	public void posttest() {
	}
	
	
	

}
