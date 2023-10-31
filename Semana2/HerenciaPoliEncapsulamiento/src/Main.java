public class Main {
    public static void main(String[] args) {

        // c) En el método "main", crear un objeto de cada clase hija. Llamar a los 3 métodos saludar desde cada objeto.
        Mamifero aMamifero = new Mamifero(1,"Toby",5,"Pelo","Omnivoro", 4,"Sexual",
                                        "Blanco","Terrestre");

        Ave aAve = new Ave(2,"Flash",2,"Plumas","Carnivoro",2.05,"Aleteo","Gris",
                            "Curvo");

        Reptil aReptil = new Reptil(3, "Harry",20,"Escamas","Carnivoro",7.05,"Cicloides",
                                    "", "Acuatico");

        /*d) Crear un objeto de tipo animal e intentar asignarle al Mamifero creado…
        ¿Qué sucede? ¿Es posible hacer esto? ¿Se aplica alguna propiedad para esto? */

        Animal animal = new Mamifero(1, "Toby", 5, "Pelo", "Omnívoro", 4, "Sexual",
                                "Blanco", "Terrestre");

        // Saludar desde cada objeto (optimo seria hacer una lista pero todavia no se ha dado (posible modificacion de codigo cuando se de)
        aMamifero.saludar();
        aAve.saludar();
        aReptil.saludar();


        /*Si, es posible crear un objeto de tipo Animal y asignarle una instancia de Mamifero debido a la herencia.
        */

        /*E) Cambiar el modificador de acceso de los métodos de "public" a "private". Intentar acceder desde el
        "main" a estos métodos. ¿Qué sucede? ¿Es posible hacer esto? */

        /*Si cambias el mod de acceso de los metodos de public a private, no vas a poder acceder a esos metodos directamente desde fuera
        * de las clases. Tendras un error de compilacion. */
    }
}