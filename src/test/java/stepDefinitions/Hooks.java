package StepDefinitions;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import Utils.TestContextSetup;

public class Hooks {
    public TestContextSetup testcontextsetup;

    public Hooks(TestContextSetup testcontextsetup) {
        this.testcontextsetup = testcontextsetup;
    }
      @BeforeAll
    public static void clearOldFiles() throws IOException {

        File file = new File(System.getProperty("user.dir") + "/test-output/Reports");
        FileUtils.deleteDirectory(file);
        file.delete();
    }

    @After
    public void afterScenario() throws IOException {
        testcontextsetup.testbase.WebDriverManager().quit();
    }
      @AfterStep
    public void addScreenShot(Scenario scenario) throws IOException, InterruptedException {
        Thread.sleep(500);
        WebDriver driver = testcontextsetup.testbase.WebDriverManager();
        File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
        scenario.attach(fileContent, "image/png", "ScreenShot");
    }
}
