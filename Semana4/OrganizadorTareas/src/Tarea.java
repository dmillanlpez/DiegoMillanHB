import java.util.ArrayList;
import java.util.List;

public class Tarea {

    // Constructor
    public Tarea(String nombre) {
        this.nombre = nombre;
        this.subtarea = new ArrayList<>();
    }

    // Metodo agregar sub-tarea
    public void addSubtarea(Tarea subtarea){
        this.subtarea.add(subtarea);
    }

    public void displayTarea(String indent) {
        System.out.println(indent + this.nombre);
        for (Tarea subtarea : subtarea) {
            subtarea.displayTarea(indent + "   ");
        }
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tarea> getSubtarea() {
        return subtarea;
    }

    public void setSubtarea(List<Tarea> subtarea) {
        this.subtarea = subtarea;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", subtarea=" + subtarea +
                '}';
    }

    // Atributos
    private String nombre;
    private List<Tarea> subtarea;
}
