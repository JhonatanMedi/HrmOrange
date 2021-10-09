package OrangeHrm.Definitions;

import org.openqa.selenium.WebDriver;

import OrangeHrm.Pages.LeavePage;
import OrangeHrm.Pages.LoginPage;
import OrangeHrm.Pages.PimPage;
import OrangeHrm.Pages.UserManagementPage;
import OrangeHrm.Steps.Conexion;
import OrangeHrm.Steps.Questions;
import OrangeHrm.Steps.TablesPages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private LoginPage loginPage = new LoginPage(driver);
	private UserManagementPage userManagementPage = new UserManagementPage(driver);
	private PimPage pimPage = new PimPage(driver);
	private LeavePage leavePage = new LeavePage(driver);
	private TablesPages tablesPages = new TablesPages(driver);
	private Questions questions = new Questions (driver);

	@Given("^open navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.openNavegado();

	}
	
	@When("^fill out username (.*) and password (.*)$")
	public void login(String userName, String password) {
		this.loginPage  = new LoginPage(driver);
		this.loginPage.loginIn(userName, password);
		
	}
	
	@Then("^to access on the option admin and search user (.*) and rol (.*)$")
	public void searchUser(String user, String useRol) {
		this.userManagementPage = new UserManagementPage(driver);
		this.userManagementPage.searchUser(user, useRol);
	}

	@Then("^Select list sub unit (.*)$")
	public void searchLeave(String subUnit) {
		this.leavePage = new LeavePage(driver);
		this.leavePage.searchLeave(subUnit);
		
	}
	
	@And("^search on the table (.*) select in the action (.*)$")
	public void buscarTabla(String nameSearch, String actions) {
		this.tablesPages = new TablesPages(driver);
		this.tablesPages.tableLeave(nameSearch,actions);
		
	}
	
	@Then("^close navigator$")
	public void closeNavigator() {
		this.questions = new Questions(driver);
		this.questions.closeNavigator();
	}
	
	@And("^to access on the option add employee$")
	public void addEmployee() {
		this.pimPage = new PimPage (driver);
		this.pimPage.diligenciarAddEmployee();
	}
	
	@Then("^fill out first name (.*) and last name (.*)$")
	public void diligenciarEmployee(String firtName, String lastName) {
		this.pimPage = new PimPage(driver);
		this.pimPage.llenarAddEmployee(firtName, lastName);
		
	}
}