package utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import utest.model.DataPage;
import static utest.userinterface.WriteFormPage.*;
import java.util.List;


public class WriteForm implements Task {

    List<DataPage> dataPageList;

    public WriteForm(List<DataPage> dataPageList) {
        this.dataPageList = dataPageList;
    }

    public static WriteForm theForms (List<DataPage> dataPageList) {
        return Tasks.instrumented(WriteForm.class, dataPageList);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataPageList.get(0).getStrName()).into(FIELD_NAME),
                Enter.theValue(dataPageList.get(0).getStrLastName()).into(FIELD_LASTNAME),
                Enter.theValue(dataPageList.get(0).getStrEmail()).into(FIELD_EMAIL),
                SelectFromOptions.byVisibleText(dataPageList.get(0).getStrMonth()).from(LIST_MONTH),
                SelectFromOptions.byVisibleText(dataPageList.get(0).getStrDay()).from(LIST_DAY),
                SelectFromOptions.byVisibleText(dataPageList.get(0).getStrYear()).from(LIST_YEAR),
                Enter.theValue(dataPageList.get(0).getStrLanguage()).into(FIELD_LANGUAGE).thenHit(Keys.ENTER),
                Click.on(NEXT_LOCATION_BTN),

                Enter.theValue(dataPageList.get(0).getStrCity()).into(FIELD_CITY),
                Click.on(COUNTRY_SELECT),
                Enter.theValue(dataPageList.get(0).getStrCountry()).into(FIELD_COUNTRY).thenHit(Keys.ARROW_DOWN).thenHit(Keys.ENTER),
                Enter.theValue(dataPageList.get(0).getStrCity()).into(FIELD_CITY).thenHit(Keys.ARROW_DOWN).thenHit(Keys.ENTER),
                Enter.theValue(dataPageList.get(0).getStrZIP()).into(FIELD_ZIP),
                Click.on(NEXT_DEVICES_BTN),

                Click.on(COMPUTER),
                Enter.theValue(dataPageList.get(0).getStrComputer()).into(INPUT_COMPUTER).thenHit(Keys.ENTER),
                Click.on(OSVERSION),
                Enter.theValue(dataPageList.get(0).getStrComputerOS()).into(INPUT_OSVERSION).thenHit(Keys.ENTER),
                Click.on(OS_LANGUAGE),
                Enter.theValue(dataPageList.get(0).getStrLanguage()).into(INPUT_OSLANGUAGE).thenHit(Keys.ENTER),
                Click.on(SELECT_DEVICE),
                Enter.theValue(dataPageList.get(0).getStrDevice()).into(PHONE_BRAND).thenHit(Keys.ENTER),
                Click.on(SELECT_MODELDEVICE),
                Enter.theValue(dataPageList.get(0).getStrDeviceModel()).into(PHONE_MODEL).thenHit(Keys.ENTER),
                Click.on(OSDEVICE),
                Enter.theValue(dataPageList.get(0).getStrDeviceOS()).into(INPUT_DEVICEOS).thenHit(Keys.ENTER),
                Click.on(BUTTON_LASTASTEP),

                Enter.theValue(dataPageList.get(0).strPassword).into(INPUT_PASSWORD),
                Enter.theValue(dataPageList.get(0).strPassword).into(INPUT_CONFIRMPASSWORD),
                Click.on(CHECK_STAYINFORMED),
                Click.on(CHECK_TERMSOFUSE),
                Click.on(CHECK_PRIVACYSECURITYPOLICY));
    }
}


