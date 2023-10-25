public class Main {
    public static void main(String[] args) {
        /*Escribe un programa que permita calcular el área de un triángulo y luego mostrar el resultado por pantalla.. Recuerda que la fórmula para
        calcular esto es: (base * altura) / 2 (base por altura dividido dos).

        Pista: Debes declarar variables para la base y la altura del triángulo, asignarles valores y luego calcular el área utilizando la fórmula. */

        // Declaracion de las variables y asignacion de los valores

        double base = 3.1;
        double altura = 7;

        // Declaracion variable para la formula

        double areaT = (base*altura)/2;

        // Mostrar por pantalla

        System.out.println("El area del triangulo con base: " + base +  " cm, y altura: " + altura + " cm, es de " + areaT + " cm²");

        double area = (double) (base * altura) / 2;


    }
}