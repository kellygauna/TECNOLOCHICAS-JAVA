package SOLUCIONRETO1;
//hay que llamar la clase Scanner osea IMPORTARLA

import java.util.Scanner;

public class Principal {
    //AQUI VA TODA LA FUNCIONALIDAD CON EL MAIN
    public static void main(String[] args) {
        //CREAR OBJETO
        Scanner inputs = new Scanner(System.in);
        Paciente p1 = new Paciente();

        //DATOS DE SALIDA DE NOMBRE, EDAD Y NUMDEEXP
        System.out.print("Ingresa el nombre del paciente: ");
        p1.nombre = inputs.nextLine();

        System.out.print("Ingresa la edad del paciente: ");
        p1.edad = inputs.nextInt(); //hay que limpiar el buffer
        inputs.nextLine(); //este lo limpia solo para pasar al sig dato

        System.out.println("Ingresa el número de expediente del paciente: ");
        p1.numdeexp = inputs.nextLine();

        inputs.close();

        p1.mostrarInformacion();

    }
}
