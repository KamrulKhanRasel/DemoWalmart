package walmart.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBarLocators {
	@FindBy(xpath="//input[@id='global-search-input']")
	public WebElement searchbar;
}
