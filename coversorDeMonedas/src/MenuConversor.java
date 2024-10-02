import java.util.Scanner;

public class MenuConversor {
    public void mostrarMenu(ConversorDeMonedas conversor) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*********************************************************");
        System.out.println("Conversor de Monedas Actualizado");
        System.out.println("Seleccione un opcion:");
        System.out.println("1. Convertir Moneda");
        System.out.println("2. Salir");
        System.out.println("*********************************************************");

        int opcion = scanner.nextInt();

        if (opcion == 1){
            System.out.println("Seleccione la moneda Principal de la lista:");
            System.out.println("USD, ARS, REAL, EUR");
            String monedaPrincipal = scanner.next().toUpperCase();

            System.out.println("Introduce la cantidad a convertir: ");
            double cantidad = scanner.nextDouble();

            System.out.println("Introduce la moneda secundaria: ");
            String monedaSecundaria = scanner.next().toUpperCase();

            try{
                double resultado = conversor.convertir(cantidad, monedaPrincipal, monedaSecundaria);
                System.out.println(cantidad + " " + monedaPrincipal + "son equivalentes a " + resultado + " " + monedaSecundaria);
            } catch (Exception e) {
                System.out.println("Ocurrio un error al realizar la conversion: " + e.getMessage());
            }
        }else {
            System.out.println("Gracias por usar el conversor.");
        }

        scanner.close();


    }
}
