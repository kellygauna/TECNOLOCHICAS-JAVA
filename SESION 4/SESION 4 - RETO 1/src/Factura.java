public class Factura {
    //Atributos de la factura
    private String folio;
    private String cliente;
    private double total;
    //Constructor
    public Factura(String folio, String cliente, double total){
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }
    //Metodo "toString()"
    @Override
    public String toString(){
        return "Factura [folio= " + folio + ", cliente=" + ", total = $" + total +"]";
    }
    //Metodo "equals()"
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true; //mismo objeto en la memoria
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otra = (Factura) obj;
        return this.folio.equals(otra.folio); //comparar solo el folio
    }
    @Override
    public int hashCode(){ return folio.hashCode();}
}
