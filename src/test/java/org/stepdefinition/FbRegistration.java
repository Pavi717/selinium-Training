package org.stepdefinition;

import java.util.List;

import org.base.BaseClass1;
import org.pojo.SignInPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.*;

public class FbRegistration extends BaseClass1 {
	SignInPojo f;
	@Given("To launch the browser and maximise the window")
	public void to_launch_the_browser_and_maximise_the_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To launch the url of fb application")
	public void to_launch_the_url_of_fb_application() {
	    launchUrl("https://en-gb.facebook.com/");
	}

	@When("To click create new account button")
	public void to_click_create_new_account_button() {
		f = new SignInPojo();
		clickBtn(f.getCreateNew());
	    
	}

	@When("To pass first name in first name text box")
	public void to_pass_first_name_in_first_name_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		List<String> l = d.asList();
	
		f = new SignInPojo();
		passText(l.get(3), f.getFirstName());
	}

	@When("To pass second name in second name text box")
	public void to_pass_second_name_in_second_name_text_box() {
		f = new SignInPojo();
		passText("Parthi", f.getSecondName());
	}

	@When("To pass moboleno or email in email text box")
	public void to_pass_moboleno_or_email_in_email_text_box(DataTable d) {
		List<List<String>> l = d.asLists();
		f = new SignInPojo();
		
		passText(l.get(1).get(1), f.getMoborEmail());
	}

	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() {
		f = new SignInPojo();
		passText("paviparthi", f.getPassword());
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
		//closeEntireBrowser();
	    
	}



}
