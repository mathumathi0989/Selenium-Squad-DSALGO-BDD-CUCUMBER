package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import dsUtilities.DriverManager;

public class hooks {
	
	@Before
	   
    public void setUp(Scenario scenario) {
        DriverManager.initializeDriver();
    }


    @After
    public void tearDown(Scenario scenario) {
        DriverManager.quitDriver();
    }



}