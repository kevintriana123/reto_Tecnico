package utest.tasks;

import net.serenitybdd.screenplay.Performable;
import utest.userinterface.uTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private uTestPage uTestPage;

    public static Performable thepage() {
        return Tasks.instrumented(OpenUp.class);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(uTestPage));
    }
}
