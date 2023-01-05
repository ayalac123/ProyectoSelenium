package com.proyecto.view;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

public class webserviceView {
//se guarda los selectores en la vista VIEW para cualquier mantenimiento en base a la web o proyecto movil
    @Autowired
    private WebDriver driver;

    public static By SingUp = By.cssSelector("a[id='signin2']");
    public static By userinput = By.cssSelector("[id='sign-username']");
    public static By passinput = By.cssSelector("[id='sign-password']");
    public static By loginButton2 = By.cssSelector("button[onclick='register()']");

    public static By loginButton3 = By.cssSelector("button[onclick='logIn()']");

    public static By LoginUp = By.cssSelector("a[id='login2']");

    public static By userlogin = By.cssSelector("[id='loginusername']");
    public static By passlogin = By.cssSelector("[id='loginpassword']");

    public static By welcome= By.cssSelector("a[id='nameofuser']");

    public static By laptops= By.cssSelector("a[onclick=\"byCat('notebook')\"]");

    public static By laptopsProduct= By.cssSelector("a[class=\"hrefch\"]");

    public static By carritoCompras= By.cssSelector("a[onclick=\"addToCart(8)\"]");

    public static By car= By.cssSelector("a[id=\"cartur\"]");

    public static By placeHolder= By.cssSelector("button[class=\"btn btn-success\"]");


}
