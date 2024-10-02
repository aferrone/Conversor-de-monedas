import java.awt.*;

public class Principal {
    public static void main(String[] args) {
        ConversorDeMonedas conversor = new ConversorDeMonedas();
        MenuConversor menu = new MenuConversor();
        menu.mostrarMenu(conversor);

    }
}
