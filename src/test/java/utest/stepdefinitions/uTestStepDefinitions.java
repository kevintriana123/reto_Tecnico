package utest.stepdefinitions;
import net.serenitybdd.screenplay.Question;
import utest.model.DataPage;
import utest.questions.Answer;
import utest.tasks.SingUp;
import utest.tasks.WriteForm;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import utest.tasks.OpenUp;


import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class uTestStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^that Kevin wants to register as a new user on the uTest\\.com page$")
    public void thatKevinWantsToRegisterAsANewUserOnTheUTestComPage()  throws Exception {
        OnStage.theActorCalled("Kevin").wasAbleTo(OpenUp.thepage(), (SingUp.onThePage()));
    }

    @When("^He finds the form and completes it, to be a registered user$")
    public void heFindsTheFormAndCompletesItToBeARegisteredUser(List<DataPage> dataPageList)  throws Exception {
        theActorInTheSpotlight().attemptsTo(WriteForm.theForms(dataPageList));
    }





    @Then("^of fill out the form is a new registered user\\.$")
    public void ofFillOutTheFormIsANewRegisteredUser(List<DataPage> dataPageList) throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat((Question<Boolean>) Answer.toThe(dataPageList)));
    }



}
