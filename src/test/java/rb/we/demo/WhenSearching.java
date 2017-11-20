package rb.we.demo;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.chrome.ChromeDriver;


public class WhenSearching {

    @Steps
    SearchSteps searchSteps;

    @BeforeScenario
    public void init() {
        System.setProperty("webdriver.chrome.driver",ClassLoader.getSystemResource("drivers/chromedriver").getPath());
        Serenity.getWebdriverManager().setCurrentDriver(new ChromeDriver());
    }

    @Given("word to find: $word")
    public void worldToFind(String word) {
        searchSteps.print(word);
    }

    @When("move to $url")
    public void moveToUrl(String url) {
        searchSteps.movetourl(url);
    }

    @Then("make search by $word")
    public  void translate(String word){
        searchSteps.translate(word);
    }
    public void findCount(String world) {
        searchSteps.findCount(world);
    }
}