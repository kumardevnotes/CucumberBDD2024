package com.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {


    @Before
    public void before_launchBrowser(Scenario scenario) {}

    @After
    public void after_quitBrowser(Scenario scenario) {}

}
