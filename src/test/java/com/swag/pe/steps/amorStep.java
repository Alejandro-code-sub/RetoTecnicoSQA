package com.swag.pe.steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class amorStep {

    @Step("El usuario hace clic en la opción AMOR")
    public void clickAmor() {
        getDriver().findElement(By.xpath("//a[text()='AMOR']")).click();
    }
}
