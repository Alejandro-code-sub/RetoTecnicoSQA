package com.swag.pe.steps.validations;

import com.swag.pe.pages.validations.validationsPage;
import net.thucydides.core.annotations.Step;

public class validationStep extends validationsPage {
    @Step("validar ttulo amor")
    public Boolean titleVisible()
    {
        return lbl_amor.isDisplayed();
    }
}
