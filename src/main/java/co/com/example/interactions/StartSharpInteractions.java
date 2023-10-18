package co.com.example.interactions;

import co.com.example.userinterfaces.StartSharpRegisterPage;
import net.serenitybdd.core.pages.PageObject;

public class StartSharpInteractions extends PageObject {

    private static StartSharpRegisterPage startSharpRegisterPage;

    public static String getTitleModal(){
        return startSharpRegisterPage.modal.waitUntilVisible().getText();
    }
}

