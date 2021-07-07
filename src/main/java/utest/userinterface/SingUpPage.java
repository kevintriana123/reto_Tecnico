package utest.userinterface;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SingUpPage extends PageObject {

    public static final Target BUTTON_JOIN = Target.the("button that shows us the form to register").located(By.xpath("//html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
}
