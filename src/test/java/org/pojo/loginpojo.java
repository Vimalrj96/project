package org.pojo;

import org.frameBase.FrameWork;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpojo extends FrameWork{

	public loginpojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({
		@FindBy(xpath="//span[text()='login']"),
			})
	private WebElement log;
	
	@FindAll({
		@FindBy(id="customer_email"),
		@FindBy(xpath="(//*[@type='email'])[1]")
	})
	private WebElement mail;
	
	@FindAll({
		@FindBy(xpath="//*[@type='password']"),
		@FindBy(xpath="//*[@placeholder='Password']")
	})
	private WebElement pass;
	
	@FindAll({
		@FindBy(xpath="(//*[text()='Submit'])[1]")
	})
	private WebElement sub;

	public WebElement getLog() {
		return log;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSub() {
		return sub;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
