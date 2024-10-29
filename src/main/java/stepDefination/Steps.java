package stepDefination;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseTest {
	
	//WebDriver driver;
	
	@Given("^user is on home page$")
	public void user_is_on_home_page() {
//	    driver = new ChromeDriver();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://rahulshettyacademy.com/");
	}

	@When("^User navigate to Login page$")
	public void user_navigate_to_login_page() {
	    driver.findElement(By.className("login-btn")).click();
	    System.out.println("user clicked on login button");
	}

	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
	    driver.findElement(By.id("email")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

	@Then("^Message displayed Login successfully$")
	public void message_displayed_login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("user successfully logged in and title is "+ driver.getTitle());
		  driver.quit();
	}
	
	
	@When("^user navigate to dashboard page$")
	public void user_navigate_to_dashboard_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is navigating to dashboard page");
	}

	@Then("^dashboard is opened$")
	public void dashboard_is_opened() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on dashboard page");
	}

	@When("^user logout from the application$")
	public void user_logout_from_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("User is logged out");
	}

	@Then("^message displayed logout successfully$")
	public void message_displayed_logout_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("Logout successfuly!");
	}

}
