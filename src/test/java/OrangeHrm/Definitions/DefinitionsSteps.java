package OrangeHrm.Definitions;

import org.openqa.selenium.WebDriver;

import OrangeHrm.Pages.LoginPage;
import OrangeHrm.Pages.UserManagementPage;
import OrangeHrm.Steps.Conexion;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private LoginPage loginPage = new LoginPage(driver);
	private UserManagementPage userManagementPage = new UserManagementPage(driver);

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}
	
	@When("^diligencie los campos nombre (.*) y contraseña (.*)$")
	public void login(String userName, String contrasena) {
		this.loginPage  = new LoginPage(driver);
		this.loginPage.loginIn(userName, contrasena);
		
	}
	
	@Then("^haga en el boton admin y buscar usuario (.*) y rol (.*)$")
	public void searchUser(String usuario, String useRol) {
		this.userManagementPage = new UserManagementPage(driver);
		this.userManagementPage.searchUser(usuario, useRol);
	}

}