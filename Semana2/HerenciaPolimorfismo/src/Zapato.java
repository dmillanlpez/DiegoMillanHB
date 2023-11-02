public class Zapato extends Vestimenta{

    // Zapato: material, tipoCierre

    // Constructor
    public Zapato(int codigo, String nombre, double precio, String marca, String talla, String color, String materia, String tipoCierre) {
        super(codigo, nombre, precio, marca, talla, color);
        this.materia = materia;
        this.tipoCierre = tipoCierre;
    }

    // Metodo
    @Override
    public void mostrarMarca() {
        super.mostrarMarca();
    }

    // Atributos
    private String materia;
    private String tipoCierre;
}
