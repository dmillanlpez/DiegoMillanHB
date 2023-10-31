public class Animal {

    /*Crear una clase "Animal" con los atributos: id, nombre, edad, tipo de piel y tipo de alimentación
    (con sus métodos y constructores correspondientes). Agregar también un método llamado saludar que emita un mensaje
    por pantalla que diga “Hola, soy un animal”. A partir de esto hacer lo siguientes pasos: */

    // Constructor
    public Animal(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoPiel = tipoPiel;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    // Metodos
    public void saludar(){
        System.out.println("Hola, soy un animal.");
    }

    // Atributos
    private int id;
    private String nombre;
    private int edad;
    private String tipoPiel;
    private String tipoAlimentacion;
}
