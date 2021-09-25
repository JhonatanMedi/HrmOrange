package OrangeHrm.Steps;

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
	
	public ButtonPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void btnLogin() {
		btnLogin.click();
		
	}
	
	public void btnAdmin() {
		btnAdmin.click();
	}
	
	public void btnSearch() {
		btnSearch.click();
	}
}
