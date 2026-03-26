package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoblazePage {


    public static By INPUT_CART_ITEM_ONE = new By.ByXPath("/html/body/div[5]/div/div[2]/div/div[1]/div/a/img");
    public static By INPUT_BUTTON_ADD = new By.ByXPath("/html/body/div[5]/div/div[2]/div[2]/div/a");
    public static By INPUT_BUTTON_HOME = new By.ByXPath("/html/body/nav/div/div/ul/li[1]/a");
    public static By INPUT_CART_ITEM_TWO = new By.ByXPath("/html/body/div[5]/div/div[2]/div/div[6]/div/div/h4/a");

    public static By INPUT_CART = By.id("cartur");
    public static By INPUT_PLACE_ORDER = new By.ByXPath("/html/body/div[6]/div/div[2]/button");

    public static By INPUT_NAME = By.id("name");
    public static By INPUT_COUNTRY = By.id("country");
    public static By INPUT_CITY = By.id("city");
    public static By INPUT_CARD = By.id("card");
    public static By INPUT_MONTH = By.id("month");
    public static By INPUT_YEAR = By.id("year");

    public static By INPUT_BUTTON_PURCHASE = new By.ByXPath("/html/body/div[3]/div/div/div[3]/button[2]");
    public static By PURCHASE_SUCCESS_TEXT = new By.ByXPath("/html/body/div[10]/h2");
    public static By PURCHASE_SUCCESS_BUTTON = new By.ByXPath("/html/body/div[10]/div[7]/div/button");

    public static Target PURCHASE_SUCCESS_TEXT_TARGET = Target
            .the("Success purchase text")
            .located(PURCHASE_SUCCESS_TEXT);

    public static final Target BACK_HOME_BUTTON = Target
            .the("botón back home")
            .located(By.id("back-to-products"));


}

