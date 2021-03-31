package co.com.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StartPage {
    public static final Target BTN_COMPOSE = Target.the("Button compose").located(By.xpath("//*[@class='T-I T-I-KE L3']"));
    public static final Target INFO_MESSAGE = Target.the("Message sent email").located(By.xpath("//span[@id='link_vsm']"));
    public static final Target INFO_MESSAGE_DELETED = Target.the("Message deleted email").located(By.xpath("//span[@class='bAq']"));
    public static final Target CHECK_FIRST_EMAIL = Target.the("Check first message").located(By.xpath("(//td[@data-tooltip='Select'])[1]"));
    public static final Target LABEL_NUMBER_DRAFTS = Target.the("Check first message").located(By.xpath("//div[@data-tooltip='Drafts']//div[@class='bsU']"));
    public static final Target INPUT_SEARCH = Target.the("Input search emails").located(By.xpath("//*[@placeholder='Search mail']"));
    public static final Target RESULT_SEARCH = Target.the("Number result search").located(By.xpath("((//*[@class='J-J5-Ji amH J-JN-I'])[2]//span[@class='ts'])[3]"));
    public static final Target BTN_DELETE = Target.the("Button delete email").located(By.xpath("//div[@data-tooltip='Delete']//div[@class='asa']"));
    public static final Target INFO_MESSAGE_ERROR = Target.the("Message warning error").located(By.xpath("//div[@class='Kj-JD-Jz']"));

}
