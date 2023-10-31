import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      /*Crea un programa que pida al usuario que ingrese por teclado dos números enteros y realice las siguientes operaciones con ellos: suma, resta,
        multiplicación y división. Muestra por pantalla/consola los resultados de cada una de las operaciones con un mensaje amigable para el usuario.

        Sugerencia: Compara los resultados que obtengas con otros compañeros. Pide a tus compañeros que te digan números al azar y haz las pruebas necesarias
        para comprobar el funcionamiento de tu programa.

        Extra: ¿Qué sucede si como segundo número de una división se ingresa 0? Con lo que sabes o aprendiste hasta ahora… ¿De qué manera tratarías de evitar ésta situación?
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("----- Ingresa numeros enteros -----");

        System.out.print("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        int num2 = scanner.nextInt();

        // Realiza las operaciones

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;

        // Comprobar si el segundo num es distinto de 0
        if (num2 != 0) {
            double division = (double) num1 / num2; // Convertir a double para obtener los decimales
            System.out.println("El resultado de la division es: " + division);
        } else {
            System.out.println("No puedes dividir por 0.");
        }

        System.out.println("----- Resultados -----");

        // Muestra los resultados
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
    }
}