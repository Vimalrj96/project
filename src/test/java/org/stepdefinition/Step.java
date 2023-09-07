package org.stepdefinition;

import java.time.Duration;

import org.frameBase.FrameWork;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pojo.Cartpojo;
import org.pojo.loginpojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step extends FrameWork{


@Given("User to Launch the Tecovas Application via ChromeBrowser")
public void user_to_Launch_the_Tecovas_Application_via_ChromeBrowser() {
	maxwin();
    }

@When("User to Click the Login button")
public void user_to_Click_the_Login_button() {
   loginpojo a = new loginpojo();
   buttonclick(a.getLog());
   
}


	@When("User to Enter the Valid {string} and {string}")
	public void user_to_Enter_the_Valid_and(String v, String p) {
		loginpojo a = new loginpojo();
		sendvalue(a.getMail(), v);
		sendvalue(a.getPass(), p);
		buttonclick(a.getSub());
	}
	

@Then("User to Validate the Valid Credencial Page")
public void user_to_Validate_the_Valid_Credencial_Page() {
   
	if (getaurl().equals("https://www.tecovas.com/account")) {
		System.out.println("valid");
		
	} else {
         System.out.println("invalid");
	}
		
}


@Given("To launch the Tecovas Application through via Chromebrowser and into thier account")
public void to_launch_the_Tecovas_Application_through_via_Chromebrowser_and_into_thier_account() {
	Cartpojo j = new Cartpojo();
	Actions k = new Actions(driver);
	buttonclick(j.getLogin());
	sendvalue(j.getMailid(), "vimalraj720@gmail.com");
	sendvalue(j.getPassword(), "vimalrj6");
	buttonclick(j.getSubmmit());
	
}

@When("User to move the Men Section and add to cart the Hat")
public void user_to_move_the_Men_Section_and_add_to_cart_the_Hat() {
	Cartpojo j = new Cartpojo();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	movetheelement(j.getMen());
	buttonclick(j.getHat());
	buttonclick(j.getCart());
	js.executeScript("arguments[0].click()", j.getAddcart());
	await();
	WebElement t = driver.findElement(By.xpath("//*[contains(text(),'$38')]"));
	js.executeScript("arguments[0].click()", t);
}

@Then("user to verify the hat is added in Cart")
public void user_to_verify_the_hat_is_added_in_Cart()
{
   await();
	WebElement findElement = driver.findElement(By.xpath("//*[text()='Quality Made Western Six-Panel Trucker Hat']"));
	boolean selected = findElement.isDisplayed();
	System.out.println(selected);
}




}


	
	
	
	
	
	

