package com.unit.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
(features = "classpath:login/LoginTest2.feature",
glue = "com.unit.runner.steps",
plugin = {"html:target/cucumber-html-report/login_Report.html"})
public class TestRunner {

}
