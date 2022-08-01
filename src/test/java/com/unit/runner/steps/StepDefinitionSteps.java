package com.unit.runner.steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionSteps {

	@Given("^I am on login page$")
    public void i_am_on_login_page() throws Throwable {
        System.out.println("open login page url");
        //System set prop
    }

    @When("^I enter username as \"(.*)\" and password as \"(.*)\"$")
    public void i_enter_username_as_and_password_as(String username, String password) throws Throwable {
        System.out.println("User Name : "+username);
        System.out.println("password : "+password);

    }

    @And("^I submit login page$")
    public void i_submit_login_page() throws Throwable {
        System.out.println("open login page url");
    }

    @Then("^I redirect to user home page$")
    public void i_redirect_to_user_home_page() throws Throwable {
        System.out.println("open login page url");
    }

}
