package utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class CompleteRegister {

    public static final Target COMPLETE_BUTTON= Target.the("When do you click to go to page Last step")
            .located(By.xpath("//a[@id='laddaBtn']//span[contains(text(),'Complete Setup')]"));
}

