import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Imagina que estás trabajando en un sistema de reservas de asientos para un teatro. Crea un programa en Java que represente un mapa de asientos en una matriz
        de 5x5 y ten en cuenta lo siguiente:

        Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").

        Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de asiento (por ejemplo, "Fila 3, Asiento 2"). El programa debe marcar
        como ocupado ese asiento solo en caso de que esté vacío.

        Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.

        A medida que los asientos se ocupen, el programa debe actualizar el mapa de asientos y mostrarlo por pantalla luego de cada reserva.

        Intenta hacer pruebas con otros compañeros, imagina que ellos son los compradores y tú el encargado del teatro. ¿Funciona para todos los casos? ¿Encontraste errores que resolver? ¿Considera tu programa los asientos ya reservados?

        El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los asientos determine que ha finalizado.

        Pista: Puedes preguntar en cada “vuelta” del bucle, si esta ha sido la última compra. */

        Scanner scanner = new Scanner(System.in);


        // Creo un mapa de asientos de 5 x 5
        char[][] teatro = new char[5][5];

        // Inicializar todos los asientos vacios en 0
        for (int fila = 0; fila < 5; fila++) {
            for (int asiento = 0; asiento < 5; asiento++) {
                teatro[fila][asiento] = 'O';
            }
        }

        boolean reservasCompletadas = false;

        // Mapa de los asientos
        do {
            // Mostrar el mapa de asientos actual
            System.out.println("Mapa de asientos:");
            for (int fila = 0; fila < 5; fila++) {
                for (int asiento = 0; asiento < 5; asiento++) {
                    System.out.print(teatro[fila][asiento] + " ");
                }
                System.out.println();
            }

            // Solicitar al user que elija uno de los asientos
            System.out.println("Introduce un asiento (Fila x |,| Asiento Y) o escribe 'fin' para terminar: ");
            String eleccion = scanner.nextLine();

            if (eleccion.equalsIgnoreCase("fin")) {
                reservasCompletadas = true;
                System.out.println("Reservas completadas, disfruta!.");
                continue;
            }

            // Procesamiento de la eleccion del asiento
            String[] partes = eleccion.split(",");
            if (partes.length != 2) {
                System.out.println("Entrada incorrecta. recuerda el formato (Fila x |,| Asiento Y)");
                continue;
            }
            try {
                int filaElegida = Integer.parseInt(partes[0].trim()) - 1; // por si el user pone un espacio en blanco con space
                int asientoElegido = Integer.parseInt(partes[1].trim()) - 1;

                if (filaElegida < 0 || filaElegida >= 5 || asientoElegido < 0 || asientoElegido >= 5) {
                    System.out.println("El asiento seleccionado esta fuera del rango, intentalo de nuevo.");
                } else if (teatro[filaElegida][asientoElegido] == 'O') {
                    teatro[filaElegida][asientoElegido] = 'X'; // x marca el asiento como ocupado en el mapa
                    System.out.println("Reserva realizada con exito!");
                } else {
                    System.out.println("El asiento que estas intentando seleccionar ya esta ocupado, intentalo de nuevo");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada incorrecta. recuerda el formato (Fila x |,| Asiento Y");
            }
        } while (!reservasCompletadas);
    }
}