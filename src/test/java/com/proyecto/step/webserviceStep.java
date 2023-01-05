package com.proyecto.step;
import com.proyecto.view.webserviceView;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class webserviceStep {
    // en esta clase step se definen todos los metodos a definir para cada paso que se va ejecutar
    @Autowired

    public WebDriver driver;

    public webserviceStep(WebDriver driver){
        this.driver = driver;
    }

    public void typeUser(String user){
        WebElement userInputElement = driver.findElement(webserviceView.userinput);
        userInputElement.sendKeys(user);
    }
    public void typePassword(String pass){

        this.driver.findElement(webserviceView.passinput).sendKeys(pass);
    }
    public void login(){
        this.driver.findElement(webserviceView.SingUp).click();
    }
    public void registrar() throws InterruptedException {
        this.driver.findElement(webserviceView.loginButton2).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }

    public void Iniciar() throws InterruptedException {
        this.driver.findElement(webserviceView.loginButton3).click();
        Thread.sleep(2000);

    }
    public void logeo() throws InterruptedException {
        this.driver.findElement(webserviceView.LoginUp).click();

    }

    public void typeUserlogin(String user){
        WebElement userInputElement = driver.findElement(webserviceView.userlogin);
        userInputElement.sendKeys(user);
    }
    public void typePasswordlogin(String pass){

        this.driver.findElement(webserviceView.passlogin).sendKeys(pass);
    }

    public String validarLogin(){
        return this.driver.findElement(webserviceView.welcome).getText();
    }

    public void ClickLaptop() throws InterruptedException {
        this.driver.findElement(webserviceView.laptops).click();
        Thread.sleep(2000);
    }
    public void Producto() throws InterruptedException {
        this.driver.findElement(webserviceView.laptopsProduct).click();
        Thread.sleep(2000);
    }
    public void AgregarCarrito() throws InterruptedException {
        this.driver.findElement(webserviceView.carritoCompras).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }
    public void HomeCar() throws InterruptedException {
        this.driver.findElement(webserviceView.car).click();
        Thread.sleep(2000);
    }
    public void Holder() throws InterruptedException {
        this.driver.findElement(webserviceView.placeHolder).click();
        Thread.sleep(2000);
    }
}
