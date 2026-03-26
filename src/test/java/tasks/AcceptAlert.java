package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AcceptAlert implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriverWait wait = new WebDriverWait(
                BrowseTheWeb.as(actor).getDriver(),
                Duration.ofSeconds(5)
        );

        wait.until(ExpectedConditions.alertIsPresent());

        BrowseTheWeb.as(actor)
                .getDriver()
                .switchTo()
                .alert()
                .accept();
    }

    public static AcceptAlert now() {
        return new AcceptAlert();
    }
}