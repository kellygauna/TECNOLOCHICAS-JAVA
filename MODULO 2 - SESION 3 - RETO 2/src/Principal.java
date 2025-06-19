import java.util.*;
import java.util.stream.*;

public class Principal {
    public static void main(String[] args) { //TODAS ESTAS SON LAS LISTAS CON SUS ENCUESTAS
        List<Sucursal> sucursales = List.of(
                new Sucursal("Centro", List.of(
                        new Encuesta("Lucía", "El tiempo de espera fue largo", 2),
                        new Encuesta("Pedro", null, 4)
                )),
                new Sucursal("Norte", List.of(
                        new Encuesta("Ana", "La atención fue buena, pero la limpieza puede mejorar", 3),
                        new Encuesta("José", null, 1)
                )),
                new Sucursal("Sur", List.of(
                        new Encuesta("María", "Todo excelente", 5),
                        new Encuesta("Carlos", null, 2)
                ))
        );
        //AQUI ES DONDE FUNCIONA EL FLATMAP Y EL OPTIONAL
        sucursales.stream()
                .flatMap(sucursal ->
                        sucursal.getEncuestas().stream()
                                .filter(e -> e.getCalificacion() <= 3)
                                .flatMap(e -> e.getComentario()
                                        .map(comentario ->
                                                Stream.of("Sucursal " + sucursal.getNombre() +
                                                        ": Seguimiento a paciente con comentario: \"" + comentario + "\""))
                                        .orElseGet(Stream::empty))
                )
                .forEach(System.out::println); //ESTO IMPRIME PLOS MENSAJES
    }
}