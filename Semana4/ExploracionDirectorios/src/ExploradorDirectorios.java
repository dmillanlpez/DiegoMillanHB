public class ExploradorDirectorios {

    public void exploradorDirectorios(Directorio directorio, String prefix){
        System.out.println(prefix + directorio.getNombre() + " / ");

        // Mostrar archivos que esten en el directorio actual
        for(String archivo : directorio.getArchivosList()){
            System.out.println(prefix + " - " + archivo);
        }

        // Explorar subdirectorios
        for(Directorio subdirectorios : directorio.getSubdirectoriosList()){
            exploradorDirectorios(subdirectorios, prefix + " - ");
        }
    }
}
