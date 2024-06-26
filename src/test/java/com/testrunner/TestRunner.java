package com.testrunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//src//test//resources//features//ArithmeticOps.feature",
        glue = {"com.stepdefinitions"},

        monochrome = true,
        plugin = {"pretty",
                "junit:target/cucumber-reports/cucumber.xml",
                "html:target/HTMLReports/report.html",
                "json:target/cucumber-reports/cucumber.json"},
        tags = "@ArithmeticOps")
public class TestRunner {

}
