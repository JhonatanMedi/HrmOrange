package OrangeHrm.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import OrangeHrm.Steps.ButtonPages;
import OrangeHrm.Steps.Questions;

public class PimPage {

	private ButtonPages buttonPages;
	private Questions questions;

	@FindBy(how = How.ID, using = "firstName")
	private WebElement inputFirtName;

	@FindBy(how = How.ID, using = "lastName")
	private WebElement inputLastName;

	@FindBy(how = How.ID, using = "firstName")
	private WebElement txtFirstName;

	@FindBy(how = How.ID, using = "lastName")
	private WebElement txtLastName;

	public PimPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);

	}

/*	public void addEmployee(String firtName, String lastName) {
		buttonPages.btnPim();
		buttonPages.btnAddEmployee();
		inputFirtName.sendKeys(firtName);
		inputLastName.sendKeys(lastName);
		questions.tiempoSegundos(1);
		buttonPages.btnSave();
		questions.assertFirstName(firtName, lastName);
	}*/
	
	public void diligenciarAddEmployee() {
		buttonPages.btnPim();
		buttonPages.btnAddEmployee();

	}

	public void llenarAddEmployee(String firtName, String lastName) {
		txtFirstName.sendKeys(firtName);
		txtLastName.sendKeys(lastName);
		buttonPages.btnSave();
		questions.tiempoSegundos(1);
		questions.assertWelcome();
		questions.tiempoSegundos(1);
		questions.assertFirstName(firtName, lastName);

	}

}
