import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /* Un administrador de una tienda de electrónica necesita un programa para gestionar los productos en su

        inventario. Para ello, necesita la creación de una clase Producto que cuente con los siguientes datos: código, nombre, marca, tipo, precio costo, precio venta, cantidad en stock.

        A partir de esto, realizar las siguientes acciones en el programa desarrollado:

        a) Crear 10 objetos de tipo Producto con sus correspondientes valores cargados (por ejemplo, teléfono, laptop,
        auriculares/cascos, cargador, tablet, etc).

        b) Guardar estos objetos creados en un ArrayList.

        c) Recorrer el ArrayList y determinar el producto con el mayor precio de venta.

        d) Recorrer el ArrayList y determinar el producto con el menor precio de costo.

        e) Borrar el producto que se encuentre en la posición 5 del ArrayList.

        f) Determinar el producto que tenga la mayor cantidad en stock. A ese producto, descontarle 3 unidades del stock
        y actualizar el registro en la lista en base a eso.

        g) Mostrar siempre por consola un mensaje informativo luego de resolver cada punto.
         */

        // Creacion del arraylist
        ArrayList<Producto> inventario = new ArrayList<>();

        // Crear 10 objetos de tipo producto
        inventario.add(new Producto(0,"Telefono","Apple","Smartphone",560.00,1150.00,1000));
        inventario.add(new Producto(1,"Tablet","Apple","Tablet",600.00,1700.99,1000));
        inventario.add(new Producto(2,"Telefono","Apple","Smartphone",560.00,1150.00,1000));
        inventario.add(new Producto(3, "Telefono", "Samsung", "Smartphone", 200, 300, 50));
        inventario.add(new Producto(4, "Laptop", "Dell", "Portatil", 800, 1200, 30));
        inventario.add(new Producto(5, "Auriculares", "Sony", "Inalambricos", 50, 80, 100));
        inventario.add(new Producto(6, "Cargador", "Apple", "USB-C", 10, 20, 200));
        inventario.add(new Producto(5, "Auriculares", "Sony", "Inalambricos", 50, 80, 100));
        inventario.add(new Producto(7, "Tablet", "Lenovo", "Android", 150, 250, 40));
        inventario.add(new Producto(8, "Smartwatch", "Apple", "Fitness", 80, 120, 60));
        inventario.add(new Producto(9, "TV", "LG", "LED 4K", 400, 600, 25));

        // Mostrar el producto con el mayor precio de venta
        Producto masCaro = Producto.encontrarProductoMasCaro(inventario);
        if (masCaro != null) {
            System.out.println("El producto mas caro es: " + masCaro.getNombre() + " con precio de venta de " + masCaro.getPrecioVenta() + " €");
        } else {
            System.out.println("No hay productos en el inventario.");
        }

        // Mostrar el producto con el menor precio de costo
        Producto masBaratoCosto = Producto.encontrarProductoMasBaratoCosto(inventario);
        if (masBaratoCosto != null) {
            System.out.println("El producto mas barato en costo es: " + masBaratoCosto.getNombre() + " con precio de costo de " + masBaratoCosto.getPrecioCosto() + " €");
        } else {
            System.out.println("No hay productos en el inventario.");
        }

        // Borrar el producto en la posición 5
        if (inventario.size() >= 6) {
            Producto productoBorrado = inventario.remove(5);
            System.out.println("Se ha eliminado el producto en la posicion 5: " + productoBorrado.getNombre());
        } else {
            System.out.println("No hay suficientes productos en el inventario para borrar en la posicion 5.");
        }

        // Determinar el producto con la mayor cantidad en stock y descontar 3 unidades
        Producto mayorStock = Producto.encontrarProductoMayorStock(inventario);
        if (mayorStock != null) {
            mayorStock.setCantidadStock(mayorStock.getCantidadStock() - 3);
            System.out.println("El producto con mayor stock es: " + mayorStock.getNombre() +
                    " con " + mayorStock.getCantidadStock() + " unidades en stock.");
        } else {
            System.out.println("No hay productos en el inventario.");
        }
    }
}