import java.util.concurrent.*;
import java.util.Random;

public class AeropuertoControl {

    private static final Random random = new Random();
    private static final ExecutorService executor = Executors.newFixedThreadPool(4);

    public static void main(String[] args) {
        System.out.println("🛫 Verificando condiciones para aterrizaje...\n");

        CompletableFuture<Boolean> pistaFuture = verificarPista();
        CompletableFuture<Boolean> climaFuture = verificarClima();
        CompletableFuture<Boolean> traficoFuture = verificarTraficoAereo();
        CompletableFuture<Boolean> personalFuture = verificarPersonalTierra();

        CompletableFuture<Void> controlAterrizaje = CompletableFuture.allOf(
                pistaFuture, climaFuture, traficoFuture, personalFuture
        ).thenRun(() -> {
            try {
                boolean pista = pistaFuture.get();
                boolean clima = climaFuture.get();
                boolean trafico = traficoFuture.get();
                boolean personal = personalFuture.get();

                if (pista && clima && trafico && personal) {
                    System.out.println("\n🛬 Aterrizaje autorizado: todas las condiciones óptimas.");
                } else {
                    System.out.println("\n🚫 Aterrizaje denegado: condiciones no óptimas.");
                }
            } catch (InterruptedException | ExecutionException e) {
                System.out.println("\n🚨 Error en la evaluación de condiciones: " + e.getMessage());
            } finally {
                executor.shutdown();
            }
        }).exceptionally(ex -> {
            System.out.println("\n🚨 Error inesperado en el proceso de aterrizaje: " + ex.getMessage());
            executor.shutdown();
            return null;
        });

        controlAterrizaje.join();
    }

    public static CompletableFuture<Boolean> verificarPista() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("🛣️ Verificando pista...");
            dormir(2);
            boolean disponible = random.nextInt(100) < 80;
            System.out.println("🛣️ Pista disponible: " + disponible);
            return disponible;
        }, executor);
    }

    public static CompletableFuture<Boolean> verificarClima() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("🌦️ Verificando clima...");
            dormir(3);
            boolean favorable = random.nextInt(100) < 85;
            System.out.println("🌦️ Clima favorable: " + favorable);
            return favorable;
        }, executor);
    }

    public static CompletableFuture<Boolean> verificarTraficoAereo() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("🚦 Verificando tráfico aéreo...");
            dormir(1);
            boolean despejado = random.nextInt(100) < 90;
            System.out.println("\n🚦 Tráfico aéreo despejado: " + despejado);
            return despejado;
        }, executor);
    }

    public static CompletableFuture<Boolean> verificarPersonalTierra() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("👷‍♂️ Verificando personal en tierra...");
            dormir(2);
            boolean disponible = random.nextInt(100) < 95;
            System.out.println("👷‍♂️ Personal disponible: " + disponible);
            return disponible;
        }, executor);
    }

    public static void dormir(int segundos) {
        try {
            TimeUnit.SECONDS.sleep(segundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
