package PageObjects;

import factories.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
  public ProductsPage() {
    PageFactory.initElements(Driver.getDriver(),this);
  }

  @FindBy(css = ".title")
  public WebElement pageTitle;
}
