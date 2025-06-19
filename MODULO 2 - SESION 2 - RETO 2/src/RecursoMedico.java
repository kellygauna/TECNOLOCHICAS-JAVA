import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

// Clase que representa el recurso compartido
class RecursoMedico {
    private final String nombre;
    private final ReentrantLock lock = new ReentrantLock();

    public RecursoMedico(String nombre) {
        this.nombre = nombre;
    }

    public void usar(String profesional) {
        lock.lock(); // Intenta adquirir el recurso
        try {
            System.out.println("👩‍⚕️ " + profesional + " ha ingresado a " + nombre);
            Thread.sleep(1000); // Simula tiempo de uso
            System.out.println("✅ " + profesional + " ha salido de " + nombre);
        } catch (InterruptedException e) {
            System.err.println("⛔ Interrupción detectada en " + profesional);
        } finally {
            lock.unlock(); // Libera el recurso
        }
    }
}

