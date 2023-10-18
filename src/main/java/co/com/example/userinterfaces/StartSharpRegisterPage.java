package co.com.example.userinterfaces;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.serenity.is/Account/SignUp")
public class StartSharpRegisterPage extends PageObject {
    public static final Target FULLNAME_TEXTBOX = Target.the("Nombre completo"). // Imput fullname
            locatedBy("//input[@id='SignUpPanel0_DisplayName']");
    public static final Target EMAIL_TEXTBOX = Target.the("Email"). // Input email
            locatedBy("//input[@id='SignUpPanel0_Email']");
    public static final Target CONFIRM_EMAIL_TEXTBOX = Target.the("Confirmar email"). // Input confirm email
            locatedBy("//input[@id='SignUpPanel0_ConfirmEmail']");
    public static final Target PASSWORD_TEXTBOX = Target.the("Contraseña"). // Input password
            locatedBy("//input[@id='SignUpPanel0_Password']");
    public static final Target CONFIRM_PASS_TEXTBOX = Target.the("Confirmar contraseña"). // Input confirm password
            locatedBy("//input[@id='SignUpPanel0_ConfirmPassword']");
    public static final Target REGISTER_BUTTON = Target.the("Boton registrarse"). // // Button regoster
            locatedBy("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]");
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]") // Subtitulo de la búsqueda
    public WebElementFacade buttonRegister;
    @FindBy(xpath = "//div[@class='toast-message']") // Texto modal
    public WebElementFacade modal;

    ////button[contains(text(),"Regístrate")]
}
