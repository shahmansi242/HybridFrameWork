package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features =".",tags ="@registration", plugin = {"pretty","html:target/Destination"})

public class RunTest {
}



