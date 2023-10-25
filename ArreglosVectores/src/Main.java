import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana, calcule la temperatura máxima promedio que hubo.

        Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura máxima de cada día. Una vez almacenadas
        las temperaturas, deberá calcular el promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla. */

        Scanner scanner = new Scanner(System.in);

        // Creacion del array
        double [] temperaturas = new double[7];

        // Recorro el array para almacenar las temperaturas

        for(int i = 0; i < temperaturas.length; i++){
            System.out.print("Ingresa la temperatura maxima del dia " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        // Declaro la variable suma para luego hacer el promedio
        double suma = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            // Leo el array
            suma += temperaturas[i];
        }

        double promedio = suma / temperaturas.length;
        System.out.println("El promedio de las temperaturas maximas es: " + promedio);
    }


}