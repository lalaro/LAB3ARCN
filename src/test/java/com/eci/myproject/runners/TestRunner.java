package com.eci.myproject.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/com/eci/myproject/features",  // Ruta a tus archivos de características
    glue = "com.eci.myproject.steps",                      // Paquete de tus definiciones de pasos
    monochrome = true,
    plugin = {
        "pretty", 
        "junit:target/JUnitReports/report.xml",
        "json:target/JSonReports/report.json",
        "html:target/HtmlReports/report.html"
    }
)
public class TestRunner {
    // Esta clase puede estar vacía, es solo un punto de entrada para Cucumber
}