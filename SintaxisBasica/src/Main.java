public class Main {
    public static void main(String[] args) {

       /* a) Escribir un programa en Java que muestre por pantalla un mensaje de Bienvenida a un usuario.
        Por ejemplo: “Hola, bienvenido al sistema”.

        b) Una vez logrado esta primera parte, permitir que se almacene el nombre del usuario en una variable
        y se muestre el mismo en el mensaje. Por ejemplo: “Hola Eduardo, bienvenida al sistema”. */

        // A
        System.out.println("Hola, bienvenido al sistema.");

        // Inicializacion de la variable con asignacion de valor
        String name = "Diego";

        // B
        // Muestro el valor por consola
        System.out.println("Hola " + name + ", bienvenido al sistema");

    }
}