public class Principal {
    public static void main(String[] args){
        // CREAR MIS OBJETOS para que mi solucion tenga sentido
        // 1. Clase a la que pertenece el objeto
        // 2. Identificador
        // 3. New + constructor
        Estudiante estudiante1 = new Estudiante(); //por default constructor es el "nombre de la clase()"

        estudiante1.nombre = "Kelly";
        estudiante1.edad = 19;
        //Para que realice la accion debemos llamar  ala clase!!
        estudiante1.saludar();

    }
}
