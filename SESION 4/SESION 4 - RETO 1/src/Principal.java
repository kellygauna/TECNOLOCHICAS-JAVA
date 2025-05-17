public class Principal {
    public static void main(String[] args) {

        //CREAMOS DOS FACTURAS
        Factura f1 = new Factura("FAC001", "Kelly de la Rosa", 1450.00);
        Factura f2 = new Factura("FAC001", "Comercializadora XYA", 23840.56);
        //Mostrar facturas con toString()
        System.out.println(f1);
        System.out.println(f2);
        //Comparar si son iguales usando equals()
        System.out.println("¿Las facturas son iguales?: " + f1.equals(f2));
    }
}
