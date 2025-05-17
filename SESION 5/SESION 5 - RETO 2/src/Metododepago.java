public abstract class Metododepago implements Autenticable {
    protected double monto;

    public Metododepago(double monto){
        this.monto = monto;
    }

    public abstract void procesarPago();

    public void mostrarResumen(){
        System.out.println("Tipo: "+ this.getClass().getSimpleName() + " - Monto: $" + monto);

    }
}
