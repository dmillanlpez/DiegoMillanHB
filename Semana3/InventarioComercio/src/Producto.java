public class Producto {

    // Constructores
    public Producto(String nombre, double precio, int cantDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantDisponible = cantDisponible;
    }
    public Producto() {
    }

    // Metodos
    public void agregarInventario(int cantidad) throws InventarioInvalidoException {
        if (cantidad < 0) {
            throw new InventarioInvalidoException("La cantidad a agregar debe ser mayor que cero.");
        }

        cantDisponible += cantidad;
    }

    public void vender(int cantidad) throws InventarioInvalidoException {
        if (cantidad <= 0) {
            throw new InventarioInvalidoException("La cantidad a vender debe ser mayor que cero.");
        }

        if (cantidad > cantDisponible) {
            throw new InventarioInvalidoException("No hay suficientes unidades disponibles para la venta.");
        }

        cantDisponible -= cantidad;
    }

    // Mostrar la informacion de los productos
    @Override
    public String toString() {
        return "Producto: " + nombre + ", Precio: Є" + precio + ", Cantidad Disponible: " + cantDisponible;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantDisponible() {
        return cantDisponible;
    }

    public void setCantDisponible(int cantDisponible) {
        this.cantDisponible = cantDisponible;
    }

    // Atributos
    private String nombre;
    private double precio;
    private int cantDisponible;
}
