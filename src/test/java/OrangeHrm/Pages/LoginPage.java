package OrangeHrm.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import OrangeHrm.Steps.ButtonPages;
import OrangeHrm.Steps.Questions;

public class LoginPage {

	private WebDriver driver;
	private ButtonPages buttonPages;
	private Questions questions;

	@FindBy(how = How.ID, using = "txtUsername")
	private WebElement txtUserName;

	@FindBy(how = How.ID, using = "txtPassword")
	private WebElement inputPassword;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);
	}

	public void loginIn(String userName, String contrasena) {
		txtUserName.isDisplayed();
		txtUserName.sendKeys(userName);
		inputPassword.sendKeys(contrasena);
		buttonPages.btnLogin();
	//	questions.assertWelcome();
	}

}
