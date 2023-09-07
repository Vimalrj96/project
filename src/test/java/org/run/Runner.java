package org.run;

import org.frameBase.FrameWork;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature",
glue="org.stepdefinition",
 dryRun=false,strict=true,tags= {"@prabu"},plugin={"pretty","json:TecovasNg\\allreport\\jsonreport\\j.json",
 })

public class Runner {
@AfterClass
public static void report() {
	Jvmreport.jvmreport("TecovasNg\\allreport\\jsonreport\\j.json");

}
}
