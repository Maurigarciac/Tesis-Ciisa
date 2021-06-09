package testClases;

import Base.BaseWeb;
import email.Email;

public class enviarEmail extends BaseWeb {

    public void enviarEmail(){

        Email email = new Email();
        email.setDestinatario("maurigarciac88@gmail.com");
        email.setAsunto("Asunto de prueba");
        email.configurarCabeceraEmail();
        email.setFileFolder("C:\\jenkins");
        email.setFileName("report_2021_06_08.zip");
        email.configurarCuerpoEmail();
        email.enviarMensaje();

    }


}
