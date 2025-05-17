import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        //OBJETOS
        Scanner inputs = new Scanner(System.in);
        SimuladorFarmacia med1 = new SimuladorFarmacia();

        System.out.print("Medicamento: ");
        med1.Medicamento = inputs.nextLine();

        System.out.print("Precio Unitario: $");
        med1.Preciounitario = inputs.nextDouble(); //hay que limpiar el buffer
        inputs.nextLine(); //este lo limpia solo para pasar al sig dato

        System.out.println("Cantidad de piezas: ");
        med1.Cantidaddepiezas = inputs.nextInt();
        inputs.close();

        med1.Info();
    }
}
