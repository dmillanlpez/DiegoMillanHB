import java.util.ArrayList;
import java.util.List;

public class Directorio {

    // Constructor
    public Directorio(String nombre) {
        this.nombre = nombre;
        this.subdirectoriosList = new ArrayList<>();
        this.archivosList = new ArrayList<>();
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public List<Directorio> getSubdirectoriosList() {
        return subdirectoriosList;
    }


    public List<String> getArchivosList() {
        return archivosList;
    }


    public void agregarSubdirectorio(Directorio subdirectorio) {
        subdirectoriosList.add(subdirectorio);
    }

    public void agregarArchivo(String archivo) {
        archivosList.add(archivo);
    }

    // Atributos
    private String nombre;
    private List<Directorio> subdirectoriosList;
    private List<String> archivosList;
}
