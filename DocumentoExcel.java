public class DocumentoExcel extends Documento{

    public DocumentoExcel(String nombre) {
        super(nombre);
    }
    @Override
    public void exportar(){
        System.out.println("Documento '"+nombre+"' exportado en EXCEL ... ");
    }
}
