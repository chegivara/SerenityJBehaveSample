package rb.we.demo;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchSteps {


    @Step()
    public void movetourl(String url) {
        Serenity.getWebdriverManager().getCurrentDriver().get(url);
    }

    @Step()
    public void print(String word) {
        System.out.println("*****************word has would be find is " + word + "***********************");
    }

    @Step()
    public void findCount(String word) {

    }

    @Step()
    public void translate(String word) {
        WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
        WebElement webElement = driver.findElement(new By.ById("source"));
        webElement.sendKeys(word);
        (new WebDriverWait(driver, 3)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return !driver.findElement(new By.ByCssSelector("#result_box>span")).getText().isEmpty();
            }
        });
        String result = driver.findElement(new By.ByCssSelector("#result_box>span")).getText();
        System.out.println("***********on Russian: " + word + " translate on English " + result + " ***************");
    }
}