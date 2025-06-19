import java.util.*;
import java.util.stream.*;

public class Principal {
    public static void main(String[] args) {
        List<Pedido> pedidos = List.of(
                new Pedido("Carlos", "domicilio", "555-1234"),
                new Pedido("Ana", "local", null),
                new Pedido("Luis", "domicilio", null),
                new Pedido("María", "domicilio", "555-5678"),
                new Pedido("Jorge", "domicilio", "555-0000")
        );

        pedidos.stream()
                .filter(p -> p.getTipoEntrega().equalsIgnoreCase("domicilio")) // Solo "domicilio"
                .map(Pedido::getTelefono) // Obtener Optional<String>
                .filter(Optional::isPresent) // Filtrar solo los que sí tienen teléfono
                .map(Optional::get) // Extraer el valor
                .map(tel -> "📞 Confirmación enviada al número: " + tel)
                .forEach(System.out::println);
    }
}
