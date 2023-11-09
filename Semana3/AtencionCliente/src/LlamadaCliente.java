public class LlamadaCliente implements Runnable{

    // Constructor
    public LlamadaCliente(String cliente, String agente) {
        this.cliente = cliente;
        this.agente = agente;
    }

    // Metodos
    @Override
    public void run() {
        System.out.println("Llamada de: " + cliente + " ha sido atendida por: " + agente);
    }

    // Atributos
    private String cliente;
    private String agente;
}
