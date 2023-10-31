import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*a) Imagina que eres un cajero en un supermercado. Crea un programa en Java que permita ingresar el precio de varios productos comprados por un cliente.

        Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios hasta que el usuario decida finalizar. Luego, muestra el
        total de la compra que debe abonar.

        Pista: Recuerda que existen dos tipos de bucles, los controlador por un contador (cuando sabemos un número exacto de productos por ejemplo)
        u por centinela (cuando no sabemos cuántos productos va a comprar el cliente). En este caso debes aplicar un “centinela”. Un ejemplo podría ser, si se
        ingresa un número negativo o un 0 como monto de un producto. */


        // Declaracion scanner
        Scanner scanner = new Scanner(System.in);

        // Declaracion variables
        double precioProductos;
        double precioTotalP = 0.0;

        System.out.println("Bienvenido al supermercado, por favor introduce el precio de los productos que quieres comprar");
        System.out.println("Para salir presiona 0");

        do{
            System.out.print("Precio del producto: ");
            precioProductos = scanner.nextDouble();

            if(precioProductos > 0){
                precioTotalP += precioProductos;
            }else if(precioProductos < 0){
                System.out.println("No puedes introducir precios negativos");
            }
        }while (precioProductos != 0);

        System.out.println("El total de la compra es " + precioTotalP + " euros.");

    }
}