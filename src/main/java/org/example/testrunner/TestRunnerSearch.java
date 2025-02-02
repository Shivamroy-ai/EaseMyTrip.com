package org.example.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
            features = "C:\\Users\\Vyom\\OneDrive\\Software Testing\\EaseMyTrripBDDFrameWork\\src\\main\\java\\org\\example\\featurefile\\searcht_transaction.feature",
            glue = "org.example.stepdefinationfile",
            monochrome = true,
            dryRun = false
)
public class TestRunnerSearch
{

}
