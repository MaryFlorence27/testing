package api.cucumber.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.junit.AfterClass;

public class CucumberHooks {
    @Before(order = -3)
    public void setUp(){
        System.out.println("----Before hook-----");
    }
    @Before(order = 1)
    public void setUp2(){
        System.out.println("----Before hook-----");
    }

    @After
    public void tearDown(){
        System.out.println("-----After hook-----");
    }
    @BeforeStep
    public void setUpSteps(){
        System.out.println("------Before hook----- ");
    }
    @AfterClass
    public void tearDownSteps(){
        System.out.println("------After hook--------");
    }
}
