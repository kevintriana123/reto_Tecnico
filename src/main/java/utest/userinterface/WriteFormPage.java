package utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;




public class WriteFormPage extends PageObject {

    public static final Target FIELD_NAME = Target.the("when do you write your name")
            .located(By.id("firstName"));
    public static final Target FIELD_LASTNAME = Target.the("when do you write your lastname")
            .located(By.id("lastName"));
    public static final Target FIELD_EMAIL = Target.the("when do you write your email")
            .located(By.id("email"));
    public static final Target LIST_MONTH = Target.the("When do you select your month")
            .located(By.id("birthMonth"));
    public static final Target LIST_DAY = Target.the("When do you select your day")
            .located(By.id("birthDay"));
    public static final Target LIST_YEAR = Target.the("When do you select your year")
            .located(By.id("birthYear"));
    public static final Target FIELD_LANGUAGE = Target.the("when do you write  language")
            .located(By.xpath("//input[@type='search']"));
    public static final Target NEXT_LOCATION_BTN = Target.the("Buttons that show the next form")
            .located(By.xpath("//a[@class='btn btn-blue']"));



    public static final Target FIELD_CITY = Target.the("when do you write your city")
            .located(By.id("city"));
    public static final Target FIELD_ZIP = Target.the("when do you write your zip code")
            .located(By.id("zip"));
    public static final Target COUNTRY_SELECT = Target.the("when do you click on country button")
            .located(By.name("countryId"));
    public static final Target FIELD_COUNTRY = Target.the("when do you write your country")
            .located(By.xpath("//input[@placeholder='Select a country']"));
    public static final Target NEXT_DEVICES_BTN = Target.the("Buttons that show the next form:")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));


    public static final Target COMPUTER = Target.the("when do you click to select your machine")
            .located(By.name("osId"));
    public static final Target INPUT_COMPUTER = Target.the("when do you write your machine")
            .located(By.xpath("//div[@name='osId']//input[@placeholder='Select OS']"));
    public static final Target OSVERSION = Target.the("When do you click the OS version of your computer")
            .located(By.name("osVersionId"));
    public static final Target INPUT_OSVERSION = Target.the("When do you select the OS version of your computer")
            .located(By.xpath("//input[@placeholder='Select a Version']"));
    public static final Target OS_LANGUAGE = Target.the("When do you select the OS language of your computer")
            .located(By.name("osLanguageId"));
    public static final Target INPUT_OSLANGUAGE = Target.the("When do you select the OS version of your computer")
            .located(By.xpath("//input[@placeholder='Select OS language']"));
    public static final Target SELECT_DEVICE = Target.the("When do you click to select your device")
            .located(By.name("handsetMakerId"));
    public static final Target PHONE_BRAND = Target.the("When do you select the phone brand")
            .located(By.xpath("//input[@placeholder='Select Brand']"));
    public static final Target SELECT_MODELDEVICE = Target.the("When do you click to select your model device")
            .located(By.name("handsetModelId"));
    public static final Target PHONE_MODEL = Target.the("When do you select the phone brand")
            .located(By.xpath("//input[@placeholder='Select a Model']"));
    public static final Target OSDEVICE = Target.the("When do you click to select your device")
            .located(By.name("handsetOSId"));
    public static final Target INPUT_DEVICEOS = Target.the("When do you select the OS brand")
            .located(By.xpath("//div[@name='handsetOSId']//input[@placeholder='Select OS']"));
    public static final Target BUTTON_LASTASTEP = Target.the("When do you click to go to page Last step")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));


    public static final Target INPUT_PASSWORD = Target.the("When do you write your password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRMPASSWORD = Target.the("When do you rewrite your password")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_STAYINFORMED = Target.the("When do you mark the checkbox STAY")
            .located(By.name("newsletterOptIn"));
    public static final Target CHECK_TERMSOFUSE = Target.the("When do you mark the checkbox Term")
            .located(By.id("termOfUse"));
    public static final Target CHECK_PRIVACYSECURITYPOLICY = Target.the("When do you mark the checkbox Privacy")
            .located(By.id("privacySetting"));


}
