package stepdefinitions;


import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.AddtwoProduct;
import tasks.GoToCart;

public class BuyMultipleItemsStepDefinitions {

    @When("agrega dos productos al carrito")
    public void agrega_dos_productos_al_carrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddtwoProduct.toCart());
        OnStage.theActorInTheSpotlight().attemptsTo(GoToCart.goToCart());
    }


}

