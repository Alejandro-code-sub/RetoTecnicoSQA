package com.swag.pe.pages.validations;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class validationsPage extends PageObject {


    @FindBy(xpath = "//div[@class=\"site-content\"]")
    protected WebElementFacade lbl_amor;
}
