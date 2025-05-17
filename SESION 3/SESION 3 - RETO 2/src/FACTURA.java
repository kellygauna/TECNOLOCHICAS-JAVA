import java.util.Optional;

public class FACTURA {
    //definir atributos privados
    private double monto;
    private String descripcion;
    private Optional<String> rfc; //manejo seguro del null

    //constructorrrrr
    public FACTURA(double monto, String descripcion, String rfc){
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc); //convierte el rfc en optional
    }

    //metodo que devuelve un resumen de la factura
    public String getResumen(){
        String resumen = "Factura generada: \n";
        resumen += "Descripcion: " + descripcion + "\n";
        resumen += "Monto: $" + monto + "\n";

        //Si el RFC esta presente se va a mostrar, si no muestra este mensaje
        resumen += "RFC: " + rfc.orElse("[No proporcionado]") + "\n";

        return resumen;
    }
}
