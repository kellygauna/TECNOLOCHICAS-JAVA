import java.security.SignatureException;

public class Ambulancia extends Unidademergencia{
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    public Ambulancia(String nombre, String nombreOperador){
        super(nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);

    }
     public void iniciarOperacion(){
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
     }
     @Override
    public void responder(){System.out.println("Ambulancia en camino");}
}
