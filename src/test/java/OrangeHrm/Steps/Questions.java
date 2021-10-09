package OrangeHrm.Steps;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ibm.icu.text.SimpleDateFormat;

import net.thucydides.core.annotations.Step;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;

public class Questions {

	private WebDriver driver;

	public Questions(WebDriver driver) {
		this.driver = driver;
	}

	@Step
	public void tituloAssert() {

		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, "Booking.com");
	}

	@Step
	public void screenShot() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String filename = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File dest = new File("C:\\Users\\Jhonatan\\Documents\\Capturas\\" + filename + ".png");
		try {
			FileUtils.copyFile(scr, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@Step
	public void tiempoSegundos(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Step
	public void assertWelcome() {
		WebElement usurio = driver.findElement(By.id("welcome"));
		usurio.getText();
		Assert.assertEquals(usurio.getText(), "Welcome Paul");
	}
	
	@Step
	public void assertFirstName(String nombre, String apellido) {
		String usurio = driver.findElement(By.xpath("//*[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(usurio, nombre + " " + apellido);

	}
	
	public void scrollSeach(String user) {
		WebElement result = driver.findElement(By.xpath("//table//*[text() = '"+user+"']"));
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView();", result);

	}
	
	public void scrollSeach() {
		WebElement result = driver.findElement(By.id("frmList_ohrmListComponent"));
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView();", result);

	}
	public void closeNavigator() {
		driver.close();
	}
}