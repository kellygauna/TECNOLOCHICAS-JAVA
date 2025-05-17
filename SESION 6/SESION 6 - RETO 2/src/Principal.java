import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class Principal{
    public static void main(String[] args) {
        //Crear lista de temas activos
        List<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        Collections.sort(temas);
        System.out.println("Temas ordenados alfabéticamente:");
        for (Tema t : temas) {
            System.out.println(t);
        }
        temas.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema a, Tema b) {
                return Integer.compare(a.prioridad, b.prioridad); // Prioridad ascendente
            }
        });
        System.out.println("\nTemas ordenados por prioridad (1 = urgente):");
        for (Tema t : temas) {
            System.out.println(t);
        }

        //Mapa concurrente de temas usando ConcurrentHashMap
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/ambiente");

        //Repositorio concurrente de materiales asociados a cada tema
        System.out.println("\nRepositorio de recursos por tema:");
        for (String tema : recursos.keySet()) {
            System.out.println(tema + " → " + recursos.get(tema));
        }
    }
}
