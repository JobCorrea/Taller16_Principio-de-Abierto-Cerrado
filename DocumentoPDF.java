public class DocumentoPDF extends Documento{
    public DocumentoPDF(String nombre) {
        super(nombre);
    }

    @Override
    public void exportar(){
        System.out.println("Documento '"+nombre+"' exportado en PDF ... ");
    }
}
