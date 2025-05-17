public class Principal {
    public static void main(String[] args) {
        //Crear un pasajero
        Pasajero pasajero = new Pasajero("Ana Martinez", "P123456");

        //Crear un vuelo
        Vuelo vuelo = new Vuelo("UX123", "Paris", "14:30");

        //Reservar asiento
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("Reserva realizada con exito. \n");
        } else {
            System.out.println("No se pudo realizar la reserva. \n");
        }

        //Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        //Cancelar reserva
        System.out.println("Cancelando reserva... \n");
        vuelo.cancelarReservar();

        //Mostrar itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());

        //Realizamos una nueva reservacion
        vuelo.reservarAsiento("Kelly de la Rosa", "P301105");
        System.out.println(vuelo.obtenerItinerario());
    }
}
