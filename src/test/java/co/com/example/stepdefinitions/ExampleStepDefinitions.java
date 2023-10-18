package co.com.example.stepdefinitions;

import co.com.example.interactions.StartSharpInteractions;
import co.com.example.tasks.StartSharpRegisterTask;
import co.com.example.userinterfaces.StartSharpRegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class ExampleStepDefinitions {

    @Managed
    WebDriver driver;
    private Actor toby = Actor.named("Toby");
    StartSharpRegisterPage startSharpRegisterPage;
    final String mensajeError = "------- No coincide el texto del Titulo ------";
    @Given("I have several record fields")
    public void iHaveSeveralRecordFields() {
        toby.can(BrowseTheWeb.with(driver));
        toby.wasAbleTo(Open.browserOn(startSharpRegisterPage));
    }
    @When("I enter the data in each of the fields")
    public void iEnterTheDataInEachOfTheFields() {
        toby.attemptsTo(StartSharpRegisterTask.startSharpRegisterTask());
    }
    @Then("I will be able to register and validate the mandatory nature of the fields")
    public void iWillBeAbleToRegisterAndValidateTheMandatoryNatureOfTheFields() {
        String title = "Por favor, valide los campos vacíos o inválidos (marcados en rojo) antes de enviar el formulario";
        assertThat(mensajeError, StartSharpInteractions.getTitleModal(), is(equalTo(title)));
    }
}
