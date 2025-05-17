public class PRINCIPLA {
    public static void main(String[] args) {

        //Factura con RFC
        FACTURA facturaconRFC = new FACTURA(2500.0, "Consulta medica", "051130MNL456S");

        //Factura sin RFC
        FACTURA facturasinRFC = new FACTURA(1800.0, "Gasto escolar", null);

        //MOSTRAR AMBAS FACTURAS
        System.out.println(facturaconRFC.getResumen());
        System.out.println(facturasinRFC.getResumen());

    }
}
