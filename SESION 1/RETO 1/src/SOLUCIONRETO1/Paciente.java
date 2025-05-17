package SOLUCIONRETO1;
    //ATRIBUTOS
public class Paciente {
    String nombre;
    int edad;
    String numdeexp;

    //LOS DATOS QUE VOY A PEDIR SON EN EL MAIN O EL PRINCIPAL; SOLO UNA CLASE
        // PUEDE TENER MAIN, OSEA DEBEMOS SEPARAR EL CODIGO

    public void mostrarInformacion(){
        System.out.println("\nInformacion del(la) paciente: ");
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Número de Expediente: " + numdeexp);
    }
}
