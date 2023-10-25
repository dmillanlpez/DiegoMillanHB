import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*a) Una recital permite únicamente el ingreso de mayores de 18 años. Para ello necesita un programa que, a partir de que un usuario ingrese su edad,
        determine mediante un mensaje en pantalla si la persona puede o no ingresar al evento. El programa debe mostrar (según cada caso) un mensaje informando la situación. */

        Scanner scanner = new Scanner(System.in);

        // Pido la edad al usuario
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        if(edad < 18){
            System.out.println("Lo sentimos mucho pero no puedes acceder al recital.");
        }else{
            System.out.println("Puedes pasar, disfruta la funcion.");
        }

    }
}