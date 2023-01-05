package com.proyecto.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * AUTHOR BRANDON AYALA
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber/cucumber-report.html",
                "json:target/cucumber/cucumber.json"},
        features = "src/test/resources/features",
        glue = "com.proyecto.glue",
        tags = "@validarFlujosCaso1y2"

)
public class RunnerTest {

}
