public class Estudiante {

    //Atributos
    String nombre; //cadena de texto
    int edad; // entero ; si ponemos "String edad" no podemos realizar operaciones aritmeticas con ello.

    //Metodos
    // NECESITAMOS:
    // 1. Tipo de regreso
    // 2. Nombre
    // 3. Parametros (con su tipo)
    // "void" NO devuelve nada - se usa para cadenas de textos.
    public void saludar(){
        System.out.println("Hola :), soy " + nombre + " tengo "+ edad + " años");
    }
}
