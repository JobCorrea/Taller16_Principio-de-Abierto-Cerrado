public class DocumentoWord extends Documento{
    public DocumentoWord(String nombre) {
        super(nombre);
    }

    @Override
    public void exportar(){
        System.out.println("Documento '"+nombre+"' exportado en WORD ... ");
    }
}
