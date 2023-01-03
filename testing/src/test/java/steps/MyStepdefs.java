package steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MyStepdefs {
    @Given("I visit mail.yandex.ru page")
    public void iVisitMailYandexRuPage() {
        open(new Util().getPropertyValue("page"));
    }

    @When("I press the Login button")
    public void iPressTheLoginButton() {
        $(byXpath("//button[@type=\"button\"]")).click();
    }

    @And("I enter username in the username field")
    public void iEnterUsernameInTheUsernameField() {
        $(byXpath("//input[@name=\"login\"]")).sendKeys(new Util().getPropertyValue("email"));
    }

    @And("I press the Next button")
    public void iPressTheNextButton() {
        $(byXpath("//*[@id=\"passp:sign-in\"]")).click();
    }

    @And("I enter password in the password field")
    public void iEnterPasswordInThePasswordField() {
        $(byXpath("//input[@name=\"passwd\"]")).sendKeys(new Util().getPropertyValue("password"));
    }

    @And("I press Next button")
    public void iPressNextButton() {
        $(byXpath("//button[@type=\"submit\"]")).click();
    }

    @Then("I should see the mail Yandex page")
    public void iShouldSeeTheMailYandexPage() {
        $(By.cssSelector("[href=\"#compose\"]")).shouldBe(Condition.visible);
    }

}
