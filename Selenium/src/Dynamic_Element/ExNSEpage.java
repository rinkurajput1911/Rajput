package Dynamic_Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExNSEpage
{
@FindBy(xpath="(//nav[@class='tabs_boxes']//a)[4]") private WebElement BankNifty;

public ExNSEpage(WebDriver driver)
{
PageFactory.initElements(driver, this);
}

public void getBankNifty()
{
	System.out.println(BankNifty.getText());
}

}
