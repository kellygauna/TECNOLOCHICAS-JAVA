import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Clase principal para ejecutar la simulación
public class PrincipalSimulacion {
    public static void main(String[] args) {
        System.out.println("🏥 Iniciando acceso a la Sala de cirugía...\n");

        RecursoMedico salaCirugia = new RecursoMedico("Sala de cirugía");

        // Lista de nombres de profesionales médicos
        String[] profesionales = {
                "Dra. Sánchez", "Dr. Gómez", "Enf. Ramírez", "Dra. Ortega", "Dr. Pérez"
        };

        // Creamos las tareas como lambdas que usan Runnable
        ExecutorService executor = Executors.newFixedThreadPool(4);
        for (String nombre : profesionales) {
            executor.execute(() -> salaCirugia.usar(nombre));
        }

        executor.shutdown();
    }
}
