import java.util.Objects;

public class Cuentafiscal {
    //encapsulacion y validacion
    private final String rfc;
    private double saldoDisponible;
    //Constructor con validacion del saldo
    public Cuentafiscal(String rfc, double saldoDisponible){
        this.rfc =rfc;
        if (saldoDisponible >= 0){
            this.saldoDisponible =saldoDisponible;
        } else {
            System.out.println("El saldo no puede ser negativo. Valor asignado 0");
            this.saldoDisponible = 0;
        }
    }
    //Getters
    public String getRfc(){return rfc;}
    public double getSaldoDisponible(){ return saldoDisponible;}
    //Metodo que valida si el RFC de la declaracion coincide con el de la cuenta
    public boolean validarRFC(DeclaracionImpuestos d){ return Objects.equals(this.rfc, d.rfcContribuyentes());}
    //Metodo que muestra info de la cuenta
    public void mostrarCuenta(){
        System.out.println("Cuenta fiscal registrada con RFC: " + rfc + ", saldo disponible: $" +  saldoDisponible);
    }
}
