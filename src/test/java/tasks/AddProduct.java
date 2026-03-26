package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import ui.DemoblazePage;

public class AddProduct implements Task {

    public static AddProduct toCart() {
        return Tasks.instrumented(AddProduct.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DemoblazePage.INPUT_BUTTON_ADD)

        );
    }
}

