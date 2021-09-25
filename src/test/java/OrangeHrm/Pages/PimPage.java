package OrangeHrm.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import OrangeHrm.Steps.ButtonPages;
import OrangeHrm.Steps.Questions;

public class PimPage {
	
	private WebDriver driver;
	private ButtonPages buttonPages;
	private Questions questions;
	
	@FindBy(how = How.ID, using = "firstName")
	private WebElement inputFirtName;
	
	@FindBy(how = How.ID, using = "lastName")
	private WebElement inputLastName;
	
	public PimPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);
		
	}
	
	public void addEmployee(String nombre, String apellido) {
		buttonPages.btnPim();
		buttonPages.btnAddEmployee();
		inputFirtName.sendKeys(nombre);
		inputLastName.sendKeys(apellido);
		questions.tiempoSegundos(1);
		buttonPages.btnSave();
		questions.assertFirstName(nombre, apellido);
	}
}
