package testClases;

import Base.BaseWeb;
import email.Email;
import org.testng.annotations.Test;

public class enviarEmail extends BaseWeb {

    @Test(groups = {"Ingresar al TOLLS QA FORMULARIOS"},description = "TOOLSQA ")
    public void enviarEmail(){

        Email email = new Email();
        email.setDestinatario("maurigarciac88@gmail.com");
        email.setAsunto("Asunto de prueba");
        email.configurarCabeceraEmail();
        email.setFileFolder("C:\\jenkins");
        email.setFileName("report_2021_06_09.zip");
        email.configurarCuerpoEmail();
        email.enviarMensaje();

    }


}
