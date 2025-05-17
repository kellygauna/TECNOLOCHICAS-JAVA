public abstract class Unidademergencia {
    String nombre;

    public Unidademergencia(String nombre){ this.nombre = nombre;}

    public void activarUnidad(){ System.out.println("Activando unidad: " + nombre);}
    //metodo activarunidad y mensaje de activacion
    public abstract void responder(); //metodo responder abstracto
}
