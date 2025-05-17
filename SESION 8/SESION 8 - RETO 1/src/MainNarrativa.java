public class MainNarrativa {
    public static void main(String[] args) {
        // Simulación inicial
        PaqueteNarrativo paquete = new PaqueteNarrativo("Inicio del viaje");

        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDesicion decision = new DesicionBinaria();

        dialogo.mostrarDialogo(paquete);
        String accion = decision.tomarDecision();
        transicion.realizarTransicion(accion);
    }
}
