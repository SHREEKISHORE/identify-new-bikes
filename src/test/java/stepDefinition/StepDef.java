package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObject.LoginPage;
import PageObject.LoginSignupPage;
import PageObject.UpcomingBikes;
import PageObject.UsedCars;
import PageObject.zigWheelsPage;
import io.cucumber.java.en.*;

public class StepDef {
	WebDriver driver;
	UpcomingBikes up=new UpcomingBikes(driver);
	UsedCars usc=new UsedCars(driver);
	LoginSignupPage lp=new LoginSignupPage(driver);
	LoginPage lop=new LoginPage(driver);
	@When("Click on the New Bikes")
	public void click_on_the_new_bikes() throws InterruptedException, IOException {
		zigWheelsPage zg=new zigWheelsPage(driver);
		zg.clickNewBikes();
		zg.selectUpcomingBikes();
		
	}

	@When("Click on Upcoming Bikes")
	public void click_on_upcoming_bikes() throws InterruptedException {
		
		up.clickViewMoreButton();
		
	}

	@When("Click on Manufactorers")
	public void click_on_manufactorers() throws IOException {
		up.bikeDetails();
	}
	
	@When("Select Used Cars")
	public void select_used_cars() throws InterruptedException {
	   usc.selectUsedCars();
	}

	@When("Select Used Cars Location")
	public void select_used_cars_location() throws IOException, InterruptedException {
	   usc.clickSelectedCar();
	}

	@When("Select Popular models")
	public void select_popular_models() throws IOException, InterruptedException {
	    usc.extractPopularModels();
	}

	@When("Click on Login/SignUp")
	public void click_on_login_sign_up() {
	    lp.clickZigwheels();
	    lp.clickLoginSignUp();
	    lp.selectGoogleButton();
	}
	
	@Given("the user is on the Google login page")
	public void the_user_is_on_the_google_login_page() throws InterruptedException {
		lop.setEmailInput();
	    lop.clickNextBtn();
	}

	@When("the user enters invalid credentials")
	public void the_user_enters_invalid_credentials() throws IOException {
	    lop.handleErrorMsg();
	}


}
