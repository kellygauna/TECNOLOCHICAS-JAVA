public class Principal {
    public static void main(String[] args) {
        //CREAR OBJETO DE TIPO ENTRADA
        //LOS PRECIOS VAN SIN ""
        ENTRADA OBRADETEATRO = new ENTRADA("Obra de Teatro",450.00);
        ENTRADA CONCIERTO = new ENTRADA("Concierto",800.00);

        //LLAMAR AL METODO PARA MOSTRAR LA INFORMACION
        OBRADETEATRO.mostrarInformacion();
        CONCIERTO.mostrarInformacion();

    }
}
