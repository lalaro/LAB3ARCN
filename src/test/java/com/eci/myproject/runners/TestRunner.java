package com.eci.myproject.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/eci/myproject/features", glue="com.eci.myproject.steps",
monochrome = true,
publish = true,
plugin = {"pretty", "junit:target/JUnitReports/report.xml",
        "json:target/JSonReports/report.json",
        "html:target/HtmlReports/report.html"
        }
)
public class TestRunner {
}