public class Trabajador extends Thread{

    // Constructor
    public Trabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    // Metodo
    @Override
    public void run() {
        ensamblarProducto();
        controlCalidad();
        empaquetarProducto();
    }

    public void ensamblarProducto() {
        System.out.println("Trabajador " + nombreTrabajador + " esta ensamblando el producto.");
    }

    public void controlCalidad() {
        System.out.println("Trabajador " + nombreTrabajador + " esta realizando el control de calidad.");
    }

    public void empaquetarProducto() {
        System.out.println("Trabajador " + nombreTrabajador + " esta empaquetando el producto.");
    }

    // Atributos
    private String nombreTrabajador;

}
