package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import ui.DemoblazePage;

public class AddtwoProduct implements Task {

    public static AddtwoProduct toCart() {
        return Tasks.instrumented(AddtwoProduct.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(DemoblazePage.INPUT_CART_ITEM_ONE),
                Click.on(DemoblazePage.INPUT_BUTTON_ADD),
                AcceptAlert.now(),
                Click.on(DemoblazePage.INPUT_BUTTON_HOME),
                Click.on(DemoblazePage.INPUT_CART_ITEM_TWO),
                Click.on(DemoblazePage.INPUT_BUTTON_ADD),
                AcceptAlert.now()




        );
    }
}

