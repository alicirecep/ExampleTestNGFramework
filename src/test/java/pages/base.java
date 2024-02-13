package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class base {

    public base(){
        PageFactory.initElements(Driver.getDriver(),this);


    }

}
