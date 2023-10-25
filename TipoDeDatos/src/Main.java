public class Main {
    public static void main(String[] args) {

        /*a) Crea un programa que declare una variable para cada uno de los siguientes tipos de datos: int, double, boolean y String.
        Asigna un valor a cada variable y muestra su contenido en la consola.
S
        b) Ahora, asigna valores que no correspondan al tipo de dato. Por ejemplo, un int en un String o un String en un double…
        ¿Qué sucede con el programa? ¿Se produce algún error? ¿En qué situaciones se genera error y en cuáles no? Justificar el
        por qué de cada caso. Debatir con otros compañeros. */

        // Declarar e inicializar variables de diferentes tipos de datos
        int numEntero = 42;
        double numDecimal = 3.1416;
        boolean isTrue = true;
        String company = "Canonical, Build at speed." ;

        // Mostrar los valores de las variables en la consola
        System.out.println("Valor de numEntero: " + numEntero);
        System.out.println("Valor de numDecimal: " + numDecimal);
        System.out.println("Valor de isTrue: " + isTrue);
        System.out.println("Valor de cadenaTexto: " + company);

        // Asignar valores incorrectos

        /*
        Comentado para que no genere errores de compilacion

        numEntero = "No soy un entero"; // Error: No se puede asignar un String a un int
        numDecimal = "Esto tampoco es un double"; // Error: No se puede asignar un String a un double
        isTrue = 42; // Error: No se puede asignar un int a un boolean
        company = 123; // Error: No se puede asignar un int a un String

         */
    }
}