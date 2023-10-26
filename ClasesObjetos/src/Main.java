public class Main {
    public static void main(String[] args) {

        /*Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres de clases y variables no llevan tilde)
        con los siguientes atributos: cod, marca, modelo, consumo y color.

        Luego, realiza las siguientes acciones:

        a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.

        b) Crea 1 objeto de la clase Electrodomestico sin parámetros.

        c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.

        d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene? */

        // Creacion de los objetos

        Electrodomestico electrodomestico1 = new Electrodomestico(1, "Samsung", "Lavadora 5kg", 100, "Negra");
        Electrodomestico electrodomestico2 = new Electrodomestico(2, "Huaweii", "Nevera con Congelador", 233, "Blanca");
        Electrodomestico electrodomestico3 = new Electrodomestico(3, "AOC", "Televisor 44'", 50, "Negro");

        // Array para almacenarlos
        Electrodomestico[] electrodomesticosArr = {electrodomestico1, electrodomestico2, electrodomestico3};

        // Objeto sin parametros
        Electrodomestico electrodomesticoVacio = new Electrodomestico();

        // Recorrer array
        for(int i = 0; i < electrodomesticosArr.length; i++){
            System.out.println("-----------------");
            System.out.println("Electrodomestico " + (i + 1) + ":");
            System.out.println("Marca: " + electrodomesticosArr[i].getMarca());
            System.out.println("Modelo: " + electrodomesticosArr[i].getModelo());
            System.out.println("Consumo: " + electrodomesticosArr[i].getConsumo() + " KW/h");

        }

        System.out.println("---- Parte B ----");

        // Intentar coger la marca del electrodomesticoVacio (Se observa que da null ya que no tiene ningun parametro)
        System.out.println(electrodomesticoVacio.getMarca());
    }
}