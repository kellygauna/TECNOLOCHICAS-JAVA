public class SimuladorFarmacia {
    String Medicamento;
    double Preciounitario;
    int Cantidaddepiezas;

    //INFO QUE SI PUEDE CAMBIAR
    public void Info(){
        double total = (Preciounitario * Cantidaddepiezas);
        boolean aplicaDescuento = total > 500;
        double descuento = aplicaDescuento ? total * 0.15 : 0;
        double totalconDescuento = total - descuento;
        System.out.println("Total sin descuento: $" + total);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalconDescuento);
    }

}
