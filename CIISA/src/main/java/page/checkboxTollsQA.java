package page;

import com.aventstack.extentreports.Status;
import driver.DriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.metodosGenericos;

import static utils.HtmlReport.addWebReportImage;

public class checkboxTollsQA {

    private WebDriver driver;

    public checkboxTollsQA() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }



    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]")
    private WebElement botonCheckbox;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/span[1]/button[1]")
    private WebElement btonMasCheckbox;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]")
    private WebElement seleccionCheckBox;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/button[1]")
    private WebElement FlechaAbajoExpandeUno;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/button[1]")
    private WebElement FlechaAbajoExpandeDos;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]")
    private WebElement BotonMas;

    @FindBy(xpath = " //body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[2]")
    private WebElement BotonMenos;


    public void checkBox(){

        boolean menucheck = metodosGenericos.visualizarObjeto(botonCheckbox, 10);
        if (menucheck) {
            botonCheckbox.click();
            addWebReportImage("text Box ", "text box", Status.PASS, false);
            System.out.println("Se realiza click en opcion ChecBox del menu lateral izquierdo");

        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar click en boton Sumit ");

        }

    }

    public void formularioCheckbox(){

        boolean btnmas = metodosGenericos.visualizarObjeto(btonMasCheckbox, 10);
        if (btnmas) {
            btonMasCheckbox.click();
            System.out.println("Se realiza click en + que expande el arbol del checkbox");
            addWebReportImage("text Box ", "text box", Status.PASS, false);
        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar click en + que espande el arbol del checkbox");

        }

        boolean seleccheck = metodosGenericos.visualizarObjeto(seleccionCheckBox, 10);
        if (seleccheck) {
            seleccionCheckBox.click();
            addWebReportImage("text Box ", "text box", Status.PASS, false);
            System.out.println("Se realiza click Seleccionador que expande el arbol del checkbox");

        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar click Seleccionador que expande el arbol del checkbox");

        }

        boolean expandeUno = metodosGenericos.visualizarObjeto(FlechaAbajoExpandeUno, 10);
        if (expandeUno) {
            FlechaAbajoExpandeUno.click();
            addWebReportImage("text Box ", "text box", Status.PASS, false);
            System.out.println("Se realiza click Seleccionador que expande el arbol del checkbox");

        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar click Seleccionador que expande el arbol del checkbox");

        }

        boolean expandeDos = metodosGenericos.visualizarObjeto(FlechaAbajoExpandeDos, 10);
        if (expandeDos) {
            FlechaAbajoExpandeDos.click();
            addWebReportImage("text Box ", "text box", Status.PASS, false);
            System.out.println("Se realiza click Seleccionador que expande el arbol del checkbox");

        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar click Seleccionador que expande el arbol del checkbox");

        }

        boolean btnMas = metodosGenericos.visualizarObjeto(BotonMas, 10);
        if (btnMas) {
            BotonMas.click();
            addWebReportImage("text Box ", "text box", Status.PASS, false);
            System.out.println("Se realiza click + que expande el arbol del checkbox");

        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar click + que expande el arbol del checkbox");

        }

        boolean btnMenos = metodosGenericos.visualizarObjeto(BotonMenos, 10);
        if (btnMenos) {
            BotonMenos.click();
            addWebReportImage("text Box ", "text box", Status.PASS, false);
            System.out.println("Se realiza click (-) que expande el arbol del checkbox");

        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar click (-) que expande el arbol del checkbox");

        }
    }


    }

