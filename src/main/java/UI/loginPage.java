package UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class loginPage {
    public static final Target USERNAME_INPUT = Target.the("Input de usuario").located(By.name("Username"));
    public static final Target PASSWORD_INPUT = Target.the("Input de contrasena").located(By.name("Password"));
    public static final Target LOGIN_BTN = Target.the("Boton ingresar").located(By.xpath("//button[contains(text(), 'Sign In')]"));

}
