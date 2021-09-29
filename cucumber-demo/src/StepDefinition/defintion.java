package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class defintion {
	WebDriver driver;
	
	
	@Given("^i should be in Login Page$")
	public void i_should_be_in_Login_Page()  {
	    //what is my first step
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chrome driver 91\\chromedriver.exe");
		//i am trying to create a new instance of chrome driver
	    driver = new ChromeDriver();
	    //WedDriver driver - new ChromeDriver()
	    //ChromeDriver driver = new ChromeDriver()
	    //i want to be the login page //what should i do
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^Enter valid username and password and click on submit$")
	public void enter_valid_username_and_password_and_click_on_submit()  {
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    
	}

	@Then("^Login should be successfull$")
	public void login_should_be_successfull() throws InterruptedException  {
	   String Actual = driver.findElement(By.id("welcome")).getText();
	   String Expected = "Welcome Paul";
	   Assert.assertEquals(Expected, Actual);
	   //i will logout
	   driver.findElement(By.id("welcome")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]")).click();
	   System.out.println("I am Succesfull logout");
	   Thread.sleep(3000);
	   
	   driver.quit();
	    
	}



}
