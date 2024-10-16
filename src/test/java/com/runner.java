package com;


import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/features",
        glue = "com.sauce.pe.swag.pe.swag.pe.definitions",
        tags ="amorProductos"

)
public class runner {
}
