public class Vuelo {
    final String codigoVuelo; //identificador y/o cte
    String destino;
    String horaSalida;
    Pasajero asientoReservado;

    public Vuelo(String codigoVuelo, String destino, String horaSalida) { //constructor
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    //Metodo con parametro y valor de retorno
    public boolean reservarAsiento(Pasajero p){
        if (asientoReservado == null){ //si no tiene a nadie
            asientoReservado = p; //se asigna esto
            return true;
        } else {
            return false;
        }
    }

    public boolean reservarAsiento(String nombre, String pasaporte){
        Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevoPasajero);
    }

    //Metodo sin retorno
    public  void cancelarReservar(){
        asientoReservado = null;
    }

    //Metodo que retorna un String
    public String obtenerItinerario(){
        String info = "Itinerario del vuelo: \n";
        info += "Codigo: " + codigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Salida: " + horaSalida + "\n";
        if (asientoReservado != null){
            info += "Pasajero: " + asientoReservado.nombre + "\n";
        } else {
            info += "Pasajero: [SIN RESERVA]\n";
        }
        return info;
    }
}