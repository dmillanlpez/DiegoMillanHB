import java.util.ArrayList;
import java.util.List;

public class InventarioAutos {

    // Constructor
    public InventarioAutos() {
        this.inventario = new ArrayList<>();
    }

    // Metodos
    public void agregarAuto(Auto auto){
        inventario.add(auto);
    }

    public List<Auto> buscarPorMarca(String marca){
        List<Auto> autosEncontrados = new ArrayList<>();
        for(Auto auto : inventario){
            if (auto.getMarca().equalsIgnoreCase(marca)){
                autosEncontrados.add(auto);
            }
        }
        return autosEncontrados;
    }

    public List<Auto> buscarPorAno(int ano) {
        List<Auto> autosEncontrados = new ArrayList<>();
        for (Auto auto : inventario) {
            if (auto.getAno() == ano) {
                autosEncontrados.add(auto);
            }
        }
        return autosEncontrados;
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Auto auto : inventario) {
            valorTotal += auto.getPrecio();
        }
        return valorTotal;
    }


    // Atributo
    private List<Auto> inventario;
}
