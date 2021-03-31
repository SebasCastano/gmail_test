package co.com.test.userinterface;

import co.com.test.util.Constantes;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl(Constantes.AMBIENTE_CALIDAD)
public class HomePage extends PageObject {
    public static final Target INPUT_USERNAME = Target.the("Button going to").located(By.id("identifierId"));
    public static final Target BTN_USER_NEXT = Target.the("Button going to").located(By.id("identifierNext"));
    public static final Target INPUT_PASSWORD = Target.the("Button going to").located(By.name("password"));
    public static final Target BTN_PASSWORD_NEXT = Target.the("Button going to").located(By.id("passwordNext"));

}
