import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*Una clínica veterinaria necesita un sistema para administrar su registro de mascotas, para ello, se solicita la definición de una
        clase genérica Mascota<T> con atributos como nombre, edad, y especie (no olvides el código o id de mascota para identificar a cada una).
        Crea una clase utilitaria propia llamada RegistroMascotas que cuente con métodos genéricos para:

        Agregar Mascotas al Registro: Utiliza métodos de la clase java.util junto con genéricos para manipular colecciones como ArrayList o
        LinkedList y agregar mascotas de distinto tipo al registro de la veterinaria (puedes tomar como ejemplos de tipos: perros, gatos, reptiles y aves).

        Buscar Mascotas por Nombre o Especie: Emplea métodos de las clases utilitarias como Collections o Arrays junto con genéricos para
        realizar búsquedas eficientes por nombre o especie dentro del registro de mascotas.

        Contar la Cantidad Total de Mascotas Registradas: Utiliza métodos de java.util  para obtener el tamaño de la colección y contar la
        cantidad total de mascotas registradas en la veterinaria.

        Generar Datos Aleatorios para Mascotas: Utiliza la clase Random de java.util  para generar datos aleatorios, como nombres, edades o
        especies, para agregar mascotas al registro.

         */

        RegistroMascota<String> registro = new RegistroMascota<>();

        // Agregar mascotas al registro
        registro.generarDatosAleatorios(10);

        // Buscar mascotas por su nombre
        List<Mascota<String>> mascotaPorNombre = registro.buscarPorNombres("Lu");
        System.out.println("Mascotas encontradas por el nombre de Lu " + mascotaPorNombre.size());

        // Buscar mascotas por especies
        List<Mascota<String>> mascotaPorEspecie = registro.buscarEspecie("Gato");
        System.out.println("Mascotas encontradas por la especie de Gato: " + mascotaPorEspecie.size());

        // Contar la cantidad de mascotas
        int totalMascotas = registro.cantidadTotalMascotas();
        System.out.println("Cantidad de mascotas registradas actualmente: " + totalMascotas);
    }
}