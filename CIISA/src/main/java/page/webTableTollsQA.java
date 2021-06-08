package page;

import com.aventstack.extentreports.Status;
import driver.DriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.metodosGenericos;

import static utils.HtmlReport.addWebReportImage;

public class webTableTollsQA {

    private WebDriver driver;

    public webTableTollsQA() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }



    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]")
    private WebElement BotonWebTable;

    @FindBy(id = "addNewRecordButton")
    private WebElement BotonADD;

    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")
    private WebElement txtFullNameWT;

    @FindBy(id = "lastName")
    private WebElement txtLastNameWT;

    @FindBy(id = "userEmail")
    private WebElement txtEmailWT;

    @FindBy(id = "age")
    private WebElement txtEdad;

    @FindBy(id = "salary")
    private WebElement txtSalario;

    @FindBy(id = "department")
    private WebElement txtDepartamento;

    @FindBy(id = "submit")
    private WebElement BotonSumitWT;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]")
    private WebElement botonFlechaSube;


    public void webTable(){

        boolean webTable = metodosGenericos.visualizarObjeto(BotonWebTable, 10);
        if (webTable) {
            BotonWebTable.click();
            addWebReportImage("text Box ", "text box", Status.PASS, false);
            System.out.println("Se realiza click Menu Lateral Web Table");

        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar click Menu Lateral Web Table");

        }

    }

    public void formularioWebtable( ) {

        String fullName="";
        String lastName="";
        String email="prueba@gmail.com";
        String edad="";
        String salario="";
        String departamento="";



        for (int a = 0; a < 3; a++) {
            switch (a) {
                case 0:
                    fullName = "Rodrigo";
                    lastName = "Espinoza Maltez";
                    edad = "35";
                    salario = "850000";
                    departamento = "QA AUTOMATION";

                    break;
                case 1:
                    fullName = "Juan Francisco";
                    lastName = "Perez Perez";

                    edad = "35";
                    salario = "1850000";
                    departamento = "INGERNIERO QA AUTOMATION";

                    break;
                case 2:
                    fullName = "Jonathan";
                    lastName = "PCuevas Muñoz";
                    edad = "35";
                    salario = "1850000";
                    departamento = "TESTER QA AUTOMATION";

                    break;
            }


                boolean add = metodosGenericos.visualizarObjeto(BotonADD, 10);
                if (add) {
                    BotonADD.click();
                    addWebReportImage("text Box ", "text box", Status.PASS, false);
                    System.out.println("Se realiza click ADD de web table");

                } else {
                    addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
                    System.out.println("No es  Posible realizar click ADD de web table");

                }


                boolean name = metodosGenericos.visualizarObjeto(txtFullNameWT, 10);
                if (name) {
                    txtFullNameWT.sendKeys(fullName);
                    addWebReportImage("text Box ", "text box", Status.PASS, false);
                    System.out.println("Se realiza click ADD de web table");

                } else {
                    addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
                    System.out.println("No es  Posible realizar click ADD de web table");

                }

                boolean lasname = metodosGenericos.visualizarObjeto(txtLastNameWT, 10);
                if (lasname) {
                    txtLastNameWT.sendKeys(lastName);
                    addWebReportImage("text Box ", "text box", Status.PASS, false);
                    System.out.println("Se realiza Ingreso de last Name");

                } else {
                    System.out.println("No es  Posible realizar Ingreso de last Name");
                    addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
                }

                boolean temail = metodosGenericos.visualizarObjeto(txtEmailWT, 10);
                if (temail) {
                    txtEmailWT.sendKeys(email);
                    addWebReportImage("text Box ", "text box", Status.PASS, false);
                    System.out.println("Se realiza Ingreso Email");

                } else {
                    addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
                    System.out.println("No es  Posible realizar Ingreso de Email");

                }

                boolean tedad = metodosGenericos.visualizarObjeto(txtEdad, 10);
                if (tedad) {
                    txtEdad.sendKeys(edad);
                    addWebReportImage("text Box ", "text box", Status.PASS, false);
                    System.out.println("Se realiza Ingreso EDAD");

                } else {
                    addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
                    System.out.println("No es  Posible realizar Ingreso de EDAD");

                }


                boolean tsalario = metodosGenericos.visualizarObjeto(txtSalario, 10);
                if (tsalario) {
                    txtSalario.sendKeys(salario);
                    addWebReportImage("text Box ", "text box", Status.PASS, false);
                    System.out.println("Se realiza Ingreso Salario");

                } else {
                    addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
                    System.out.println("No es  Posible realizar Ingreso de Salario");

                }

                boolean tdepardatmento = metodosGenericos.visualizarObjeto(txtDepartamento, 10);
                if (tdepardatmento) {
                    txtDepartamento.sendKeys(departamento);
                    addWebReportImage("text Box ", "text box", Status.PASS, false);
                    System.out.println("Se realiza Ingreso Departamento");

                } else {
                    addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
                    System.out.println("No es  Posible realizar Ingreso de Departamento");

                }

                boolean btnsumit = metodosGenericos.visualizarObjeto(BotonSumitWT, 10);
                if (btnsumit) {
                    BotonSumitWT.submit();
                    addWebReportImage("text Box ", "text box", Status.PASS, false);
                    System.out.println("Se realiza click Sumit Web Tables");

                } else {
                    addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
                    System.out.println("No es  Posible realizar click Menu Lateral Web Table");

                }


            }
        boolean button = metodosGenericos.visualizarObjeto(botonFlechaSube, 10);
        if (button) {
            botonFlechaSube.click();
            addWebReportImage("text Box ", "text box", Status.PASS, false);
            System.out.println("Se realiza click Sumit Web Tables");

        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar click Menu Lateral Web Table");

        }


    }

    }




