public class ENTRADA {
    //ATRIBUTOS
    String nomevento;
    double precioent;
//CONSTRUCTOR
    public ENTRADA(String nomevento, double precioent){
        this.nomevento = nomevento;
        this.precioent = precioent;
    }
//METODO PUBLICO PARA QUE SE MUESTRE LA INFORMACION
    public void mostrarInformacion(){
        System.out.println("Evento: " + nomevento + " | Precio: $" + precioent);

    }
}
