package com.swag.pe.definitions;

import com.swag.pe.steps.amorStep;
import com.swag.pe.steps.validations.validationStep;
import com.swag.pe.utilities.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginDef {
    @Steps(shared = true)
    WebSite url;
    @Steps(shared = true)
    amorStep amor;
@Steps(shared = true)
    validationStep validation;

    @Given("el usuario navega al sitio web")
    public void userNavigateTo(){
        url.naviateTo("https://www.floristeriamundoflor.com");
    }

    @When("Realizar clic en la opcion AMOR")
    public void userAmor(){
        amor.clickAmor();

    }

    @Then("la aplicacion deberia mostrar el modulo de productos de amor")
    public void systemProducts(){

        Assert.assertTrue(validation.titleVisible());
    }


}

