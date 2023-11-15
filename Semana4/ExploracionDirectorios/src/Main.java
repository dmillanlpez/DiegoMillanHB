public class Main {
    public static void main(String[] args) {

        /*Crea un programa que simule la exploración recursiva de directorios en el sistema de archivos de un sistema operativo utilizando
        una estructura de datos propia.

        Emplea una estructura donde cada nodo representa un directorio y contiene referencias a sus subdirectorios.

        El programa debe realizar una exploración simulada para mostrar la jerarquía de directorios y archivos.

         */

        Directorio home = new Directorio("Home");
        Directorio dir1 = new Directorio("Directorio1");
        Directorio dir2 = new Directorio("Directorio2");

        dir1.agregarSubdirectorio(new Directorio("Subdir1"));
        dir1.agregarSubdirectorio(new Directorio("Subdir2"));
        dir2.agregarSubdirectorio(new Directorio("Subdir3"));

        dir1.agregarArchivo("Text.txt");
        dir1.agregarArchivo("Text.pdf");

        dir2.agregarArchivo("Imagen.jpeg");

        home.agregarSubdirectorio(dir1);
        home.agregarSubdirectorio(dir1);

        home.agregarSubdirectorio(dir2);

        ExploradorDirectorios finder = new ExploradorDirectorios();
        finder.exploradorDirectorios(home, " ");



    }
}