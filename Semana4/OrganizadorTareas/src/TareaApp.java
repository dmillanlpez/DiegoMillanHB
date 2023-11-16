import java.util.ArrayList;
import java.util.List;

public class TareaApp {

    // Constructor
    public TareaApp() {
        this.tareas = new ArrayList<>();
    }

    public void displayTareas(){
        for(Tarea tarea : tareas){
            tarea.displayTarea("|-");
        }
    }

    public void anadirTarea(Tarea tarea){
        this.tareas.add(tarea);
    }

    // Atributo
    private List<Tarea> tareas;
}
