package com.swag.pe.utilities;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.htmlunit.Page;

public class WebSite {

    @Steps(shared=true)
    PageObject swag;

    @Step("Navegar el sitio web")
    public void naviateTo(String url){
        swag.setDefaultBaseUrl(url);
        swag.open();
    }



}
