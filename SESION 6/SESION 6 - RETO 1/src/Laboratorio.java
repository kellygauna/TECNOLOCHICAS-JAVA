import java.util.*;

public class Laboratorio {
    public static void main(String[] args) {

        //ArrayList: registrar orden de llegada (puede haber repetidos)
        ArrayList<String> reportes = new ArrayList<>();
        reportes.add("Homo sapiens");
        reportes.add("Mus musculus");
        reportes.add("Arabidopsis thaliana"); // Repetido
        reportes.add("Homo sapiens");

        System.out.println("🗂️ Reportes de llegada (ordenados, con duplicados):");
        for (int i = 0; i < reportes.size(); i++) {
            System.out.println(i + 1 + ". " + reportes.get(i));
        }

        // HashSet: registrar especies únicas
        HashSet<String> especies = new HashSet<>(reportes); // Elimina duplicados

        System.out.println("\n✅Especies únicas procesadas:");
        for (String especie : especies) {
            System.out.println("- " + especie);
        }

        //HashMap: asociar ID de muestra con nombre del investigador
        HashMap<String, String> muestrainvestigador = new HashMap<>();
        muestrainvestigador.put("M-001", "Dra. Lopez");
        muestrainvestigador.put("M-002", "Dr. Hernandez");
        muestrainvestigador.put("M-003", "Dr. Ruiz");

        System.out.println("\n📇 Especies asociadas (ID → Investigador):");
        for (Map.Entry<String, String> entry : muestrainvestigador.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // 🔍 Buscar causa de rechazo por ID
        String idBuscar = "M-001";
        System.out.println("\n🔍 Investigador responsable de " + idBuscar + ": " + muestrainvestigador.get(idBuscar));
    }
}
