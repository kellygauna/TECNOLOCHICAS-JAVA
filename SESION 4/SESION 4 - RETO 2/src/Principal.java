public class Principal {
    public static void main(String[] args) {
        //Crear declaracion de impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("XSSHHAJSHAJHSAHSHJ",8700.00);

        //Creamos una cuenta fiscal
        Cuentafiscal cuenta = new Cuentafiscal("XSSHHAJSHAJHSAHSHJ", 9500.00);

        //Mostramos la informacion
        System.out.println("Declaracion enviada por RFC: " + declaracion.rfcContribuyentes() +
                " por $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        //Validamos sie el RFC de la declaracion es valido
        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("¿RFC valido para esta cuenta?" + rfcValido);

    }
}
