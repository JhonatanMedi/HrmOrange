package OrangeHrm.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import OrangeHrm.Steps.ButtonPages;
import OrangeHrm.Steps.ListPages;
import OrangeHrm.Steps.Questions;
import OrangeHrm.Steps.TablesPages;

public class LeavePage {

	private ButtonPages buttonPages;
	private ListPages listPages;
	private Questions questions;
	private TablesPages tablesPages;

	public LeavePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		this.listPages = new ListPages(driver);
		this.questions = new Questions(driver);
		this.tablesPages = new TablesPages(driver);

	}

	public void searchLeave(String subUnit) {
		buttonPages.btnLeave();
		listPages.listSubUnit(subUnit);
		buttonPages.btnSeach();
		questions.tiempoSegundos(1);
		questions.scrollSeach();

	}

	public void actions(String nameSearch, String actions) {
		tablesPages.tableLeave(nameSearch, actions);

	}
}
