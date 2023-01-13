package UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class orderUI {
    public static final Target DASHBOARD =  Target.the("Visualiza el dashboard").located(By.xpath("//h1"));
    public static final Target BTN_MOREINFO = Target.the("boton mas informacion").located(By.xpath("//a[contains(text(), 'More info')]"));
    public static final Target ORDERS =  Target.the("Visualiza el modulo de ordenes").located(By.xpath("//div[contains(text(), 'Orders')]"));
    public static final Target BTN_ADDORDER =  Target.the("Boton nuevo order").located(By.xpath("//*[@id='GridDiv']/div[2]/div[2]/div/div[1]/div[1]"));

    //Formulario
    public static final Target INPUT_CUSTOMER =  Target.the("Selecciona un cliente").located(By.xpath("//label[contains(text(), 'Customer')]/following-sibling::div[1]"));
    public static final Target INPUT_CUSTOMEROPTION =  Target.the("Selecciona un cliente").located(By.xpath("//div[@role='option']"));
    public static final Target BTN_SAVE =  Target.the("Boton grabar").located(By.xpath("//div[@title='Apply Changes']/div"));
    public static final Target MSN_SUCCESSFUL =  Target.the("Mensaje exitoso").located(By.xpath("//div[@class='toast-message']"));
                                                                                                                                //div[contains(text(), 'Grabacion Exitosa')]


}
