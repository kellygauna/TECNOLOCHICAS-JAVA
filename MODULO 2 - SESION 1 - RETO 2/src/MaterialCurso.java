public abstract class MaterialCurso {
    protected String titulo;
    protected String autor;

    public MaterialCurso(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }

    public abstract void mostrarDetalle();
}
