package OrangeHrm.Steps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {
	
	private WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//input[@name = 'Submit']")
	private WebElement btnLogin;
	
	@FindBy(how = How.ID, using = "menu_admin_viewAdminModule")
	private WebElement btnAdmin;
	
	@FindBy(how = How.ID, using = "searchBtn")
	private WebElement btnSearch;
	
	@FindBy(how = How.ID, using = "menu_pim_viewPimModule")
	private WebElement btnPim;
	
	@FindBy(how = How.ID, using = "menu_pim_addEmployee")
	private WebElement btnAddEmployee;
	
	@FindBy(how = How.ID, using = "btnSave")
	private WebElement btnSave;
	
	public ButtonPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void btnLogin() {
		btnLogin.sendKeys(Keys.ENTER);
		
	}
	
	public void btnAdmin() {
		btnAdmin.click();
	}
	
	public void btnSearch() {
		btnSearch.click();
	}
	
	public void btnPim() {
		btnPim.click();
	}
	
	public void btnAddEmployee() {
		btnAddEmployee.click();
	}
	
	public void btnSave() {
		btnSave.click();
	}
}
