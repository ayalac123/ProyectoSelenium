package com.proyecto.glue;
import io.cucumber.java.es.Y;
import org.openqa.selenium.*;
import com.proyecto.view.webserviceView;
import com.proyecto.glue.webserviceGlue;
import com.proyecto.step.webserviceStep;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;

public class webserviceGlue {
    //finalmente en la clase glue solamente llamamos los metodos respectivos para dar sus funcionalidades respectivas
    //ademas de inicializar el driver desde un metodo de setup con prioridad 0
    private WebDriver driver;
    @Autowired
    private webserviceStep webserviceStep;
    private Scenario scenario;
    @Before(order = 0)
    public void setUp() {//0
        //setUp
        System.setProperty("webdriver.chrome.driver", "./.idea/chromedriver//chromedriver.exe");
        //crear el driver
        driver = new ChromeDriver();
        //max
        driver.manage().window().maximize();

    }

    @Before(order = 1)
    public void setScenario(Scenario scenario) {//1
        this.scenario = scenario;
    }

    @After
    public void quitDriver() {
        //tearsDown
        driver.quit();
    }

    public void screeShot() {
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }
    @Dado("Que me encuentro en la pagina de demoblaze")
    public void que_me_encuentro_en_la_pagina_de_demoblaze()  {
        driver.get("https://www.demoblaze.com/index.html");
        screeShot();
    }
    @Cuando("ingreso mis credenciales para dar mi alta de usuario con user y pass :{string} , {string}")
    public void ingreso_mis_credenciales_para_dar_mi_alta_de_usuario_con_user_y_pass(String user, String pass) throws InterruptedException {
;       webserviceStep webserviceStep1 = new webserviceStep(driver);
            webserviceStep1.typeUser(user);
            webserviceStep1.typePassword(pass);
            Thread.sleep(2000);
            screeShot();
            webserviceStep1.registrar();
            Thread.sleep(2000);
            screeShot();
    }
    @Entonces("me logeo al pagina con el usuario dado de dalta con el user y pass registrados: {string}, {string}")
    public void me_logeo_al_pagina_con_el_usuario_dado_de_dalta_con_el_user_y_pass_registrados(String user, String pass) throws InterruptedException {
        webserviceStep webserviceStep1 = new webserviceStep(driver);
        webserviceStep1.logeo();
        Thread.sleep(2000);
        webserviceStep1.typeUserlogin(user);
        webserviceStep1.typePasswordlogin(pass);
        Thread.sleep(2000);
        webserviceStep1.Iniciar();
        Thread.sleep(2000);
        screeShot();
    }

    @Y("ingreso al boton de logeo")
    public void ingresoAlBotonDeLogeo() throws InterruptedException {
        webserviceStep webserviceStep1 = new webserviceStep(driver);
        webserviceStep1.login();
        Thread.sleep(2000);
        screeShot();

    }

    @Entonces("valida la pantalla de ingreso con Welcome :{string}")
    public void validaLaPantallaDeIngresoConWelcome(String msge) {
        webserviceStep webserviceStep1 = new webserviceStep(driver);
        webserviceStep1.validarLogin();
        Assertions.assertEquals(msge,"Welcome");
        screeShot();
    }



    @Y("agrego al carrito una laptop")
    public void agregoAlCarritoUnaLaptop() throws InterruptedException {
        webserviceStep webserviceStep1 = new webserviceStep(driver);
        webserviceStep1.ClickLaptop();
        screeShot();
        webserviceStep1.Producto();
        screeShot();
        webserviceStep1.AgregarCarrito();
        screeShot();
    }

    @Y("valido el carrito con el producto agregado")
    public void validoElCarritoConElProductoAgregado() throws InterruptedException {
        webserviceStep webserviceStep1 = new webserviceStep(driver);
        webserviceStep1.HomeCar();
        screeShot();
        webserviceStep1.Holder();
        screeShot();
    }
}
