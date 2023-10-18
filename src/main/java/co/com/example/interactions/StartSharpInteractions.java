package co.com.example.interactions;

import co.com.example.userinterfaces.StartSharpRegisterPage;
import com.gargoylesoftware.htmlunit.html.DomElement;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class StartSharpInteractions extends PageObject {

    private static StartSharpRegisterPage startSharpRegisterPage;

    public static String getTitleModal(){
        return startSharpRegisterPage.modal.waitUntilVisible().getText();
    }

    public void scrollToElement(WebElementFacade webElementFacade){
        // Permite llevar el elemento web hacia una zona visible
        evaluateJavascript("arguments[0].scrollIntoView(true) ", webElementFacade);
    }
}

