public class Mamifero extends Animal{

    //"Mamífero" con atributos adicionales: número de patas, tipo de reproducción, color de pelaje, hábitat.

    // Creacion constructor


    public Mamifero(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, int numPatas, String tipoReproduccion, String colorPelaje, String habitat) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.numPatas = numPatas;
        this.tipoReproduccion = tipoReproduccion;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }

    // "Mamífero": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un mamífero".
    @Override
    public void saludar(){
        System.out.println("Hola, soy un mamifero.");
    }

    // Atributos
    private int numPatas;
    private String tipoReproduccion;
    private String colorPelaje;
    private String habitat;
}
