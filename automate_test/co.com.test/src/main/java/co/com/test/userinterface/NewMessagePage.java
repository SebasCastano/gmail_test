package co.com.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NewMessagePage {
    public static final Target INPUT_TO = Target.the("Field of to").located(By.name("to"));
    public static final Target INPUT_SUBJECT = Target.the("Field subject").located(By.name("subjectbox"));
    public static final Target INPUT_MESSAGE = Target.the("Field message").located(By.xpath("//div[@role='textbox']"));
    public static final Target BTN_SEND = Target.the("Button send email").located(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']"));
    public static final Target BTN_CLOSE_SEND = Target.the("Button send email").located(By.xpath("//*[@class='Ha']"));
}
