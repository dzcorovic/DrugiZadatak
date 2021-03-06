package sdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;

	private By username = By.id("user-name");
	private By password = By.id("password");
	private By login = By.id("login-button");
	private By getMessage = By.xpath("//h3[@data-test=\"error\"]");

	public HomePage(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void fillUsernameField(String value) 
	{
		driver.findElement(username).sendKeys(value);
	}

	public void fillPasswordField(String value) 
	{
		driver.findElement(password).sendKeys(value);
	}

	public void clickSubmitButton() 
	{
		driver.findElement(login).click();
	}
	
	public void refresh() 
	{ 
		driver.navigate().refresh();
	}
	public String getMessage() 
	{  
		return driver.findElement(getMessage).getText();
	}

	public DashboardPage login1(String value1, String value2) 
	{
		driver.findElement(username).sendKeys(value1);
		driver.findElement(password).sendKeys(value2);
		driver.findElement(login).click();
		return new DashboardPage(driver);
	}
}
