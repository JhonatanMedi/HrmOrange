package OrangeHrm.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListPages {

	private WebDriver driver;

	public ListPages(WebDriver driver) {
		this.driver = driver;
	}

	public void listRoles(String useRol) {
		WebElement role = driver.findElement(By.xpath("//select/option[text() = '" + useRol + "']"));
		role.click();
	}

	public void listSubUnit(String subUnit) {
		WebElement listSubUnit = driver.findElement(By.xpath("//select/option[text() = '" + subUnit + "']"));
		listSubUnit.click();
	}
}