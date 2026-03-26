package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.DemoblazePage;

public class PurchaseSuccessVisible implements Question<Boolean> {

    public static PurchaseSuccessVisible displayed() {
        return new PurchaseSuccessVisible();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return DemoblazePage.PURCHASE_SUCCESS_TEXT_TARGET
                .resolveFor(actor)
                .isVisible();
    }
}
