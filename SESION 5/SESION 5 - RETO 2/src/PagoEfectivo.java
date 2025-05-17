public class PagoEfectivo extends Metododepago{
    public PagoEfectivo(double monto){
        super(monto);
    }
    @Override
    public boolean autenticar(){
        return true; //no validacion para efectivo
    }
    @Override
    public void procesarPago(){
        System.out.println("Procesando pago en efectivo por $" + monto);
    }
}
