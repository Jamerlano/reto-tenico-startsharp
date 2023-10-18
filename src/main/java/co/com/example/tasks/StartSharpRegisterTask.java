package co.com.example.tasks;

import co.com.example.models.ActorData;
import co.com.example.userinterfaces.StartSharpRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class StartSharpRegisterTask implements Task {

    ActorData actorData = new ActorData("Test", "tester@ejemplo.com", "password");
    StartSharpRegisterPage startSharpRegisterPage;

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(

                SendKeys.of(actorData.getFullname()).into(StartSharpRegisterPage.FULLNAME_TEXTBOX),
                SendKeys.of(actorData.getEmail()).into(StartSharpRegisterPage.EMAIL_TEXTBOX),
                SendKeys.of(actorData.getEmail()).into(StartSharpRegisterPage.CONFIRM_EMAIL_TEXTBOX),
                SendKeys.of(actorData.getPassword()).into(StartSharpRegisterPage.PASSWORD_TEXTBOX),
                SendKeys.of(actorData.getPassword()).into(StartSharpRegisterPage.CONFIRM_PASS_TEXTBOX),
                WaitUntil.the(StartSharpRegisterPage.REGISTER_BUTTON, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
                Click.on(StartSharpRegisterPage.REGISTER_BUTTON)

        );

    }
    public static StartSharpRegisterTask startSharpRegisterTask(){
        return instrumented(StartSharpRegisterTask.class);
    }
}
