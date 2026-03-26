package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.DemoblazePage;

public class GoToCart implements Task {

    public static GoToCart goToCart() {
        return Tasks.instrumented(GoToCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DemoblazePage.INPUT_CART),
                Click.on(DemoblazePage.INPUT_PLACE_ORDER),
                Enter.theValue("Yesenia").into(DemoblazePage.INPUT_NAME),
                Enter.theValue("Colombia").into(DemoblazePage.INPUT_COUNTRY),
                Enter.theValue("Medellin").into(DemoblazePage.INPUT_CITY),
                Enter.theValue("345678906543").into(DemoblazePage.INPUT_CARD),
                Enter.theValue("Mayo").into(DemoblazePage.INPUT_MONTH),
                Enter.theValue("2030").into(DemoblazePage.INPUT_YEAR),
                Click.on(DemoblazePage.INPUT_BUTTON_PURCHASE)
        );
    }
}

