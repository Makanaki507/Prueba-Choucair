package test.automatization.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ObjetosDemoblaze {

    public static final Target LOGIN =
            Target.the("Dar click al boton login").located(By.xpath("//a[contains(@id,'login2')]"));

    public static final Target USERNAME =
            Target.the("colocar el usuario").located(By.xpath("//input[contains(@id,'loginusername')]"));

    public static final Target PASSWORD =
            Target.the("colocar la contraseña").located(By.xpath("//input[contains(@id,'loginpassword')]"));

    public static final Target BOTONLOGIN =
            Target.the("presionar el boton login").located(By.xpath("//button[@type='button'][contains(.,'Log in')]"));

    public static final Target GALAXYS =
            Target.the("seleccionar celular").located(By.xpath("//a[@href='prod.html?idp_=4'][contains(.,'Samsung galaxy s7')]"));

    public static final Target BOTONADDTOCARTCELL =
            Target.the("presionar boton add to cart").located(By.xpath("//a[@href='#'][contains(.,'Add to cart')]"));

    public static final Target HOME =
            Target.the("regresar a la pagina principal").located(By.xpath("//a[@class='nav-link'][contains(.,'Home (current)')]"));

    public static final Target LAPTOP =
            Target.the("seleccionar laptop").located(By.xpath("(//img[contains(@class,'card-img-top img-fluid')])[8]"));

    public static final Target BOTONADDTOCARTLAPTOP =
            Target.the("presionar boton add to cart laptop").located(By.xpath("//a[contains(@onclick,'addToCart(8)')]"));

    public static final Target CART =
            Target.the("presionar boton cart").located(By.xpath("//a[contains(@id,'cartur')]"));

    public static final Target PLACEORDER =
            Target.the("presionar boton place order").located(By.xpath("//button[@type='button'][contains(.,'Place Order')]"));

    public static final Target NAME =
            Target.the("ingresar nombre").located(By.xpath("//input[@id='name']"));

    public static final Target COUNTRY =
            Target.the("ingresar pais").located(By.xpath("//input[contains(@id,'country')]"));

    public static final Target CITY =
            Target.the("ingresar ciudad").located(By.xpath("//input[contains(@id,'city')]"));

    public static final Target CREDICARD =
            Target.the("ingresar tarjeta de credito").located(By.xpath("//input[@id='card']"));

    public static final Target PURCHARSE =
            Target.the("ingresar tarjeta de credito").located(By.xpath("//button[@type='button'][contains(.,'Purchase')]"));

    public static final Target VALIDACION =
            Target.the("Validar resultado").located(By.xpath("//h2[contains(.,'Thank you for your purchase!')]"));

}
