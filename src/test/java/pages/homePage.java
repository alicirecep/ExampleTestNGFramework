package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class homePage extends base {


    // anasayfa > searchJob / search Button
    @FindBy(xpath = "//a[@class='cookies-btn']")
    public WebElement searchButton;


}

