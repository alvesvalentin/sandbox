package fr.alvesvalentin.sandboxapijava.steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}
public class IsItFridayYetDefinition {
    private String today;
    private String actualAnswer;
    @Given("today is Sunday")
    public void todayIsSunday() {
        today = "Sunday";
    }

    @Given("today is {string}")
    public void todayIs(String today) {
        this.today = today;
    }

    @Given("today is Friday")
    public void todayIsFriday() {
        today = "Friday";
    }

    @When("I ask whether it's Friday yet")
    public void iAskWhetherItSFridayYet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String expectedAnswer) {
        assertThat(actualAnswer).isEqualTo(expectedAnswer);
    }
}