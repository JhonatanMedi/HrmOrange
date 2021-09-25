package OrangeHrm.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import OrangeHrm.Steps.ButtonPages;
import OrangeHrm.Steps.ListPages;
import OrangeHrm.Steps.Questions;

public class UserManagementPage {
	
	private ButtonPages buttonPages;
	private ListPages listPages;
	private Questions questions;
	
	@FindBy(how = How.CSS, using = "#searchSystemUser_userName")
	private WebElement inputUsuario;
	
	public UserManagementPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		this.listPages = new ListPages(driver);
		this.questions = new Questions(driver);
	}
	
	public void searchUser(String usuario, String useRol) {
		questions.tiempoSegundos(1);
		questions.screenShot();
		buttonPages.btnAdmin();
		//inputUsuario.sendKeys(usuario);
		listPages.listRoles(useRol);
		buttonPages.btnSearch();
		questions.scrollSeach(usuario);
		questions.screenShot();
	}

}
