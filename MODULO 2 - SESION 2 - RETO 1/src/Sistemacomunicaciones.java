import java.util.concurrent.Callable;
public class Sistemacomunicaciones implements Callable<String> {
    public String call() throws Exception {
        Thread.sleep(600);
        return "📡 Comunicaciones: enlace con estación terrestre establecido.";
    }
}