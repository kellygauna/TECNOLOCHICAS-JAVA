public class Cajaregistradora {
    public static void main(String[] args) {
        Metododepago[] pagos = {
                new PagoEfectivo(150.0),
                new PagoTarjeta(320.0, 500.0),
                new PagoTransferencia(250.0, false) //fallará
        };

        for (Metododepago pago : pagos) {
            if (pago.autenticar()) {
                System.out.println("Autentificacion exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.println("Fallo de autentificacion: " + pago.getClass().getSimpleName() + " no valido.");
            }
            System.out.println();
        }
    }
}
