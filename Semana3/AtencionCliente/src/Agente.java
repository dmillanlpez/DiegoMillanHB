public class Agente implements Runnable{

    // Constructor
    public Agente(String nombre) {
        this.nombre = nombre;
    }

    // Metodo
    @Override
    public void run() {
        System.out.println(nombre + " se encuentra disponible para atender llamadas.");
    }

    // Atributos
    private String nombre;
}
