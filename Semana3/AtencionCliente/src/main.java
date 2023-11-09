import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {

    public static void main(String[] args) {

        /* Ejercicio Nº 1 - Simulación de un centro de atención al cliente

        • Crea una simulación de un centro de atención al cliente en la que varios agentes de soporte pueden atender llamadas
        telefónicas concurrentemente.
        • Cada agente se representa como un hilo independiente.
        • Los agentes deben recibir llamadas de clientes, resolver consultas y registrar información sobre cada llamada.
        Utiliza hilos para simular la atención concurrente de múltiples llamadas y garantizar que los agentes puedan manejarlas de
        manera eficiente.
        • Asegúrate de controlar la concurrencia para evitar conflictos en la asignación de llamadas a los agentes.
         */

        int numAgentes = 3; // Número de agentes de soporte

        Thread[] agentes = new Thread[numAgentes];

        for (int i = 0; i < numAgentes; i++) {
            agentes[i] = new Thread(new Agente("Agente " + (i + 1)));
            agentes[i].start();
        }

        // Simular llamadas entrantes
        int numLlamadas = 10;
        for (int i = 0; i < numLlamadas; i++) {
            Thread llamada = new Thread(new LlamadaCliente("Cliente " + (i + 1), "Agente " + ((i % numAgentes) + 1)));
            llamada.start();
        }
    }

}
