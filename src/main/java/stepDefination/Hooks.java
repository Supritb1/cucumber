package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest {
	
	BaseTest bTest = new BaseTest();
	
	
	@Before("@Regression")
	public void beforeScenario() {
		System.out.println("before scenario....");
		
	}

	@After("@Regression")
	public void afterScenario() {
		System.out.println("after scenario....");
		
	}
	
	
	
	@Before("@SmokeTest")
	public void beforeSmoke() {
		System.out.println("Launching browser for smoke tests");
		bTest.launchBrowser();
	}
	
	@After("@SmokeTest")
	public void afterSmoke() {
		System.out.println("Closing browser for smoke tests");
		bTest.quitBrowser();
	}
	
}
