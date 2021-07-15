package utils.hooks;

import apis.BaseApiTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.selenium.DriverController;

public class CucumberHooks {

    @Before("@Chrome")
    public void beforeChrome(){
        DriverController.instance.startChrome("--disable-extensions");
    }

    @Before("@Firefox")
    public void beforeFirefox() throws Exception {
        DriverController.instance.startFirefox("--disable-extensions");
    }

    @Before("@HeadlessChrome")
    public void beforeChromeHeadless() {
        DriverController.instance.startChrome("--headless");
    }

    @Before("@HeadlessFirefox")
    public void beforeHeadlessFirefox() throws Exception {
        DriverController.instance.startFirefox("--headless");
    }

    @After
    public void stopWebDriver() {
        DriverController.instance.stopWebDriver();
    }

    @Before("@Api")
    public void setBaseUri(){
        BaseApiTest.setBaseUri();
    }
}


