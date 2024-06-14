package co.com.udea.fabricaescuela.moduloautenticacionautorizacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class NavigationBarPage extends PageObject {

    //Barra navegacion
    public static final Target TITTLE_NAVIGATION_BAR = Target.the("Titulo barra de navegacion").located(By.xpath("//text[@name='navigationBar']"));
    public static final Target FLY_SEACH_OPTION = Target.the("Opcion de busqueda de vuelos").located(By.xpath("//button[@name='flySearch']"));
    public static final Target CHECKING_OPTION = Target.the("Opcion de checking").located(By.xpath("//button[@name='checking']"));
    public static final Target BOOKING_OPTION = Target.the("Opcion de reserva").located(By.xpath("//button[@name='booking']"));
    public static final Target ROLE_MANAGEMENT_OPTION = Target.the("Opcion de gestion de roles").located(By.xpath("//button[@name='roleManagement']"));
    public static final Target FLY_MANAGEMENT_OPTION = Target.the("Opcion de gestion de vuelos").located(By.xpath("//button[@name='flyManagement']"));
    public static final Target TITTLE_PAGE_FLY_SEACH = Target.the("Titulo de pagina busqueda de vuelos").located(By.xpath("//text[@name='pageFlySearch']"));
    public static final Target TITTLE_PAGE_CHECKING = Target.the("Titulo de pagina checking").located(By.xpath("//text[@name='pageChecking']"));
    public static final Target TITTLE_PAGE_BOOKING = Target.the("Titulo de pagina reserva").located(By.xpath("//text[@name='pageBooking']"));
    public static final Target TITTLE_PAGE_ROLE_MANAGEMENT = Target.the("Titulo de pagina gestion de roles").located(By.xpath("//text[@name='pageRoleManagement']"));
    public static final Target TITTLE_PAGE_FLY_MANAGEMENT = Target.the("Titulo de pagina gestion de vuelos").located(By.xpath("//text[@name='pageFlyManagement']"));
}
