public class Main {
    public static void main(String[] args) {

        /*Crear una clase Persona, que tenga los siguientes atributos: id, nombre, edad, dirección y número de teléfono
        (tener en cuenta todos sus atributos, constructores y métodos getters y setters).

        a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.

        b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.

        c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio y luego mostrar el después
        de los datos de las dos personas cuyos nombres fueron cambiados.

        d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años. */

        // Creacion array persona
        Persona [] personas = new Persona[5];

        // Crear cinco personas y guardarlas en el vector
        personas[0] = new Persona(1, "Diego", 26, "Calle Antonio 12", 650133456);
        personas[1] = new Persona(2, "Catherine", 21, "Calle Ave del Paraiso 3", 643558393);
        personas[2] = new Persona(3, "Pedro", 35, "Calle Badia Portal 3", 685613322);
        personas[3] = new Persona(4, "Ana", 28, "Fontan 10 Portal 2", 678553412);
        personas[4] = new Persona(5, "Luis", 55, "Carnoedo Piso 12 Bajo Derecha", 678555641);

        // Recorrer el array
        System.out.println("Nombre y edades de las personas");
        for(Persona persona : personas){
            System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
        }

        System.out.println("---- CAMBIOS ----");
        System.out.println("Cambios de nombres:");
        System.out.println("Persona 1 nombre original: " + personas[1].getNombre());
        System.out.println("Persona 2 nombre original: " + personas[2].getNombre());

        // Realiza los cambios de nombre
        personas[1].setNombre("Kat");
        personas[2].setNombre("Pedrito");

        System.out.println("Persona 1 nombre despues del cambio: " + personas[1].getNombre());
        System.out.println("Persona 2 nombre despues del cambio: " + personas[2].getNombre());

        // Recorrer array y mostrar mayores de 30
        System.out.println("---- Personas mayores de 30 ----");
        for(Persona persona : personas){
            if(persona.getEdad() > 30){
                System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
            }
        }
    }
}