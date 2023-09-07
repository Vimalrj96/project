package org.pojo;

import org.frameBase.FrameWork;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpojo extends FrameWork {

	public Cartpojo() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindAll({
		@FindBy(xpath="//span[text()='login']"),
			})
	private WebElement login;
	
	@FindAll({
		
		@FindBy(xpath="(//*[@type='email'])[1]"),
		@FindBy(id="customer_email")
	})
	private WebElement mailid;
	
	@FindAll({
		@FindBy(xpath="//*[@type='password']"),
		@FindBy(xpath="//*[@placeholder='Password']")
	})
	private WebElement password;
	
	@FindAll({
		@FindBy(xpath="(//*[text()='Submit'])[1]")
	})
	private WebElement submmit;
	
	@FindBy(xpath="(//*[text()='Men'])[1]")
	private WebElement Men;
	
    @FindBy(xpath="(//a[text()='Hats'])[1]")
	private WebElement hat;
    
    @FindBy(xpath="(//*[contains(text(),'Quality Made')])[3]")
	private WebElement cart;
    
    @FindBy(xpath="//span[text()='Add To Cart']")
    private WebElement addcart;

	public WebElement getLogin() {
		return login;
	}

	public WebElement getMailid() {
		return mailid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmmit() {
		return submmit;
	}

	public WebElement getMen() {
		return Men;
	}

	public WebElement getHat() {
		return hat;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getAddcart() {
		return addcart;
	}
	
	
	
	
	
}
