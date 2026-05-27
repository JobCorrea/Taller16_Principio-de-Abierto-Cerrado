public abstract class Documento {
    protected String nombre;

    public Documento(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void exportar();
}
