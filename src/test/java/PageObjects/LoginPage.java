package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class LoginPage {
  public LoginPage() {
    PageFactory.initElements(Driver.getDriver(),this);
  }

  @FindBy(xpath = "//*[@id='user-name']")
  public WebElement usernameInput;
  @FindBy(xpath = "//*[@id='password']")
  public WebElement passwordInput;

  public void enterUsername(String username) {
    usernameInput.sendKeys(username);
  }

  public void enterPassword(String password) {
    passwordInput.sendKeys(password);
  }
}
