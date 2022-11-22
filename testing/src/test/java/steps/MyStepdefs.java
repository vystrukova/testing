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
    @Given("I visit passport.yandex.ru page")
    public void iVisitPassportYandexRuPage() {
        open(new Util().getPropertyValue("page"));
    }

    @When("I enter username in the username field")
    public void iEnterUsernameInTheUsernameField() {
        $(byName(new Util().getPropertyValue("login"))).sendKeys(new Util().getPropertyValue("login1"));
    }

    @And("I press the Next button")
    public void iPressTheNextButton() {
        $(byCssSelector("button[class='Button2 Button2_size_l Button2_view_action Button2_width_max Button2_type_submit']")).click();
    }

    @And("I enter password in the password field")
    public void iEnterPasswordInThePasswordField() {
        $(byName(new Util().getPropertyValue("pas"))).sendKeys(new Util().getPropertyValue("mypas"));
    }

    @And("I press Next button")
    public void iPressNextButton() {
        $(byCssSelector("button[class='Button2 Button2_size_l Button2_view_action Button2_width_max Button2_type_submit']")).click();
    }

    @Then("I should see the mail Yandex page")
    public void iShouldSeeTheMailYandexPage() {
        $(By.cssSelector("[href=\"#compose\"]")).shouldBe(Condition.visible);
    }
}
