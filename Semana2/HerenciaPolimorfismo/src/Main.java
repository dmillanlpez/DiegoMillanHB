public class Main {
    public static void main(String[] args) {

        /*Crear una clase llamada Vestimenta con los atributos: código, nombre, precio, marca, talla y color (con sus métodos y
        constructores correspondientes).

        a) Crear las siguientes clases hijas que compartan sus atributos y métodos:

        Zapato: material, tipoCierre

        Pantalon: estilo, tipoTejido

        Camiseta: manga, cuello

        Sombrero: tipo, tamaño

        b) Una vez creadas las clases, crear en el Main un vector de tipo Vestimenta y almacenar 3 zapatos, 3 pantalones,
        2 camisetas y 1 sombrero (crear un objeto con parámetros para cada uno de ellos).

        c) Crear los siguientes métodos (en cada subclase correspondiente):

        Zapato: método para mostrar un mensaje en pantalla que diga "Estos zapatos son de marca: " (mostrar marca).

        Pantalon: método para mostrar un mensaje en pantalla que diga "Estos pantalones son de marca: " (mostrar estilo).

        Camiseta: método para mostrar un mensaje en pantalla que diga "Esta camiseta es de marca: " (mostrar manga).

        Sombrero: método para mostrar un mensaje en pantalla que diga "Este sombrero es de marca: " (mostrar tipo).

        d) Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.

        PISTA: Todos tendrán el mismo método, con el mismo nombre, pero únicamente cambia el mensaje que muestran. Tener en cuenta para
        esto la implementación de herencia y sobrescritura de métodos.
        */

        // Array tipo vestimenta y almacenar 3 zapatos, 3 pantalones, 2 camisetas y 1 sombrero
        Vestimenta [] vestimentas = new Vestimenta[9];

        vestimentas[0] = new Zapato(1,"Deportivas",33.25,"Adidas","40","Blancas","Cuero","Cordones");
        vestimentas[1] = new Zapato(2,"Oficiales",99.99,"Royal","39","Negro","Cuero","");
        vestimentas[2] = new Zapato(3,"Casual",20.99,"Nike","35","Verde","Cuero","Hebilla");

        vestimentas[3] = new Pantalon(4, "Jeans", 39.99, "Levi's", "L", "Azul", "Slim", "Lana");
        vestimentas[4] = new Pantalon(5, "Deportivo", 34.99, "Armour", "S", "Negro", "Regular", "Poliéster");
        vestimentas[5] = new Pantalon(6, "Formal", 69.99, "HH", "XL", "Gris", "Regular", "Lana");

        vestimentas[6] = new Camiseta(7, "Camiseta Manga Corta", 19.99, "Nike", "XXL", "Blanca", "Corta", "Redondo");
        vestimentas[7] = new Camiseta(8, "Camiseta Manga Larga", 29.99, "Adidas", "L", "Negra", "Larga", "V");

        vestimentas[8] = new Sombrero(9, "NYK", 149.99, "Spanish Hats", "M", "Beige", "Panama", "58");

        // Recorrer y ejecutar el metodo que corresponde en cada pos del mismo
        for(Vestimenta vestimenta : vestimentas){
            vestimenta.mostrarMarca();
        }
    }
}