package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.PurchaseSuccessVisible;
import tasks.Checkout;
import tasks.Login;
import ui.DemoblazePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class CommonStepDefinitions {
    @Managed
    WebDriver driver;

    @Given("el usuario inicia sesion en demoblaze")
    public void el_usuario_inicia_sesion_en_demoblaze() {
        OnStage.theActorCalled("Cliente").can(BrowseTheWeb.with(driver));
        OnStage.theActorInTheSpotlight().attemptsTo(Login.withValidCredentials());
    }

    @When("realiza el checkout")
    public void realiza_el_checkout() {
        OnStage.theActorInTheSpotlight().attemptsTo(Checkout.complete());
    }

    @Then("la compra debe ser exitosa")
    public void la_compra_debe_ser_exitosa() {
        OnStage.theActorInTheSpotlight()
                .should(seeThat(PurchaseSuccessVisible.displayed(), is(true)));

        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(DemoblazePage.PURCHASE_SUCCESS_BUTTON));
    }


}
